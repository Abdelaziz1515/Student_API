package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
//@Table(name = "courseMaterial")
@ToString(exclude = "course")
public class CourseMaterial {
    @Id
    @SequenceGenerator(name = "courseMat_sequence",sequenceName = "courseMat_sequence",allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "courseMat_sequence")
    @Column(name = "Course_Material_Id")
    private long courseMatId;
    private String url;
    @OneToOne(
            cascade =CascadeType.ALL,
            fetch = FetchType.EAGER
    )
    @JoinColumn(name = "Course_Id",referencedColumnName = "Course_Id")
    private Course course;

}
