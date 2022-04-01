package com.kemsdev.springdatarelationships.service;

import com.kemsdev.springdatarelationships.model.Author;
import com.kemsdev.springdatarelationships.model.Book;
import com.kemsdev.springdatarelationships.repository.AuthorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorService {

    private final AuthorRepository authorRepository;

    public AuthorService(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    public List<Author> getAllAuthors(){
        return authorRepository.findAll();
    }

    public Author getAuthorById(long id){
        return authorRepository.findById(id).orElseThrow(() -> new NullPointerException("Author is not found. By Id : " + id));
    }

}
