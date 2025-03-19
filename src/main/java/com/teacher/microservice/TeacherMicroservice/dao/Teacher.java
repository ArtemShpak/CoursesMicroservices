// CoursesMicroservice/src/main/java/com/courses/microservice/CoursesMicroservice/dao/Teacher.java
package com.teacher.microservice.TeacherMicroservice.dao;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name = "teachers")
public class Teacher {

    // Getters and setters
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 100)
    private String name;

    @Column(nullable = false, length = 100, unique = true)
    private String email;

    // Constructors
    public Teacher() {}

}