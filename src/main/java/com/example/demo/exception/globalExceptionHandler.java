package com.example.demo.exception;
import org.springframework.web.bind.annotation.*;
import 

@RestControllerAdvice
public class globalExceptionHandler{
    @ExceptionHandler(MethodArgumentNotValidException.class)
}