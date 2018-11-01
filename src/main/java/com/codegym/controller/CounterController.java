package com.codegym.controller;

import com.codegym.model.Mycounter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;
@Controller
@SessionAttributes("mycounter")
public class CounterController {
    @ModelAttribute("mycounter")
    public Mycounter setUpCounter() {
        return new Mycounter();
    }

    @GetMapping("/")
    public String get(@ModelAttribute("mycounter") Mycounter myCounter) {
        myCounter.increment();
        return "index";
    }

}
