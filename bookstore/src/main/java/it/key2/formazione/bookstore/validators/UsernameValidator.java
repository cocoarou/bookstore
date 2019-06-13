package it.key2.formazione.bookstore.validators;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.springframework.beans.factory.annotation.Autowired;

import it.key2.formazione.bookstore.annotations.ValidUsername;
import it.key2.formazione.bookstore.repositories.UserRepository;

/**
 * UsernameValidator
 */
public class UsernameValidator implements ConstraintValidator<ValidUsername, String> {

    private Pattern pattern;
    private Matcher matcher;
    private static final String USERNAME_PATTERN = "^[a-zA-Z0-9]+[._]?+[a-zA-Z0-9]+[._]?+[a-zA-Z0-9]+$";

    @Autowired
    UserRepository userRepository;

    @Override
    public void initialize(ValidUsername constraintAnnotation) {
    }

    @Override
    public boolean isValid(String username, ConstraintValidatorContext context) {
        return !userRepository.findByUsername(username).isPresent() && validateUsername(username);
    }

    private boolean validateUsername(String username) {
        pattern = Pattern.compile(USERNAME_PATTERN);
        matcher = pattern.matcher(username);
        return matcher.matches();
    }
}