package com.learning.validation.advise;

import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class ApplicationExceptionHandler {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public Map<String, String> handleArgumentException(MethodArgumentNotValidException ex) {
        Map<String, String> exceptionMap = new HashMap<>();
        ex.getAllErrors().stream().forEach(c -> {
            exceptionMap.put(c.getObjectName(),c.getDefaultMessage());
        });
        return exceptionMap;
    }
}
