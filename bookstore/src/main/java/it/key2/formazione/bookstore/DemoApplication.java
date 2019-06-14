package it.key2.formazione.bookstore;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import org.apache.tomcat.jni.Time;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import it.key2.formazione.bookstore.entities.Author;
import it.key2.formazione.bookstore.entities.Book;
import it.key2.formazione.bookstore.repositories.BookRepository;
import it.key2.formazione.bookstore.entities.User;
import it.key2.formazione.bookstore.repositories.UserRepository;
import it.key2.formazione.bookstore.services.UserService;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {
	
	Logger log = LoggerFactory.getLogger(DemoApplication.class);
	
	@Autowired
	UserRepository urepo;

	@Autowired
	BookRepository brepo;
	
	@Autowired
	UserService uservice;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

	// uservice.save(new User("mario.bianchi","password", "Mario", "Bianchi", null));
	// log.info("" + brepo.findAll());
	List<Author> authors = new ArrayList<>();
	List<Book> books = new ArrayList<>();
	Timestamp timestamp = new Timestamp(Time.now());
	User user = new User("mario.rossi", "password", "Mario", "Rossi");

	Author author = new Author("Stephen", "King", books);


	brepo.save(new Book("isbn", "abc", "1994", 10.99, 2, timestamp, user,   ))


	}

}
