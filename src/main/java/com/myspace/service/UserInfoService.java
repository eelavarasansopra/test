package com.myspace.service;

import java.util.Optional;

import com.myspace.model.UserInfo;
import com.myspace.repo.UserInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserInfoService implements UserDetailsService{

		@Autowired
	    private UserInfoRepository repository;

	    @Autowired
	    private PasswordEncoder encoder;

	    @Override
	    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
	        Optional<UserInfo> userDetail = repository.findByFirstName(username);
	        // Converting userDetail to UserDetails
	        return userDetail.map(UserInfoDetails::new)
	                .orElseThrow(() -> new UsernameNotFoundException("User not found " + username));
	    }

	    public String addUser(UserInfo userInfo) {
	        userInfo.setPass(encoder.encode(userInfo.getPass()));
	        repository.saveAndFlush(userInfo);
	        return "User Added Successfully";
	    }


}
