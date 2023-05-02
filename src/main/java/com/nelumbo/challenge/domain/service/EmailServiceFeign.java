package com.nelumbo.challenge.domain.service;

import com.nelumbo.challenge.domain.model.Email;

public interface EmailServiceFeign {

    public Email sendEmail(Email email);

}
