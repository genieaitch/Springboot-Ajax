package com.kht.ecommerce.ecommerce_application.mapper;

import com.kht.ecommerce.ecommerce_application.dto.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    //사용자 조회
    List<User> getAllUsers();

    //사용자 저장
    void insertUser(User user);

    //이메일 존재 유무 확인
    int existByEmail(String email);

    //사용자 상세보기
    List<User> getUserById(String id);

    User getByUserId(int id);

    //사용자 수정하기
    void updateUser(User user);
}
