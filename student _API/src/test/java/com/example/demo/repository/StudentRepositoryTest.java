package com.example.demo.repository;

import com.example.demo.entity.Guardian;
import com.example.demo.entity.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class StudentRepositoryTest {
    @Autowired
    StudentRepository studentRepository;

    @Test
    public void saveStudent(){
        Student student=Student.builder()
                .emailId("zizo.a3991@gamil.com")
                .firstName("Abdelaziz")
                .lastName("Ahmed")
//                .guardian_email("giza@gmail.com")
//                .guardian_name("giza")
//                .guardian_mobile("123456789")
                .build();
        studentRepository.save(student);
    }


    @Test
    public void saveStudentWithGuardian(){
        Guardian guardian=Guardian.builder()
                .email("haram@gmail.com")
                .mobile("01023557745")
                .name("Haram")
                .build();

        Student student=Student.builder()
                .guardian(guardian)
                .firstName("Hatem")
                .lastName("Ahmed")
                .emailId("hamtem@gmail.com")
                .build();

        studentRepository.save(student);
    }


    @Test
    public void printAllStudent(){
        List<Student>students=studentRepository.findAll();
        System.out.println(students);
    }



    @Test
    public void printStudentByFirstName(){
        List<Student>students=
                studentRepository.findByFirstName("Hatem");
        System.out.println(students);
    }


    @Test
    public void printStudentByFirstNameContaining(){
        List<Student>students=
                studentRepository.findByLastNameContaining("Ah");
        System.out.println(students);
    }


    @Test
    public  void  printStudentByEmailAddressNative(){
        String student=studentRepository.getStudentFirstNameByEmailAddressNative("zizo.a3991@gamil.com");
        System.out.println(student);
    }


    @Test
    public void printStudentById(){
        List<Student>students=
                studentRepository.findById(Long.parseLong("2"));
        System.out.println(students);
    }






}