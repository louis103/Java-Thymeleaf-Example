package com.example.javathymeleafdemo.controllers;

import com.example.javathymeleafdemo.Models.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;

@Controller
public class PersonController {
    @GetMapping
    String getPeople(Model model){
        model.addAttribute("something","This is coming from the controller");
        model.addAttribute("people", Arrays.asList(
                new Person("John", 22),
                new Person("Sarah", 20),
                new Person("Peter", 23)
        ));
        return "people";
    }
}
