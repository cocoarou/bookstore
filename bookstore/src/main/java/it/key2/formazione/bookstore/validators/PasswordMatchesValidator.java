package it.key2.formazione.bookstore.validators;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import it.key2.formazione.bookstore.annotations.PasswordMatches;
import it.key2.formazione.bookstore.entities.User;
import it.key2.formazione.bookstore.repositories.UserRepository;
import it.key2.formazione.bookstore.utils.EncryptUtils;



/**
 * PasswordMatchesValidator
 */
public class PasswordMatchesValidator implements ConstraintValidator<PasswordMatches, Object> {

    @Autowired
    EncryptUtils encryptUtils;

    @Autowired
    UserRepository userRepository;

    @Override
    public void initialize(PasswordMatches constraintAnnotation) {
    }

    @Override
    public boolean isValid(Object obj, ConstraintValidatorContext context) {
        User user = (User) obj; 
        if(userRepository.findByUsername(user.getUsername()) != null){
            String psw = userRepository.findByUsername(user.getUsername()).getPassword();
            return encryptUtils.matches(user.getPassword(), psw);
        } else {
            return false;
        }
    }
}