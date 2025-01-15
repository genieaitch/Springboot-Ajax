package com.kh.Ajax_project.controller;

import com.kh.Ajax_project.DTO.Member;
import com.kh.Ajax_project.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class DataController {

    @Autowired
    MemberService memberService;
/*
    @GetMapping("/api/data")
    public ResponseEntity<Map<String,String>> getData(){
        Map<String,String> map = new HashMap<>();
        map.put("msg","안녕하세요~~");
        map.put("status","성공~~");
        return ResponseEntity.ok(map);
    }

 */

    @GetMapping("/api/member")
    public List<Member> getAllMembers(){
        List<Member> members = memberService.getAllMembers();
        System.out.println(members.toString());
        return members;
    }
}
