package com.zafar.service;

import java.util.ArrayList;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
@Service
public class UserDefineService  implements UserDetailsService
{

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		if(username.equals("zafar"))
		{
			return new User("zafar","zafar123",new ArrayList<>());
			
			
		}
		else
		{
			throw new UsernameNotFoundException("Unable to find user");
		}
	}

}
