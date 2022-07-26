<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="hotel_booking.dto.SubjectDTO"%>
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
			<li class="breadcrumb-item active" aria-current="page">Quản lý
				môn học</li>
		</ol>
	</nav>

	<ul class="nav nav-tabs" id="myTab" role="tablist">
		<li class="nav-item"><a class="nav-link active" id="home-tab"
			data-toggle="tab" href="#home" role="tab" aria-controls="home"
			aria-selected="true">Quản lý môn</a></li>
	</ul>
	<div class="tab-pane fade show active" id="home" role="tabpanel"
		aria-labelledby="profile-tab">
		<a class="btn btn-primary lab" href="./create-subject">Tạo môn</a>
		<h3 class="lab">Danh sách môn học</h3>

		<table class="table table-bordered">
			<thead class="thead-dark">
				<tr>

					<th scope="col">Tên môn</th>
					<th scope="col">Active</th>
					<th scope="col">Giá(Theo tháng)</th>
					<th scope="col">Số học sinh</th>
					<th scope="col">Giờ</th>
					<th scope="col">Ngày học</th>
					<th scope="col">Nội dung ghi chú</th>
					<th scope="col">Public/Private</th>
					<th scope="col">Danh sách học sinh</th>
				</tr>
			</thead>
			<%
			List<SubjectDTO> subjectList = (ArrayList<SubjectDTO>) request.getAttribute("subjectList");
			if (subjectList != null) {
				for (SubjectDTO subject : subjectList) {
			%>
			<tbody>
				<tr>

					<td scope="row"><%=subject.getSubjectName()%>
						<button type="button" class="btn btn-primary" data-toggle="modal"
							data-target="#updateSubjectName" title="Sửa tên môn">
							<i class="fa-solid fa-pen-to-square"></i>
						</button></td>
					<!-- Modal -->
					<form action="./renameSubject?subjectID=<%=subject.getSubjectID()%>" method="get">
						<div class="modal fade in" id="updateSubjectName" tabindex="-1"
							role="dialog" aria-labelledby="exampleModalLabel"
							aria-hidden="true">
							<div class="modal-dialog" role="document">
								<div class="modal-content">
									<div class="modal-header">
										<h5 class="modal-title" id="exampleModalLabel">Sửa môn</h5>
									</div>
									<div class="modal-body">

										<div class="mb-3">
											<label for="validationCustom01" class="form-label">Tên
												môn</label> <input type="text" name="subjectName"
												class="form-control" id="validationCustom01"
												value="<%=subject.getSubjectName()%>" required>
										</div>
									</div>
									<div class="modal-footer">
										<button type="submit" class="btn btn-primary"
											onclick="location.href='./createSubject?subjectName='">Xác
											nhận</button>
										<button type="button" class="btn btn-default"
											data-dismiss="modal">Close</button>
									</div>
								</div>
							</div>
						</div>
					</form>
					<td><%=subject.isActive()%></td>
					<td><%=subject.getPrice()%> vnđ/ Tháng
						<button type="button" class="btn btn-primary" data-toggle="modal"
							data-target="#updatePrice" title="Sủa giá tiền">
							<i class="fa-solid fa-pen-to-square"></i>
						</button></td>
					</td>
					<form action="./createSubject" method="get">
						<div class="modal fade in" id="updatePrice" tabindex="-1"
							role="dialog" aria-labelledby="exampleModalLabel"
							aria-hidden="true">
							<div class="modal-dialog" role="document">
								<div class="modal-content">
									<div class="modal-header">
										<h5 class="modal-title" id="exampleModalLabel">Sửa giá</h5>
									</div>
									<div class="modal-body">

										<div class="mb-3">
											<label for="validationCustom01" class="form-label">Nhập
												vào: </label> <input type="text" name="price"
												class="form-control" id="validationCustom01"
												value="<%=subject.getPrice()%>" required>
										</div>
									</div>
									<div class="modal-footer">
										<button type="submit" class="btn btn-primary"
											onclick="location.href='./createSubject?subjectName='">Xác
											nhận</button>
										<button type="button" class="btn btn-default"
											data-dismiss="modal">Close</button>
									</div>
								</div>
							</div>
						</div>
					</form>
					<td><%=subject.getStudentCount()%>
						<button type="button" class="btn btn-primary" data-toggle="modal"
							data-target="#updateStudentCount" title="Sửa số lượng học sinh">
							<i class="fa-solid fa-pen-to-square"></i>
						</button></td>
					</td>
					<form action="./updateStudentCount" method="get">
						<div class="modal fade in" id="updateStudentCount" tabindex="-1"
							role="dialog" aria-labelledby="exampleModalLabel"
							aria-hidden="true">
							<div class="modal-dialog" role="document">
								<div class="modal-content">
									<div class="modal-header">
										<h5 class="modal-title" id="exampleModalLabel">Sửa số
											lượng học sinh</h5>
									</div>
									<div class="modal-body">

										<div class="mb-3">
											<label for="validationCustom01" class="form-label">Nhập
												vào: </label> <input type="text" name="studentCount"
												class="form-control" id="validationCustom01"
												value="<%=subject.getStudentCount()%>" required>
										</div>
									</div>
									<div class="modal-footer">
										<button type="submit" class="btn btn-primary"
											onclick="location.href='./createSubject?subjectName='">Xác
											nhận</button>
										<button type="button" class="btn btn-default"
											data-dismiss="modal">Close</button>
									</div>
								</div>
							</div>
						</div>
					</form>
					<td><%=subject.getTime()%>
						<button type="button" class="btn btn-primary" data-toggle="modal"
							data-target="#updateTime" title="Sửa thời gian">
							<i class="fa-solid fa-pen-to-square"></i>
						</button></td>
					</td>
					<form action="./updateTime" method="get">
						<div class="modal fade in" id="updateTime" tabindex="-1"
							role="dialog" aria-labelledby="exampleModalLabel"
							aria-hidden="true">
							<div class="modal-dialog" role="document">
								<div class="modal-content">
									<div class="modal-header">
										<h5 class="modal-title" id="exampleModalLabel">Sửa thời
											gian học</h5>
									</div>
									<div class="modal-body">

										<div class="mb-3">
											<label for="validationCustom01" class="form-label">Nhập
												vào</label> <input type="text" name="time"
												class="form-control" id="validationCustom01"
												value="<%=subject.getTime()%>" required>
										</div>
									</div>
									<div class="modal-footer">
										<button type="submit" class="btn btn-primary"
											onclick="location.href='./createSubject?subjectName='">Xác
											nhận</button>
										<button type="button" class="btn btn-default"
											data-dismiss="modal">Close</button>
									</div>
								</div>
							</div>
						</div>
					</form>
					<td><%=subject.getWeekday()%>
						<button type="button" class="btn btn-primary" data-toggle="modal"
							data-target="#updateWeekday" title="Sủa thứ">
							<i class="fa-solid fa-pen-to-square"></i>
						</button></td>
					</td>
					<form action="./updateWeekday" method="post">
						<div class="modal fade in" id="updateWeekday" tabindex="-1"
							role="dialog" aria-labelledby="exampleModalLabel"
							aria-hidden="true">
							<div class="modal-dialog" role="document">
								<div class="modal-content">
									<div class="modal-header">
										<h5 class="modal-title" id="exampleModalLabel">Sửa ngày
											học</h5>
									</div>
									<div class="modal-body">

										<div class="mb-3">
											<label for="validationCustom01" class="form-label">Nhập
												vào</label> <input type="text" name="weekday"
												class="form-control" id="validationCustom01"
												value="<%=subject.getWeekday()%>" required>
										</div>
									</div>
									<div class="modal-footer">
										<button type="submit" class="btn btn-primary"
											onclick="location.href='./createSubject?subjectName='">Xác
											nhận</button>
										<button type="button" class="btn btn-default"
											data-dismiss="modal">Close</button>
									</div>
								</div>
							</div>
						</div>
					</form>
					<th><%=subject.getComment()%>
						<button type="button" class="btn btn-primary" data-toggle="modal"
							data-target="#updateComment" title="Sủa nội dung ghi chú">
							<i class="fa-solid fa-pen-to-square"></i>
						</button>
					</td>
					</th>
					<form action="./updateComment" method="post">
						<div class="modal fade in" id="updateComment" tabindex="-1"
							role="dialog" aria-labelledby="exampleModalLabel"
							aria-hidden="true">
							<div class="modal-dialog" role="document">
								<div class="modal-content">
									<div class="modal-header">
										<h5 class="modal-title" id="exampleModalLabel">Sửa nội
											dung ghi chú</h5>
									</div>
									<div class="modal-body">

										<div class="mb-3">
											<label for="validationCustom01" class="form-label">Nhập
												vào</label>
											<textarea type="text" name="comment" class="form-control"
												rows="" cols="" id="validationCustom01"
												 required="required"><%=subject.getComment()%></textarea>
										</div>
									</div>
									<div class="modal-footer">
										<button type="submit" class="btn btn-primary"
											onclick="location.href='./createSubject?subjectName='">Xác
											nhận</button>
										<button type="button" class="btn btn-default"
											data-dismiss="modal">Close</button>
									</div>
								</div>
							</div>
						</div>
					</form>
					<td>
						<%
						if (subject.isActive()) {
						%>
						<button type="button" class="btn btn-danger" id="btnDelete" title="Thu hồi môn"
							onclick="location.href='./privateSubject?subjectID=<%=subject.getSubjectID()%>'"
							>Private</button> <%
 } else {
 %>
						<button type="button" class="btn btn-danger" id="btnRestore" title="Đăng môn học"
							onclick="location.href='./publicSubject?subjectID=<%=subject.getSubjectID()%>'"
							>Public</button>
					</td>
					<%
					}
					%>
					<td><a title="Xem danh sách học sinh đăng ký"
						href="../admin/chapter?subjectID=<%=subject.getSubjectID()%>"><button
								type="button" class="btn btn-primary">Xem</button></a></td>
				</tr>

			</tbody>
			<%
			}
			} else {
			%>
			<p>Chưa có môn học nào được tạo.</p>
			<%
			}
			%>
		</table>





		<form action="./renameSubject?subjectID=&newSubjectName=''"
			method="post">
			<div class="modal fade in" id="updateSubjectName" tabindex="-1"
				role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
				<div class="modal-dialog" role="document">
					<div class="modal-content">
						<div class="modal-header">
							<h5 class="modal-title" id="exampleModalLabel">Sửa tên môn</h5>
						</div>
						<div class="modal-body">

							<div class="mb-3">
								<label for="validationCustom01" class="form-label">Tên
									môn</label> <input name="newSubjectName" type="text"
									class="form-control" id="validationCustom02"
									placeholder="Nhập tên môn cần sửa" required>
							</div>



						</div>
						<div class="modal-footer">
							<button type="submit" class="btn btn-primary"
								onclick="location.href=''">Xác
								nhận</button>
							<button type="button" class="btn btn-default"
								data-dismiss="modal">Close</button>
						</div>
					</div>
				</div>
			</div>
		</form>





	</div>












	<%@include file="footer.jsp"%>
</body>

</html>