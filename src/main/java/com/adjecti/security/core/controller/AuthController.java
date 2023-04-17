package com.adjecti.security.core.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.adjecti.security.core.config.JwtTokenHelper;
import com.adjecti.security.core.payloads.JwtAuthRequest;
import com.adjecti.security.core.payloads.JwtAuthResponse;
import com.adjecti.security.core.repository.UserRepository;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/v1/auth")
public class AuthController {

	@Autowired
	private JwtTokenHelper jwtTokenHelper;

	@Autowired
	private UserDetailsService userDetailsService;

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
    private AuthenticationManager authenticationManager;

	
	@PostMapping("/login")
	public ResponseEntity<JwtAuthResponse> createToken(@RequestBody JwtAuthRequest request) {
        this.authenicate(request.getUserName(), request.getPassword());
		UserDetails userDetails = this.userDetailsService.loadUserByUsername(request.getUserName());
		String token = this.jwtTokenHelper.genereateToken(userDetails);
		JwtAuthResponse response = new JwtAuthResponse();
		response.setToken(token);
		return new ResponseEntity<JwtAuthResponse>(response, HttpStatus.OK);

	}

	private void authenicate(String userName, String password) {
		UsernamePasswordAuthenticationToken authenticationToken = new UsernamePasswordAuthenticationToken(userName,password);
		this.authenticationManager.authenticate(authenticationToken);
	}

	
	
}
