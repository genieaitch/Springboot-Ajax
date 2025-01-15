package com.kh.Ajax_project.service;

import com.kh.Ajax_project.DTO.Member;
import com.kh.Ajax_project.Mapper.MemberMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberServiceImpl implements MemberService {

    //필드 삽입은 권장되지 않습니다.
    @Autowired
    private MemberMapper memberMapper;

    @Override
    public List<Member> getAllMembers() {
        return memberMapper.getAllMembers();
    }
}
