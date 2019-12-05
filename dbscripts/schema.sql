CREATE SCHEMA IF NOT EXISTS `bloodbank` DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci ;
USE `bloodbank` ;



-- -----------feedback table

CREATE TABLE IF NOT EXISTS `bloodbank`.`feedback` (
    `feedback_id` INT NOT NULL AUTO_INCREMENT,
    `hospital_name` VARCHAR(15) NULL,
	`city_id` INT NULL,
	`comments` TEXT(500) NULL,
	`user_id` INT NOT NULL,
	PRIMARY KEY (`feedback_id`))
ENGINE = InnoDB;

-- -----------user table

CREATE TABLE IF NOT EXISTS `bloodbank`.`user` (
	`user_id` INT NOT NULL AUTO_INCREMENT,
	`user_name` VARCHAR(50) NOT NULL,
	`first_name` VARCHAR(50) NULL,
	`last_name` VARCHAR(50) NULL,
	`age` INT(3) NULL,
	`gender` VARCHAR(6),
	`contact_number` BIGINT(10) NULL,
	`email` VARCHAR(15) NULL,
	`password` VARCHAR(300) NULL,
	`weight` DECIMAL(3,1) NULL,
	`state_id` INT(2) NULL,
	`area` VARCHAR(20) NULL,
	`pincode` INT(6) NULL,
	`blood_group` VARCHAR(4),
	`donor_id` INT NULL,
PRIMARY KEY (`user_id`))
ENGINE = InnoDB;

-- -----------available_blood table

CREATE TABLE IF NOT EXISTS `bloodbank`.`available_blood` (
	`blood_id` INT NOT NULL AUTO_INCREMENT,
	`blood_group` VARCHAR(4) NULL,
	`state_id` INT(2) NULL,
	`area` VARCHAR(20) NULL,
	`pincode` INT(6) NULL,
	`contact_number` BIGINT(10) NULL,
	`units` INT NOT NULL,
	`donor_id` INT NULL,
PRIMARY KEY (`blood_id`))
ENGINE = InnoDB;

CREATE TABLE IF NOT EXISTS `bloodbank`.`blood_requirement` (
	`req_id` INT NOT NULL AUTO_INCREMENT,
	`blood_group` VARCHAR(4) NULL,
	`state_id` INT(2) NULL,
	`area` VARCHAR(20) NULL,
	`pincode` INT(6) NULL,
	`contact_number` BIGINT(10) NULL,
	`user_id` INT NULL,
PRIMARY KEY (`req_id`))
ENGINE = InnoDB;

-- -----------slot table

CREATE TABLE `bloodbank`.`slot` (
  `slot_id` INT NOT NULL AUTO_INCREMENT,
`hospital_name` varchar(50),
  `city_id` INT NOT NULL,
  `date` DATE NULL,
  `time` TIME NULL,
  `donor_id` INT NOT NULL,
  PRIMARY KEY (`slot_id`),
   CONSTRAINT `city_id_slot_fk`
    FOREIGN KEY (`city_id`)
    REFERENCES `bloodbank`.`city` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
    CONSTRAINT `donor_id_slot_fk`
    FOREIGN KEY (`donor_id`)
    REFERENCES `bloodbank`.`user` (`user_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION
    )
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


CREATE TABLE `bloodbank`.`role` (
  `role_id` INT NOT NULL,
  `role_name` VARCHAR(45) NULL,
  PRIMARY KEY (`role_id`));


CREATE TABLE `bloodbank`.`user_role` (
  `ur_id` INT NOT NULL AUTO_INCREMENT,
  `ur_us_id` INT NULL,
  `ur_ro_id` INT NOT NULL,
  PRIMARY KEY (`ur_id`),
  INDEX `us_us_fk_idx` (`ur_us_id` ASC),
  INDEX `ur_ro_fk_idx` (`ur_ro_id` ASC),
  CONSTRAINT `ur_us_fk`
    FOREIGN KEY (`ur_us_id`)
    REFERENCES `bloodbank`.`user` (`user_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `ur_ro_fk`
    FOREIGN KEY (`ur_ro_id`)
    REFERENCES `bloodbank`.`role` (`role_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);

CREATE  TABLE `bloodbank`.`customer_auth` (
  `id` INT NOT NULL ,
  `selector` VARCHAR(45) NOT NULL ,
  `validator` VARCHAR(100) NOT NULL ,
  `user_id` INT NOT NULL ,
  PRIMARY KEY (`id`) ,
  INDEX `user_id_fk_auth_idx` (`user_id` ASC) ,
  CONSTRAINT `user_id_fk_auth`
    FOREIGN KEY (`user_id` )
    REFERENCES `bloodbank`.`user` (`user_id` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);





