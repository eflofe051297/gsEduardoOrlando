/*
 Navicat Premium Data Transfer

 Source Server         : Mysql
 Source Server Type    : MySQL
 Source Server Version : 80017
 Source Host           : webservices.cputezxs2i4c.us-east-2.rds.amazonaws.com:3306
 Source Schema         : bdAutos

 Target Server Type    : MySQL
 Target Server Version : 80017
 File Encoding         : 65001

 Date: 22/09/2021 22:53:26
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for autos
-- ----------------------------
DROP TABLE IF EXISTS `autos`;
CREATE TABLE `autos`  (
  `id` int(11) NOT NULL,
  `Placas` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `tipoAuto` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `entrada` timestamp(0) NULL DEFAULT CURRENT_TIMESTAMP(0) ON UPDATE CURRENT_TIMESTAMP(0),
  `salida` timestamp(0) NULL DEFAULT CURRENT_TIMESTAMP(0) ON UPDATE CURRENT_TIMESTAMP(0),
  `ingresos` int(255) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for registrosAutos
-- ----------------------------
DROP TABLE IF EXISTS `registrosAutos`;
CREATE TABLE `registrosAutos`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `placa` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `ingreso` timestamp(0) NULL DEFAULT NULL,
  `salida` timestamp(0) NULL DEFAULT NULL,
  `minutos` int(15) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `placa`(`placa`) USING BTREE,
  CONSTRAINT `placa` FOREIGN KEY (`placa`) REFERENCES `tiposAutos` (`Placa`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for tiposAutos
-- ----------------------------
DROP TABLE IF EXISTS `tiposAutos`;
CREATE TABLE `tiposAutos`  (
  `Placa` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `tipoAuto` varchar(2) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  PRIMARY KEY (`Placa`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

SET FOREIGN_KEY_CHECKS = 1;
