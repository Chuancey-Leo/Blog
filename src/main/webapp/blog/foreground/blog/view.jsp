<script type="text/javascript" src="${pageContext.request.contextPath}/static/ueditor/third-party/SyntaxHighlighter/shCore.js"></script>
<link rel="stylesheet" href="${pageContext.request.contextPath}/static/ueditor/third-party/SyntaxHighlighter/shCoreDefault.css">
<script type="text/javascript">
    SyntaxHighlighter.all();
</script>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<link rel="stylesheet" href="${pageContext.request.contextPath}/static/css-blog/blog.css">

<script type="text/javascript">
function loadimage(){
	document.getElementById("randImage").src="${pageContext.request.contextPath}/blog/image.jsp?"+Math.random();
}

function submitData(){
	var content=$("#content").val();
	var imageCode=$("#imageCode").val();
	if(content==null || content==""){
		alert("请输入评论内容！");
	}else if(imageCode==null || imageCode==""){
		alert("请输入验证码！");
	}else{
		$.post("${pageContext.request.contextPath}/comment/save.html",
				{"content":content,'imageCode':imageCode,'blog.id':'${blog.id}'},function(result){
					if(result.success){
						alert("评论已提交成功，审核后显示！");
						location.reload(true);
					}else{
						alert(result.errorInfo);
					}
					
				},"json");
		}
}

</script>
<!-- <div class="data_list"> -->
<!-- 	<div class="data_list_title"> -->
<%-- 		<img src="${pageContext.request.contextPath}/static/images/blog_show_icon.png"/> --%>
<!-- 		博客信息 -->
<!-- 	</div> -->
	
	<div>
		<div class="blog_title" style="text-align:center;margin:0 auto;"><h3><strong>${blog.title }</strong></h3></div>
<!-- 		<div class="blog_share"> -->
<!-- 			<div class="bshare-custom"><a title="分享到QQ空间" class="bshare-qzone"></a><a title="分享到新浪微博" class="bshare-sinaminiblog"></a><a title="分享到人人网" class="bshare-renren"></a><a title="分享到腾讯微博" class="bshare-qqmb"></a><a title="分享到网易微博" class="bshare-neteasemb"></a><a title="更多平台" class="bshare-more bshare-more-icon more-style-addthis"></a><span class="BSHARE_COUNT bshare-share-count">0</span></div><script type="text/javascript" charset="utf-8" src="http://static.bshare.cn/b/buttonLite.js#style=-1&amp;uuid=&amp;pophcol=2&amp;lang=zh"></script><script type="text/javascript" charset="utf-8" src="http://static.bshare.cn/b/bshareC0.js"></script> -->
<!-- 		</div> -->
		<div class="blog_info" style="text-align:center;margin:0 auto;">
			<fmt:formatDate value="${blog.releaseDate }" type="date" pattern="yyyy-MM-dd HH:mm"/>
		</div>

		<div class="blog_content">
			${blog.content }
		</div>
		
<!-- 		<div class="blog_keyWord"> -->
			
<%-- 			<c:choose> --%>
<%-- 				<c:when test="${keyWords==null }"> --%>
<!-- 					&nbsp;&nbsp;&nbsp;&nbsp; -->
<%-- 				</c:when> --%>
<%-- 				<c:otherwise> --%>
<%-- 					<c:forEach var="keyWord" items="${keyWords }"> --%>
<!-- 						<font><strong>关键字：</strong></font> -->
<%-- 						&nbsp;&nbsp;<a>${keyWord }</a>&nbsp;&nbsp; --%>
						 
<%-- 					</c:forEach> --%>
<%-- 				</c:otherwise> --%>
<%-- 			</c:choose> --%>
<!-- 		</div> -->
		
<!-- 		<div class="blog_lastAndNextPage"> -->
<%-- 			${lastnext } --%>
<!-- 		</div> -->
	
	</div>
<!-- </div> -->

<!-- <div class="data_list"> -->
<!-- 	<div class="data_list_title"> -->
<%-- 		<img src="${pageContext.request.contextPath}/static/images/comment_icon.png"/> --%>
<!-- 		评论信息     -->
<!-- 	</div> -->
<!-- 	<div class="commentDatas"> -->
<%-- 		<c:choose> --%>
<%-- 			<c:when test="${CommentList.size==0 }"> --%>
<!-- 				暂无评论 -->
<%-- 			</c:when> --%>
<%-- 			<c:otherwise> --%>
<%-- 				<c:forEach var="comment" items="${commentList }" varStatus="status"> --%>
<!-- 					<div class="comment"> -->
<%-- 						<span><font>${status.index+1 }楼&nbsp;&nbsp;&nbsp;&nbsp;${comment.ip }：</font>${comment.content }&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[&nbsp;<fmt:formatDate value="${comment.commentDate }" type="date" pattern="yyyy-MM-dd HH:mm"/>&nbsp;]</span> --%>
						
<!-- 					</div> -->
<%-- 				</c:forEach> --%>
<%-- 			</c:otherwise> --%>
<%-- 		</c:choose> --%>
<!-- 	</div> -->

<!-- </div> -->
<!-- <div class="data_list" > -->
<!-- 	<div class="data_list_title"> -->
<%-- 		<img src="${pageContext.request.contextPath}/static/images/publish_comment_icon.png"/> --%>
<!-- 		发表评论 -->
<!-- 	</div> -->
<!-- 	<div class="publish_comment"> -->
<!-- 			<div> -->
<!-- 				<textarea style="width: 100%" rows="3" id="content" name="content" placeholder="来说两句吧..."></textarea> -->
<!-- 			</div> -->
<!-- 			<div class="verCode"> -->
<%-- 				验证码：<input type="text" value="" name="imageCode"  id="imageCode" size="10" onkeydown= "if(event.keyCode==13)form1.submit()"/>&nbsp;<img onclick="javascript:loadimage();"  title="换一张试试" name="randImage" id="randImage" src="${pageContext.request.contextPath}/blog/image.jsp" width="60" height="20" border="1" align="absmiddle">  --%>
<!-- 			</div> -->
<!-- 			<div class="publishButton"> -->
<!-- 				<button class="btn btn-primary" type="button" onclick="submitData()">发表评论</button> -->
<!-- 			</div> -->
<!-- 		</form> -->
<!-- 	</div> -->
<!-- </div> -->
