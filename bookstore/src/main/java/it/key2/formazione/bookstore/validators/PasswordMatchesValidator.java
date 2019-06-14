package it.key2.formazione.bookstore.validators;

import java.util.Optional;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.springframework.beans.factory.annotation.Autowired;

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
<<<<<<< HEAD
        if(userRepository.findByUsername(user.getUsername()).isPresent()) {
            String psw = userRepository.findByUsername(user.getUsername()).get().getPassword();
=======
<<<<<<< HEAD
        if(userRepository.findByUsername(user.getUsername()).isPresent()) {
            String psw = userRepository.findByUsername(user.getUsername()).get().getPassword();
=======
        if(userRepository.findByUsername(user.getUsername()).isPresent()){
            User userr = userRepository.findByUsername(user.getUsername()).get();
            String psw = userr.getPassword();
>>>>>>> testSecurity
>>>>>>> a955ac3b21d945a7bc498195ca767c2fdaa3329e
            return encryptUtils.matches(user.getPassword(), psw);
        } else {
            return false;
        }
    }


}