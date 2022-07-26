<%@page import="java.util.List"%>
<%@page import="elementary_web.dto.AccountDTO"%>
<%@page import="elementary_web.dto.RoleDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<!doctype html>
<html class="no-js" lang="en">

<head>
<title>EDIT ACCOUNT</title>
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
									<h1>
										Bảng <span class="table-project-n">dữ liệu</span>
									</h1>
								</div>
							</div>
							<div class="sparkline13-graph">
								<div class="datatable-dashv1-list custom-datatable-overright">
									<div class="container">
										<%
										AccountDTO accountDTO = (AccountDTO) request.getAttribute("accountDTO");
										%>
										<div id="editAccount">
											<div class="modal-dialog">
												<div class="modal-content">
													<form
														action="./edit?accountID=<%=accountDTO.getAccountID()%>"
														method="post" onsubmit="return validation()"><!--  -->
														<div class="modal-header">
															<h4 class="modal-title">Edit Account</h4>
															<button type="button" class="close" data-dismiss="modal"
																aria-hidden="true">&times;</button>
														</div>
														<div class="modal-body">
															<div class="form-group">
																<label>ID</label> <input name="accountID" type="text"
																	class="form-control"
																	value="<%=accountDTO.getAccountID()%>" required
																	readonly>
															</div>
															<div class="form-group">
																<label>Tên tài khoản</label> <input name="accountName"
																	type="text" class="form-control"
																	value="<%=accountDTO.getAccountName()%>" required>
																<div id="accountNameMessage" style="color: red"></div>
															</div>
															<div class="form-group">
																<label>Tiền xu</label> <input name="coin" type="number"
																	class="form-control" value=""
																	required>
															</div>
															<div class="form-group">
																<label>Email</label> <input name="email" type="email"
																	class="form-control" value="<%=accountDTO.getEmail()%>"
																	required>
																<div id="emailMessage" style="color: red"></div>
															</div>
															<div class="form-group">
																<label>Nick name</label> <input name="nickName"
																	type="text" class="form-control"
																	value="<%=accountDTO.getNickName()%>" required>
																<div id="nickNameMessage" style="color: red"></div>
															</div>
															<div class="form-group">
																<label>Mật khẩu</label> <input name="password" id="password"
																	type="text" class="form-control" pattern="[A-Za-z0-9]{10,18}">
																	<p style="color: black">*Mật Khẩu từ 10-15 ký tự và không chứa ký tự đặc biệt</p>
																	
															</div>
															<div class="form-group">
																<label>SDT</label> <input name="phoneNumber" type="tel"
																	class="form-control"
																	value="<%=accountDTO.getPhoneNumber()%>" required>
																<div id="phoneNumberMessage" style="color: red"></div>
															</div>
															<div class="form-group">
																<label>Điểm tích lũy</label> <input name="totalPoint"
																	class="form-control"
																	value=""
																	readonly>
															</div>
															<div class="form-group">
																<label>Điểm tích lũy Tuần</label> <input
																	type="number" class="form-control"
																	value="" 
																	readonly>
															</div>
															<div class="form-group">
																<label>Điểm tích lũy Tháng</label> <input
																	type="number" class="form-control"
																	value=""
																	readonly>
															</div>
															<div class="form-group">
																<label>Vai trò</label> <select name="roleName"
																	class="form-select" aria-label="Default select example">
																	<%
																	List<RoleDTO> listRoledto = (List<RoleDTO>) request.getAttribute("listRoledto");
																	for (RoleDTO roledto : listRoledto) {
																	%>
																	<option value="<%=roledto.getRoleName()%>" <%if (accountDTO.getRoleName().equals(roledto.getRoleName())) {%>selected="selected"<%}%>><%=roledto.getRoleName()%></option>
																	<%
																	}
																	%>
																</select>
															</div>
															<div class="form-group">
																<label>Active</label> <input name="active"
																	type="checkbox" class="form-control"
																	<%if (accountDTO.isActive()) {%> checked <%}%>>
															</div>
														</div>
														<div class="modal-footer">
															
															<input type="button" class="btn btn-success" onclick="location.href = '../admin/accountManagement';" value="CANCEL"> 
															<input
																type="submit" class="btn btn-success" value="save">
														</div>
													</form>
												</div>
											</div>
										</div>



										<!-- Static Table End -->
										<%@ include file="footer.jsp"%>
									</div>
			<script src="../admin_page/js/ajaxEdit.js" type="text/javascript"></script>						
</body>
</html>