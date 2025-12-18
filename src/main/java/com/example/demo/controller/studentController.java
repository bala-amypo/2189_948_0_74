package com.example.demo.controller;
import java.util.List;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;


import com.example.demo.entity.studentEntity;
import com.example.demo.service.studentService;


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