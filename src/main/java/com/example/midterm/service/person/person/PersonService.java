package com.example.midterm.service.person.person;

import com.example.midterm.dto.AuthRequest;
import com.example.midterm.dto.BookDto;
import com.example.midterm.dto.BookRequest;
import com.example.midterm.dto.PersonDto;
import com.example.midterm.entity.Person;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Map;

public interface PersonService {

    Map<String , Object> registration(PersonDto request);
    Map<String , Object> auth(AuthRequest request);
    ResponseEntity<?> addPost(BookRequest request);
    List<BookDto> allPosts(String author );
    Person getByLogin(String login);
    void save(Person person);
}
