package com.kh.AjaxSpringProject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CafeController {
    @GetMapping("/all/cafe")
    public String allCafe() {
        return "cafe";
    }
}
