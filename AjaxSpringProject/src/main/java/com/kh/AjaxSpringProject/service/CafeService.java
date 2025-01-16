package com.kh.AjaxSpringProject.service;

import com.kh.AjaxSpringProject.dto.Cafe;

import java.util.List;

public interface CafeService {
    List<Cafe> getAllCafes();
    List<Cafe> getCafeInfo(int id);
}
