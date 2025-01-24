package com.kht.ecommerce.ecommerce_application.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Book {
    private int id;
    private String title;
    private String author;
    private String genre;
    private String imagePath;
}
