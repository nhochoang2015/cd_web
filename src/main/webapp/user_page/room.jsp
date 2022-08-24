<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
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
			<li class="breadcrumb-item active" aria-current="page">Phòng</li>
		</ol>
	</nav>
<% RoomDTO roomDTO =(RoomDTO) request.getAttribute("roomDTO"); %>
	<ul class="nav nav-tabs" id="myTab" role="tablist">
		<li class="nav-item"><a class="nav-link active" id="home-tab"
			data-toggle="tab" href="#home" role="tab" aria-controls="home"
			aria-selected="true"><%=roomDTO.getRoomName() %></a></li>
	</ul>

	<div class="tab-pane fade show active" id="home" role="tabpanel"
		aria-labelledby="profile-tab">

		<img src="user_page/img/HCM1.jpg" alt="..." class="img-thumbnail"
			style="max-height: 350; max-width: 800px;">
		<h3 style="margin-top: 20px; margin-left: 10px">Tiện ích - dịch
			vụ phòng:</h3>
		<p style="margin-top: 20px; margin-left: 10px"><%=roomDTO.getService() %></p>
		<h3 style="margin-top: 20px; margin-left: 10px">Giá phòng theo
			thứ:</h3>
		<table class="table">
			<thead class="thead-dark">
				<tr>
					<th scope="col">Thứ 2</th>
					<th scope="col">Thứ 3</th>
					<th scope="col">Thứ 4</th>
					<th scope="col">Thứ 5</th>
					<th scope="col">Thứ 6</th>
					<th scope="col">Thứ 7</th>
					<th scope="col">Chủ nhật</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td>500.000 vnđ</td>
					<td>500.000 vnđ</td>
					<td>500.000 vnđ</td>
					<td>500.000 vnđ</td>
					<td>500.000 vnđ</td>
					<td>500.000 vnđ</td>
					<td>500.000 vnđ</td>
				</tr>
			</tbody>
		</table>
		<h3 style="margin-top: 20px; margin-left: 10px">Đăng ký phòng:</h3>
		<form style="max-width: 700px;border-color: black solid 1px;margin: auto">
			<div class="form-group">
				<label for="exampleFormControlInput1">Nhập ngày đăng ký phòng</label> <input
					type="date" class="form-control" id="exampleFormControlInput1"
					placeholder="" required="required">
			</div>
			<div class="form-group">
				<label for="exampleFormControlSelect1">Chọn số ngày ở lại phòng từ ngày đăng ký</label> <select
					class="form-control" id="exampleFormControlSelect1" required="required">
					<option>1</option>
					<option>2</option>
					<option>3</option>
					<option>4</option>
					<option>5</option>
				</select>
			</div>
			<div class="form-group">
				<label for="exampleFormControlInput1">Tổng tiền phải trả</label> <input
					type="text" class="form-control" placeholder="Đơn vị: vnđ" disabled="disabled">
			</div>
			
			<button class="btn btn-primary">Đăng ký</button>
		</form>
	</div>












	<%@include file="footer.jsp"%>
</body>

</html>