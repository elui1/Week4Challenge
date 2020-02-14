package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String index() {
        return "index";
    }

    @RequestMapping("/About")
    public String bootCamp() {
        return "About";
    }

    @RequestMapping("/ForLoops")
    public String blog() {
        return "ForLoops";
    }

    @RequestMapping("/FizzBuzz")
    public String fizzBuzz() {
        return "FizzBuzz";
    }
}

