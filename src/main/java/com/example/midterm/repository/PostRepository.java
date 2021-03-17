package com.example.midterm.repository;

import com.example.midterm.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PostRepository extends JpaRepository<Book, Long> {


}