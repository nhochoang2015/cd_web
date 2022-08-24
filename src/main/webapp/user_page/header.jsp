<%@page import="java.util.List"%>
<%@page import="hotel_booking.dto.NotificationDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="hotel_booking.dto.AccountDTO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="hotel_booking.dto.HotelDTO"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Hotel - Booking</title>
<meta content="width=device-width, initial-scale=1.0" name="viewport">
<meta content="Free HTML Templates" name="keywords">
<meta content="Free HTML Templates" name="description">

<!-- Favicon -->
<link href="user_page/img/favicon.ico" rel="icon">

<!-- BootStrap 4.4.1 -->
<link href="user_page/bootstrap-4.4.1/css/bootstrap.min.css"
	rel="stylesheet">

<!-- Google Web Fonts -->
<link rel="preconnect" href="user_page/https://fonts.gstatic.com">
<link href="user_page/css/css2.css" rel="stylesheet">

<!-- Font Awesome -->
<link rel="stylesheet"
	href="user_page/fonts/fontawesome/css/fontawesome.min.css">
<link rel="stylesheet"
	href="user_page/fonts/fontawesome/css/all.min.css">

<!-- Flaticon Font -->
<link href="user_page/lib/flaticon/font/flaticon.css" rel="stylesheet">

<!-- Libraries Stylesheet -->
<link href="user_page/lib/owlcarousel/assets/owl.carousel.min.css"
	rel="stylesheet">
<link href="user_page/lib/lightbox/css/lightbox.min.css"
	rel="stylesheet">
<link rel="stylesheet" type="text/css"
	href="user_page/lib/slick/slick.css" />

<!-- Customized Bootstrap Stylesheet -->
<link href="user_page/css/style.css" rel="stylesheet">
<link href="user_page/fonts/chalk/stylesheet.css" rel="stylesheet">
<link href="user_page/css/header.css" rel="stylesheet">

</head>
<body>

	<!-- Navbar Start -->
	<div class="container-fluid bg-light position-relative shadow">
		<nav
			class="navbar navbar-expand-lg bg-light navbar-light py-3 py-lg-0 px-0 px-lg-5">
			<div>
				<a href="./" class="navbar-brand font-weight-bold text-secondary"
					style="font-size: 50px;"> <i class="fa-solid fa-book-open"></i>
					<span class="text-primary">Booking-Hotels</span>
				</a>
			</div>
			<button type="button" class="navbar-toggler" data-toggle="collapse"
				data-target="#navbarCollapse">
				<span class="navbar-toggler-icon"></span>
			</button>

			<div class="collapse navbar-collapse justify-content-between"
				id="navbarCollapse">
				<div class="navbar-nav font-weight-bold mx-auto py-0">
					<a href="./" class="nav-item nav-link active">Home</a> <a href="./"
						class="nav-item nav-link">Trang chủ</a>
					<%
					AccountDTO accountDTO = (AccountDTO) session.getAttribute("account");

					if (accountDTO != null) {
					%>
					<!-- Trường họp người dùng đã đăng nhập -->
					<a class="nav-item nav-link" href="./q&a">Q&A</a>
					
						
						
					<%
					if (accountDTO.getRoleName().equals("ADMIN")) {
					%>

					<a href="./admin/account-Management" class="nav-item nav-link">Amin
						Page</a>
					<div id="logout-container">
						<div class="dropdown">
							<button class="btn btn-secondary dropdown-toggle" type="button"
								id="dropdownMenuButton" data-toggle="dropdown"
								style="margin: auto; margin-left: 10px" aria-haspopup="true"
								aria-expanded="false">
								<i class="fa-solid fa-user"></i>
								<%=accountDTO.getNickName()%>
							</button>
							<div class="dropdown-menu" aria-labelledby="dropdownMenuButton">
								<a class="dropdown-item"
									href="./account?accountID=<%=accountDTO.getAccountID()%>">Tài
									khoản</a>
								<div class="dropdown-divider"></div>
								<a class="dropdown-item" href="./logout">Logout</a>

							</div>
						</div>
					</div>
					<%
					}
					if (accountDTO.getRoleName().equals("USER")) {
					%>
					<div id="logout-container">
						<div class="dropdown">
							<button class="btn btn-secondary dropdown-toggle" type="button"
								id="dropdownMenuButton" data-toggle="dropdown"
								style="margin: auto; margin-left: 10px" aria-haspopup="true"
								aria-expanded="false">
								<i class="fa-solid fa-user"></i>
								<%=accountDTO.getNickName()%>
							</button>
							<div class="dropdown-menu" aria-labelledby="dropdownMenuButton">
								<a class="dropdown-item"
									href="./account?accountID=<%=accountDTO.getAccountID()%>">Tài
									khoản</a> 
								<div class="dropdown-divider"></div>
								<a class="dropdown-item" href="./logout">Logout</a>
							</div>
						</div>
						
					</div>
					
					<%
					}
					%>
					<div class="dropdown">
							<button class="btn btn-secondary dropdown-toggle" type="button"
								id="dropdownMenuButton" data-toggle="dropdown"
								style="margin: auto; margin-left: 10px;margin-top: 25px" aria-haspopup="true" 
								aria-expanded="false">
								<i class="fa-solid fa-bell"></i>
							</button>
							<div class="dropdown-menu" aria-labelledby="dropdownMenuButton">
								<a class="dropdown-item"> thông báo 1
								</a>
							</div>
						</div>
					<%
					} else {
					%>
					<div id="login-container" style="margin-left: 10px">
						<a href="./login" class="btn btn-primary px-4" id="login-button">Đăng
							nhập</a> <a href="./signup" class="btn btn-primary px-4"
							id="sign-in-button">Đăng ký</a>
					</div>

					<%
					}
					%>
				</div>
			</div>
		</nav>
	</div>



</body>
</html>