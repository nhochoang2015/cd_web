<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="hotel_booking.dto.HotelDTO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<!DOCTYPE html>
<html lang="en">
<head>
<link href="user_page/css/index.css" rel="stylesheet">
</head>

<body>
	<%@include file="header.jsp"%>
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
					<span class="px-2">Tìm kiếm</span>
				</p>

				<h1 class="mb-4">Danh sách khách sạn</h1>
				<nav class="navbar navbar-light bg-light">
					<button type="button" class="btn btn-primary float-right"
						data-toggle="modal" data-target=".bd-example-modal-lg">Hiển
						thị ví trí trên bản đồ</button>

					<div class="modal fade bd-example-modal-lg" tabindex="-1"
						role="dialog" aria-labelledby="myLargeModalLabel"
						aria-hidden="true">
						<div class="modal-dialog modal-lg">
							<div class="modal-content">
								<div class="modal-header">
									<button type="button" class="close" data-dismiss="modal"
										aria-label="Close">
										<span aria-hidden="true">&times;</span>
									</button>
								</div>
								<div class="modal-body">
									<iframe
										src="https://www.google.com/maps/d/u/0/edit?mid=1O0bAuF9j6C8hOsrQSaM3qDI81Rs11Xo&ll=10.380887391545683%2C107.1132738090149&z=16"
										width="640" height="480"></iframe>
								</div>

							</div>
						</div>
					</div>

				</nav>
			</div>

			<div class="row pb-3">

				<div class="col-lg-4 mb-4">
					<div class="card border-0 shadow-sm mb-2">
						<img class="card-img-top mb-2" src="img/blog-1.jpg" alt="">
						<div class="card-body bg-light text-center p-4">
							<form class="form-inline" action="./">

								<input class="form-control" type="search" name="locationName"
									id="findlocation" list="locationList"
									style="width: 500px; margin-right: 20px" placeholder="Search"
									aria-label="Search" required="required">
								<datalist id="locationList">
									<option id="valueLoction" value="">
								</datalist>
								<button class="btn btn-outline-success my-2 my-sm-0"
									type="submit">Search</button>
							</form>
						</div>
					</div>

				</div>
				<div class="card col-sm-8 float-right" style="width: 30rem;">

					<%
					List<HotelDTO> hotelDTOList = (ArrayList<HotelDTO>) request.getAttribute("hotelDTOList");
					if (hotelDTOList != null) {
						for (HotelDTO hotel : hotelDTOList) {
					%>
					<div class="row">
						<img src="<%=hotel.getPic()%>" alt="..."
							class="img-thumbnail col"
							style="max-width: 250px; max-height: 250px; margin-top: 10px; margin-left: 10px">
						<div class="col">
							<a style="font-size: 20px" href="#"><%=hotel.getHotelName()%></a>
							<h5 class="card-title"></h5>
							<p class="card-text"><%=hotel.getComment()%></p>
							<a href="./hotel?hotelID=<%=hotel.getHotelID()%>"
								class="btn btn-primary">Chi tiết khách sạn</a>
						</div>
					</div>
					<%
					}
					} else {
					%>
					<h5>Không tìm thấy kết quả</h5>
					<%
					}
					%>

				</div>
				<div class="col-md-12 mb-4">
					<nav aria-label="Page navigation">
						<ul class="pagination justify-content-center mb-0">
							<li class="page-item disabled"><a class="page-link" href="#"
								aria-label="Previous"> <span aria-hidden="true">&laquo;</span>
									<span class="sr-only">Previous</span>
							</a></li>
							<li class="page-item active"><a class="page-link" href="#">1</a></li>
							<li class="page-item"><a class="page-link" href="#">2</a></li>
							<li class="page-item"><a class="page-link" href="#">3</a></li>
							<li class="page-item"><a class="page-link" href="#"
								aria-label="Next"> <span aria-hidden="true">&raquo;</span> <span
									class="sr-only">Next</span>
							</a></li>
						</ul>
					</nav>
				</div>
			</div>
		</div>
	</div>











	<%@include file="footer.jsp"%>
</body>

</html>