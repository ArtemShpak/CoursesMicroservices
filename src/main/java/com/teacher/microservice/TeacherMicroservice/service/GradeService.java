// GradeService.java
package com.teacher.microservice.TeacherMicroservice.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.teacher.microservice.TeacherMicroservice.dao.Grades;
import com.teacher.microservice.TeacherMicroservice.dto.CourseDTO;
import com.teacher.microservice.TeacherMicroservice.dto.StudentDTO;
import com.teacher.microservice.TeacherMicroservice.feignClient.CourseClient;
import com.teacher.microservice.TeacherMicroservice.feignClient.StudentClient;
import com.teacher.microservice.TeacherMicroservice.repository.GradesRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class GradeService {

    private final StudentClient studentClient;
    private final CourseClient courseClient;
    private final GradesRepository gradeRepository;

    public void setMark(String json) throws JsonProcessingException {
        Map<String, Object> map = new ObjectMapper().readValue(json, Map.class);
        String studentName = (String) map.get("studentName");
        String courseName = (String) map.get("courseName");
        Integer mark = (Integer) map.get("mark");
        StudentDTO student = studentClient.getStudent(studentName);
        CourseDTO course = courseClient.getCourseByName(courseName);
        LocalDateTime now = LocalDateTime.now();
        Grades grade = new Grades(student.getId(), course.getId(), mark, now);
        gradeRepository.save(grade);
    }
}