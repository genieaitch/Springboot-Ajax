package com.kht.ecommerce.ecommerce_application.dto;

import lombok.*;

@AllArgsConstructor
@Setter
@NoArgsConstructor
@Getter
@ToString
public class Product {
    
    private int id;
    private String title;
    private String price;
    private String description;
    private String category;
    private String image;
    private String ratingRate;
    private String ratingCount;
}
