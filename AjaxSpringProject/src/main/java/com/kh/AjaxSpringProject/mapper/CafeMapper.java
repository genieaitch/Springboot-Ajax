package com.kh.AjaxSpringProject.mapper;

import com.kh.AjaxSpringProject.dto.Cafe;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CafeMapper {
    // 카페 목록 전체 조회 [전체] or [목록] or [리스트]를 작성하게 되면
    // List<DTO파일명> mapper.xml에서 작성한 id 명칭;
    List<Cafe> getAllCafes();

    // 하나의 데이터만 조회할 떄
    // DTO 파일명 mapper.xml 에서 작성한 id 명칭;
}
