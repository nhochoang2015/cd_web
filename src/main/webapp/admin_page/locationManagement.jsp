<%@page import="hotel_booking.dto.LocationDTO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="hotel_booking.dto.HotelDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"%>

<!doctype html>
<html class="no-js" lang="en">

<head>
<title>Subject Management</title>
<%@ include file="menu-bar.jsp"%>
<%@ include file="header.jsp"%>
</head>

<body>


	<!-- Start Welcome area -->
	<div class="all-content-wrapper">


		<div class="section-admin container-fluid">
			<div class="row admin text-center">
				<div class="col-md-12"></div>
			</div>
		</div>
		<div class="product-sales-area mg-tb-30">
			<div class="container-fluid">
				<div class="row">
					<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">

						<div class="product-status-wrap">
							<h4>QUẢN LÝ MÔN HỌC</h4>

							<!--                            <h4>Products List</h4>-->

							<div class="col-lg-8">
								<div class="form-group has-feedback has-search">
									<span class="glyphicon glyphicon-search form-control-feedback"></span>
									<input type="text" class="form-control id="
										myInput"
										placeholder="Nhập tên hoặc mã môn học cần tìm">
								</div>
								<button type="button" class="btn btn-primary"
									data-toggle="modal" data-target="#createSubject">Tạo địa điểm</button>

							</div>
							<table>
								<thead>
									<tr>
										<th>Tên địa điểm</th>
										<th>Link vị trí</th>
										<th>Link hình ảnh</th>
										<th>Chi tiết</th>
									</tr>
								</thead>
								<%
								List<LocationDTO> locationDTOList = (ArrayList<LocationDTO>) request.getAttribute("locationDTOList");
								for (LocationDTO location : locationDTOList) {
								%>
								<tbody id="myTable">
									<tr>
									<td><%=location.getLocationName()%></td>
									<td><%=location.getPosition()%>
										<!--  <button type="button" class="btn btn-primary"
												data-toggle="modal" data-target="#updateSubjectName"
												title="Sủa tên môn">
											<i class="fa-solid fa-pen-to-square"></i>
										</button>--></td>

									<td id="hiddenResult"><%=location.getPic()%></td>
									<td><a title="Đến trang quản lý chương"
											href="../admin/hotel-management?locationID=<%=location.getLocationID()%>"><button
													type="button" class="btn btn-primary">Xem</button></a></td>
									
										
										<!-- <button type="button" class="btn btn-danger" id="btnDelete"
												onclick="location.href='./unactiveSubject?subjectID='"
												onclick="function();">Xóa</button> 

										<button type="button" class="btn btn-danger" id="btnRestore"
												onclick="location.href='./activeSubject?subjectID='"
												onclick="function();">Phục hồi</button> -->
									
									
								</tr>
									</tbody>
								<!-- Modal -->
								<form action="./createSubject" method="post">
									<div class="modal fade in" id="createSubject" tabindex="-1"
										role="dialog" aria-labelledby="exampleModalLabel"
										aria-hidden="true">
										<div class="modal-dialog" role="document">
											<div class="modal-content">
												<div class="modal-header">
													<h5 class="modal-title" id="exampleModalLabel">Tạo môn</h5>
												</div>
												<div class="modal-body">

													<div class="mb-3">
														<label for="validationCustom01" class="form-label">Tên
															môn</label> <input type="text" name="subjectName"
															class="form-control" id="validationCustom01"
															placeholder="Nhập tên môn cần tạo" required>
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

								<form
									action="./renameSubject?subjectID=&newSubjectName=''"
									method="post">
									<div class="modal fade in" id="updateSubjectName" tabindex="-1"
										role="dialog" aria-labelledby="exampleModalLabel"
										aria-hidden="true">
										<div class="modal-dialog" role="document">
											<div class="modal-content">
												<div class="modal-header">
													<h5 class="modal-title" id="exampleModalLabel">Sửa tên
														môn</h5>
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
														onclick="location.href='./renameSubject?subjectID=&newSubjectName='">Xác
														nhận</button>
													<button type="button" class="btn btn-default"
														data-dismiss="modal">Close</button>
												</div>
											</div>
										</div>
									</div>
								</form>

								<%
								}
								%>
								</table>
							<!-- Modal -->

							<!-- Modal -->
							<form action="./unactiveSubject" method="post">
								<div class="modal fade in" id="deleteSubject" tabindex="-1"
									role="dialog" aria-labelledby="exampleModalLabel"
									aria-hidden="true">
									<div class="modal-dialog" role="document">
										<div class="modal-content">
											<div class="modal-header">
												<h5 class="modal-title" id="exampleModalLabel">Sửa tên
													môn</h5>
											</div>
											<div class="modal-body">Ẩn môn học khỏi giao diện học
												sinh</div>
											<div class="modal-footer">
												<button type="submit" class="btn btn-primary">Xác
													nhận</button>
												<button type="button" class="btn btn-default"
													data-dismiss="modal">Close</button>
											</div>
										</div>
									</div>
								</div>
							</form>
						</div>
					</div>
				</div>
			</div>
			<div class="traffic-analysis-area">
				<div class="container-fluid">
					<div class="row">
						<div class="col-lg-4 col-md-4 col-sm-4 col-xs-12"></div>
					</div>
				</div>
			</div>
			<div class="product-new-list-area">
				<div class="container-fluid"></div>
			</div>
			<div class="product-sales-area mg-tb-30">
				<div class="container-fluid"></div>
			</div>
			<div class="calender-area mg-tb-30">
				<div class="container-fluid">
					<div class="row">
						<div class="col-lg-12">
							<div class="calender-inner">
								<div id='calendar'></div>
							</div>
						</div>
					</div>
				</div>
			</div>
			<%@ include file="footer.jsp"%>

		</div>
	</div>
	<script>

</script>
</body>

</html>