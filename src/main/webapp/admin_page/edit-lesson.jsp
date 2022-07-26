<%@page import="java.util.List"%>
<%@page import="elementary_web.dto.LessonDTO"%>
<%@page import="elementary_web.dto.RoleDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<!doctype html>
<html class="no-js" lang="en">

<head>
<title>Sửa bài học</title>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">


</head>
<style>
img {
	width: 200px;
	height: 120px;
}
</style>

<body>
	<%@ include file="menu-bar.jsp"%>
	<!-- Start Welcome area -->
	<div class="all-content-wrapper">
		<%@ include file="header.jsp"%>
		<!-- Static Table Start -->
		<div class="data-table-area mg-tb-15">
			<div class="container-fluid">
				<div class="row">
					<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
						<div class="sparkline13-list">
							<div class="sparkline13-hd">
								<div class="main-sparkline13-hd">
									<h1>Sửa bài học</h1>
								</div>
							</div>
							<div class="sparkline13-graph">
								<div class="datatable-dashv1-list custom-datatable-overright">
									<div class="container">
										<%
										LessonDTO lesson = (LessonDTO) request.getAttribute("lesson");
										Integer lessonBeforeID = lesson.getLessonBeforeID();
										int chapterID = (int) request.getAttribute("chapterID");
										List<LessonDTO> lessonList = (List<LessonDTO>) request.getAttribute("lessonList");
										%>
										<div id="editAccount">
											<div class="modal-dialog">
												<div class="modal-content">
													<form action="../admin/editLesson" method="post">
														<!--  -->
														<div class="modal-header">
															<h4 class="modal-title">Edit Account</h4>
															<button type="button" class="close" data-dismiss="modal"
																aria-hidden="true">&times;</button>
														</div>
														<div class="modal-body">
															<input name="chapterID" hidden="true"
																value="<%=chapterID%>">
															<div class="form-group">
																<label>ID</label> <input name="lessonID" id="lessonID"
																	type="text" class="form-control" required
																	value="<%=lesson.getLessonID()%>" readonly="readonly">
															</div>
															<div class="form-group">
																<label>Tên bài học</label> <input name="lessonName"
																	id="lessonName" type="text" class="form-control"
																	required value="<%=lesson.getLessonName()%>">
															</div>
															<div class="form-group">
																<label>Bài học tiên quyết</label> <select
																	name="lessonBeforeID">
																	<option value="0">Không</option>
																	<%
																	for (LessonDTO lessonDTO : lessonList) {
																		int lessonID = lessonDTO.getLessonID();
																		String lessonName = lessonDTO.getLessonName();
																	%>
																	<%
																	if (lessonID != lesson.getLessonID()) {
																		System.out.println(lessonID);
																		System.out.println(lessonBeforeID);
																	%>
																	<option value="<%=lessonDTO.getLessonID()%>"
																		<%if ((lessonBeforeID != null) && (lessonID == lessonBeforeID)) {%>
																		selected <%}%>><%=lessonName%></option>

																	<%
																	}
																	}
																	%>
																</select>
															</div>
															<div class="form-group">
																<label>Điểm</label> <input id="lessonScoreInput"
																	name="score" type="number" class="form-control" min="0"
																	max="1000" required value="<%=lesson.getScore()%>">
															</div>
															<div class="form-group">
																<label>Active</label> <input name="active"
																	type="checkbox" class="form-control"
																	<%if (lesson.isActive()) {%> checked <%}%>>
															</div>
														</div>
														<div class="modal-footer">

															<input type="button" class="btn btn-success"
																onclick="location.href = '../admin/lessonManagement?chapterID=<%=chapterID%>';"
																value="Hủy"> <input type="submit"
																class="btn btn-success" value="Lưu">
														</div>
													</form>
												</div>
											</div>
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
		<!-- Static Table End -->
		<%@ include file="footer.jsp"%>
	</div>
	<script src="../admin_page/js/ajaxEdit.js" type="text/javascript"></script>
</body>
</html>