package com.example.demo.repository;

import com.example.demo.entity.Course;
import com.example.demo.entity.Teacher;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class TeacherRepositoryTest {


    @Autowired
    private TeacherRepository teacherRepository;



    @Test
    public void saveTeacher(){
        Course course=Course.builder()
                .credit(7)
                .title("python")
                .build();
        Course course1=Course.builder()
                .credit(8)
                .title("Git")
                .build();
        Teacher teacher=Teacher.builder()
                .courses(List.of(course,course1))
                .firstName("Zizo")
                .lastName("Ahmed")
                .build();
        teacherRepository.save(teacher);
    }



}