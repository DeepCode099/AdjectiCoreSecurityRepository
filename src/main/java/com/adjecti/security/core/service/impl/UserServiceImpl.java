package com.adjecti.security.core.service.impl;

import java.util.Base64;
import java.util.List;
import java.util.Set;

import org.springframework.stereotype.Service;

import com.adjecti.security.core.exception.ResourceNotFoundException;
import com.adjecti.security.core.model.Role;
import com.adjecti.security.core.model.User;
import com.adjecti.security.core.repository.RoleRepository;
import com.adjecti.security.core.repository.UserRepository;
import com.adjecti.security.core.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	private UserRepository userRepository;
	
	private RoleRepository roleRepository;

	public UserServiceImpl(UserRepository userRepository) {
		super();
		this.userRepository = userRepository;
	}

	@Override
	public User createUser(User user) {
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
