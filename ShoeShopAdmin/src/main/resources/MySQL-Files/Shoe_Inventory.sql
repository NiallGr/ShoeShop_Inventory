-- MySQL dump 10.13  Distrib 8.0.22, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: shoe_shop_inventory
-- ------------------------------------------------------
-- Server version	8.0.22


DROP TABLE IF EXISTS `shoe_inventory`;

CREATE TABLE `shoe_inventory` (
  `id` int NOT NULL AUTO_INCREMENT,
  `shoe_name` varchar(45) DEFAULT NULL,
  `shoe_price` varchar(45) DEFAULT NULL,
  `shoe_description` varchar(255) DEFAULT NULL,
  `img_url` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=20 DEFAULT CHARSET=latin1;


--
-- Dumping data for table `shoe_inventory`
--

LOCK TABLES `shoe_inventory` WRITE;
INSERT INTO `shoe_inventory` VALUES (3,'Nike Air Max','125$','Black Male Size 10','https://images.footlocker.com/is/image/EBFL2/4206708_a1?wid=630&hei=630&fmt=png-alpha'),
(4,'Nike Air Max','100$','Nike Female Size 5','https://images.footlocker.com/is/image/EBFL2/4206708_a1?wid=630&hei=630&fmt=png-alpha'),
(6,'Adidas','180$','White with Black Strips Male Size 8','https://assets.adidas.com/images/w_600,f_auto,q_auto/4e894c2b76dd4c8e9013aafc016047af_9366/Superstar_Shoes_White_FV3284_01_standard.jpg'),
(7,'Adidas','120$','White with Black Strips Female Size 4','https://assets.adidas.com/images/w_600,f_auto,q_auto/4e894c2b76dd4c8e9013aafc016047af_9366/Superstar_Shoes_White_FV3284_01_standard.jpg'),
(8,'Puma','110$','Pink Mesh Female Size 5','https://cdn.citymapia.com/kottayam/ibc-store/17099/portfolio.jpg?biz=2922'),
(9,'Puma','110$','Pink Mesh Female Size 7','https://cdn.citymapia.com/kottayam/ibc-store/17099/portfolio.jpg?biz=2922'),
(10,'Asus','210$','Red Running Shoes Male Size 12','https://img.ssensemedia.com/images/b_white,g_center,f_auto,q_auto:best/211985M237004_1/kiko-kostadinov-red-asics-edition-gel-kiril-2-sneakers.jpg'),
(12,'Asus','210$','Red Running Shoes Male Size 7','https://img.ssensemedia.com/images/b_white,g_center,f_auto,q_auto:best/211985M237004_1/kiko-kostadinov-red-asics-edition-gel-kiril-2-sneakers.jpg'),
(13,'Dress Shoe','220$','Grey Male Size 6','https://www.florsheimshoes.ca/shop/images/13326-020.jpg'),
(14,'Dress Shoe','300$','Black Male Size 10','https://www.chicagotribune.com/resizer/dDVptWK7s6ZWf3JMQIJtUMPUI1U=/1200x0/top/arc-anglerfish-arc2-prod-tronc.s3.amazonaws.com/public/R37AIW6JUBC7PBOYRSINV2S2MM.jpg'),
(17,'Dress Shoe','175$','Brown Male Size 7','https://images.freeimages.com/images/large-previews/b78/nice-shoes-1418807.jpg'),
(18,'Dress Shoe','175$','Brown Male Size 8','https://images.freeimages.com/images/large-previews/b78/nice-shoes-1418807.jpg');

UNLOCK TABLES;



