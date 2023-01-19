package com.deveficiente.service;

import com.deveficiente.entity.Author;
import com.deveficiente.entity.Book;
import com.deveficiente.entity.Category;
import com.deveficiente.entity.dto.BookDTO;
import com.deveficiente.mapper.BookMapper;
import com.deveficiente.repository.AuthorRepository;
import com.deveficiente.repository.BookRepository;
import com.deveficiente.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {

    @Autowired
    private BookMapper bookMapper;

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private AuthorRepository authorRepository;

    @Autowired
    private BookRepository bookRepository;

    public List<Book> findAllBook() {
       return bookRepository.findAll();
    }

    public Book saveBook(BookDTO response) throws Exception {
      //  bookRepository.findById(response.get)
        Optional<Author> authorId = Optional.ofNullable(authorRepository.findById(response.getAuthorId())
                .orElseThrow(() -> new Exception("Não existe")));
        Optional<Category> categoryId = Optional.ofNullable(categoryRepository.findById(response.getCategoryId())
                .orElseThrow(() -> new Exception("não existe")));

        Book book = bookMapper.toDomain(response);
        book.setAuthor(authorId.get());
        book.setCategory(categoryId.get());
        return bookRepository.save(book);
    }

    public Optional<Book> findByIdBook(Long id) {
       return bookRepository.findById(id);
    }
}
