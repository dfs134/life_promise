package com.example.demo.User;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Service;

import groovy.util.logging.Slf4j;
import lombok.RequiredArgsConstructor;


@Service
@RequiredArgsConstructor
@Slf4j
public class LoginService {
	 @Autowired
	    private final UserRepository userRepository;

	    public boolean login(User user) {

	        Optional<UserDb> findUser = userRepository.findByUsername(user.getUsername());

	        if(findUser == null){
	            return false;
	        }

	        if(!findUser.equals(user.getPassword())){
	            return false;
	        }
	        return true;

	    }
}
