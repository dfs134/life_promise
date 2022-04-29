package com.example.demo.User;



import java.util.Optional;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.demo.DataNotFoundException;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class UserService {
	private final UserRepository userRepository;
	private final PasswordEncoder passwordEncoder;
	
	public UserDb userDb(String username, String password, String name, String sex,
			String tel1, String tel2,  String tel3, String email, String email3,
		String agree, String agree2, String agree3) {
		UserDb user = new UserDb();
		user.setUsername(username);
		user.setPassword(passwordEncoder.encode(password));
		user.setName(name);
		user.setSex(sex);
		user.setTel1(tel1);
		user.setTel2(tel2);
		user.setTel3(tel3);
		user.setEmail(email);
		user.setEmail3(email3);
		user.setAgree(agree);
		user.setAgree2(agree2);
		user.setAgree3(agree3);
		this.userRepository.save(user);
		System.out.println(username + "/" + password + "/" +name + "/" +sex + "/" +tel1+ "/" +tel2+ 
				"/" +tel3+"/" +email+"/" +email3+"/" +agree+"/" +agree2+"/" +agree3);
		return user;
	}
	
	
//	public UserDb getUser(String username) {
//		System.out.println(username);
//		Optional<UserDb> user = this.userRepository.findByUsername(username);
//		System.out.println(username);
//		if(user.isPresent()) {
//			return user.get();
//		} else {
//			throw new DataNotFoundException("sitruser no found");
//		}
//	}
	 
}
