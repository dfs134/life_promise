package com.example.demo.User;

import javax.validation.Valid;

import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
@RequestMapping("/User")
public class UserController {

	private final UserService userService;

	@GetMapping("/signUp")
	public String signUp(UserCreateForm userCreateForm) {
		return "contents/signUp";
	}

	@PostMapping("/signUp")
	public String signUp(@Valid UserCreateForm userCreateForm, BindingResult bindingResult) {

		if (bindingResult.hasErrors()) {
			return "signUp";
		}

		if (!userCreateForm.getPassword().equals(userCreateForm.getRepassword())) {
			bindingResult.rejectValue("repasswd", "passwordInCorrect", "2개의 패스워드가 일치하지 않습니다");
			return "signUp";
		}

		try {
			userService.userDb(userCreateForm.getUsername(), userCreateForm.getPassword(), userCreateForm.getName(),
					userCreateForm.getSex(), userCreateForm.getTel1(), userCreateForm.getTel2(),
					userCreateForm.getTel3(), userCreateForm.getEmail(), userCreateForm.getEmail3(),
					userCreateForm.getAgree(), userCreateForm.getAgree2(), userCreateForm.getAgree3());
		} catch (DataIntegrityViolationException e) {

			bindingResult.reject("signupFailed", "이미 등록이 되어있는 ID 입니다");
			return "signUp";

		} catch (Exception e) {
			bindingResult.reject("signupFailed", e.getMessage());
			return "signUp";
		}

		return "contents/index";

	}

	
//	  @GetMapping("/login") 
//	  public String login() { 
//		  System.out.println("하");
//		  return "contents/login"; 
//	  }
	  
	 


}
