package com.kht.ecommerce.ecommerce_application.dto;

import lombok.*;

@AllArgsConstructor
@Setter
@NoArgsConstructor
@Getter
@ToString

public class User {

    private int id;
    private String email;
    private String username;
    private String password;
    private String firstname;
    private String lastname;
    private String phone;
    private String city;
    private String street;
    private int StreetNumber;
    private String zipcode;
    private String geolocationLat;
    private String geolocationLong;
}
