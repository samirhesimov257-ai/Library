package com.jetacademy.v1.exception;

import org.apache.coyote.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.Map;

@RestControllerAdvice
public class GlobalExceptionHandling {


    @ExceptionHandler(AuthorNotFoundException.class)
    public ResponseEntity<?> AuthorIdHadler(AuthorNotFoundException ex){
        return ResponseEntity.badRequest().body(Map.of("error",ex.getMessage()));
    }
}
