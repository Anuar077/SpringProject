package com.example.midterm.dto;

import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class PersonDto {

    @NotBlank
    private String login;

    @NotBlank
    private String password;

    @NotBlank
    private String address;
}
