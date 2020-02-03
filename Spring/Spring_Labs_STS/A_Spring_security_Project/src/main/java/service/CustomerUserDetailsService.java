package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import DAO.UserAuthDao;
import DTO.CustomUserDetails;

public class CustomerUserDetailsService implements UserDetailsService{
	
	@Autowired
	private UserAuthDao userAuthDAO;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		CustomUserDetails user = userAuthDAO.getUserById(username);
		if(user==null) {
			throw new UsernameNotFoundException(username);
		}
		return user;
	}
	
	
	
}
