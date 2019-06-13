package it.key2.formazione.bookstore.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import it.key2.formazione.bookstore.entities.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {

    
}