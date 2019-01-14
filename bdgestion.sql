/*
SQLyog Ultimate v11.5 (64 bit)
MySQL - 5.6.25 : Database - bdgestion
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`bdgestion` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `bdgestion`;

/*Table structure for table `hibernate_sequence` */

DROP TABLE IF EXISTS `hibernate_sequence`;

CREATE TABLE `hibernate_sequence` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

/*Data for the table `hibernate_sequence` */

insert  into `hibernate_sequence`(`next_val`) values (5);

/*Table structure for table `patient` */

DROP TABLE IF EXISTS `patient`;

CREATE TABLE `patient` (
  `idEleve` int(11) NOT NULL,
  `age` int(11) NOT NULL,
  `fonction` varchar(255) DEFAULT NULL,
  `matricule` int(11) NOT NULL,
  `nom` varchar(255) DEFAULT NULL,
  `prenom` varchar(255) DEFAULT NULL,
  `quartier` varchar(255) DEFAULT NULL,
  `sexe` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`idEleve`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

/*Data for the table `patient` */

insert  into `patient`(`idEleve`,`age`,`fonction`,`matricule`,`nom`,`prenom`,`quartier`,`sexe`) values (1,14,'etu',1458,'test','test1','ngo','m'),(2,17,'ele',1254,'kont','ton','nht','m'),(3,14,'frds',1458,'tresz','szed','eza','f'),(4,45,'xsz',4785,'sez','qzs','aze','m');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
