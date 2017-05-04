/*
Navicat MySQL Data Transfer

Source Server         : mysql
Source Server Version : 50714
Source Host           : localhost:3306
Source Database       : poi

Target Server Type    : MYSQL
Target Server Version : 50714
File Encoding         : 65001

Date: 2017-05-04 20:12:17
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for employee
-- ----------------------------
DROP TABLE IF EXISTS `employee`;
CREATE TABLE `employee` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `sex` varchar(255) DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  `native_place` varchar(255) DEFAULT NULL,
  `entry_date` date DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of employee
-- ----------------------------
INSERT INTO `employee` VALUES ('1', '张三', 'M', '32', '上海', '2017-05-03');
INSERT INTO `employee` VALUES ('2', '李四', 'M', '24', '北京', '2017-04-18');
INSERT INTO `employee` VALUES ('3', '刘德华', 'M', '55', '香港', '2016-11-01');
INSERT INTO `employee` VALUES ('4', '艾弗森', 'M', '42', '美国', '2017-05-17');
INSERT INTO `employee` VALUES ('5', '谢楠', 'F', '38', '中国', '2017-05-07');
INSERT INTO `employee` VALUES ('6', '宝强', 'N', '40', '河北', '2017-04-11');
