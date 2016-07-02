/*
SQLyog Ultimate v12.08 (64 bit)
MySQL - 5.1.49-community : Database - db_blog
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`db_blog` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `db_blog`;

/*Table structure for table `t_blog` */

DROP TABLE IF EXISTS `t_blog`;

CREATE TABLE `t_blog` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(200) DEFAULT NULL,
  `sumary` varchar(400) DEFAULT NULL,
  `releaseDate` datetime DEFAULT NULL,
  `clickHit` int(11) DEFAULT NULL,
  `replyHit` int(11) DEFAULT NULL,
  `content` text,
  `typeId` int(11) DEFAULT NULL,
  `keyWord` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `typeId` (`typeId`),
  CONSTRAINT `t_blog_ibfk_1` FOREIGN KEY (`typeId`) REFERENCES `t_blogtype` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=64 DEFAULT CHARSET=utf8;

/*Data for the table `t_blog` */

insert  into `t_blog`(`id`,`title`,`sumary`,`releaseDate`,`clickHit`,`replyHit`,`content`,`typeId`,`keyWord`) values (60,'Python《圣经》','The Zen of Python, by Tim Peters Beautiful is better than ugly.Explicit is better than implicit.Simple is better than complex.Complex is better than compli','2016-05-23 15:29:10',3,0,'<p style=\";font-family:Calibri;font-size:15px;color:#2E75B5\">The Zen of Python, by Tim Peters</p><p style=\";font-family:Calibri;font-size:15px;color:#2E75B5\">&nbsp;</p><p style=\";font-family:Calibri;font-size:15px;color:#2E75B5\">Beautiful is better than ugly.</p><p style=\";font-family:Calibri;font-size:15px;color:#2E75B5\">Explicit is better than implicit.</p><p style=\";font-family:Calibri;font-size:15px;color:#2E75B5\">Simple is better than complex.</p><p style=\";font-family:Calibri;font-size:15px;color:#2E75B5\">Complex is better than complicated.</p><p style=\";font-family:Calibri;font-size:15px;color:#2E75B5\">Flat is better than nested.</p><p style=\";font-family:Calibri;font-size:15px;color:#2E75B5\">Sparse is better than dense.</p><p style=\";font-family:Calibri;font-size:15px;color:#2E75B5\">Readability counts.</p><p style=\";font-family:Calibri;font-size:15px;color:#2E75B5\">Special cases aren&#39;t special enough to break the rules.</p><p style=\";font-family:Calibri;font-size:15px;color:#2E75B5\">Although practicality beats purity.</p><p style=\";font-family:Calibri;font-size:15px;color:#2E75B5\">Errors should never pass silently.</p><p style=\";font-family:Calibri;font-size:15px;color:#2E75B5\">Unless explicitly silenced.</p><p style=\";font-family:Calibri;font-size:15px;color:#2E75B5\">In the face of ambiguity, refuse the temptation to guess.</p><p style=\";font-family:Calibri;font-size:15px;color:#2E75B5\">There should be one-- and preferably only one --obvious way to do it.</p><p style=\";font-family:Calibri;font-size:15px;color:#2E75B5\">Although that way may not be obvious at first unless you&#39;re Dutch.</p><p style=\";font-family:Calibri;font-size:15px;color:#2E75B5\">Now is better than never.</p><p style=\";font-family:Calibri;font-size:15px;color:#2E75B5\">Although never is often better than *right* now.</p><p style=\";font-family:Calibri;font-size:15px;color:#2E75B5\">If the implementation is hard to explain, it&#39;s a bad idea.</p><p style=\";font-family:Calibri;font-size:15px;color:#2E75B5\">If the implementation is easy to explain, it may be a good idea.</p><p style=\";font-family:Calibri;font-size:15px;color:#2E75B5\">Namespaces are one honking great idea -- let&#39;s do more of those!</p><p style=\";font-family:Calibri;font-size:15px\">&nbsp;</p><p style=\";font-size:15px;color:#538135\"><span style=\"font-family: Calibri\">Python</span><span style=\"font-family:微软雅黑\">之禅</span></p><p style=\";font-family:Calibri;font-size:15px;color:#538135\">&nbsp;</p><p style=\";font-family:微软雅黑;font-size:15px;color:#538135\">优美胜于丑陋</p><p style=\";font-family:微软雅黑;font-size:15px;color:#538135\">明了胜于晦涩</p><p style=\";font-family:微软雅黑;font-size:15px;color:#538135\">简洁胜于复杂</p><p style=\";font-family:微软雅黑;font-size:15px;color:#538135\">复杂胜于凌乱</p><p style=\";font-family:微软雅黑;font-size:15px;color:#538135\">扁平胜于嵌套</p><p style=\";font-family:微软雅黑;font-size:15px;color:#538135\">间隔胜于紧凑</p><p style=\";font-family:微软雅黑;font-size:15px;color:#538135\">可读性很重要</p><p style=\";font-family:微软雅黑;font-size:15px;color:#538135\">即便假借特例的实用性之名，也不可违背这些规则</p><p style=\";font-family:微软雅黑;font-size:15px;color:#538135\">不要包容所有错误，除非你确定需要这样做</p><p style=\";font-size:15px;color:#538135\"><span style=\"font-family: 微软雅黑\">当存在多种可能，不要尝试去猜测</span> </p><p style=\";font-family:微软雅黑;font-size:15px;color:#538135\">而是尽量找一种，最好是唯一一种明显的解决方案</p><p style=\";font-size:15px;color:#538135\"><span style=\"font-family: 微软雅黑\">虽然这并不容易，因为你不是</span><span style=\"font-family:Calibri\"> Python </span><span style=\"font-family:微软雅黑\">之父</span></p><p style=\";font-family:微软雅黑;font-size:15px;color:#538135\">做也许好过不做，但不假思索就动手还不如不做</p><p style=\";font-family:微软雅黑;font-size:15px;color:#538135\">如果你无法向人描述你的方案，那肯定不是一个好方案；反之亦然</p><p style=\";font-family:微软雅黑;font-size:15px;color:#538135\">命名空间是一种绝妙的理念，我们应当多加利用</p><p><br/></p>',2,''),(61,'盗梦空间','So do you want to take a leap of faith or become an old man, filled with regret, waiting to die alone? 那么，你是想放手一搏，还是要等到年华老去，心中充满遗憾，孤独地迈向黄泉路？','2016-05-23 15:46:04',7,0,'<p style=\"margin:0in;font-family:微软雅黑;font-size:11.0pt\"></p><p style=\"margin:0in;font-family:微软雅黑;font-size:11.0pt\"><img src=\"/Leo2/static/userImages/20160610/1465570456528032595.jpg\" title=\"1465570456528032595.jpg\" alt=\"psb.jpg\"/></p><p style=\"margin:0in;font-family:微软雅黑;font-size:11.0pt\"><br/></p><p style=\"margin:0in;font-family:微软雅黑;font-size:11.0pt\">So&nbsp;do&nbsp;you&nbsp;want&nbsp;to&nbsp;take&nbsp;a&nbsp;leap&nbsp;of&nbsp;faith&nbsp;or&nbsp;become&nbsp;an&nbsp;old&nbsp;man,&nbsp;filled&nbsp;with&nbsp;regret,&nbsp;waiting&nbsp;to&nbsp;die&nbsp;alone?&nbsp;</p><p style=\"margin:0in;font-family:微软雅黑;font-size:11.0pt\">那么，你是想放手一搏，还是要等到年华老去，心中充满遗憾，孤独地迈向黄泉路？</p><p><br/></p>',6,''),(62,'ListView中的点击问题','BaseAdapter原类中的方法？ListView的点击事件与Button的点击事件有什么不同？Resume()内部是怎么运行的？   重写记事本当点击一个listview子元素实现跳转到另一个activity：http://www.oschina.net/question/913204_82282','2016-05-23 15:59:23',18,1,'<p style=\";font-size:15px\"><span style=\"font-family:Calibri\">BaseAdapter</span><span style=\"font-family:微软雅黑\">原类中的方法？</span></p><p style=\";font-size:15px\"><span style=\"font-family:Calibri\">ListView</span><span style=\"font-family:微软雅黑\">的点击事件与</span><span style=\"font-family:Calibri\">Button</span><span style=\"font-family: 微软雅黑\">的点击事件有什么不同？</span></p><p style=\";font-size:15px\"><span style=\"font-family:Calibri\">Resume()</span><span style=\"font-family:微软雅黑\">内部是怎么运行的？</span></p><p style=\";font-family:微软雅黑;font-size:15px\">&nbsp;</p><p style=\";font-family:微软雅黑;font-size:15px\">&nbsp;</p><p style=\";font-family:微软雅黑;font-size:15px\">&nbsp;</p><p style=\";font-family:微软雅黑;font-size:15px;color:red\">重写记事本</p><p style=\";font-size:15px\"><span style=\"font-family:微软雅黑\">当点击一个</span><span style=\"font-family:Calibri\">listview</span><span style=\"font-family:微软雅黑\">子元素实现跳转到另一个</span><span style=\"font-family: Calibri\">activity</span><span style=\"font-family:微软雅黑\">：</span></p><p style=\";font-family:Calibri;font-size:15px\"><a href=\"http://www.oschina.net/question/913204_82282\">http://www.oschina.net/question/913204_82282</a></p><p><br/></p>',7,''),(63,'这是测试页面','rfajldagdsjgpsjkdgdjslgjds','2016-06-10 18:46:43',8,1,'<p>rfajlda</p><p>gdsjgpsjkd</p><p>gdjslgjds</p>',10,'');

/*Table structure for table `t_blogger` */

DROP TABLE IF EXISTS `t_blogger`;

CREATE TABLE `t_blogger` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `userName` varchar(50) DEFAULT NULL,
  `password` varchar(100) DEFAULT NULL,
  `profile` text,
  `nickName` varchar(50) DEFAULT NULL,
  `sign` varchar(100) DEFAULT NULL,
  `imageName` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

/*Data for the table `t_blogger` */

insert  into `t_blogger`(`id`,`userName`,`password`,`profile`,`nickName`,`sign`,`imageName`) values (1,'leo','45c153dd97c9e540d9d7571c80a1337b','xxx','leo','劈材、喂马、周游世界','b.jpg');

/*Table structure for table `t_blogtype` */

DROP TABLE IF EXISTS `t_blogtype`;

CREATE TABLE `t_blogtype` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `typeName` varchar(30) DEFAULT NULL,
  `orderNum` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8;

/*Data for the table `t_blogtype` */

insert  into `t_blogtype`(`id`,`typeName`,`orderNum`) values (1,'java',1),(2,'python',3),(3,'c#',2),(6,'我的感想',4),(7,'android',5),(8,'3d',6),(9,'unity',7),(10,'test',8),(11,'test2',9);

/*Table structure for table `t_comment` */

DROP TABLE IF EXISTS `t_comment`;

CREATE TABLE `t_comment` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `ip` varchar(50) DEFAULT NULL,
  `blogId` int(11) DEFAULT NULL,
  `content` varchar(1000) DEFAULT NULL,
  `commentDate` datetime DEFAULT NULL,
  `state` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=31 DEFAULT CHARSET=utf8;

/*Data for the table `t_comment` */

insert  into `t_comment`(`id`,`ip`,`blogId`,`content`,`commentDate`,`state`) values (29,'0:0:0:0:0:0:0:1',62,'this is test','2016-05-23 19:34:19',1),(30,'0:0:0:0:0:0:0:1',63,'mgf;lsdg;lfdshfdhfdhfd','2016-06-10 19:11:25',0);

/*Table structure for table `t_link` */

DROP TABLE IF EXISTS `t_link`;

CREATE TABLE `t_link` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `linkName` varchar(100) DEFAULT NULL,
  `linkUrl` varchar(200) DEFAULT NULL,
  `orderNum` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

/*Data for the table `t_link` */

insert  into `t_link`(`id`,`linkName`,`linkUrl`,`orderNum`) values (1,'稀土~掘金hehe','http://gold.xitu.io/',1),(2,'游戏设计','http://www.aboutcg.com/',2),(3,'小图标下载','http://www.easyicon.net/',3),(4,'Java贴吧','http://tieba.baidu.com/f?kw=java',5),(5,'免费logo在线制作','http://www.uugai.com/',4),(6,'test','hgfjhfg',6);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
