package it.key2.formazione.bookstore;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
<<<<<<< HEAD
=======
=======
<<<<<<< HEAD
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
=======
import java.util.ArrayList;

>>>>>>> testSecurity
>>>>>>> a955ac3b21d945a7bc498195ca767c2fdaa3329e
>>>>>>> 94228f27bb15d39dd9841d7e5ebfd29a1a59a652
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
<<<<<<< HEAD

//		uservice.save(new User("mario.bianchi","password", "Mario", "Bianchi", null));

=======
		
<<<<<<< HEAD
//		urepo.save(new User("mario.rossi", "password", "Mario", "Rossi", null));
		urepo.save(new User("mario.verdi", "password", "Mario", "Verdi", null));
		log.info("" + urepo.findByUsername("mario.rossi").isPresent());
=======
<<<<<<< HEAD
//		urepo.save(new User("mario.rossi", "password", "Mario", "Rossi", null));
		urepo.save(new User("mario.verdi", "password", "Mario", "Verdi", null));
		log.info("" + urepo.findByUsername("mario.rossi").isPresent());
=======
		urepo.save(new User("mario.rossi", "password", "Mario", "Rossi", new ArrayList<>()));
>>>>>>> testSecurity
>>>>>>> a955ac3b21d945a7bc498195ca767c2fdaa3329e
>>>>>>> 94228f27bb15d39dd9841d7e5ebfd29a1a59a652

	}

}
