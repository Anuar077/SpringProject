package com.example.midterm.dto;

import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class BookDto {

    @NotBlank
    private String author;

    @NotBlank
    private String title;

    public BookDto(String author, String title) {
        this.author = author;
        this.title = title;
    }

    public BookDto() {
    }
}
