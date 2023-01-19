package com.alura.controller;

import com.alura.dominio.Author;
import com.alura.exception.HandleValidationExceptions;
import com.alura.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value = "/author")
public class AuthorController extends HandleValidationExceptions {

    @Autowired
    private AuthorRepository authorRepository;
    @GetMapping("/")
    String home() {
        return "Hello, World!!!!!!!!!!!!!!!!!@#$";
    }

    @GetMapping
    public List<Author> getAuthor() {
        return authorRepository.findAll();
    }

    @PostMapping
    public Author saveAuthor(@RequestBody @Valid Author author) {
        return authorRepository.save(author);
    }
}
