package com.nelumbo.challenge.domain.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import static org.springframework.http.HttpStatus.BAD_REQUEST;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(value
            = BadRequestException.class)
    @ResponseStatus(BAD_REQUEST)
    public @ResponseBody ErrorResponse
    handleBadRequestException(BadRequestException ex)
    {
        return new ErrorResponse(ex.getMessage());
    }

}
