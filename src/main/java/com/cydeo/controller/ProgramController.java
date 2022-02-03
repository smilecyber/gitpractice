package com.cydeo.controller;

import com.cydeo.entity.Program;
import com.cydeo.service.ProgramService;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class ProgramController {
    private final ProgramService programService;

    public String createProgram(Program program){
        return programService.createProgram(program);
    }
}
