package com.kh.AjaxSpringProject.controller;

import com.kh.AjaxSpringProject.dto.Cafe;
import com.kh.AjaxSpringProject.dto.User;
import com.kh.AjaxSpringProject.service.CafeService;
import com.kh.AjaxSpringProject.service.CafeServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
public class CafeAjaxController {

    @Autowired
    // AI가 CafeService 만 추천하더라도 실질적인 코드가 적혀있는
    // impl 을 무조건 붙이기
    private CafeServiceImpl cafeService;

    @GetMapping("/api/cafes")
    // public 다음에 자료형으로 CafeServiceImpl.java 파일에
    // getAllCafes() 메서드 자료형으로 List<cafe>로 작성했기 때문에
    // public 다음에 List<Cafe>가 자료형으로 와야함
    public List<Cafe> getAllCafes() {
        List<Cafe> cafes = cafeService.getAllCafes();
        log.info("Cafes: {}", cafes);
        return cafeService.getAllCafes();
    }

    @GetMapping("/api/cafes/{id}")
    public Cafe getCafe(@PathVariable int id) {
        Cafe cafe = (Cafe) cafeService.getCafeInfo(id);
        log.info("Cafe: {}", cafe);
        return cafe;
    }

}
