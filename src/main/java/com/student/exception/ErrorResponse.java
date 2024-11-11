package com.student.exception;

import org.springframework.http.HttpStatus;

import lombok.Data;

@Data
public class ErrorResponse {
    private String message;
  
    private int status;
    private HttpStatus code;
    public ErrorResponse(int status,String message,HttpStatus code) {
        this.message = message;
       
        this.status = status;
        this.code=code;
    }

    // Getters and setters
}
