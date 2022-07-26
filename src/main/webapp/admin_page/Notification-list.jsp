<%@page import="java.util.ArrayList"%>
<%@page import="elementary_web.dto.NotificationDTO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"%>


<!doctype html>
<html class="no-js" lang="en">

<head>
<title>Notification Management | Admin Page</title>
</head>

<body>
	<%@ include file="menu-bar.jsp"%>
	<!-- Start Welcome area -->
	<div class="all-content-wrapper">
		<%@ include file="header.jsp"%>

		<div class="product-status mg-tb-15">
			<div class="container-fluid">
				<div class="row">
					<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
						<div class="col-sm-6">
							<a href="#addnotify" class="btn btn-success" data-toggle="modal"><i
								class="material-icons"></i> <span>Tạo thông báo</span></a>
						</div>
						<div class="product-status-wrap">

							<h4>Danh sách thông báo</h4>

							<%
							List<NotificationDTO> notesDTOList = (ArrayList<NotificationDTO>) request.getAttribute("notesDTOList");
							for (NotificationDTO note : notesDTOList) {
							%>
							<ul class="list-group">
								<li class="list-group-item"><span
									class="caption-subject text-uppercase pull-left"><b>
											Tiêu đề: <%=note.getTitle()%>
									</b></span>
									<div class="portlet-title">
										<div class="row">
											<div class="actions graph-lp"></div>
											<div class="actions graph-rp">
												<a class="btn btn-primary" data-toggle="collapse"
													href="#collapseExample<%=note.getNotificationID()%>"
													role="button" aria-expanded="false"
													aria-controls="collapseExample"
													title="Xem nội dung thông báo">Xem nội dung</a> <a
													href="#updateNotification<%=note.getNotificationID()%>"
													class="btn btn-warning" data-toggle="modal"
													title="Sửa nội dung thông báo"><span><i
														class="fa-solid fa-pen-to-square"></i></span></a> <a
													href="../admin/deleteNotification?notificationID=<%=note.getNotificationID()%>"
													class="btn btn-danger" title="Xóa thông báo"><span><i
														class="fa-solid fa-trash"></i></span></a>
											</div>
										</div>
										<div class="collapse"
											id="collapseExample<%=note.getNotificationID()%>">
											<div class="card card-body"><%=note.getContent()%></div>
										</div>
									</div></li>
							</ul>
							<!-- model -->
							<div id="addnotify" class="modal fade">
								<div class="modal-dialog">
									<div class="modal-content">
										<form action="../admin/createNotification" method="post">
											<div class="modal-header">
												<h4 class="modal-title">Tạo thông báo</h4>
												<button type="button" class="close" data-dismiss="modal"
													aria-hidden="true">&times;</button>
											</div>
											<div class="modal-body">

												<div class="form-group">
													<label>Tên thông báo</label> <input name="title"
														type="text" class="form-control" required>
												</div>
												<div class="form-group">
													<label>Nội dung thông báo</label>
													<textarea class="form-control" name="content"
														id="exampleFormControlTextarea1" rows="3"></textarea>
												</div>

											</div>
											<div class="modal-footer">
												<input type="button" class="btn btn-default"
													data-dismiss="modal" value="Cancel"> <input
													type="submit" class="btn btn-success" value="Add">
											</div>
										</form>
									</div>
								</div>
							</div>

							<!-- model -->

							<div id="updateNotification<%=note.getNotificationID()%>"
								class="modal fade">
								<div class="modal-dialog">
									<div class="modal-content">
										<form
											action="../admin/updateNotification?notificationID=<%=note.getNotificationID()%>"
											method="post">
											<div class="modal-header">
												<h4 class="modal-title">Sửa thông báo</h4>
												<button type="button" class="close" data-dismiss="modal"
													aria-hidden="true">&times;</button>
											</div>
											<div class="modal-body">

												<div class="form-group">
													<label>Sửa tên thông báo</label> <input name="title"
														type="text" class="form-control" required="required">
												</div>
												<div class="form-group">
													<label>Sửa nội dung thông báo</label>
													<textarea class="form-control"
														id="exampleFormControlTextarea1" name="content" rows="3"
														required="required"></textarea>
												</div>
											</div>
											<div class="modal-footer">
												<input type="button" class="btn btn-default"
													data-dismiss="modal" value="Cancel"> <input
													type="submit" class="btn btn-success" value="Update">
											</div>
										</form>
									</div>
								</div>
							</div>
							<%
							}
							%>
							<!-- <div class="custom-pagination">
								<nav aria-label="Page navigation example">
									<ul class="pagination">
										<li class="page-item disabled"><a class="page-link"
											href="#">trước</a></li>
										                                 <li class="page-item"><a class="page-link" href="#">Previous</a></li>
							<li class="page-item active"><a class="page-link" href="#">1</a></li>
							<li class="page-item"><a class="page-link" href="#">2</a></li>
							<li class="page-item"><a class="page-link" href="#">3</a></li>
							<li class="page-item"><a class="page-link" href="#">Tiếp</a></li>
							                                    <li class="page-item"><a class="page-link" href="#">Next</a></li>
							</ul>
							</nav>
						</div>
						-->

						</div>
					</div>
				</div>
			</div>
		</div>
		<%@ include file="footer.jsp"%>
	</div>


</body>

</html>