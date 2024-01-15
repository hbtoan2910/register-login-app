package com.ryanhuynh.demo.email;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class EmailService implements EmailSender {
	private static final Logger logger = LoggerFactory.getLogger(EmailService.class);
	
	private final JavaMailSender mailSender;
	
	@Override
	@Async
	public void send(String to, String email) {
		
		try {
			MimeMessage mimeMessage = mailSender.createMimeMessage(); //Instead of a SimpleMailMessage, use the MimeMessage, which will allow you to set the email’s content as HTML with the setContent method
			MimeMessageHelper helper = new MimeMessageHelper(mimeMessage, "UTF-8");

			helper.setText(email, true);// Use true to enable HTML content
			helper.setTo(to);
			helper.setSubject("Please confirm your email !");
			helper.setFrom("ryan@gmail.com"); //if using real Gmail to test, we can omit this, cause from_email will be your personal email.
			
			mailSender.send(mimeMessage);
			logger.info("SENT");
			
		} catch (MessagingException e) {
			logger.error("Failed to send email", e);
			throw new IllegalStateException("Failed to send email.");
		}
	}

}
