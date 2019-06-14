package it.key2.formazione.bookstore;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//import it.key2.formazione.bookstore.entities.User;
import it.key2.formazione.bookstore.repositories.UserRepository;
import it.key2.formazione.bookstore.services.UserService;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {
	
	Logger log = LoggerFactory.getLogger(DemoApplication.class);
	
	@Autowired
	UserRepository urepo;
	
	@Autowired
	UserService uservice;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

//		uservice.save(new User("mario.bianchi","password", "Mario", "Bianchi", null));


	}

}
