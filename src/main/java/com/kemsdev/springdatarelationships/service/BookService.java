package com.kemsdev.springdatarelationships.service;

import com.kemsdev.springdatarelationships.model.Book;
import com.kemsdev.springdatarelationships.repository.BookRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public List<Book> getAllBooks(){
        return bookRepository.findAll();
    }

    public Book getBookById(long id){
        return bookRepository.findById(id).get();
    }

    public void addBook(Book book){
        bookRepository.save(book);
    }




}
