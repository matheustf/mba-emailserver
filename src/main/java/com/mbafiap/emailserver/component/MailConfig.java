package com.mbafiap.emailserver.component;

import java.util.Properties;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;

@Configuration
public class MailConfig {
	
	@Bean
	public JavaMailSender javaMailSender() {
		JavaMailSenderImpl mailSender = new JavaMailSenderImpl();
		Properties props = mailSender.getJavaMailProperties();

	    mailSender.setHost("smtp.gmail.com");
	    mailSender.setUsername("lojatestmba@gmail.com");
	    mailSender.setPassword("officialstore");
	    
	    mailSender.setPort(587);
	    
	    props.put("mail.smtp.ssl.trust", "smtp.gmail.com");
	    props.put("mail.transport.protocol", "smtp");
	    props.put("mail.smtp.auth", "true");
	    props.put("mail.smtp.starttls.enable", "true");
	    props.put("mail.debug", "true");
	    
	    return mailSender;
	}
	
}
