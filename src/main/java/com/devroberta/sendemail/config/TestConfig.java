package com.devroberta.sendemail.config;

import com.devroberta.sendemail.service.EmailService;
import com.devroberta.sendemail.service.MockEmailService;
import com.devroberta.sendemail.service.SendGridEmailService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("test")
public class TestConfig {

    @Bean
    public EmailService emailService() {
        return new MockEmailService();
    }
}
