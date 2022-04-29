package com.example.demo.User;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class UserDb {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long usercnt;

	@Column(unique = true)
	private String username;
	
	private String password;
	
	private String name;
	
	private String sex;

	private String tel1;

	private String tel2;

	private String tel3;
	
	private String email;
	
	private String email3;

	private String agree;

	private String agree2;

	private String agree3;
	

}
