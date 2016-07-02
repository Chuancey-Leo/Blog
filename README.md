# Blog

使用方法：
clone或下载此repository。
在eclipse、IDEA中新建maven项目，更新相关的maven库（eclipse会根据pom.xml中的要求自动下载）
在Java Resources目录下新建src/main/java、src/main/resources，将repository下的java、resources下的内容一次拷入src/main/java、src/main/resources。
将repository的webapp下的内容拷入相应的目录。

版本：
1.0：
1.前台可对博客进行评论。
2.前台可对博客进行分时间和分博客类别进行查询。
3.博客内容可添加视频、音乐、相应的文档附件。
4.博客有分享功能，

2.0：
1.去掉了搜索功能。
2.后台评论信息实现。
3.后台清除session。
4.增加管理员可修改密码功能。
5.修改博客类别。
6.博客时间从数据库而非从session中读取。
7.去除分页。
8.解决代码高亮的问题。

3.0:
也即是现在的版本，去除了所有冗长的功能，博客只能观看博客，返回上一级或下一级都用浏览器的功能实现。而这才是设计的精髓！

演示地址：
http://115.159.191.196/Leo/blogIndex.html