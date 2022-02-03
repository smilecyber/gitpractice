package com.cydeo.controller;

import com.cydeo.entity.Course;
import com.cydeo.entity.Program;
import com.cydeo.service.ProgramService;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class CourseController {
    private final ProgramService programService;

    public String createCourse(Course course){
        return "success";
    }
}
