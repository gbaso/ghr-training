package com.github.gbaso.ghr;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
    @GetMapping("/")
    public String welcome() {
        return "Welcome to GHR Training";
    }

    @GetMapping("/hello")
    public String hello(@RequestParam String name) {
        return "Hello " + name;
    }
}
