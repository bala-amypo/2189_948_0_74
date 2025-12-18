package com.example.demo.controller;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Autowired;
import com.example.demo.entity.studentEntity;
import com.example.demo.service.studentService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;
import jakarta.validation.Valid;

@RestController
public class studentController{

    @Autowired
    studentService service;

    @GetMapping("/getAllStudent")
    public List<studentEntity>getAll(){
        return service.getAll();
    }

    @PostMapping("/add")
    public studentEntity addStudent(@Valid @RequestBody studentEntity student){
        return service.addStudent(student);
    }
}