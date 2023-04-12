package com.adjecti.security.core.controller;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.adjecti.security.core.config.JwtTokenHelper;
import com.adjecti.security.core.dto.UserDTO;
import com.adjecti.security.core.model.Role;
import com.adjecti.security.core.model.User;
import com.adjecti.security.core.payloads.JwtAuthRequest;
import com.adjecti.security.core.payloads.JwtAuthResponse;
import com.adjecti.security.core.repository.RoleRepository;
import com.adjecti.security.core.repository.UserRepository;
import com.adjecti.security.core.service.UserService;

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
	
	@Autowired
    private BCryptPasswordEncoder passwordEncoder;

	@Autowired 
	private RoleRepository roleRepository;
	
	@Autowired 
	private UserService userService;
	
	
	
	@PostMapping("/signup")
    public ResponseEntity<?> registerUser(@RequestBody UserDTO userDto){
        // add check for username exists in a DB
        if(userRepository.existsByUserName(userDto.getUserName())){
            return new ResponseEntity<>("Username is already taken!", HttpStatus.BAD_REQUEST);
        }
        // create user object
        User user = new User();
        user.setFirstName(userDto.getFirstName());
        user.setMiddleName(userDto.getMiddleName());
        user.setLastName(userDto.getLastName());
        user.setUserName(userDto.getUserName());
        user.setEmailAddress(userDto.getEmailAddress());
        user.setPassword_(passwordEncoder.encode(userDto.getPassword_()));
        
        List<User> users = userService.getAllUsers();
        Role role = null;
        if(users.size()>0) {
        	role = roleRepository.findByName("ROLE_USER").get();
        }else {
        	role = roleRepository.findByName("ROLE_ADMIN").get();
        }
        user.setUserRole(Collections.singleton(role));
        userRepository.save(user);
        return new ResponseEntity<>("User registered successfully", HttpStatus.OK);

    }
	
	
	
	@PostMapping("/login")
	public ResponseEntity<JwtAuthResponse> createToken(@RequestBody JwtAuthRequest request) {
        System.out.println("print responseentity"+request.getUserName());
        System.out.println("password from the database"+request.getPassword());
        this.authenicate(request.getUserName(), request.getPassword());
		UserDetails userDetails = this.userDetailsService.loadUserByUsername(request.getUserName());
		System.out.println("userdetails --->"+userDetails.getUsername());
		String token = this.jwtTokenHelper.genereateToken(userDetails);
		JwtAuthResponse response = new JwtAuthResponse();
		response.setToken(token);
		return new ResponseEntity<JwtAuthResponse>(response, HttpStatus.OK);

	}

	private void authenicate(String userName, String password) {
		System.out.println("userName-"+userName+"password"+password);
		UsernamePasswordAuthenticationToken authenticationToken = new UsernamePasswordAuthenticationToken(userName,
				password);
		this.authenticationManager.authenticate(authenticationToken);
	}

	
	
}
