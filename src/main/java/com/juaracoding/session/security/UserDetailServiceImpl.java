package com.juaracoding.session.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.juaracoding.session.entity.UserModel;
import com.juaracoding.session.repository.UserRepository;

public class UserDetailServiceImpl implements UserDetailsService {
	@Autowired
	private UserRepository userRepo;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		UserModel user = userRepo.getUserByUsername(username);
		
		if(user == null) {
			throw new UsernameNotFoundException("User tidak ditemukan");
		}
		return new MyUserDetails(user);
	}

}
