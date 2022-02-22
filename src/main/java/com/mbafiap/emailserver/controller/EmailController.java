package com.mbafiap.emailserver.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mbafiap.emailserver.component.EmailSenderComponent;
import com.mbafiap.emailserver.dto.Email;

@RestController
@RequestMapping("/email")
public class EmailController {
	
	private final EmailSenderComponent emailSenderComponent;
	
	public EmailController(EmailSenderComponent emailSenderComponent) {
		this.emailSenderComponent = emailSenderComponent;
	}

	@PostMapping("") 
	public ResponseEntity<Email> incluir(@RequestBody Email email) {
		emailSenderComponent.createMail(email);
		return new ResponseEntity<Email>(HttpStatus.OK);
	}

}