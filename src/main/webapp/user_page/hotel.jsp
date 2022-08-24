<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="hotel_booking.dto.HotelDTO"%>
<%@page import="hotel_booking.dto.RoomDTO"%>
<!DOCTYPE html>
<html lang="en">
<head>
<link href="user_page/css/index.css" rel="stylesheet">
<style type="text/css">
.lab {
	margin-left: 20px;
	margin-top: 20px
}
</style>
</head>

<body>
	<%@include file="header.jsp"%>

	<!-- Banner Start -->

	<!-- Banner End -->
	<nav aria-label="breadcrumb">
		<ol class="breadcrumb" style="text-align: center">
			<li class="breadcrumb-item"><a href="./">Trang chủ</a></li>
			<li class="breadcrumb-item active" aria-current="page">Khách sạn</li>
		</ol>
	</nav>

	<ul class="nav nav-tabs" id="myTab" role="tablist">
		<li class="nav-item"><a class="nav-link active" id="home-tab"
			data-toggle="tab" href="#home" role="tab" aria-controls="home"
			aria-selected="true">Tên Khách sạn</a></li>
	</ul>
	<%
	HotelDTO hotel = (HotelDTO) request.getAttribute("hotelDTO");
	%>
	<div class="tab-pane fade show active" id="home" role="tabpanel"
		aria-labelledby="profile-tab">
		<nav class="navbar navbar-light bg-light">
			<button type="button" class="btn btn-primary float-right"
				data-toggle="modal" data-target=".bd-example-modal-lg">Hiển
				thị ví trí khách sạn trên bản đồ</button>

			<div class="modal fade bd-example-modal-lg" tabindex="-1"
				role="dialog" aria-labelledby="myLargeModalLabel" aria-hidden="true">
				<div class="modal-dialog modal-lg">
					<div class="modal-content">
						<div class="modal-header">
							<button type="button" class="close" data-dismiss="modal"
								aria-label="Close">
								<span aria-hidden="true">&times;</span>
							</button>
						</div>
						<div class="modal-body">
							<iframe src="<%=hotel.getPosition()%>" width="640" height="480"></iframe>
						</div>

					</div>
				</div>
			</div>

		</nav>
		<img src="<%=hotel.getPic()%>" alt="..." class="img-thumbnail"
			style="max-height: 350; max-width: 800px;">
		<h3 style="margin-top: 20px; margin-left: 10px">Tiện ích - dịch
			vụ:</h3>
		<p><%=hotel.getComment()%></p>
		<h3 style="margin-top: 20px; margin-left: 10px">Các phòng còn
			trống:</h3>
		<%
		List<RoomDTO> roomDTOList = (ArrayList<RoomDTO>) request.getAttribute("roomDTOList");
		%>
		<table class="table">
			<thead class="thead-dark">
				<tr>
					<th scope="col">Tên Phòng</th>
					<th scope="col">Số người có thể ở</th>
					<th scope="col">Tình trạng</th>
					<th scope="col">Xem chi tiết</th>
				</tr>
			</thead>
		<%
		if(roomDTOList!=null){
		for (RoomDTO room : roomDTOList) {
			
		%>
		

			<tbody>
				<tr>
					<th scope="row"><%=room.getRoomName()%></th>
					<td><%=room.getPerson()%></td>
					<td><%=room.isActive() %></td>
					<td><a class="btn btn-primary" href="./room?roomID=<%=room.getRoomID()%>">Xem chi tiết phòng</a></td>
				</tr>

			</tbody>
		

		


		<%
		}
		%>
		</table>
		<%
		}else {
			%>
		<h3 style="margin-top: 20px; margin-left: 10px">Hiện tại chưa có
			phòng</h3>
		<%
		}
		%>



	</div>












	<%@include file="footer.jsp"%>
</body>

</html>