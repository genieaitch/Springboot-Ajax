package com.kht.ecommerce.ecommerce_application.service;

import com.kht.ecommerce.ecommerce_application.dto.Cart;

public interface CartService {
    Cart getCartByUserId(int id);
}
