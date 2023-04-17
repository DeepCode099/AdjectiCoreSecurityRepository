package com.adjecti.security.core.service.impl;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.adjecti.security.core.exception.ResourceNotFoundException;
import com.adjecti.security.core.model.Role;
import com.adjecti.security.core.model.User;
import com.adjecti.security.core.repository.UserRepository;
import com.adjecti.security.core.service.RoleService;
import com.adjecti.security.core.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private PasswordEncoder bCryptPasswordEncoder;

	@Autowired
	private RoleService roleServie;

	public UserServiceImpl(UserRepository userRepository) {
		super();
		this.userRepository = userRepository;
	}

	@Override
	public User createUser(User user) {
		String password = user.getPassword_();
		user.setPassword_(bCryptPasswordEncoder.encode(password));
		System.out.println("encoded password" + user.getPassword_());
		List<User> users = getAllUsers();
		Role role = null;
		if (users.size() > 0) {
			role = roleServie.findByName("ROLE_USER").get();
		} else {
			role = roleServie.findByName("ROLE_ADMIN").get();
		}
		user.setUserRole(Collections.singleton(role));
		System.out.println("user object" + user.toString());
		return userRepository.save(user);
	}

	@Override
	public List<User> getAllUsers() {
		return userRepository.findAll();
	}

	@Override
	public User getUserById(long id) {
		return userRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("User", "Id", id));

	}

	@Override
	public User updateUser(User user, long id) {
		User existingUser = userRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("User", "Id", id));
		existingUser.setFirstName(user.getFirstName());
		existingUser.setMiddleName(user.getMiddleName());
		existingUser.setLastName(user.getLastName());
		existingUser.setEmailAddress(user.getEmailAddress());
		existingUser.setAgreedToTermsOfUse(user.getAgreedToTermsOfUse());
		existingUser.setComments(user.getComments());
		existingUser.setCompanyId(user.getCompanyId());
		existingUser.setContactId(user.getContactId());
		existingUser.setCreateDate(user.getCreateDate());

		existingUser.setDefaultUser(user.isDefaultUser());
		existingUser.setDigest(user.getDigest());
		existingUser.setEmailAddressVerified(user.isEmailAddressVerified());
		existingUser.setExternalReferenceCode(user.getExternalReferenceCode());
		existingUser.setFacebookId(user.getFacebookId());
		existingUser.setFailedLoginAttempts(user.getFailedLoginAttempts());
		existingUser.setGoogleUserId(user.getGoogleUserId());
		existingUser.setGraceLoginCount(user.getGraceLoginCount());
		existingUser.setGreeting(user.getGreeting());
		existingUser.setJobTitle(user.getJobTitle());
		existingUser.setLanguageId(user.getLanguageId());
		existingUser.setLastFailedLoginDate(user.getLastFailedLoginDate());
		existingUser.setLastLoginDate(user.getLastLoginDate());
		existingUser.setLastLoginIp(user.getLastLoginIp());
		existingUser.setLdapserverId(user.getLdapserverId());
		existingUser.setLockoutDate(user.getLockoutDate());
		existingUser.setLoginDate(user.getLoginDate());
		existingUser.setLoginIp(user.getLoginIp());

		existingUser.setOpenId(user.getOpenId());
		existingUser.setPasswordEncrypted(user.isPasswordEncrypted());
		existingUser.setPasswordModifiedDate(user.getPasswordModifiedDate());
		existingUser.setPasswordReset(user.isPasswordReset());
		existingUser.setPassword_(user.getPassword_());
		existingUser.setReminderQueryAnswer(user.getReminderQueryAnswer());
		existingUser.setReminderQueryQuestion(user.getReminderQueryQuestion());
		existingUser.setUserName(user.getUserName());
		existingUser.setStatus(user.getStatus());
		existingUser.setTimeZoneId(user.getTimeZoneId());
		return userRepository.save(existingUser);
	}

	@Override
	public void deleteUser(long id) {
		// check whether a user exist or not
		userRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("User", "Id", id));
		userRepository.deleteById(id);
	}

	@Override
	public Boolean existsByUserName(String userName) {
		return userRepository.existsByUserName(userName);
	}

	@Override
	public User findByUserName(String userName) {
		return userRepository.findByUserName(userName);
	}

}
