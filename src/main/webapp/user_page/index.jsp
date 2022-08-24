<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="hotel_booking.dto.LocationDTO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<!DOCTYPE html>
<html lang="en">
<head>
<link href="user_page/css/index.css" rel="stylesheet">
</head>

<body>
	<%@include file="header.jsp"%>
	<%@include file="banner.jsp"%>
	<!-- Banner Start -->

	<!-- Banner End -->
	<nav aria-label="breadcrumb">
		<ol class="breadcrumb" style="text-align: center">
			<li class="breadcrumb-item active" aria-current="page">Home</li>
		</ol>
	</nav>
	<div class="container-fluid pt-5" id="blog">
		<div class="container">
			<div class="text-center pb-2">
				<p class="section-title px-5">
					<span class="px-2">Trang chủ</span>
				</p>

				<h1 class="mb-4">Tìm kiếm khách sạn bạn cần tìm</h1>
				<%
				List<LocationDTO> locationDTOList = (ArrayList<LocationDTO>) request.getAttribute("locationDTOList");
				%>
				<nav class="navbar navbar-light bg-light">
					<span>Nhập tên địa điểm bạn muốn đến:</span>
					<form class="form-inline" action="./">

						<input class="form-control" type="search" name="locationName"
							id="findlocation" list="locationList" 
							style="width: 500px; margin-right: 20px" placeholder="Search"
							aria-label="Search" required="required">
						<datalist id="locationList">
							<option id= "valueLoction" value="">
						</datalist>
						<button class="btn btn-outline-success my-2 my-sm-0"
									type="submit">Search</button></form>
							
				</nav>
			</div>

			<h1 class="mb-4">Khám phá</h1>
			<nav class="navbar navbar-light bg-light">
				<%
				if (locationDTOList != null) {
					for (LocationDTO location : locationDTOList) {
				%> 
				
				<div id="" class="card " style="width: 18rem; margin-bottom: 20px">
					<img class="card-img-top" src="<%=location.getPic()%>"
						alt="Card image cap" style="max-height: 180; max-width: 286">
					<div class="card-body">
						<h5 class="card-title">
							<%=location.getLocationName()%></h5>
						<a href="./search?locationID=<%=location.getLocationID()%>"
							class="btn btn-primary">Xem thêm</a>
					</div>
				</div>


				<%
				}
				}
				%>
			</nav>
			<h1 class="mb-4">Khách sạn có đánh giá tốt</h1>
			<nav class="navbar navbar-light bg-light">
				<div class="card " style="width: 18rem; margin-bottom: 20px">
					<img class="card-img-top" src="user_page/img/header.png"
						alt="Card image cap" style="max-height: 180; max-width: 286">
					<div class="card-body">
						<h5 class="card-title">Vũng tàu</h5>
						<a href="#" class="btn btn-primary">Xem thêm</a>
					</div>
				</div>
				<div class="card" style="width: 18rem; margin-bottom: 20px">
					<img class="card-img-top" src="user_page/img/header.png"
						alt="Card image cap" style="max-height: 286; max-width: 180">
					<div class="card-body">
						<h5 class="card-title">Vũng tàu</h5>
						<a href="#" class="btn btn-primary">Xem thêm</a>
					</div>
				</div>
				<div class="card " style="width: 18rem; margin-bottom: 20px">
					<img class="card-img-top" src="user_page/img/header.png"
						alt="Card image cap" style="max-height: 286; max-width: 180">
					<div class="card-body">
						<h5 class="card-title">Vũng tàu</h5>
						<a href="#" class="btn btn-primary">Xem thêm</a>
					</div>
				</div>
				<div class="card " style="width: 18rem; margin-bottom: 20px">
					<img class="card-img-top" src="user_page/img/header.png"
						alt="Card image cap" style="max-height: 286; max-width: 180">
					<div class="card-body">
						<h5 class="card-title">Vũng tàu</h5>
						<a href="#" class="btn btn-primary">Xem thêm</a>
					</div>
				</div>
				<div class="card " style="width: 18rem; margin-bottom: 20px">
					<img class="card-img-top" src="user_page/img/header.png"
						alt="Card image cap" style="max-height: 286; max-width: 180">
					<div class="card-body">
						<h5 class="card-title">Vũng tàu</h5>
						<a href="#" class="btn btn-primary">Xem thêm</a>
					</div>
				</div>
				<div class="card " style="width: 18rem; margin-bottom: 20px">
					<img class="card-img-top" src="user_page/img/header.png"
						alt="Card image cap" style="max-height: 286; max-width: 180">
					<div class="card-body">
						<h5 class="card-title">Vũng tàu</h5>
						<a href="#" class="btn btn-primary">Xem thêm</a>
					</div>
				</div>
			</nav>



		</div>
	</div>











	<%@include file="footer.jsp"%>
</body>

</html>