package com.kh.Ajax_project.controller;

import com.kh.Ajax_project.DTO.Member;
import com.kh.Ajax_project.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
public class MemberController {

        @Autowired
        private MemberService memberService;

        // ResponseEntity 제대로 데이터를 전달했는지 확인
        /*
        ResponseEntity<>
                 ResponseEntity.ok();
        */

        @GetMapping("/")
        public String index() {
                return "index";
        }

        /*
        @GetMapping("/api/members")
        public List<Member> getAllMembers(){
            return memberService.getAllMembers();
        }
        */
}
