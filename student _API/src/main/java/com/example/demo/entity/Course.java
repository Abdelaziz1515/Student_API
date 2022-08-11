package com.example.demo.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Course {
    @Id
    @SequenceGenerator(name = "course_sequence",sequenceName = "course_sequence",allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "course_sequence")
    @Column(name = "Course_Id")
    private long courseId;
    private String title;
    private  Integer credit;

    @OneToOne(mappedBy ="course")
    private CourseMaterial courseMaterial;

}
