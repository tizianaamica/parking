package com.nelumbo.challenge.domain.service;

import com.nelumbo.challenge.domain.client.EmailFeignClient;
import com.nelumbo.challenge.domain.model.Email;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmailServiceFeignImpl implements EmailServiceFeign {

    @Autowired
    private EmailFeignClient emailFeignClient;
    @Override
    public Email sendEmail(Email email) {
        return emailFeignClient.sendEmail(email);
    }
}
