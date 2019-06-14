package it.key2.formazione.bookstore.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import it.key2.formazione.bookstore.entities.Author;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Integer> {

	Author findByFirstname(String firstname);

    
}