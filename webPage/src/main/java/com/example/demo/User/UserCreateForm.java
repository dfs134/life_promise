package com.example.demo.User;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserCreateForm {

	@Size(min = 4, max = 15)
	@NotEmpty(message = "아이디는 필히 입력되어아 합니다")
	private String username;
	
	@NotEmpty(message = "비밀번호를 입력해 주세요")
	private String password;
	
	@NotEmpty(message = "비밀번호는 일치해야 합니다")
	private String repassword;
	
	@NotEmpty(message = "이름을 입력해 주세요")
	private String name;
	
	@NotEmpty(message = "성별을 선택해 주세요")
	private String sex;
	
	@NotNull(message = "휴대폰 번호를 확인해 주세요")
	private String tel1;
	
	@NotNull(message = "휴대폰 중간 번호 확인해 주세요")
	private String tel2;
	
	@NotNull(message = "휴대폰 마지막 번호 확인해 주세요")
	private String tel3;
	
	@NotEmpty(message = "이메일은 필수 입력사항 입니다")
	private String email;
	
	@NotEmpty(message = "이메일을 확인해 주세요")
	private String email3;
	
	@NotEmpty(message = "이용약관을 체크해 주세요")
	private String agree;
	
	@NotEmpty(message = "이용약관을 체크해 주세요")
	private String agree2;
	
	@NotEmpty(message = "선택정보를 체크해 주세요")
	private String agree3;
	
}
