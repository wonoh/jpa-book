package com.wonoh.jpa.book;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("/hello")
    public String hello(Model model){
        model.addAttribute("data","wonoh");
        return "hello";
    }
    @GetMapping("/")
    public String index(Model model){
        return "index";
    }
}
