package com.example.demo.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class UserSecurityService implements UserDetailsService {
	
	private final UserRepository userRepository;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException{
		Optional<UserDb> _siteUser = this.userRepository.findByUsername(username);
		System.out.println("제발좀" +username);
		System.out.println("제발좀" +_siteUser);
		if(_siteUser.isEmpty()) {
			throw new UsernameNotFoundException("사용자는 찾을수 없음");
		}
		UserDb siteUser = _siteUser.get();
		List<GrantedAuthority> authorities = new ArrayList<>();
		System.out.println("제발좀" +username);
		System.out.println("제발좀" +_siteUser);
		if("admin".equals(username)) {
			authorities.add(new SimpleGrantedAuthority(UserRole.ADMIN.getValue()));
		} else {
			authorities.add(new SimpleGrantedAuthority(UserRole.USER.getValue()));
		}
		System.out.println("제발좀" +username);
		System.out.println("제발좀" +_siteUser);
		return new User(siteUser.getUsername(), siteUser.getPassword(), authorities);
	}
	
}
