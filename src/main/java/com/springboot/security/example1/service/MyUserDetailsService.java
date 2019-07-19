package com.springboot.security.example1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.springboot.security.example1.dao.UserPrincipal;
import com.springboot.security.example1.dao.UserRepository;
import com.springboot.security.example1.model.User;

/**
 * Service class
 * @author tarkhand
 *
 */
@Service
public class MyUserDetailsService implements UserDetailsService {

	/** Injects UserRepository instance **/
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = userRepository.findByUsername(username);
		if(user==null) {
			throw new UsernameNotFoundException("User not found");
		}
		return new UserPrincipal(user);
	}

}
