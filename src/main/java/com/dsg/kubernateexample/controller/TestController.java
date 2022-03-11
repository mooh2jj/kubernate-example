package com.dsg.kubernateexample.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/dsg")
    public String dsg() {
        return "dsg!!";
    }
}
