<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="elementary_web.dto.ChapterDTO"%>
<%@page import="elementary_web.dto.SubjectDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"%>

<!doctype html>
<html class="no-js" lang="en">

<head>
<title></title>
<%@ include file="menu-bar.jsp"%>
<%@ include file="header.jsp"%>
</head>

<body>


	<!-- Start Welcome area -->
	<div class="all-content-wrapper">


		<div class="section-admin container-fluid">
			<div class="row admin text-center">
				<div class="col-md-12">
					<div class="row"></div>
				</div>
			</div>
		</div>
		<div class="product-sales-area mg-tb-30">
			<div class="container-fluid">
				<div class="row">
					<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
						<div class="product-sales-chart">
							<div class="portlet-title">
								<div class="row">
									<div class="col-lg-6 col-md-6 col-sm-6 col-xs-12">
										<div class="caption pro-sl-hd">
											<!--                                            ***********8-->
											<span class="caption-subject text-uppercase"><b>QUẢN
													LÝ CHƯƠNG</b></span>

										</div>
									</div>

								</div>
							</div>
							<ul class="list-inline cus-product-sl-rp">
								<li>
									<h5>Môn học:</h5>
								</li>

							</ul>
							<div class="product-status-wrap">
								<h4>QUẢN LÝ CHƯƠNG</h4>
							</div>

						</div>
						<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
							<div class="product-sales-chart">
								<div class="portlet-title">
									<div class="row">
										<div class="col-lg-6 col-md-6 col-sm-6 col-xs-12">
											<div class="col-lg-12">
												<div class="form-group has-feedback has-search">
													<span
														class="glyphicon glyphicon-search form-control-feedback"></span>
													<input type="text" class="form-control"
														placeholder="Nhập tên hoặc mã chương cần tìm">
												</div>
												<button type="button" class="btn btn-primary">Tìm
													kiếm</button>

											</div>
											<div class="caption pro-sl-hd">
												<span class="caption-subject text-uppercase"><b>Danh
														sách chương</b></span>

											</div>
										</div>
										<div class="col-lg-6 col-md-6 col-sm-6 col-xs-12">
											<div class="actions graph-rp">
												<button type="button" class="btn btn-success"
													data-toggle="modal" data-target="#createChapter"
													title="Tạo chương">
													<i class="fa fa-plus-square"></i>
												</button>
											</div>
										</div>
									</div>
								</div>
								<%
								List<ChapterDTO> chapterList = (List<ChapterDTO>) request.getAttribute("chapterList");
								for (ChapterDTO chapter : chapterList) {
								%>
								<ul class="list-group">
									<li class="list-group-item">
										<div class="portlet-title">
											<div class="row">
												<div class="col-lg-6 col-md-6 col-sm-6 col-xs-12">
													<div class="caption pro-sl-hd">
														<span class="caption-subject text-uppercase"><b>
																<%=chapter.getChapterName()%>
														</b></span>
													</div>
												</div>
												<div class="col-lg-6 col-md-6 col-sm-6 col-xs-12">
													<div class="actions graph-rp">
														<a
															href="../admin/lessonManagement?chapterID=<%=chapter.getChapterID()%>">
															<button type="button" class="btn btn-primary"
																title="Xem bài tập">
																<i class="fa-solid fa-circle-info"></i>
															</button>
														</a>

														<button type="button" class="btn btn-primary"
															data-toggle="modal" data-target="#updateChapterName"
															title="Sủa tên chương">
															<i class="fa-solid fa-pen-to-square"></i>
														</button>
														<button type="button" class="btn btn-danger"
															data-toggle="modal" data-target="#deleteChapter"
															title="Xóa chương">
															<i class="fa-solid fa-trash"></i>
														</button>
													</div>
												</div>
											</div>
										</div>
									</li>
								</ul>
								<!-- Modal -->
								<form
									action="./createChapter?subjectID=<%=chapter.getSubjectID()%>"
									method="POST">
									<div class="modal fade" id="createChapter" tabindex="-1"
										role="dialog" aria-labelledby="exampleModalLabel"
										aria-hidden="true">
										<div class="modal-dialog" role="document">
											<div class="modal-content">
												<div class="modal-header">
													<h5 class="modal-title" id="exampleModalLabel">Tạo
														chương</h5>
												</div>
												<div class="modal-body">

													<div class="mb-3">
														<label for="validationCustom01" class="form-label">Tên
															chương</label> <input type="text" class="form-control"
															name="chapterName" id="validationCustom01"
															placeholder="Tên chương" required>
													</div>
												</div>
												<div class="modal-footer">
													<button type="submit" class="btn btn-primary">Tạo</button>
													<button type="button" class="btn btn-default"
														data-dismiss="modal">Close</button>
												</div>
											</div>
										</div>
									</div>
								</form>
								<!-- Modal -->
								<form action="./renameChapter?chapterID=<%=chapter.getChapterID()%>&chapterName=" method="POST">
									<div class="modal fade in" id="updateChapterName" tabindex="-1"
										role="dialog" aria-labelledby="exampleModalLabel"
										aria-hidden="true">
										<div class="modal-dialog" role="document">
											<div class="modal-content">
												<div class="modal-header">
													<h5 class="modal-title" id="exampleModalLabel">Sửa tên
														chương</h5>
												</div>
												<div class="modal-body">

													<div class="mb-3">
														<label for="validationCustom01" class="form-label">Tên
															chương</label> <input type="text" class="form-control"
															id="validationCustom01" placeholder="Tên chương" value = "<%=chapter.getChapterName()%>"name="chapterName" required>
													</div>



												</div>
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
								<%
								}
								%>

								

							</div>
						</div>
					</div>
				</div>
			</div>
			<div class="traffic-analysis-area">
				<div class="container-fluid">
					<div class="row">
						<div class="col-lg-4 col-md-4 col-sm-4 col-xs-12"></div>
						<!--                    ///////////////////////////////////////******* SITE TRAFFIC*-->

					</div>
				</div>
			</div>

			<div class="product-sales-area mg-tb-30">
				<div class="container-fluid">
					<div class="row">
						<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12"></div>

					</div>
				</div>
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
</body>

</html>