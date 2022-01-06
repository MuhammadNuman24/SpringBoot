package com.example.java;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/person")
public class NumanController {
    @GetMapping("/list")
    private List<NumanModel> getPerson() {
        return Collections.singletonList(new NumanModel("Numan"));
    }
    }
