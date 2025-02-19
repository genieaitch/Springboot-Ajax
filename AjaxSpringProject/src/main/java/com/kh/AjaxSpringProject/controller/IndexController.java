package com.kh.AjaxSpringProject.controller;


import com.kh.AjaxSpringProject.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class IndexController {
    @Autowired
    private UserService userService;

    @GetMapping("/")
    public String index() {
        return "index";
    }

    //Ajax 와 별개로 /detail/ 원하는 회원정보번호를 통해서
    // userInfo.html을 보여줄 수 있도록 설정하는 controller
    @GetMapping("/detail")
    public String detail(@RequestParam("id") Integer id, Model model) {
        model.addAttribute("user", userService.getUserById(id));
        return "userInfo";
    }

    @GetMapping("/get/avatar")
    public String getAvatar() {
        return "jQueryAjax/Avatar";
    }

    @GetMapping("/get/randomLogo")
    public String getRandomLogo() {
        return "jQueryAjax/randomLogo";
    }

    @GetMapping("/get/product")
    public String getProduct() {
        return "jQueryAjax/product";
    }

    @GetMapping("/get/kakaoLogin")
    public String getKakaoLogin() {
        return "jQueryAjax/kakaoLogin";
    }
}