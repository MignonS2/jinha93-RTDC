package com.rtdc.controller;

import com.rtdc.dto.HelloResponseDto;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "hello, RTDC!!!";
    }
    
    @GetMapping("/hello/dto")
    public HelloResponseDto helloResponseDto(@RequestParam("name") String name, @RequestParam("nickname") String nickname) {
        return new HelloResponseDto(name, nickname);
    }

}