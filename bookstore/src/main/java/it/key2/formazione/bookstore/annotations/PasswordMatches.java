package it.key2.formazione.bookstore.annotations;

import static java.lang.annotation.ElementType.ANNOTATION_TYPE;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

import it.key2.formazione.bookstore.validators.PasswordMatchesValidator;


/**
 * PasswordMatches
 */
@Target({ TYPE, ANNOTATION_TYPE })
@Retention(RUNTIME)
@Constraint(validatedBy = PasswordMatchesValidator.class)
@Documented
public @interface PasswordMatches  {

    String message() default "Username or Password don't match";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}