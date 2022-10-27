package com.taskmanagementsytem.security.service;

import com.taskmanagementsytem.model.User;
import com.taskmanagementsytem.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class JwtUserDetailsService implements UserDetailsService {

	@Autowired
	private UserRepo userRepo;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

		User user=
		userRepo.findByUsername(username);

		if(username.equals(user.getUsername()) ){
			return new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPassword(),
					user.getUserRoles());
		}
		else
			throw new UsernameNotFoundException("User not found with username: " + username);

		/*if ("javainuse".equals(username)) {
			return new User("javainuse", "$2a$10$slYQmyNdGzTn7ZLBXBChFOC9f6kFjAqPhccnP6DxlWXx2lPk1C3G6",
					new ArrayList<>());
		} else {
			throw new UsernameNotFoundException("User not found with username: " + username);
		}*/


	}

}