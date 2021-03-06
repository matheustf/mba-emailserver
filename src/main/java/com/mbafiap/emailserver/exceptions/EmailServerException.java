package com.mbafiap.emailserver.exceptions;

import org.springframework.http.HttpStatus;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class EmailServerException extends Exception {

	private static final long serialVersionUID = 1L;
	
	private HttpStatus statusCode;
	
	private String message;
}