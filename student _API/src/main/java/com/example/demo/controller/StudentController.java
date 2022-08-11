package com.example.demo.CONTROLLER;

import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping()

public class StudentController {

    @Autowired
    StudentRepository studentRepository;

    @GetMapping("/all")
    List<Student> getStudent(){ return studentRepository.findAll();}

    @GetMapping(path = "{firstName}")
    List<Student> getStudent(@PathVariable String firstName ){return studentRepository.findByFirstName(firstName);}

    @PostMapping("/set")
    Student createStudent(@RequestBody Student student){
        return studentRepository.save(student);

    }


}
