package it.key2.formazione.bookstore.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import it.key2.formazione.bookstore.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

    
}