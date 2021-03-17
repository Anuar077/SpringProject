package com.example.midterm.controller;

import com.example.midterm.dto.AuthRequest;
import com.example.midterm.dto.BookDto;
import com.example.midterm.dto.BookRequest;
import com.example.midterm.dto.PersonDto;
import com.example.midterm.service.person.person.PersonService;;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/v1/person")
public class PersonController {

    private final PersonService personService;


    @Autowired
    public PersonController(PersonService personService) {
        this.personService =personService;
    }


    @PostMapping(value = "/register")
    public Map<String , Object> signUp(@RequestBody PersonDto request){
        return personService.registration(request);
    }

    @PutMapping(value = "/auth")
    public Map<String , Object> login(@RequestBody AuthRequest request){
        return personService.auth(request);
    }

    @PostMapping(value = "/new/book")
    public ResponseEntity<?> newPost(@RequestBody BookRequest request){
        return personService.addPost(request);
    }

    @GetMapping(value = "/posts")
    public List<BookDto> allPosts(@RequestParam(name = "login")String login){
        return personService.allPosts(login);
    }
}
