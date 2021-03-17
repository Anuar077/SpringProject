package com.example.midterm.dto;

import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class BookRequest {

    @NotBlank
    private int author;

    @NotBlank
    private String title;

}