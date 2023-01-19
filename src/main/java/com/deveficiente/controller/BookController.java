package com.deveficiente.controller;


import com.deveficiente.service.BookService;
import com.deveficiente.config.HandleValidationExceptions;
import com.deveficiente.entity.Book;
import com.deveficiente.mapper.BookMapper;
import com.deveficiente.entity.dto.BookDTO;
import com.deveficiente.mapper.dto.DetalheLivroResponse;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/book", produces = MediaType.APPLICATION_JSON_VALUE,
        consumes = MediaType.APPLICATION_JSON_VALUE)
 class BookController extends HandleValidationExceptions {
    @Autowired
    private BookService bookService;
    @Autowired
    private BookMapper bookMapper;

    @GetMapping
    public List<Book> getAll(){
       return bookService.findAllBook();
    }

    @PostMapping
    public Book save(@RequestBody @Valid BookDTO bookDTO) throws Exception {
        return bookService.saveBook(bookDTO);
    }

    @GetMapping(value = "/product/{id}")
    public ResponseEntity<DetalheLivroResponse> GetMethodName(@PathVariable Long id){

        Optional<Book> book = bookService.findByIdBook(id);

        if (!book.isPresent()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }

        DetalheLivroResponse detalheLivroResponse = new DetalheLivroResponse(book.get());
        return ResponseEntity.ok(detalheLivroResponse);
    }



}
