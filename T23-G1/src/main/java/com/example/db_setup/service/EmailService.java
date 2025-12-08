package com.example.db_setup.service;

import org.springframework.context.MessageSource;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.util.Locale;

@Service
public class EmailService {

    private final JavaMailSender javaMailSender;
    private final MessageSource messageSource;

    public EmailService(JavaMailSender javaMailSender, MessageSource messageSource) {
        this.javaMailSender = javaMailSender;
        this.messageSource = messageSource;
    }

    public void sendPasswordResetEmail(String email, String resetToken, Locale locale) throws MessagingException {
        MimeMessage message = javaMailSender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(message, true);

        helper.setTo(email);
        helper.setSubject(messageSource.getMessage("emailService.sendResetPswToken.obj", null, locale));
        helper.setText(messageSource.getMessage("emailService.sendResetPswToken.msg", null, locale) + "\n" + resetToken);

        javaMailSender.send(message);

    }

}