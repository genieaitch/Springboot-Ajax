package com.kh.AjaxSpringProject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class CafeController {
    @GetMapping("/all/cafe")
    public String allCafe() {
        return "cafe";
    }
}
