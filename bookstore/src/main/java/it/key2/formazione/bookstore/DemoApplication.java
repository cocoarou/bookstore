package it.key2.formazione.bookstore;

<<<<<<< HEAD
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
=======
import java.util.ArrayList;

>>>>>>> testSecurity
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import it.key2.formazione.bookstore.entities.User;
import it.key2.formazione.bookstore.repositories.UserRepository;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {
	
	Logger log = LoggerFactory.getLogger(DemoApplication.class);
	
	@Autowired
	UserRepository urepo;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
<<<<<<< HEAD
//		urepo.save(new User("mario.rossi", "password", "Mario", "Rossi", null));
		urepo.save(new User("mario.verdi", "password", "Mario", "Verdi", null));
		log.info("" + urepo.findByUsername("mario.rossi").isPresent());
=======
		urepo.save(new User("mario.rossi", "password", "Mario", "Rossi", new ArrayList<>()));
>>>>>>> testSecurity

	}

}
