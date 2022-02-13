
create database mwc;
use mwc;
 
CREATE TABLE `users` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `category` int(11), 
  `date` int(11), 
  `email` varchar(255), 
  `name` varchar(255), 
  `phone` varchar(255),
  PRIMARY KEY (`id`)
) 

