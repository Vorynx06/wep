package org.xyz.josefeus.wep.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
@RequestMapping("/hello")
public class HelloController {

    @Value("${test.user}")
    private String name;

    @GetMapping
    public String hello() {
        return "Hello World";
    }

    @GetMapping("/user")
    public String getUser() {
        return name;
    }
}
