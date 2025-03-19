// TeacherMicroservice/src/main/java/com/teacher/microservice/TeacherMicroservice/controller/TeacherController.java
package com.teacher.microservice.TeacherMicroservice.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.teacher.microservice.TeacherMicroservice.dao.Teacher;
import com.teacher.microservice.TeacherMicroservice.repository.TeacherRepository;
import com.teacher.microservice.TeacherMicroservice.service.GradeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/teacher")
@RequiredArgsConstructor
public class TeacherController {

    private final TeacherRepository teacherRepository;
    private final GradeService gradeService;

    @GetMapping("/find")
    public Teacher findTeacherId(@RequestParam String teacherName) {
        return teacherRepository.findByName(teacherName);
    }

    @PostMapping("/setMark")
    public void setMark(@RequestBody String json) throws JsonProcessingException {
        gradeService.setMark(json);
    }
}