<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="java.util.ArrayList"%>
<%@page import="hotel_booking.dto.NotificationDTO"%>



<!DOCTYPE html>
<html lang="en">
<head>
<link href="user_page/css/index.css" rel="stylesheet">
</head>

<body>
	<%@include file="header.jsp"%>
	<!-- Banner Start -->
	<h2 style="margin-top: 20px; text-align: center;">THÔNG BÁO</h2>
	<%
	NotificationDTO note = (NotificationDTO) request.getAttribute("note");
	%>
	<h4><b style="margin-left: 200px; margin-bottom: 20px">Tiêu đề :</b></h4>
	<p style="margin-left: 200px; margin-top: 20px"><%=note.getTitle()%></p>
	<br>

	<h4><b style="margin-left: 200px; margin-top: 20px">Nội dung:</b></h4>
	<br>
	<p style="margin-left: 200px;"><%=note.getContent()%></p>










	<%@include file="footer.jsp"%>
</body>

</html>
