package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.header.writers.frameoptions.XFrameOptionsHeaderWriter;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

import com.example.demo.User.UserSecurityService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class SequrityConfig extends WebSecurityConfigurerAdapter{
	
	private final UserSecurityService userSecurityService;
	
	@Override
	protected void configure(HttpSecurity http) throws Exception{
		http.authorizeHttpRequests().antMatchers("/**")
		.permitAll().and().csrf().ignoringAntMatchers("/h2-console/**")
		.and().headers().addHeaderWriter(new XFrameOptionsHeaderWriter(XFrameOptionsHeaderWriter.XFrameOptionsMode.SAMEORIGIN))
		.and().formLogin().loginPage("/User/login").defaultSuccessUrl("/") // 로그인 설정 담당
		.and().logout().logoutRequestMatcher(new AntPathRequestMatcher("/User/logout"))
		.logoutSuccessUrl("/").invalidateHttpSession(true); // 로그아웃 설정 담당
	}
	
	@Bean
	public PasswordEncoder passwordEncoder() {
		System.out.println("dddddd");
		return new BCryptPasswordEncoder();
	}
	
	@Override
	public void configure(AuthenticationManagerBuilder auth) throws Exception{
		System.out.println("dddddd");
		auth.userDetailsService(userSecurityService).passwordEncoder(passwordEncoder());
	}
}
