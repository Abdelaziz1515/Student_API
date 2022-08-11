package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Teacher {
    @Id
    @SequenceGenerator(name = "teacher_sequence",sequenceName = "teacher_sequence",allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "teacher_sequence")
    @Column(name = "Teacher_Id")
    private long teacherId;
    private String firstName;
    private String lastName;

    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    @JoinColumn(
            name = "Teacher_Id",
            referencedColumnName = "Teacher_Id"
    )
    private List<Course>courses;

}
