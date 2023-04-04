package com.adjecti.security.core.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.DefaultSecurityFilterChain;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

@Configuration
@EnableWebSecurity
public class SecurityConfig {
	
	@Autowired
	private JwtAuthenticationEntryPoint jwtAuthenticationEntryPoint;
	@Autowired
	private JwtAuthenticationFilter jwtAuthenticationFilter;
    @Autowired
    private CustomUserDetailService customUserDetailService;

	@Bean
	public PasswordEncoder passwordEncoder() {
		return NoOpPasswordEncoder.getInstance();
	}
	@Bean
	public UserDetailsService userDetailsService() {
		return new CustomUserDetailService();
	}
	
	@Bean
	public DaoAuthenticationProvider daoAuthenticationProvider() {
		DaoAuthenticationProvider daoAuthenticationProvider = new DaoAuthenticationProvider();
		daoAuthenticationProvider.setUserDetailsService(this.customUserDetailService);
		daoAuthenticationProvider.setPasswordEncoder(passwordEncoder());
		return daoAuthenticationProvider;
	}
	
	@Bean
	public SecurityFilterChain filterChain(HttpSecurity httpSecurity) throws Exception {
		 httpSecurity.csrf()
		.disable()
		.authorizeHttpRequests()
		.requestMatchers("api/v1/user")
		.hasRole("ADMIN")
	    .requestMatchers("api/v1/auth/login")
		.permitAll()
		.anyRequest()
	    .authenticated()
	    .and()
	    .exceptionHandling()
	    .authenticationEntryPoint(this.jwtAuthenticationEntryPoint)
	    .and()
	    .sessionManagement()
	    .sessionCreationPolicy(SessionCreationPolicy.STATELESS);
		httpSecurity.addFilterBefore(this.jwtAuthenticationFilter,UsernamePasswordAuthenticationFilter.class);
		httpSecurity.authenticationProvider(daoAuthenticationProvider());
		DefaultSecurityFilterChain defaultSecurityFilterChain = httpSecurity.build();
		return defaultSecurityFilterChain;
	}
	
	@Bean 
	public AuthenticationManager authenticationManagerBean(AuthenticationConfiguration configuration) throws Exception {
		return configuration.getAuthenticationManager();
	}
	
	
}