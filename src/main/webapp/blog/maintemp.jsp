<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<script src="${pageContext.request.contextPath}/static/js/jquery-2.1.0.min.js"></script>
<script src="${pageContext.request.contextPath}/static/js/audioplayer.js"></script>

<link rel="stylesheet" href="${pageContext.request.contextPath}/static/bootstrap3/css/bootstrap.min.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/static/bootstrap3/css/bootstrap-theme.min.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/static/css-blog/blog.css">
<script src="${pageContext.request.contextPath}/static/bootstrap3/js/jquery-1.11.2.min.js"></script>
<script src="${pageContext.request.contextPath}/static/bootstrap3/js/bootstrap.min.js"></script>

<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Leo</title>

<style type="text/css">
	body{
		padding-top:10px;
		padding-bottom:40px;
	}
</style>

<script type="text/javascript"> 
	function goTopEx() { 
	var obj = document.getElementById("goTopBtn"); 
	function getScrollTop() { 
	return document.documentElement.scrollTop + document.body.scrollTop; 
	} 
	function setScrollTop(value) { 
	if (document.documentElement.scrollTop) { 
	document.documentElement.scrollTop = value; 
	} else { 
	document.body.scrollTop = value; 
	} 
	} 
	window.onscroll = function() { 
	getScrollTop() > 0 ? obj.style.display = "": obj.style.display = "none"; 
	} 
	obj.onclick = function() { 
	var goTop = setInterval(scrollMove, 10); 
	function scrollMove() { 
	setScrollTop(getScrollTop() / 1.1); 
	if (getScrollTop() < 1) clearInterval(goTop); 
		} 
	} 
} 
</script> 
	<style> 
/* 	BODY {  */
/* 	HEIGHT: 3600px;  */
/* 	}  */
	#goTopBtn { 
	POSITION: fixed; TEXT-ALIGN: center; LINE-HEIGHT: 30px; WIDTH: 30px; BOTTOM: 35px; HEIGHT: 33px; FONT-SIZE: 12px; CURSOR: pointer; RIGHT: 35px; _position: absolute; _right: auto 
	} 
	</style>

</head>
<body>
    <nav class="navbar navbar-default navbar-fixed-top" style="opacity: .9" role="navigation">
    <div class="container-fluid">
        <!-- Brand and toggle get grouped for better mobile display -->
        <div class="navbar-header">
            <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="http://115.159.191.196/Leo/index.jsp">Leo</a>
        </div>

        <!-- Collect the nav links, forms, and other content for toggling -->
        <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
            <ul class="nav navbar-nav navbar-right">
                <li class="active"><a href="http://115.159.191.196/Leo/blogIndex.html">Blog</a></li>
                <li><a href="http://www.jianshu.com/users/71fcdcfc08c2/latest_articles" target="_blank">简书</a></li>

                <li><a href="https://github.com/Chuancey-Leo" target="_blank">GitHub</a></li>
            </ul>
        </div><!-- /.navbar-collapse -->
    </div><!-- /.container-fluid -->
</nav>
<!-- <div class="container" style="margin: 0 auto;"> -->

<%-- 	<jsp:include page="foreground/common/head.jsp"></jsp:include> --%>
<%-- 	<jsp:include page="foreground/common/menu.jsp"></jsp:include> --%>
	
	
	<div class="row" style="padding-top: 70px">
  <div class="container center-block">
  
    <div class="col-md-2"></div>
	
    <div class="col-md-8 col-sm-12">
      <div class="panel panel-default">
        <div class="panel-heading">
<!--           <h3 class="panel-title">Blog</h3> -->
        </div>

         		<jsp:include page="${mainPage }"></jsp:include> 
      </div>
    </div>

    <div class="col-md-2">
    </div>
  </div>
    </div>

<!-- 	<div class="row" style="margin: 0 auto;"> -->
<!-- 	  <div class="col-md-12" style="margin: 0 auto;"> -->

 		
<!--  			  <div> -->
<!-- 				<nav> -->
<!-- 				  <ul class="pagination pagination-sm"> -->
<%-- 						${pageCode} --%>
<!-- 				  </ul> -->
<!-- 				</nav> -->
<!-- 			 	</div> -->
<!-- 	  </div> -->
	  
	  
<!-- 	  <div class="col-md-3"> -->
<!-- 	  	<div class="data_list"> -->
<!-- 			<div class="data_list_title"> -->
<%-- 				<img src="${pageContext.request.contextPath}/static/images/user_icon.png"/> --%>
<!-- 				博主信息 -->
<!-- 			</div> -->
<!-- 			<div class="user_image"> -->
<%-- 				<img src="${pageContext.request.contextPath}/static/userImages/${blogger.imageName}"/> --%>
<!-- 			</div> -->
<%-- 			<div class="nickName">${blogger.nickName}</div> --%>
<%-- 			<div class="userSign">${blogger.sign}</div> --%>
<!-- 		</div> -->
		
<!-- 		<div class="data_list"> -->
<!-- 			<div class="data_list_title"> -->
<%-- 				<img src="${pageContext.request.contextPath}/static/images/byType_icon.png"/> --%>
<!-- 				按博客类别 -->
<!-- 			</div> -->
<!-- 			<div class="datas"> -->
<!-- 				<ul> -->
					
<%-- 					<c:forEach var="blogtype" items="${blogTypeCountList }"> --%>
<%-- 						<li><span><a href="${pageContext.request.contextPath}/blogIndex.html?typeId=${blogtype.id}">${blogtype.typeName }(${blogtype.blogCount })</a></span></li> --%>
<%-- 					</c:forEach>					 --%>
<!-- 				</ul> -->
<!-- 			</div> -->
<!-- 		</div> -->
		
<!-- 		<div class="data_list"> -->
<!-- 			<div class="data_list_title"> -->
<%-- 				<img src="${pageContext.request.contextPath}/static/images/byDate_icon.png"/> --%>
<!-- 				按博客日期 -->
<!-- 			</div> -->
<!-- 			<div class="datas"> -->
<!-- 				<ul> -->
<%-- 					<c:forEach var="blogs" items="${blogCountList }"> --%>
<%-- 						<li><span><a href="${pageContext.request.contextPath}/blogIndex.html?releaseDateStr=${blogs.releaseDateStr}">${blogs.releaseDateStr }(${blogs.blogCount })</a></span></li> --%>
<%-- 					</c:forEach>				 --%>
<!-- 				</ul> -->
<!-- 			</div> -->
<!-- 		</div> -->

<!-- 		<div class="data_list"> -->
<!-- 			<div class="data_list_title"> -->
<%-- 				<img src="${pageContext.request.contextPath}/static/images/link_icon.png"/> --%>
<!-- 				友情链接 -->
<!-- 			</div> -->
<!-- 			<div class="datas"> -->
<!-- 				<ul> -->
<%-- 					<c:forEach var="links" items="${linkList }"> --%>
<%-- 						<li><span><a href="${links.linkUrl }" target="_blank">${links.linkName}</a></span></li> --%>
<%-- 					</c:forEach> --%>
<!-- 				</ul> -->
<!-- 			</div> -->
<!-- 		</div> -->
<!-- 	  </div> -->
<!-- 	</div> -->
	
<%-- 	<div style="display: none" id="goTopBtn"><img border=0 src="${pageContext.request.contextPath}/static/images/go_to_top.png"/></div> --%>
<!-- 	<script type=text/javascript>goTopEx();</script> -->
	
<!-- 	<embed src="http://www.xiami.com/widget/186821644_184946563_190_500_FF8719_494949_0/collectPlayer.swf" type="application/x-shockwave-flash" width="190" height="500" wmode="opaque"></embed> -->
<%-- 	<jsp:include page="foreground/common/foot.jsp"></jsp:include> --%>
	
<!-- </div> -->

</body>
</html>