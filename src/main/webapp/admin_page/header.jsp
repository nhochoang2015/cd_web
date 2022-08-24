<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@page import="hotel_booking.dto.AccountDTO"%>

<!DOCTYPE html>
<html>
<head>

<meta charset="utf-8">
<meta http-equiv="x-ua-compatible" content="ie=edge">
<meta name="description" content="">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- favicon -->
<link rel="shortcut icon" type="image/x-icon"
	href="../admin_page/img/IMG_BOOK/favicon.ico">
<!--  -->
<link href="https://fonts.googleapis.com/css?family=Play:400,700"
	rel="stylesheet">
<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="../admin_page/bootstrap-4.4.1/css/bootstrap.min.css">
<!-- owl.carousel CSS -->
<link rel="stylesheet" href="../admin_page/css/owl.carousel.css">
<link rel="stylesheet" href="../admin_page/css/owl.theme.css">
<link rel="stylesheet" href="../admin_page/css/owl.transitions.css">
<!-- animate CSS -->
<link rel="stylesheet" href="../admin_page/css/animate.css">
<!-- normalize CSS -->
<link rel="stylesheet" href="../admin_page/css/normalize.css">
<!-- meanmenu icon CSS -->
<link rel="stylesheet" href="../admin_page/css/meanmenu.min.css">
<!-- main CSS -->
<link rel="stylesheet" href="../admin_page/css/main.css">
<!-- morrisjs CSS -->
<link rel="stylesheet" href="../admin_page/css/morrisjs/morris.css">
<!-- mCustomScrollbar CSS -->
<link rel="stylesheet"
	href="../admin_page/css/scrollbar/jquery.mCustomScrollbar.min.css">
<!-- metisMenu CSS -->
<link rel="stylesheet"
	href="../admin_page/css/metisMenu/metisMenu.min.css">
<link rel="stylesheet"
	href="../admin_page/css/metisMenu/metisMenu-vertical.css">
<!-- calendar CSS -->
<link rel="stylesheet"
	href="../admin_page/css/calendar/fullcalendar.min.css">
<link rel="stylesheet"
	href="../admin_page/css/calendar/fullcalendar.print.min.css">
<!-- style CSS -->
<link rel="stylesheet" href="../admin_page/css/style.css">
<!-- responsive CSS -->
<link rel="stylesheet" href="../admin_page/css/responsive.css">
<!-- modernizr JS -->
<script src="../admin_page/js/vendor/modernizr-2.8.3.min.js"></script>
<!-- Jquery JS -->
<script src="../admin_page/js/jquery-3.6.0.min.js"
	type="text/javascript"></script>
<!-- Boot Strap JS -->
<script src="../admin_page/bootstrap-4.4.1/js/bootstrap.bundle.min.js"></script>
<!-- Font Aswome CSS -->
<link rel="stylesheet"
	href="../admin_page/lib/fontawesome/css/fontawesome.min.css">
<link rel="stylesheet"
	href="../admin_page/lib/fontawesome/css/regular.min.css">
<link rel="stylesheet" href="../admin_page/lib/fontawesome/css/all.css">
</head>
<body>
	<% AccountDTO account = (AccountDTO)session.getAttribute("account"); %>
	<div class="container-fluid">
		<div class="row">
			<div class="col-xl-12 col-lg-12 col-md-12 col-12">
				<div class="logo-pro">
					<a href="../admin_page/index.html"><img class="main-logo"
						src="../admin_page/img/logo/logo.png" alt=""></a>
				</div>
			</div>
		</div>
	</div>
	<div class="header-advance-area">
		<div class="header-top-area">
			<div class="container-fluid">
				<div class="row">
					<div class="col-xl-12 col-lg-12 col-md-12 col-12">
						<div class="header-top-wraper">
							<div class="row">
								<div class="col-xl-1 col-lg-0 col-md-1 col-12">
									<div class="menu-switcher-pro">
										<button type="button" id="sidebarCollapse"
											class="btn bar-button-pro header-drl-controller-btn btn-info nav-item">
											<i class="fa fa-bars"></i>
										</button>
									</div>
								</div>
								<div class="col-6">
									<div class="header-top-menu tabl-d-n">
										<ul class="nav navbar-nav mai-top-nav d-flex flex-row">
											<li class="nav-item"><a href="../admin_page/#"
												class="nav-link">Trang ch&#x1EE7;</a></li>
											<li class="nav-item"><a href="../admin_page/#"
												class="nav-link">Th&#xF4;ng tin</a></li>
											<li class="nav-item"><a href="../admin_page/#"
												class="nav-link">D&#x1ECB;ch v&#x1EE5;</a></li>
											<li class="nav-item"><a href="../admin_page/#"
												class="nav-link">H&#x1ED7; tr&#x1EE3;</a></li>
										</ul>
									</div>
								</div>
								<!-- //////////////////-->
								<div class="col-5">
									<div class="header-right-info">
										<ul
											class="nav navbar-nav mai-top-nav header-right-menu d-flex flex-row">
											<li class="nav-item dropdown"><a href="../admin_page/#"
												data-toggle="dropdown" role="button" aria-expanded="false"
												class="nav-link dropdown-toggle"><i
													class="fa-solid fa-envelope adminpro-chat-pro"
													aria-hidden="true"></i><span class="indicator-ms"></span></a>
												<div role="menu"
													class="author-message-top dropdown-menu animated zoomIn">
													<div class="message-single-top">
														<h1>Tin nh&#x1EAF;n</h1>
													</div>
													<ul class="message-menu">
														<li><a href="../admin_page/#">

																<div class="message-img">

																	<img src="../admin_page/img/contact/1.jpg" alt="">

																</div>

																<div class="message-content">

																	<span class="message-date">16 Sept</span> <br>

																	<p>S&#xE1;ch hay v&#xE0; h&#x1EA5;p d&#x1EAB;n.</p>





																</div>

																<div>

																	<h5>TTY</h5>

																</div>

														</a></li>
													</ul>
													<div class="message-view">
														<a href="../admin_page/#">Nhi&#x1EC1;u h&#x1A1;n</a>
													</div>
												</div></li>
											<li class="nav-item"><a href="../admin_page/#"
												data-toggle="dropdown" role="button" aria-expanded="false"
												class="nav-link dropdown-toggle"><i
													class="fa-solid fa-bell" aria-hidden="true"></i><span
													class="indicator-nt"></span></a>
												<div role="menu"
													class="notification-author dropdown-menu animated zoomIn">
													<div class="notification-single-top">
														<h1>Th&#xF4;ng b&#xE1;o</h1>
													</div>
													<ul class="notification-menu">
														<li><a href="../admin_page/#">

																<div class="notification-icon">

																	<i
																		class="fa fa-check adminpro-checked-pro admin-check-pro"
																		aria-hidden="true"></i>

																</div>

																<div class="notification-content">

																	<span class="notification-date">16 Sept</span>

																	<h2>Advanda Cro</h2>

																	<p>Hi , aaaaaaaaaa.</p>

																</div>

														</a></li>
													</ul>
													<div class="notification-view">
														<a href="../admin_page/#">Nhi&#x1EC1;u h&#x1A1;n</a>
													</div>
												</div></li>
											<li class="nav-item"><a href="../admin_page/#"
												data-toggle="dropdown" role="button" aria-expanded="false"
												class="nav-link dropdown-toggle"> <i
													class="fa fa-user adminpro-user-rounded header-riht-inf"
													aria-hidden="true"></i> <span class="admin-name"><%=account.getNickName() %></span>



													<i
													class="fa fa-angle-down adminpro-icon adminpro-down-arrow"></i>

											</a>
												<ul role="menu"
													class="dropdown-header-top author-log dropdown-menu animated zoomIn">
													<li class="dropdown-item"><a href="../admin_page/#"><span
															class="fa fa-user author-log-ic"></span>Thông Tin Tài Khoản</a></li>
													<li class="dropdown-item"><a href="../admin_page/#"><span
															class="fa fa-cog author-log-ic"></span>Cài Đặt</a></li>
													<li class="dropdown-item"><a
														href="../logout"><span
															class="fa fa-lock author-log-ic"></span>Đăng Xuất</a></li>
												</ul></li>
										</ul>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
		<!-- Mobile Menu start -->
		<div class="mobile-menu-area">
			<div class="container">
				<div class="row">
					<div class="col-xl-12 col-lg-12 col-md-12 col-12">
						<div class="mobile-menu">
							<nav id="dropdown">
								<ul class="mobile-menu-nav">
									<li><a data-toggle="collapse" data-target="#Charts"
										href="../admin_page/#">Trang ch&#x1EE7;<span
											class="admin-project-icon adminpro-icon adminpro-down-arrow"></span></a>
									</li>
									<li><a href="../admin_page/index-3.html">Dashboard</a></li>
									<li><a href="../admin_page/product-list.html">Danh

											s&#xE1;ch s&#x1EA3;n ph&#x1EA9;m</a></li>
									<li><a href="../admin_page/product-edit.html">Thay
											&#x111;&#x1ED5;i s&#x1EA3;n ph&#x1EA9;m</a></li>
									<li><a href="../admin_page/ADM-User.html">Qu&#x1EA3;n
											l&#xFD; User</a></li>
									<li><a href="../admin_page/product-cart.html">Gi&#x1ECF;
											h&#xE0;ng</a></li>
									<li><a href="../admin_page/product-payment.html">Thanh

											to&#xE1;n</a></li>
									<li><a href="../admin_page/analytics.html">Ph&#xE2;n
											t&#xED;ch</a></li>
								</ul>
								<li><a data-toggle="collapse"
									data-target="#Miscellaneousmob" href="../admin_page/#">Giao

										di&#x1EC7;n <span
										class="admin-project-icon adminpro-icon adminpro-down-arrow"></span>

								</a>
									<ul id="Miscellaneousmob" class="collapse dropdown-header-top">
										<li><a href="../admin_page/google-map.html">B&#x1EA3;n
												&#x111;&#x1ED3; google</a></li>
										<li><a href="../admin_page/images-cropper.html">H&#xEC;nh

												&#x1EA3;nh</a></li>
									</ul></li>
								<li><a data-toggle="collapse" data-target="#Chartsmob"
									href="../admin_page/#">Bi&#x1EC3;u &#x111;&#x1ED3; <span
										class="admin-project-icon adminpro-icon adminpro-down-arrow"></span></a>
									<ul id="Chartsmob" class="collapse dropdown-header-top">
										<li><a href="../admin_page/bar-charts.html">Bi&#x1EC3;u
												&#x111;&#x1ED3; thanh</a></li>
										<li><a href="../admin_page/line-charts.html">Bi&#x1EC3;u
												&#x111;&#x1ED3; &#x111;&#x1B0;&#x1EDD;ng</a></li>
										<li><a href="../admin_page/rounded-chart.html">Bi&#x1EC3;u

												&#x111;&#x1ED3; tr&#xF2;n</a></li>
									</ul></li>
								<li><a data-toggle="collapse" data-target="#Tablesmob"
									href="../admin_page/#">B&#x1EA3;ng d&#x1EEF; li&#x1EC7;u <span
										class="admin-project-icon adminpro-icon adminpro-down-arrow"></span></a>
									<ul id="Tablesmob" class="collapse dropdown-header-top">
										<li><a href="../admin_page/data-table.html">D&#x1EEF;
												li&#x1EC7;u</a></li>
									</ul></li>
								<li><a data-toggle="collapse" data-target="#Pagemob"
									href="../admin_page/#">Trang <span
										class="admin-project-icon adminpro-icon adminpro-down-arrow"></span></a>
									<ul id="Pagemob" class="collapse dropdown-header-top">
										<li><a href="../admin_page/login.html">&#x110;&#x103;ng
												nh&#x1EAD;p</a></li>
										<li><a href="../admin_page/register.html">&#x110;&#x103;ng
												k&#xFD;</a></li>
										<li><a href="../admin_page/password-recovery.html">Kh&#xF4;i

												ph&#x1EE5;c m&#x1EAD;t kh&#x1EA9;u</a></li>
									</ul></li>
							</nav>
						</div>
					</div>
				</div>
			</div>
		</div>
		<!-- Mobile Menu end -->
		<div class="breadcome-area">
			<div class="container-fluid">
				<div class="row">
					<div class="col-xl-12 col-lg-12 col-md-12 col-12">
						<div class="breadcome-list single-page-breadcome">
							<div class="row">
								<!-- <div class="col-xl-6 col-lg-6 col-md-6 col-6">

									<div class="breadcome-heading">

										<form role="search" class="">

											<input type="text" placeholder="Search..."

												class="form-control"> <a href="../admin_page/"><i

												class="fa fa-search"></i></a>

										</form>

									</div>

								</div>-->
								<!-- <div class="col-xl-6 col-lg-6 col-md-6 col-6">

									<ul class="breadcome-menu">

										<li><a href="../admin_page/#">Ten Trang</a> <span class="bread-slash">/</span>

											<!--                                            <li><a href="../admin_page/#">Home</a> <span class="bread-slash">/</span>

										</li>

										<li><span class="bread-blod">Phan</span> <!--                                            <li><span class="bread-blod">Analytics</span>



										</li>

									</ul>

								</div> -->
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>