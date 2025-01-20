package com.kht.ecommerce.ecommerce_application.dto;

import lombok.*;

@AllArgsConstructor
@Setter
@NoArgsConstructor
@Getter
@ToString

public class Cart {

    private int id;
    private String userId;
    private String date;

    //products table 컬럼명
    private int cartId;
    private String title;
    private int price;
    private int discount;
    
}
