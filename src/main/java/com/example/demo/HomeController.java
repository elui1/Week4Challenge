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

    @RequestMapping("/Author")
    public String author() {
        return "Author";
    }

    @RequestMapping("/ForLoops")
    public String blog() {
        return "ForLoops";
    }

    @RequestMapping("/FizzBuzz")
    public String fizzBuzz() {
        return "FizzBuzz";
    }

    @RequestMapping("/Composition")
    public String composition() {
        return "Composition";
    }

    @RequestMapping("/Inheritance")
    public String inheritance() {
        return "Inheritance";
    }

    @RequestMapping("/Bootstrap")
    public String bootStrap() {
        return "Bootstrap";
    }

    @RequestMapping("/CSS")
    public String CSS() {
        return "CSS";
    }
}

