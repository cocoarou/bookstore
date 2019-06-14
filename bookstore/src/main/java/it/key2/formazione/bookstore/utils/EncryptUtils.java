package it.key2.formazione.bookstore.utils;

import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.stereotype.Component;

/**
 * EncryptUtils
 */
@Component
public class EncryptUtils {

    public String encode(String data) {
        return BCrypt.hashpw((data), BCrypt.gensalt(15)); // more iteration (4-31)
    }

    public Boolean matches(String data, String encodedData) {
        return BCrypt.checkpw(data, encodedData);
    }
}