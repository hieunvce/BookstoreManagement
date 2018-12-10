CREATE DATABASE  IF NOT EXISTS `BookstoreDB` /*!40100 DEFAULT CHARACTER SET utf8 COLLATE utf8_unicode_ci */;
USE `BookstoreDB`;
-- MySQL dump 10.13  Distrib 5.7.24, for Linux (x86_64)
--
-- Host: 127.0.0.1    Database: BookstoreDB
-- ------------------------------------------------------
-- Server version	5.7.24-0ubuntu0.18.04.1

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `baocaocongno`
--

DROP TABLE IF EXISTS `baocaocongno`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `baocaocongno` (
  `MANO` int(11) NOT NULL,
  `THANGNO` datetime DEFAULT NULL,
  PRIMARY KEY (`MANO`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `baocaocongno`
--

LOCK TABLES `baocaocongno` WRITE;
/*!40000 ALTER TABLE `baocaocongno` DISABLE KEYS */;
/*!40000 ALTER TABLE `baocaocongno` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `baocaoton`
--

DROP TABLE IF EXISTS `baocaoton`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `baocaoton` (
  `MATON` int(11) NOT NULL,
  `THANGLAP` datetime DEFAULT NULL,
  PRIMARY KEY (`MATON`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `baocaoton`
--

LOCK TABLES `baocaoton` WRITE;
/*!40000 ALTER TABLE `baocaoton` DISABLE KEYS */;
/*!40000 ALTER TABLE `baocaoton` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ct_baocaoton`
--

DROP TABLE IF EXISTS `ct_baocaoton`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `ct_baocaoton` (
  `MATON` int(11) NOT NULL,
  `SLNHAP` int(11) DEFAULT NULL,
  `SLBAN` int(11) DEFAULT NULL,
  `TONDAU` int(11) DEFAULT NULL,
  `TONCUOI` int(11) DEFAULT NULL,
  `MASACH` int(11) NOT NULL,
  KEY `fk_ct_baocaoton_sach1_idx` (`MASACH`),
  KEY `fk_ct_baocaoton_baocaoton1` (`MATON`),
  CONSTRAINT `fk_ct_baocaoton_baocaoton1` FOREIGN KEY (`MATON`) REFERENCES `baocaoton` (`MATON`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_ct_baocaoton_sach1` FOREIGN KEY (`MASACH`) REFERENCES `sach` (`MASACH`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ct_baocaoton`
--

LOCK TABLES `ct_baocaoton` WRITE;
/*!40000 ALTER TABLE `ct_baocaoton` DISABLE KEYS */;
/*!40000 ALTER TABLE `ct_baocaoton` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ct_congno`
--

DROP TABLE IF EXISTS `ct_congno`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `ct_congno` (
  `MANO` int(11) NOT NULL,
  `MAKH` int(11) NOT NULL,
  `NODAU` int(11) DEFAULT NULL,
  `PHATSINH` int(11) DEFAULT NULL,
  `NOCUOI` int(11) DEFAULT NULL,
  PRIMARY KEY (`MANO`,`MAKH`),
  KEY `fk_ct_congno_khachhang1_idx` (`MAKH`),
  CONSTRAINT `fk_ct_congno_baocaocongno1` FOREIGN KEY (`MANO`) REFERENCES `baocaocongno` (`MANO`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_ct_congno_khachhang1` FOREIGN KEY (`MAKH`) REFERENCES `khachhang` (`MAKH`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ct_congno`
--

LOCK TABLES `ct_congno` WRITE;
/*!40000 ALTER TABLE `ct_congno` DISABLE KEYS */;
/*!40000 ALTER TABLE `ct_congno` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ct_hoadon`
--

DROP TABLE IF EXISTS `ct_hoadon`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `ct_hoadon` (
  `MASACH` int(11) NOT NULL,
  `SOHD` int(11) NOT NULL,
  `SOLUONG` int(11) DEFAULT NULL,
  `DONGIA` int(11) DEFAULT NULL,
  `THANHTIEN` int(11) DEFAULT NULL,
  KEY `fk_ct_hoadon_hoadon1_idx` (`SOHD`),
  KEY `fk_ct_hoadon_sach1` (`MASACH`),
  CONSTRAINT `fk_ct_hoadon_hoadon1` FOREIGN KEY (`SOHD`) REFERENCES `hoadon` (`SOHD`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_ct_hoadon_sach1` FOREIGN KEY (`MASACH`) REFERENCES `sach` (`MASACH`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ct_hoadon`
--

LOCK TABLES `ct_hoadon` WRITE;
/*!40000 ALTER TABLE `ct_hoadon` DISABLE KEYS */;
/*!40000 ALTER TABLE `ct_hoadon` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ct_phieunhap`
--

DROP TABLE IF EXISTS `ct_phieunhap`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `ct_phieunhap` (
  `MASACH` int(11) NOT NULL,
  `SOPN` int(11) NOT NULL,
  `DVT` varchar(10) COLLATE utf8_unicode_ci DEFAULT NULL,
  `SOLUONG` int(11) DEFAULT NULL,
  `GIANHAP` int(11) DEFAULT NULL,
  `THANHTIEN` int(11) DEFAULT NULL,
  KEY `fk_ct_phieunhap_phieunhap1_idx` (`SOPN`),
  KEY `fk_ct_phieunhap_sach1` (`MASACH`),
  CONSTRAINT `fk_ct_phieunhap_phieunhap1` FOREIGN KEY (`SOPN`) REFERENCES `phieunhap` (`SOPN`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_ct_phieunhap_sach1` FOREIGN KEY (`MASACH`) REFERENCES `sach` (`MASACH`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ct_phieunhap`
--

LOCK TABLES `ct_phieunhap` WRITE;
/*!40000 ALTER TABLE `ct_phieunhap` DISABLE KEYS */;
/*!40000 ALTER TABLE `ct_phieunhap` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `hoadon`
--

DROP TABLE IF EXISTS `hoadon`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `hoadon` (
  `SOHD` int(11) NOT NULL,
  `MANV` int(11) NOT NULL,
  `MAKH` int(11) NOT NULL,
  `NGAYLAP` date DEFAULT NULL,
  `TONGGIATRI` int(11) DEFAULT NULL,
  PRIMARY KEY (`SOHD`,`MAKH`,`MANV`),
  KEY `fk_hoadon_nhanvien1_idx` (`MANV`),
  KEY `fk_hoadon_khachhang1_idx` (`MAKH`),
  CONSTRAINT `fk_hoadon_khachhang1` FOREIGN KEY (`MAKH`) REFERENCES `khachhang` (`MAKH`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_hoadon_nhanvien1` FOREIGN KEY (`MANV`) REFERENCES `nhanvien` (`MANV`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `hoadon`
--

LOCK TABLES `hoadon` WRITE;
/*!40000 ALTER TABLE `hoadon` DISABLE KEYS */;
/*!40000 ALTER TABLE `hoadon` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `khachhang`
--

DROP TABLE IF EXISTS `khachhang`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `khachhang` (
  `MAKH` int(11) NOT NULL,
  `TENKH` varchar(20) CHARACTER SET utf8 DEFAULT NULL,
  `GIOITINH` varchar(5) CHARACTER SET utf8 DEFAULT NULL,
  `DIACHI` varchar(50) CHARACTER SET utf8 DEFAULT NULL,
  `SDT` varchar(15) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`MAKH`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `khachhang`
--

LOCK TABLES `khachhang` WRITE;
/*!40000 ALTER TABLE `khachhang` DISABLE KEYS */;
/*!40000 ALTER TABLE `khachhang` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `nhanvien`
--

DROP TABLE IF EXISTS `nhanvien`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `nhanvien` (
  `MANV` int(11) NOT NULL,
  `TENNV` varchar(45) CHARACTER SET utf8 DEFAULT NULL,
  `CHUCVU` varchar(20) CHARACTER SET utf8 DEFAULT NULL,
  `GIOITINH` varchar(5) CHARACTER SET utf8 DEFAULT NULL,
  `DIACHI` varchar(45) CHARACTER SET utf8 DEFAULT NULL,
  `SDT` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL,
  `USERNAME` varchar(45) COLLATE utf8_unicode_ci NOT NULL,
  `PASSWORD` varchar(45) COLLATE utf8_unicode_ci NOT NULL,
  PRIMARY KEY (`MANV`),
  UNIQUE KEY `USERNAME_UNIQUE` (`USERNAME`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `nhanvien`
--

LOCK TABLES `nhanvien` WRITE;
/*!40000 ALTER TABLE `nhanvien` DISABLE KEYS */;
INSERT INTO `nhanvien` VALUES (1,'Nham Nga Hanh','Sale','Nam','Thu Duc, TP.HCM','0123466477','hanhnn','hanh1234'),(2,'Mo Dung Phuc','Manager','Nam','Quan 1, TP.HCM','0345234234','phucmd','phuc1234');
/*!40000 ALTER TABLE `nhanvien` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `nhaxuatban`
--

DROP TABLE IF EXISTS `nhaxuatban`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `nhaxuatban` (
  `MANXB` int(11) NOT NULL,
  `TENNXB` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
  `DIACHI` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
  `SDT` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
  `EMAIL` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`MANXB`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `nhaxuatban`
--

LOCK TABLES `nhaxuatban` WRITE;
/*!40000 ALTER TABLE `nhaxuatban` DISABLE KEYS */;
/*!40000 ALTER TABLE `nhaxuatban` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `phieunhap`
--

DROP TABLE IF EXISTS `phieunhap`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `phieunhap` (
  `SOPN` int(11) NOT NULL,
  `MANXB` int(11) DEFAULT NULL,
  `MANV` int(11) DEFAULT NULL,
  `NGAYLAP` date DEFAULT NULL,
  `TONGGIATRI` int(11) DEFAULT NULL,
  PRIMARY KEY (`SOPN`),
  KEY `fk_phieunhap_1_idx` (`MANV`),
  CONSTRAINT `fk_phieunhap_1_nhanvien` FOREIGN KEY (`MANV`) REFERENCES `nhanvien` (`MANV`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `phieunhap`
--

LOCK TABLES `phieunhap` WRITE;
/*!40000 ALTER TABLE `phieunhap` DISABLE KEYS */;
/*!40000 ALTER TABLE `phieunhap` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sach`
--

DROP TABLE IF EXISTS `sach`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `sach` (
  `MASACH` int(11) NOT NULL,
  `MATHELOAI` int(11) NOT NULL,
  `MANXB` int(11) NOT NULL,
  `MATAGIA` int(11) DEFAULT NULL,
  `SOLUONG` int(11) DEFAULT NULL,
  `DONGIA` int(11) DEFAULT NULL,
  `TENSACH` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`MASACH`,`MATHELOAI`,`MANXB`),
  KEY `fk_sach_nhaxuatban_idx` (`MANXB`),
  KEY `fk_sach_theloai1_idx` (`MATHELOAI`),
  CONSTRAINT `fk_sach_nhaxuatban` FOREIGN KEY (`MANXB`) REFERENCES `nhaxuatban` (`MANXB`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_sach_theloai1` FOREIGN KEY (`MATHELOAI`) REFERENCES `theloai` (`MATHELOAI`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sach`
--

LOCK TABLES `sach` WRITE;
/*!40000 ALTER TABLE `sach` DISABLE KEYS */;
/*!40000 ALTER TABLE `sach` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `theloai`
--

DROP TABLE IF EXISTS `theloai`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `theloai` (
  `MATHELOAI` int(11) NOT NULL,
  `TENTHELOAI` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`MATHELOAI`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `theloai`
--

LOCK TABLES `theloai` WRITE;
/*!40000 ALTER TABLE `theloai` DISABLE KEYS */;
/*!40000 ALTER TABLE `theloai` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-10-29  9:34:48
