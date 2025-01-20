package com.kh.AjaxSpringProject.dto;

import lombok.*;

@AllArgsConstructor
@Getter
@NoArgsConstructor
@Setter
@ToString

public class Person {
    private int id;
    private String email;
    private String username;
    private String password;
    private String firstname;
    private String lastname;
    private String phone;
    private String city;
    private String street;
    private String streetNumber;
    private String zipcode;
    private String geolocationLat;
    private String geolocationLong;
}
