package com.kemsdev.springdatarelationships.service;

import com.kemsdev.springdatarelationships.model.Book;
import com.kemsdev.springdatarelationships.model.Library;
import com.kemsdev.springdatarelationships.repository.LibraryRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LibraryService {

    private final LibraryRepository libraryRepository;

    public LibraryService(LibraryRepository libraryRepository) {
        this.libraryRepository = libraryRepository;
    }

    public List<Library> getAllLibraries(){
        return libraryRepository.findAll();
    }

    public Library getLibraryById(long id){
        return libraryRepository.findById(id).orElseThrow(() -> new NullPointerException("Library is not found. By Id : " + id));
    }



}
