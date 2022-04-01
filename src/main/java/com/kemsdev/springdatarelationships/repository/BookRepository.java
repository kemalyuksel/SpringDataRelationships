package com.kemsdev.springdatarelationships.repository;

import com.kemsdev.springdatarelationships.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book,Long> {

}
