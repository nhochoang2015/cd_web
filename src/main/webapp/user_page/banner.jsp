<%@page import="java.util.ArrayList"%>
<%@page import="hotel_booking.dto.NotificationDTO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
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

<style>
</style>
</head>
<body>

	<!-- Banner Start-->
	<div class="container-fluid bg-primary px-0 px-md-5 mb-5 notification">
		<div class="row align-items-center px-3">
			<h4 class="text-white mb-4 mt-5 mt-lg-0">Website đặt phòng khách
				sạn</h4>
			<h1 class="display-3 font-weight-bold text-white">Đặt phòng dễ
				dàng</h1>
			<div id="carouselExampleIndicators" class="carousel slide"
				data-ride="carousel">

				<ol class="carousel-indicators">

					<li data-target="#carouselExampleIndicators" data-slide-to="0"
						class="active"></li>
					<li data-target="#carouselExampleIndicators" data-slide-to="1"></li>
					<li data-target="#carouselExampleIndicators" data-slide-to="2"></li>
				</ol>
				<div class="carousel-inner">
					<div class="carousel-item active">
						<img class="d-block w-100" src="user_page/img/VungTau1.jpg"
							alt="First slide">
					</div>
					<div class="carousel-item">
						<img class="d-block w-100" src="user_page/img/DangNang1.jpg"
							alt="Second slide">
					</div>
					<div class="carousel-item">
						<img class="d-block w-100" src="user_page/img/HaNoi1.jpg"
							alt="Third slide">
					</div>
				</div>
				<a class="carousel-control-prev" href="#carouselExampleIndicators"
					role="button" data-slide="prev"> <span
					class="carousel-control-prev-icon" aria-hidden="true"></span> <span
					class="sr-only">Previous</span>
				</a> <a class="carousel-control-next" href="#carouselExampleIndicators"
					role="button" data-slide="next"> <span
					class="carousel-control-next-icon" aria-hidden="true"></span> <span
					class="sr-only">Next</span>
				</a>
			</div>
		</div>
		<!-- <div class="row align-items-center px-3">
			<div class="col-lg-6 text-center text-lg-left notification-content">
				<h4 class="text-white mb-4 mt-5 mt-lg-0">Website đặt phòng
					khách sạn</h4>
				<h1 class="display-3 font-weight-bold text-white">Đặt phòng dễ
					dàng</h1>
				<p class="text-white mb-4"></p>

				<a href="#blog" class="btn btn-secondary mt-1 py-3 px-5">Learn
					More</a>

			</div>

			<div class="col-lg-6 text-center text-lg-right notification-image">
				<img class="img-fluid mt-5" src="user_page/img/header.png" alt="">
			</div>
		</div>


		<div class="row align-items-center px-3">
			<div class="col-lg-6 text-center text-lg-left notification-content">
				<h4 class="text-white mb-4 mt-5 mt-lg-0">Kids Learning Center</h4>
				<h1 class="display-3 font-weight-bold text-white">New Approach
					to Kids Education</h1>
				<p class="text-white mb-4">Sea ipsum kasd eirmod kasd magna, est
					sea et diam ipsum est amet sed sit. Ipsum dolor no justo dolor et,
					lorem ut dolor erat dolore sed ipsum at ipsum nonumy amet. Clita
					lorem dolore sed stet et est justo dolore.</p>
				<a href="#blog" class="btn btn-secondary mt-1 py-3 px-5">Learn
					More</a>
			</div>
			<div class="col-lg-6 text-center text-lg-right notification-image">
				<img class="img-fluid mt-5" src="user_page/img/header.png" alt="">
			</div>
		</div> -->

	</div>
</body>
</html>