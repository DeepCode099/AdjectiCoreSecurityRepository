package com.adjecti.security.core.config;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import io.jsonwebtoken.ExpiredJwtException;
import io.jsonwebtoken.MalformedJwtException;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Component
public class JwtAuthenticationFilter extends OncePerRequestFilter {

	@Autowired
	private UserDetailsService userDetailsService;

	@Autowired
	private JwtTokenHelper jwtTokenHelper;

	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
			throws ServletException, IOException {
		System.out.println("inside dofilter");
		// TODO Auto-generated method stub
		// 1. get Token
		String requestToken = request.getHeader("Authorization");
		// Bearer 12133323ddsfds
		String userName = null;
		String token = null;
		if (request != null && requestToken.startsWith("Bearer ")) {
			token = requestToken.substring(7);
			try {
				userName = this.jwtTokenHelper.getUserNameFromToken(token);
			} catch (IllegalArgumentException e) {
				System.out.println("unable to get Jwt token ");
			} catch (ExpiredJwtException e1) {
				System.out.println("JWT token has expired ");
			} catch (MalformedJwtException e2) {
				System.out.println("invalid jwt ");
			}
		/*
			 * else { System.out.println("jwt token does not begin with Bearer"); }
			 */
		if (userName != null && SecurityContextHolder.getContext().getAuthentication() == null) {
			UserDetails userDetails = this.userDetailsService.loadUserByUsername(userName);
			if (this.jwtTokenHelper.validateToken(token, userDetails)) {
				// do authenticate
				UsernamePasswordAuthenticationToken usernamePasswordAuthenticationToken = new UsernamePasswordAuthenticationToken(
						userDetails, null, userDetails.getAuthorities());
				usernamePasswordAuthenticationToken
						.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));
				SecurityContextHolder.getContext().setAuthentication(usernamePasswordAuthenticationToken);
			}
			else {
				System.out.println("Invalid jwt token");
			}
		} else {

			System.out.println("Username is null or context is not null");
		}
		}
		
		System.out.println("filter chain");
		filterChain.doFilter(request, response);

	}

}
