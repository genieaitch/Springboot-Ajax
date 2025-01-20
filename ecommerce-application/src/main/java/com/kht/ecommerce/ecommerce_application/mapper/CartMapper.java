package com.kht.ecommerce.ecommerce_application.mapper;

import com.kht.ecommerce.ecommerce_application.dto.Cart;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CartMapper {
    Cart getCartByUserId(int id);
}
