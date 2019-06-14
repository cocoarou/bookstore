<<<<<<< HEAD
CREATE SCHEMA `bookstore` ;

CREATE TABLE `bookstore`.`user` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `username` VARCHAR(16) NOT NULL,
  `password` VARCHAR(500) NOT NULL,
  `first_name` VARCHAR(45) NOT NULL,
  `last_name` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `username_UNIQUE` (`username` ASC) VISIBLE);

CREATE TABLE `bookstore`.`genre` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `description` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `description_UNIQUE` (`description` ASC) VISIBLE);

CREATE TABLE `bookstore`.`publisher` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `description` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `description_UNIQUE` (`description` ASC) VISIBLE);

CREATE TABLE `bookstore`.`author` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `first_name` VARCHAR(45) NOT NULL,
  `last_name` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`));

CREATE TABLE `bookstore`.`book` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `isbn` VARCHAR(13) UNIQUE,
  `title` VARCHAR(100) NOT NULL,
  `year` CHAR(4) NOT NULL,
  `price` DECIMAL(7,2) NOT NULL,
  `copies` INT(2) NOT NULL,
  `user_id` INT NOT NULL,
  `genre_id` INT NOT NULL,
  `publisher_id` INT NOT NULL,
  `last_modify_date` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`),
  INDEX `fk_user_id_idx` (`user_id` ASC) VISIBLE,
  INDEX `fk_genre_id_idx` (`genre_id` ASC) VISIBLE,
  INDEX `fk_publisher_id_idx` (`publisher_id` ASC) VISIBLE,
  CONSTRAINT `fk_user_id`
    FOREIGN KEY (`user_id`)
    REFERENCES `bookstore`.`user` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_genre_id`
    FOREIGN KEY (`genre_id`)
    REFERENCES `bookstore`.`genre` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_publisher_id`
    FOREIGN KEY (`publisher_id`)
    REFERENCES `bookstore`.`publisher` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);
	
CREATE TABLE `bookstore`.`authors_books` (
  `author_id` INT NOT NULL,
  `book_id` INT NOT NULL,
   FOREIGN KEY (`author_id`) REFERENCES `bookstore`.`author` (`id`),
   FOREIGN KEY (`book_id`) REFERENCES `bookstore`.`book` (`id`));
=======
CREATE SCHEMA `bookstore` ;

CREATE TABLE `bookstore`.`user` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `username` VARCHAR(16) NOT NULL,
  `password` VARCHAR(500) NOT NULL,
  `first_name` VARCHAR(45) NOT NULL,
  `last_name` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `username_UNIQUE` (`username` ASC) VISIBLE);

CREATE TABLE `bookstore`.`genre` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `description` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `description_UNIQUE` (`description` ASC) VISIBLE);

CREATE TABLE `bookstore`.`publisher` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `description` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `description_UNIQUE` (`description` ASC) VISIBLE);

CREATE TABLE `bookstore`.`author` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `first_name` VARCHAR(45) NOT NULL,
  `last_name` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`));

CREATE TABLE `bookstore`.`book` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `isbn` VARCHAR(13) UNIQUE,
  `title` VARCHAR(100) NOT NULL,
  `year` CHAR(4) NOT NULL,
  `price` DECIMAL(7,2) NOT NULL,
  `copies` INT(2) NOT NULL,
  `user_id` INT NOT NULL,
  `genre_id` INT NOT NULL,
  `publisher_id` INT NOT NULL,
  `last_modify_date` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`),
  INDEX `fk_user_id_idx` (`user_id` ASC) VISIBLE,
  INDEX `fk_genre_id_idx` (`genre_id` ASC) VISIBLE,
  INDEX `fk_publisher_id_idx` (`publisher_id` ASC) VISIBLE,
  CONSTRAINT `fk_user_id`
    FOREIGN KEY (`user_id`)
    REFERENCES `bookstore`.`user` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_genre_id`
    FOREIGN KEY (`genre_id`)
    REFERENCES `bookstore`.`genre` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_publisher_id`
    FOREIGN KEY (`publisher_id`)
    REFERENCES `bookstore`.`publisher` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);
	
CREATE TABLE `bookstore`.`authors_books` (
  `author_id` INT NOT NULL,
  `book_id` INT NOT NULL,
   FOREIGN KEY (`author_id`) REFERENCES `bookstore`.`author` (`id`),
   FOREIGN KEY (`book_id`) REFERENCES `bookstore`.`book` (`id`));
>>>>>>> 8497670720f98b9d9dacabca51cdde7801dec0a1
