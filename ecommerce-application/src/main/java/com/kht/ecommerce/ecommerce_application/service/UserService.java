package com.kht.ecommerce.ecommerce_application.service;

import com.kht.ecommerce.ecommerce_application.dto.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    List<User> getAllUsers();

    //사용자 저장
    void insertUser(User user);

    //이메일 존재 유무 확인
    boolean existByEmail(String email);

    //사용자 상세보기
    List<User> getUserById(String id);

    User getByUserId(int id);

    User updateUser(User user);
}
