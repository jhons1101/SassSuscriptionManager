package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entity.Teacher;
import com.example.demo.service.TeacherService;

@RestController
@RequestMapping("/teachers")
public class TeacherController {

    @Autowired
    private TeacherService service;

    @GetMapping
    public List<Teacher> getAll() {
        return service.getAll();
    }

    @PostMapping
    public Teacher save(@RequestBody Teacher teacher) {
        return service.save(teacher);
    }
}
