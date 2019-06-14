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

<<<<<<< HEAD
//import it.key2.formazione.bookstore.entities.User;
import it.key2.formazione.bookstore.repositories.UserRepository;
import it.key2.formazione.bookstore.services.UserService;
=======
import it.key2.formazione.bookstore.entities.User;
import it.key2.formazione.bookstore.repositories.UserRepository;
>>>>>>> testSecurity

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {
	
<<<<<<< HEAD
	Logger log = LoggerFactory.getLogger(DemoApplication.class);
	
	@Autowired
	UserRepository urepo;
	
	@Autowired
	UserService uservice;
=======
	@Autowired
	UserRepository urepo;
>>>>>>> testSecurity

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		urepo.save(new User("mario.rossi", "password", "Mario", "Rossi", new ArrayList<>()));

//		uservice.save(new User("mario.bianchi","password", "Mario", "Bianchi", null));


	}

}
