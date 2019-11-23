CREATE SCHEMA IF NOT EXISTS `bloodbank` DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci ;
USE `bloodbank` ;



-- -----------feedback table

CREATE TABLE IF NOT EXISTS `bloodbank`.`feedback` (
    `feedback_id` INT NOT NULL AUTO_INCREMENT,
    `hospital_name` VARCHAR(15) NULL,
	`city` VARCHAR(15) NULL,
	`comments` TEXT(500) NULL,
	`user_id` INT NOT NULL,
	PRIMARY KEY (`feedback_id`))
ENGINE = InnoDB;

-- -----------user table

CREATE TABLE IF NOT EXISTS `bloodbank`.`user` (
	`user_id` INT NOT NULL AUTO_INCREMENT,
	`first_name` VARCHAR(50) NULL,
	`last_name` VARCHAR(50) NULL,
	`age` INT(2) NULL,
	`gender` VARCHAR(6),
	`contact_number` INT(10) NULL,
	`email` VARCHAR(15) NULL,
	`password` VARCHAR(300) NULL,
	`weight` DECIMAL(3,2) NULL,
	`state_id` INT(2) NULL,
	`area` VARCHAR(20) NULL,
	`pincode` INT(6) NULL,
	`blood_group` VARCHAR(4),
PRIMARY KEY (`user_id`))
ENGINE = InnoDB;

-- -----------available_blood table

CREATE TABLE IF NOT EXISTS `bloodbank`.`available_blood` (
	`blood_id` INT NOT NULL AUTO_INCREMENT,
	`blood_group` VARCHAR(4) NULL,
	`state` VARCHAR(20) NULL,
	`area` VARCHAR(20) NULL,
	`pincode` INT(6) NULL,
	`contact_number` INT(10) NULL,
	`donor_id` INT NULL,
PRIMARY KEY (`blood_id`))
ENGINE = InnoDB;

-- -----------state table

CREATE TABLE IF NOT EXISTS `bloodbank`.`state`(
	`state_id` INT NOT NULL AUTO_INCREMENT,
	`state` VARCHAR(50) NULL,
PRIMARY KEY (`state_id`))
ENGINE = InnoDB;

-- -----------city table

CREATE TABLE IF NOT EXISTS `bloodbank`.`city`(
	`city_id` INT NOT NULL AUTO_INCREMENT,
	`city` VARCHAR(50) NULL,
	`state_id` INT NULL,
PRIMARY KEY (`city_id`))
ENGINE = InnoDB;

