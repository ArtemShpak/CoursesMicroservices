package com.teacher.microservice.TeacherMicroservice.repository;

import com.teacher.microservice.TeacherMicroservice.dao.Grades;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GradesRepository extends JpaRepository<Grades, Long> {
}
