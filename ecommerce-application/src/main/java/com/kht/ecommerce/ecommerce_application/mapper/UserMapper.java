package com.kht.ecommerce.ecommerce_application.mapper;

import com.kht.ecommerce.ecommerce_application.dto.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    //DB에서 데이터를 가져올 때만 DTO 사용
    //사용자 조회
    List<User> getAllUsers();
    User getByUserId(int id);

    //사용자 저장
    void insertUser(User user);

    //이메일 존재 유무 확인
    int existByEmail(String email);

    //사용자 상세보기
    List<User> getUserById(String id);

    //int GET = 몇 개 찾았는지
    // 수정하기 수정을 1가지만 진행할 경우 void로 작성할 수 있음
    // 갯수가 여러개일 경우 int 사용하는 것이 좋음
    //사용자 수정하기
    int updateUser(User user);
}
