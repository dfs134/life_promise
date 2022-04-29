package com.example.demo.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import groovy.util.logging.Slf4j;
import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
@Slf4j
@RequestMapping("/User")
public class LoginController {
	 	@Autowired
	    private final LoginService loginService;

	    @GetMapping("/login")
	    public String login() {
	        return "contents/login";
	    }

	    @PostMapping("/login")
	    public String loginId(@ModelAttribute User user) {
	        if(loginService.login(user)){
	            return "redirect:/";
	        }
	        return "login";
	    }
}
