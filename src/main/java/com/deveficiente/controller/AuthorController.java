package com.deveficiente.controller;

import com.deveficiente.entity.Author;
import com.deveficiente.entity.dto.AuthorDTO;
import com.deveficiente.mapper.AuthorMapper;
import com.deveficiente.config.HandleValidationExceptions;
import com.deveficiente.repository.AuthorRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping(value = "/author")
 class AuthorController extends HandleValidationExceptions {
    @Autowired
    private AuthorRepository authorRepository;
    @Autowired
    private AuthorMapper authorMapper;

    @GetMapping
    List<Author> getAuthor() {

        return authorRepository.findAll();
    }

    @PostMapping
    Author saveAuthor( @RequestBody @Valid AuthorDTO authorDTO) {
        Author response = authorMapper.toDomain(authorDTO);
        return authorRepository.save(response);
    }


}
