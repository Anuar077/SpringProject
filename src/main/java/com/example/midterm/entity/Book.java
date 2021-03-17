package com.example.midterm.entity;

import com.example.midterm.dto.BookDto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Book {

    @Id
    @GeneratedValue
    private int id;

    private String author;
    private String title;

    public Book(String author, String title) {
        this.author = author;
        this.title = title;
    }

    public Book( BookDto postDto) {
        this.author = postDto.getAuthor();
        this.title = postDto.getTitle();
    }

    public Book() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Post{" +
                "id=" + id +
                ", author='" + author + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}