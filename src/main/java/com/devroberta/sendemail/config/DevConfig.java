package com.devroberta.sendemail.config;

import com.devroberta.sendemail.service.EmailService;
import com.devroberta.sendemail.service.SendGridEmailService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("dev")
public class DevConfig {

    @Bean
    public EmailService emailService() {
        return new SendGridEmailService();
    }
}
