package com.nelumbo.challenge.domain.client;

import com.nelumbo.challenge.domain.model.Email;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(name = "email-service", url = "http://localhost:8091")
public interface EmailFeignClient {

    @PostMapping("/sendEmail")
    public Email sendEmail(Email email);

}
