package com.example.midterm.service.person.person;

import com.example.midterm.dto.AuthRequest;
import com.example.midterm.dto.BookDto;
import com.example.midterm.dto.BookRequest;
import com.example.midterm.dto.PersonDto;
import com.example.midterm.entity.Person;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class PersonImpl implements PersonService {

    @Override
    public Map<String, Object> registration(PersonDto request) {
        return null;
    }

    @Override
    public Map<String, Object> auth(AuthRequest request) {
        return null;
    }

    @Override
    public ResponseEntity<?> addPost(BookRequest request) {
        return null;
    }

    @Override
    public List<BookDto> allPosts(String author) {
        return null;
    }


    @Override
    public Person getByLogin(String login) {
        return null;
    }

    @Override
    public void save(Person person) {

    }
}