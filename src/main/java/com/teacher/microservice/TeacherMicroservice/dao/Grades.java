package com.teacher.microservice.TeacherMicroservice.dao;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@Table(name = "grades")
@Entity
public class Grades {
    @Id
    private Long id;

    @Column(nullable = false)
    private Long  studentId;

    @Column(nullable = false)
    private Long  courseId;

    @Column(nullable = false)
    private int grade;

    @Column(nullable = false)
    private String dataAssigment;

    public Grades(Long studentId, Long courseId, int grade, String dataAssigment) {
        this.studentId = studentId;
        this.courseId = courseId;
        this.grade = grade;
        this.dataAssigment = dataAssigment;
    }

    public Grades(Long id, Long courseId, Integer mark, LocalDateTime now) {}
}
