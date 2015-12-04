-- MySQL Script generated by MySQL Workbench
-- 12/03/15 15:30:02
-- Model: New Model    Version: 1.0
-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema slit
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema slit
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `slit` DEFAULT CHARACTER SET utf8 ;
USE `slit` ;

-- -----------------------------------------------------
-- Table `slit`.`Fag`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `slit`.`Fag` (
  `fagKode` INT NOT NULL COMMENT '',
  `fagNavn` VARCHAR(45) NOT NULL COMMENT '',
  `fagLærer` VARCHAR(45) NOT NULL COMMENT '',
  PRIMARY KEY (`fagKode`)  COMMENT '',
  UNIQUE INDEX `fagKode_UNIQUE` (`fagKode` ASC)  COMMENT '')
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `slit`.`Bruker`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `slit`.`Bruker` (
  `brukerId` INT NOT NULL AUTO_INCREMENT COMMENT '',
  `brukerRolle` VARCHAR(45) NOT NULL COMMENT '',
  `brukerFornavn` VARCHAR(45) NOT NULL COMMENT '',
  `brukerEtternavn` VARCHAR(45) NOT NULL COMMENT '',
  `brukerEmail` VARCHAR(45) NOT NULL COMMENT '',
  `brukerPassord` VARCHAR(45) NOT NULL COMMENT '',
  `brukerKull` INT NULL COMMENT '',
  `Fag_fagKode` INT NOT NULL COMMENT '',
  PRIMARY KEY (`brukerId`)  COMMENT '',
  UNIQUE INDEX `idBruker_UNIQUE` (`brukerId` ASC)  COMMENT '',
  INDEX `fk_Bruker_Fag1_idx` (`Fag_fagKode` ASC)  COMMENT '',
  UNIQUE INDEX `brukerEmail_UNIQUE` (`brukerEmail` ASC)  COMMENT '',
  CONSTRAINT `fk_Bruker_Fag1`
    FOREIGN KEY (`Fag_fagKode`)
    REFERENCES `slit`.`Fag` (`fagKode`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `slit`.`Userlog`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `slit`.`Userlog` (
  `userlogId` INT NOT NULL AUTO_INCREMENT COMMENT '',
  `userlogLogin` DATETIME NOT NULL COMMENT '',
  `userlogLogout` DATETIME NULL COMMENT '',
  `Bruker_brukerId` INT NOT NULL COMMENT '',
  PRIMARY KEY (`userlogId`)  COMMENT '',
  UNIQUE INDEX `userlogId_UNIQUE` (`userlogId` ASC)  COMMENT '',
  INDEX `fk_Userlog_Bruker1_idx` (`Bruker_brukerId` ASC)  COMMENT '',
  CONSTRAINT `fk_Userlog_Bruker1`
    FOREIGN KEY (`Bruker_brukerId`)
    REFERENCES `slit`.`Bruker` (`brukerId`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `slit`.`Statusrapport`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `slit`.`Statusrapport` (
  `idStatusrapport` INT NOT NULL AUTO_INCREMENT COMMENT '',
  `statusUke` INT NOT NULL COMMENT '',
  `statusGått` LONGTEXT NOT NULL COMMENT '',
  `statusAnnerledes` LONGTEXT NOT NULL COMMENT '',
  `statusHjelp` LONGTEXT NOT NULL COMMENT '',
  `statusTimer` INT NOT NULL COMMENT '',
  `Bruker_brukerId` INT NOT NULL COMMENT '',
  PRIMARY KEY (`idStatusrapport`)  COMMENT '',
  UNIQUE INDEX `idStatusrapport_UNIQUE` (`idStatusrapport` ASC)  COMMENT '',
  INDEX `fk_Statusrapport_Bruker1_idx` (`Bruker_brukerId` ASC)  COMMENT '',
  CONSTRAINT `fk_Statusrapport_Bruker1`
    FOREIGN KEY (`Bruker_brukerId`)
    REFERENCES `slit`.`Bruker` (`brukerId`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `slit`.`Modul`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `slit`.`Modul` (
  `modulId` INT NOT NULL AUTO_INCREMENT COMMENT '',
  `modulNummer` INT NOT NULL COMMENT '',
  `modulKapittel` INT NOT NULL COMMENT '',
  `modulEmne` VARCHAR(100) NOT NULL COMMENT '',
  `modulKriterie` MEDIUMTEXT NOT NULL COMMENT '',
  `modulFrist` DATETIME NOT NULL COMMENT '',
  `modulLærer` VARCHAR(100) NOT NULL COMMENT '',
  `modulLæringsmål` MEDIUMTEXT NOT NULL COMMENT '',
  `modulRessurs` VARCHAR(500) NOT NULL COMMENT '',
  PRIMARY KEY (`modulId`)  COMMENT '',
  UNIQUE INDEX `modulNummer_UNIQUE` (`modulNummer` ASC)  COMMENT '',
  UNIQUE INDEX `modulId_UNIQUE` (`modulId` ASC)  COMMENT '')
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `slit`.`Møte`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `slit`.`Møte` (
  `møteId` INT NOT NULL AUTO_INCREMENT COMMENT '',
  `møteTidspunkt` DATETIME NOT NULL COMMENT '',
  `møteSted` VARCHAR(100) NOT NULL COMMENT '',
  PRIMARY KEY (`møteId`)  COMMENT '')
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `slit`.`Møtedeltakere`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `slit`.`Møtedeltakere` (
  `Bruker_brukerId` INT NOT NULL COMMENT '',
  `Møte_møteId` INT NOT NULL COMMENT '',
  INDEX `fk_Møtedeltakere_Bruker1_idx` (`Bruker_brukerId` ASC)  COMMENT '',
  INDEX `fk_Møtedeltakere_Møte1_idx` (`Møte_møteId` ASC)  COMMENT '',
  CONSTRAINT `fk_Møtedeltakere_Bruker1`
    FOREIGN KEY (`Bruker_brukerId`)
    REFERENCES `slit`.`Bruker` (`brukerId`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Møtedeltakere_Møte1`
    FOREIGN KEY (`Møte_møteId`)
    REFERENCES `slit`.`Møte` (`møteId`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `slit`.`Dagens`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `slit`.`Dagens` (
  `dagensBeskjed` LONGTEXT NOT NULL COMMENT '',
  `Bruker_brukerId` INT NOT NULL COMMENT '',
  INDEX `fk_Dagens_Bruker1_idx` (`Bruker_brukerId` ASC)  COMMENT '',
  CONSTRAINT `fk_Dagens_Bruker1`
    FOREIGN KEY (`Bruker_brukerId`)
    REFERENCES `slit`.`Bruker` (`brukerId`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `slit`.`Modulfil`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `slit`.`Modulfil` (
  `modulfilId` INT NOT NULL AUTO_INCREMENT COMMENT '',
  `modulfilTittel` VARCHAR(80) NOT NULL COMMENT '',
  `modulfilDato` DATETIME NOT NULL COMMENT '',
  `modulfilVersjon` VARCHAR(80) NOT NULL COMMENT '',
  `modulfilBlob` LONGBLOB NOT NULL COMMENT '',
  `Modul_modulNummer` INT NOT NULL COMMENT '',
  `Bruker_brukerId` INT NOT NULL COMMENT '',
  PRIMARY KEY (`modulfilId`)  COMMENT '',
  UNIQUE INDEX `modulfilId_UNIQUE` (`modulfilId` ASC)  COMMENT '',
  INDEX `fk_Modulfil_Modul2_idx` (`Modul_modulNummer` ASC)  COMMENT '',
  INDEX `fk_Modulfil_Bruker2_idx` (`Bruker_brukerId` ASC)  COMMENT '',
  CONSTRAINT `fk_Modulfil_Modul2`
    FOREIGN KEY (`Modul_modulNummer`)
    REFERENCES `slit`.`Modul` (`modulNummer`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Modulfil_Bruker2`
    FOREIGN KEY (`Bruker_brukerId`)
    REFERENCES `slit`.`Bruker` (`brukerId`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `slit`.`Modulfil`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `slit`.`Modulfil` (
  `modulfilId` INT NOT NULL AUTO_INCREMENT COMMENT '',
  `modulfilTittel` VARCHAR(80) NOT NULL COMMENT '',
  `modulfilDato` DATETIME NOT NULL COMMENT '',
  `modulfilVersjon` VARCHAR(80) NOT NULL COMMENT '',
  `modulfilBlob` LONGBLOB NOT NULL COMMENT '',
  `Modul_modulNummer` INT NOT NULL COMMENT '',
  `Bruker_brukerId` INT NOT NULL COMMENT '',
  PRIMARY KEY (`modulfilId`)  COMMENT '',
  UNIQUE INDEX `modulfilId_UNIQUE` (`modulfilId` ASC)  COMMENT '',
  INDEX `fk_Modulfil_Modul2_idx` (`Modul_modulNummer` ASC)  COMMENT '',
  INDEX `fk_Modulfil_Bruker2_idx` (`Bruker_brukerId` ASC)  COMMENT '',
  CONSTRAINT `fk_Modulfil_Modul2`
    FOREIGN KEY (`Modul_modulNummer`)
    REFERENCES `slit`.`Modul` (`modulNummer`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Modulfil_Bruker2`
    FOREIGN KEY (`Bruker_brukerId`)
    REFERENCES `slit`.`Bruker` (`brukerId`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `slit`.`Sensur`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `slit`.`Sensur` (
  `sensurId` INT NOT NULL AUTO_INCREMENT COMMENT '',
  `sensurSensor` VARCHAR(80) NOT NULL COMMENT '',
  `sensurModul` VARCHAR(80) NOT NULL COMMENT '',
  `sensurVurdering` LONGTEXT NOT NULL COMMENT '',
  `Modulfil_modulfilId` INT NOT NULL COMMENT '',
  `Bruker_brukerId` INT NOT NULL COMMENT '',
  `sensurResultat` VARCHAR(45) NOT NULL COMMENT '',
  PRIMARY KEY (`sensurId`)  COMMENT '',
  UNIQUE INDEX `sensurId_UNIQUE` (`sensurId` ASC)  COMMENT '',
  INDEX `fk_Sensur_Modulfil1_idx` (`Modulfil_modulfilId` ASC)  COMMENT '',
  INDEX `fk_Sensur_Bruker1_idx` (`Bruker_brukerId` ASC)  COMMENT '',
  CONSTRAINT `fk_Sensur_Modulfil1`
    FOREIGN KEY (`Modulfil_modulfilId`)
    REFERENCES `slit`.`Modulfil` (`modulfilId`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Sensur_Bruker1`
    FOREIGN KEY (`Bruker_brukerId`)
    REFERENCES `slit`.`Bruker` (`brukerId`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `slit`.`Generellinfo`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `slit`.`Generellinfo` (
  `generelInfoId` INT NOT NULL AUTO_INCREMENT COMMENT '',
  `generellInfoBeskjed` LONGTEXT NULL COMMENT '',
  PRIMARY KEY (`generelInfoId`)  COMMENT '',
  UNIQUE INDEX `idGenerellinfo_UNIQUE` (`generelInfoId` ASC)  COMMENT '')
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `slit`.`Profilbilde`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `slit`.`Profilbilde` (
  `profilbildeId` INT NOT NULL AUTO_INCREMENT COMMENT '',
  `profilbildeBlob` MEDIUMBLOB NOT NULL COMMENT '',
  `Bruker_brukerId` INT NOT NULL COMMENT '',
  PRIMARY KEY (`profilbildeId`)  COMMENT '',
  UNIQUE INDEX `profilbildeId_UNIQUE` (`profilbildeId` ASC)  COMMENT '',
  INDEX `fk_Profilbilde_Bruker1_idx` (`Bruker_brukerId` ASC)  COMMENT '',
  CONSTRAINT `fk_Profilbilde_Bruker1`
    FOREIGN KEY (`Bruker_brukerId`)
    REFERENCES `slit`.`Bruker` (`brukerId`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

USE `slit` ;

-- -----------------------------------------------------
-- Placeholder table for view `slit`.`statistikk`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `slit`.`statistikk` (`Bruker_brukerId` INT, `brukerFornavn` INT, `brukerEtternavn` INT, `modulfilDato` INT, `COUNT(sensurId)` INT);

-- -----------------------------------------------------
-- View `slit`.`statistikk`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `slit`.`statistikk`;
USE `slit`;
CREATE  OR REPLACE VIEW `statistikk` AS
    SELECT 
        `modulfil`.`Bruker_brukerId` AS `Bruker_brukerId`,
        `bruker`.`brukerFornavn` AS `brukerFornavn`,
        `bruker`.`brukerEtternavn` AS `brukerEtternavn`,
        `modulfil`.`modulfilDato` AS `modulfilDato`,
        COUNT(`sensur`.`sensurId`) AS `COUNT(sensurId)`
    FROM
        ((`modulfil`
        JOIN `sensur` ON ((`modulfil`.`modulfilId` = `sensur`.`Modulfil_modulfilId`)))
        JOIN `bruker` ON ((`modulfil`.`Bruker_brukerId` = `bruker`.`brukerId`)))
    GROUP BY `modulfil`.`Bruker_brukerId`
    ORDER BY `modulfil`.`Bruker_brukerId`;

SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;

-- -----------------------------------------------------
-- Data for table `slit`.`Fag`
-- -----------------------------------------------------
START TRANSACTION;
USE `slit`;
INSERT INTO `slit`.`Fag` (`fagKode`, `fagNavn`, `fagLærer`) VALUES (109, 'Objektsorientert Programmering 1', 'Even Åby Larsen');
INSERT INTO `slit`.`Fag` (`fagKode`, `fagNavn`, `fagLærer`) VALUES (110, 'Objektsorientert Programmering 2', 'Even Åby Larsen');

COMMIT;

