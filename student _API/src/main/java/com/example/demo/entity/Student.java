package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "student",
        uniqueConstraints = {
        @UniqueConstraint(name ="email_address_constrains",columnNames = "email_address")})
public class Student {
    @Id
    @SequenceGenerator(name = "student_sequence",sequenceName = "student_sequence",allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "student_sequence")
    @Column(name = "stId")
    private long studentId;
    private String firstName;
    private String lastName;
    @Column(name = "email_address",nullable = false)
    private String emailId;
    @Embedded
    Guardian guardian;



}
