package com.kh.Ajax_project.service;
import com.kh.Ajax_project.DTO.Member;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface MemberService {
    List<Member> getAllMembers();
}
