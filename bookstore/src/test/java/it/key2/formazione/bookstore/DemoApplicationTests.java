package it.key2.formazione.bookstore;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import it.key2.formazione.bookstore.entities.User;
import it.key2.formazione.bookstore.repositories.AuthorRepository;
import it.key2.formazione.bookstore.repositories.BookRepository;
import it.key2.formazione.bookstore.repositories.GenreRepository;
import it.key2.formazione.bookstore.repositories.PublisherRepository;
import it.key2.formazione.bookstore.repositories.UserRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

	@Autowired
	private AuthorRepository arepo;
	
	@Autowired
	private BookRepository brepo;
	
	@Autowired
	private GenreRepository grepo;
	
	@Autowired
	private PublisherRepository prepo;
	
	@Mock
	private UserRepository urepo;
	
	@Mock
	private User user;
	
	
	@Before
	public void setupMock() {
		MockitoAnnotations.initMocks(this);
	}
	
	@Test
	public void testMockCreation() {
		assertNotNull(urepo);
		assertNotNull(user);
	}

	@Test
	@DisplayName("assertNull Examples")
	public void test_assertNull() {
		assertNull(null);
		//assertNull(new Object(), "assertNull Fail Message");
	}
	
	@Test
	@DisplayName("assertNotNull Examples")
	public void test_assertNotNull() {
		assertNotNull(new Object());
		//assertNotNull(null, "assertNotNull Fail Message");
	}
	
	@Test
	@DisplayName("assertThat Tables are empty")
	public void test_emptyTables() {
		assertThat(arepo.findAll().isEmpty());
		assertThat(brepo.findAll().isEmpty());
		assertThat(grepo.findAll().isEmpty());
		assertThat(prepo.findAll().isEmpty());
		assertThat(urepo.findAll().isEmpty());
	}
	

	@Test
	public void test_saveUser() {
		urepo.save(new User("mario.rossi", "password", "Mario", "Rossi", null));
	}


}
