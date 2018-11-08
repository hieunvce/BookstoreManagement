-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema bookstore
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema bookstore
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `bookstore` DEFAULT CHARACTER SET utf8 ;
USE `bookstore` ;

-- -----------------------------------------------------
-- Table `bookstore`.`authors`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `bookstore`.`authors` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `firstName` VARCHAR(45) NULL,
  `lastName` VARCHAR(45) NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `bookstore`.`genres`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `bookstore`.`genres` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `bookstore`.`publishers`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `bookstore`.`publishers` (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(100) NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `bookstore`.`books`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `bookstore`.`books` (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `isbn` VARCHAR(8) NULL,
  `title` VARCHAR(100) NULL,
  `authorId` INT NOT NULL,
  `publisherId` INT NULL,
  `publicationYear` INT(11) NULL,
  `price` INT NULL,
  `availableQuantity` INT(11) NULL,
  `genreId` INT NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `isbn_UNIQUE` (`isbn` ASC),
  INDEX `fk_books_authors_idx` (`authorId` ASC),
  INDEX `fk_books_genres_idx` (`genreId` ASC),
  INDEX `fk_books_publishers_idx` (`publisherId` ASC),
  CONSTRAINT `fk_books_authors`
    FOREIGN KEY (`authorId`)
    REFERENCES `bookstore`.`authors` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_books_genres`
    FOREIGN KEY (`genreId`)
    REFERENCES `bookstore`.`genres` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_books_publishers`
    FOREIGN KEY (`publisherId`)
    REFERENCES `bookstore`.`publishers` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `bookstore`.`employees`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `bookstore`.`employees` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `username` VARCHAR(45) NOT NULL,
  `password` VARCHAR(45) NOT NULL,
  `firstName` VARCHAR(45) NULL,
  `lastName` VARCHAR(45) NULL,
  `position` VARCHAR(45) NULL,
  `salary` INT NULL,
  `joiningDate` DATE NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `bookstore`.`customers`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `bookstore`.`customers` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `firstName` VARCHAR(45) NULL,
  `lastName` VARCHAR(45) NULL,
  `address` VARCHAR(100) NULL,
  `email` VARCHAR(45) NULL,
  `phone` VARCHAR(45) NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `bookstore`.`orders`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `bookstore`.`orders` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `customerId` INT NULL,
  `orderDate` DATE NULL,
  `subtotal` INT NULL,
  `discount` INT NULL,
  `shipping` INT NULL,
  `total` INT NULL,
  `employeeId` INT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_orders_employees_idx` (`employeeId` ASC),
  INDEX `fk_orders_customers_idx` (`customerId` ASC),
  CONSTRAINT `fk_orders_employees`
    FOREIGN KEY (`employeeId`)
    REFERENCES `bookstore`.`employees` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_orders_customers`
    FOREIGN KEY (`customerId`)
    REFERENCES `bookstore`.`customers` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `bookstore`.`orders_details`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `bookstore`.`orders_details` (
  `bookId` INT NULL,
  `orderId` INT NULL,
  `amount` INT NULL,
  INDEX `fk_orders_details_books_idx` (`bookId` ASC),
  INDEX `fk_orders_details_orders_idx` (`orderId` ASC),
  CONSTRAINT `fk_orders_details_books`
    FOREIGN KEY (`bookId`)
    REFERENCES `bookstore`.`books` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_orders_details_orders`
    FOREIGN KEY (`orderId`)
    REFERENCES `bookstore`.`orders` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `bookstore`.`discounts`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `bookstore`.`discounts` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NULL,
  `value` INT(11) NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `bookstore`.`customers_discounts`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `bookstore`.`customers_discounts` (
  `customerId` INT NULL,
  `discountId` INT NULL,
  INDEX `fk_customers_discounts_1_idx` (`customerId` ASC),
  INDEX `fk_customers_discounts_2_idx` (`discountId` ASC),
  CONSTRAINT `fk_customers_discounts_1`
    FOREIGN KEY (`customerId`)
    REFERENCES `bookstore`.`customers` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_customers_discounts_2`
    FOREIGN KEY (`discountId`)
    REFERENCES `bookstore`.`discounts` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `bookstore`.`books_discounts`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `bookstore`.`books_discounts` (
  `bookId` INT NULL,
  `discountId` INT NULL,
  INDEX `fk_books_discounts_1_idx` (`bookId` ASC),
  INDEX `fk_books_discounts_2_idx` (`discountId` ASC),
  CONSTRAINT `fk_books_discounts_1`
    FOREIGN KEY (`bookId`)
    REFERENCES `bookstore`.`books` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_books_discounts_2`
    FOREIGN KEY (`discountId`)
    REFERENCES `bookstore`.`discounts` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `bookstore`.`book_adder`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `bookstore`.`book_adder` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `isbn` VARCHAR(8) NULL,
  `title` VARCHAR(100) NULL,
  `publicationYear` INT NULL,
  `quantity` INT NULL,
  `price` INT NULL,
  `publisher` VARCHAR(100) NULL,
  `firstName` VARCHAR(45) NULL,
  `lastName` VARCHAR(45) NULL,
  `company` VARCHAR(45) NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
