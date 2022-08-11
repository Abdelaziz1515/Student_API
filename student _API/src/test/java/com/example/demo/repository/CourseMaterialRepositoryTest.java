package com.example.demo.repository;

import com.example.demo.entity.Course;
import com.example.demo.entity.CourseMaterial;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class CourseMaterialRepositoryTest {

    @Autowired
    private CourseMaterialRepository courseMaterialRepository;


    @Test
    public void saveCourseMaterial(){

        Course course=Course.builder()
                .title("Java")
                .credit(5)
                .build();
        CourseMaterial courseMaterial=
                CourseMaterial.builder()
                        .url("www.Google.com")
                        .course(course)
                        .build();
        courseMaterialRepository.save(courseMaterial);
    }

    @Test
    public void printCourseMaterials(){
        List<CourseMaterial>c=courseMaterialRepository.findAll();
        System.out.println(c);
    }






}
