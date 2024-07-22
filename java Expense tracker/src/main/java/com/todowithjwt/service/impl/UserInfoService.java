package com.todowithjwt.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.todowithjwt.entity.User;
import com.todowithjwt.repository.UserInfoRepository;

@Service
public class UserInfoService implements UserDetailsService {

	@Lazy
	@Autowired
	private UserInfoRepository repository;

	@Autowired
	private PasswordEncoder encoder;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Optional<User> userDetail = repository.findByName(username);
		return userDetail.map(UserInfoDetails::new).orElseThrow(() -> new UsernameNotFoundException("User not found"));
	}

	public String addUser(User user) {
		user.setPassword(encoder.encode(user.getPassword()));
		repository.save(user);
		return "User Added Successfully";
	}
}