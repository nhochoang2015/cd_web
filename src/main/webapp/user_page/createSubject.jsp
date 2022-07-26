<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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
			<li class="breadcrumb-item"><a href="./">Trang chủ</a></li>
			<li class="breadcrumb-item"><a href="./subject-management">Quản lý môn học</a></li>
			<li class="breadcrumb-item active" aria-current="page">Tạo môn</li>
		</ol>
	</nav>

	<ul class="nav nav-tabs" id="myTab" role="tablist">
		<li class="nav-item"><a class="nav-link active" id="home-tab"
			data-toggle="tab" href="#home" role="tab" aria-controls="home"
			aria-selected="true">Tạo môn</a></li>
	</ul>
	<div class="tab-pane fade show active" id="home" role="tabpanel"
		aria-labelledby="profile-tab">
		<form style="margin-top: 20px; margin-left: 20px" class="w-50 p-3" action="./create-newSubject" method="post">
			<div class="form-group mx-sm-3 mb-2">
				<label for="exampleInputEmail1">Nhập tên môn học: </label> <input
					type="text" class="form-control" id="exampleInputEmail1"
					aria-describedby="emailHelp" placeholder="Tên môn học" name= "subjectName">
			</div>
			<div class="form-group mx-sm-3 mb-2">
				<label for="exampleInputPassword1">Số lượng học sinh (Số lượng học sinh tối đa của môn học không được quá 80)</label> <input
					type="number" class="form-control" id="exampleInputPassword1" max="80" name="studentCount"
					placeholder="">
			</div>

			<div class="form-group mx-sm-3 mb-2">
				<label for="exampleInputPassword1">Nhập buổi học trong tuần (vd: Thứ 2 - Thứ 3)</label>
				<input type="text" class="form-control" id="exampleInputPassword1" name="weekday"
					placeholder="">
			</div>

			<div class="form-group mx-sm-3 mb-2">
				<label for="exampleInputPassword1">Nhập thời gian học (vd: 18h30p)</label>
				<input type="text" class="form-control" id="exampleInputPassword1" name ="time"
					placeholder="">
			</div>
			<div class="form-group mx-sm-3 mb-2">
				<label for="exampleInputPassword1">Giá (theo tháng)</label>
				<input type="number" class="form-control" id="exampleInputPassword1"
					placeholder="" name="price">
			</div>
			<div class="form-group mx-sm-3 mb-2">
				<label for="exampleInputPassword1">Nội dung ghi chú (vd: liên lạc,link lớp học, số tk ngân hàng,...)</label>
				<textarea class="form-control" rows="5" cols="5" name="comment"></textarea>
			</div>
			<button style="margin-top: 20px; margin-left: 20px" type="submit"
				class="btn btn-primary">Xác nhận</button>
		</form>

	</div>












	<%@include file="footer.jsp"%>
</body>

</html>