package hotel_booking.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import hotel_booking.dto.AccountDTO;

@Service
public class MyUserDetailsService implements UserDetailsService {
	@Autowired
	private AccountService accountService;

	public MyUserDetailsService() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		AccountDTO user = accountService.findAccountByEmailOrUserOrPhoneNumber(username);
		if (user == null) {
			throw new UsernameNotFoundException(username);
		}
		return user;
	}

}
