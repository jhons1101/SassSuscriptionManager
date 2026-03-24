package com.example.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.example.demo.entity.Teacher;

public interface TeacherRepository extends MongoRepository<Teacher, String> {
}
