package com.kh.AjaxSpringProject.controller;

import com.kh.AjaxSpringProject.dto.Person;
import com.kh.AjaxSpringProject.service.PersonServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PersonAjaxController {
    @Autowired
    private PersonServiceImpl personService;

    // /api/person 엔드포인트로 모든 사용자 데이터 반환
    @GetMapping("/api/person")
    public List<Person> getAllPersons() {
        return personService.getAllPerson();
    }
}