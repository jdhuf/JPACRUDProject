-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema team_rosterdb
-- -----------------------------------------------------
DROP SCHEMA IF EXISTS `team_rosterdb` ;

-- -----------------------------------------------------
-- Schema team_rosterdb
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `team_rosterdb` ;
USE `team_rosterdb` ;

-- -----------------------------------------------------
-- Table `player`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `player` ;

CREATE TABLE IF NOT EXISTS `player` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NOT NULL,
  `birthdate` VARCHAR(45) NOT NULL,
  `position` VARCHAR(45) NOT NULL,
  `home_town` VARCHAR(45) NOT NULL,
  `nationality` VARCHAR(45) NOT NULL,
  `height` INT NOT NULL,
  `weight` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;

SET SQL_MODE = '';
DROP USER IF EXISTS teamrosteruser@localhost;
SET SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';
CREATE USER 'teamrosteruser'@'localhost' IDENTIFIED BY 'teamroster';

GRANT SELECT, INSERT, TRIGGER, UPDATE, DELETE ON TABLE * TO 'teamrosteruser'@'localhost';

SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;

-- -----------------------------------------------------
-- Data for table `player`
-- -----------------------------------------------------
START TRANSACTION;
USE `team_rosterdb`;
INSERT INTO `player` (`id`, `name`, `birthdate`, `position`, `home_town`, `nationality`, `height`, `weight`) VALUES (1, 'DeAndre Yedlin', '09 Jul 1993', 'Defender', 'Seattle, WA, USA', 'USA', 68, '165');
INSERT INTO `player` (`id`, `name`, `birthdate`, `position`, `home_town`, `nationality`, `height`, `weight`) VALUES (2, 'Leonardo Campana', '24 Jul 2000', 'Forward', 'Guayaquil, Ecuador', 'Ecuador', 74, '174');
INSERT INTO `player` (`id`, `name`, `birthdate`, `position`, `home_town`, `nationality`, `height`, `weight`) VALUES (3, 'Ariel Lassiter', '27 Sep 1994', 'Midfielder', 'Turrialba, Costa Rica', 'Costa Rica', 70, '154');
INSERT INTO `player` (`id`, `name`, `birthdate`, `position`, `home_town`, `nationality`, `height`, `weight`) VALUES (4, 'Robbie Robinson', '17 Dec 1998', 'Forward', 'Camden, SC, USA', 'USA', 74, '170');
INSERT INTO `player` (`id`, `name`, `birthdate`, `position`, `home_town`, `nationality`, `height`, `weight`) VALUES (5, 'Damian Lowe', '05 May 1993', 'Defender', 'Kingston, Jamaica', 'Jamaica', 74, '174');
INSERT INTO `player` (`id`, `name`, `birthdate`, `position`, `home_town`, `nationality`, `height`, `weight`) VALUES (6, 'Drake Callendar', '07 Oct 1997', 'Goalkeeper', 'Sacramento, CA, USA', 'USA', 74, '194');
INSERT INTO `player` (`id`, `name`, `birthdate`, `position`, `home_town`, `nationality`, `height`, `weight`) VALUES (7, 'Jean Mota', '15 Oct 1993', 'Midfielder', 'São Paulo, Brazil', 'Brazil', 68, '159');

COMMIT;

