package com.example.demo;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "이유 없음")
public class DataNotFoundException extends RuntimeException{
	private static final long serialversionUId = 1L;
	public DataNotFoundException(String message) {
		super(message);
	}
}
