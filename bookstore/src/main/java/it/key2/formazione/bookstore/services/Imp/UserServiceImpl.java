package it.key2.formazione.bookstore.services.Imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.key2.formazione.bookstore.entities.User;
import it.key2.formazione.bookstore.repositories.UserRepository;
import it.key2.formazione.bookstore.services.UserService;
import it.key2.formazione.bookstore.utils.EncryptUtils;

/**
 * UserServiceImpl
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Autowired
    EncryptUtils encryptUtils;

    @Override
    public User save(User user) {
        if (userRepository.findByUsername(user.getUsername()).isPresent()) {
            user.setId(userRepository.findByUsername(user.getUsername()).get().getId());
        }
        user.setPassword(encryptUtils.encode(user.getPassword()));
        userRepository.save(user);
        return user;
    }

}