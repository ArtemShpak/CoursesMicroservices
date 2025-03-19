package com.teacher.microservice.TeacherMicroservice.feignClient;

import com.teacher.microservice.TeacherMicroservice.dto.CourseDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "courses-microservice", url = "http://localhost:8081")
public interface CourseClient {

    @GetMapping("/courses/byName")
    public CourseDTO getCourseByName(@RequestParam String courseName);
}
