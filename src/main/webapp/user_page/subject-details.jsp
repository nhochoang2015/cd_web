<%@page import="hotel_booking.dto.HotelDTO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>


<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
</head>

<body>
	<%@include file="header.jsp"%>
	<nav aria-label="breadcrumb">
		<ol class="breadcrumb" style="text-align: center">
			<li class="breadcrumb-item"><a href="./">Trang chủ</a></li>
			<li class="breadcrumb-item active" aria-current="page">Thông tin
				cá nhân</li>
		</ol>
	</nav>
	<ul class="nav nav-tabs" id="myTab" role="tablist">
		<li class="nav-item"><a class="nav-link active" id="home-tab"
			data-toggle="tab" href="#home" role="tab" aria-controls="home"
			aria-selected="true">Thông tin</a></li>
	</ul>
	<%
	

		HotelDTO subjectDTO = (HotelDTO) request.getAttribute("subject");
	%>
	<div class="tab-pane fade show active" id="home" role="tabpanel"
		aria-labelledby="profile-tab">
		<form class="form-inline" style="margin-top: 20px; margin-left: 20px">
			<div class="form-group mb-2">
				<label for="staticEmail2" class="sr-only">Email</label> <input
					type="text" readonly class="form-control-plaintext"
					id="staticEmail2" value="Tên môn học">
			</div>
			<div class="form-group mx-sm-3 mb-2">
				<label for="inputPassword2" class="sr-only">Password</label> <input
					type="text" class="form-control" id="inputPassword2"
					value="<%=subjectDTO.getSubjectName()%>" disabled="disabled">
			</div>
		</form>
		<form class="form-inline" style="margin-top: 20px; margin-left: 20px">
			<div class="form-group mb-2">
				<label for="staticEmail2" class="sr-only"></label> <input
					type="text" readonly class="form-control-plaintext"
					id="staticEmail2" value="Giá">
			</div>
			<div class="form-group mx-sm-3 mb-2">
				<label for="inputPassword2" class="sr-only">Password</label> <input
					type="text" class="form-control" id="inputPassword2"
					value="<%=subjectDTO.getPrice()%>" disabled="disabled">
			</div>
		</form>
		<form class="form-inline" style="margin-top: 20px; margin-left: 20px">
			<div class="form-group mb-2">
				<label for="staticEmail2" class="sr-only"></label> <input
					type="text" readonly class="form-control-plaintext"
					id="staticEmail2" value="Buổi học">
			</div>
			<div class="form-group mx-sm-3 mb-2">
				<label for="inputPassword2" class="sr-only">Password</label> <input
					type="email" class="form-control" id="inputPassword2"
					value="<%=subjectDTO.getWeekday()%>" disabled="disabled">
			</div>
		</form>
		<form class="form-inline" style="margin-top: 20px; margin-left: 20px">
			<div class="form-group mb-2">
				<label for="staticEmail2" class="sr-only"></label> <input
					type="text" readonly class="form-control-plaintext"
					id="staticEmail2" value="Giờ học">
			</div>
			<div class="form-group mx-sm-3 mb-2">
				<label for="inputPassword2" class="sr-only">Password</label> <input
					type="text" class="form-control" id="inputPassword2"
					value="<%=subjectDTO.getTime()%>" disabled="disabled">
			</div>
		</form>
		<form class="form-inline" style="margin-top: 20px; margin-left: 20px">
			<div class="form-group mb-2">
				<label for="staticEmail2" class="sr-only"></label> <input
					type="text" readonly class="form-control-plaintext"
					id="staticEmail2" value="Ghi chú">
			</div>
			<div class="form-group mx-sm-3 mb-2">
				<label for="inputPassword2" class="sr-only">Password</label> <input
					type="text" class="form-control" id="inputPassword2"
					value="<%=subjectDTO.getComment()%> " disabled="disabled">
			</div>
		</form>
		<form class="form-inline" style="margin-top: 20px; margin-left: 20px">
			<div class="form-group mb-2">
				<label for="staticEmail2" class="sr-only"></label> <input
					type="text" readonly class="form-control-plaintext"
					id="staticEmail2" value="Xem thông tin giáo viên">
			</div>
			<div class="form-group mx-sm-3 mb-2">
				<label for="inputPassword2" class="sr-only">Password</label> <a
					class="btn btn-primary"
					href="./infomation?accountID=<%=subjectDTO.getAccountID()%>">Xem
					thông tin</a>
			</div>
			
		</form>
		<%if(accountDTO.getRoleName().equals("HOC_SINH")){ %>
		<a
					class="btn btn-primary" style="margin-left: 230px;margin-top: 50px"
					href="./regist?subjectID=<%=subjectDTO.getSubjectID()%>">Đăng ký môn học</a>
		<%} %>
	</div>
					



	<%@include file="footer.jsp"%>

</body>

</html>