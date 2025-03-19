package com.teacher.microservice.TeacherMicroservice.feignClient;

import com.teacher.microservice.TeacherMicroservice.dto.StudentDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "student-microservice", url = "http://localhost:8080")
public interface StudentClient {

    @GetMapping("/student/find")
    public StudentDTO getStudent(@RequestParam String studentName);
}
