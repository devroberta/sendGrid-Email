package com.devroberta.sendemail.service;

import com.devroberta.sendemail.dto.EmailDTO;

public interface EmailService {

    void sendEmail(EmailDTO emailDTO);
}
