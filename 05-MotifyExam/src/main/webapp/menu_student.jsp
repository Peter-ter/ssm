<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ page isELIgnored="false" %>     
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Insert title here</title>
		<link href="style/style.css" rel="stylesheet" type="text/css" />
	</head>
	
	<!--left-->
	<div id="left" style="float: left;">
		<!--s_left-->
		<div class="s_left" id="nav">
			
			<p>
				我的考试
			</p>
			<ul>

				<li>
					<a href="./login.html"
						style="background: url(images/zx.jpg) no-repeat 15px center;"
						target="_top">退出考试</a>
				</li>
				<li>
					<a href="${pageContext.request.contextPath }/pxs/test.do"
						style="background: url(images/grzlxg.jpg) no-repeat 15px center;"
						target="content">参加考试</a>
				</li>
			
				
			</ul>

		</div>

		

	</div>