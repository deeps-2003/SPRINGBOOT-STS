package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;

@RestController

public class test2Controller {
        @GetMapping("/students")
        public  String hello() {
        	return "Hello students";
        }
}
