package com.teacher.microservice.TeacherMicroservice.repository;

import com.teacher.microservice.TeacherMicroservice.dao.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeacherRepository extends JpaRepository<Teacher, Long> {
    Teacher findByName(String name);
}
