package it.key2.formazione.bookstore.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import it.key2.formazione.bookstore.entities.User;
import it.key2.formazione.bookstore.repositories.BookRepository;
import it.key2.formazione.bookstore.repositories.UserRepository;

@Controller
public class RestController {

    @Autowired
    UserRepository urepo;

    @Autowired
    BookRepository brepo;

    @RequestMapping(value = "/users/findall", method = RequestMethod.POST)
    public ResponseEntity<JsonResponseBody> fetchAllAccountsPerUser(HttpServletRequest request) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(new JsonResponseBody(HttpStatus.OK.value(),urepo.findAll()));
                 
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST)
            .body(new JsonResponseBody(HttpStatus.BAD_REQUEST.value(), "Bad Request: " + e.toString()));
        }
    }

    @RequestMapping(value = "/books/findall", method = RequestMethod.POST)
    public ResponseEntity<JsonResponseBody> findAllBooks(HttpServletRequest request) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(new JsonResponseBody(HttpStatus.OK.value(),brepo.findAll()));
                 
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST)
            .body(new JsonResponseBody(HttpStatus.BAD_REQUEST.value(), "Bad Request: " + e.toString()));
        }
    }


    public class JsonResponseBody {
 
        private int server;
        private Object response;

        public JsonResponseBody() {
        }

        public JsonResponseBody(int server, Object response) {
            this.server = server;
            this.response = response;
        }

        public int getServer() {
            return server;
        }

        public void setServer(int server) {
            this.server = server;
        }

        public Object getResponse() {
            return response;
        }

        public void setResponse(Object response) {
            this.response = response;
        }

        
    }

    private class UserValidator implements Validator {

        @Override
        public boolean supports(Class<?> clazz) {
            return User.class.equals(clazz);
        }

        @Override
        public void validate(Object target, Errors errors) {
            User user = (User) target;
            if (user.getPassword().length() < 8) {
                errors.rejectValue("password", "the password must be at least 8 chars long");
            }
        }

    }
    
}