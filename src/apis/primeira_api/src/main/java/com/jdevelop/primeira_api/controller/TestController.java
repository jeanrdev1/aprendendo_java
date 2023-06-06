package com.jdevelop.primeira_api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jdevelop.primeira_api.utils.DB;

@RestController
@RequestMapping("test") // url:8080/test
public class TestController {
    
    @GetMapping // GET: url:8080/test
    public String getValue() {
        return DB.value;
    }

    @PostMapping // POST: url:8080/test
    public void setValue(@RequestBody String value) {
        DB.value = value;
    }
}