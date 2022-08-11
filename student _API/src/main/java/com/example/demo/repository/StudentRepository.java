package com.example.demo.repository;

import com.example.demo.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    public List<Student>findByFirstName(String firstName);
    public List<Student>findByLastNameContaining(String name);
    public List<Student>findById(long studentId);

    @Query(
            nativeQuery = true,
            value = "select first_name from student where email_address=:emailId"
    )
    String getStudentFirstNameByEmailAddressNative(@Param("emailId") String emailId);
}