<%@page import="java.util.List"%>
<%@page import="hotel_booking.dto.AccountDTO"%>
<%@page import="hotel_booking.dto.RoleDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<!doctype html>
<html class="no-js" lang="en">

<head>
<title></title>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>????</title>
</head>

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
									<table id="table" data-toggle="table" data-pagination="true"
										data-search="true" data-show-columns="true"
										data-show-pagination-switch="true" data-show-refresh="true"
										data-key-events="true" data-show-toggle="true"
										data-resizable="true" data-cookie="true"
										data-cookie-id-table="saveId" data-show-export="true"
										data-click-to-select="true" data-toolbar="#toolbar">
										<!--                                    ====-->
										<div class="add-product">

											<a data-target="#addAccountModal" data-toggle="modal">Thêm</a>
										</div>
										<thead>
											<tr>

												<th data-field="name" data-editable="true" >[ Tên tài
													khoản]</th>

												

												<th data-field="email" data-editable="true" >[ Email ]</th>

												<th data-field="price" data-editable="true">[ Họ tên ]</th>

												<th data-field="sdt" data-editable="true">[ Số điện thoại ]</th>
												<th data-field="active">[ Tình trạng ]</th>


												<th data-field="roleName" data-editable="true">[ Tên quyền hạn ]</th>
												<th data-field="tichluy" data-editable="true">[ Khóa tài
													khoản ]</th>



											</tr>
										</thead>
										<tbody>
											<%
											List<AccountDTO> listaccountdto = (List<AccountDTO>) request.getAttribute("accountDTOList");
											for (AccountDTO accountdto : listaccountdto) {
											%>
											<tr>

												<td><%=accountdto.getAccountName()%></td>
												<td><%=accountdto.getEmail()%></td>
												<td><%=accountdto.getNickName()%></td>
												<td><%=accountdto.getPhoneNumber()%></td>
												<td><%=accountdto.isActive()%></td>
												<td><%=accountdto.getRoleName()%></td>
												<td><a class="btn btn-danger">Khóa</a></td>
											</tr>
											<%
											}
											%>
										</tbody>
									</table>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
		<!-- ....................................................... -->
		<div id="addAccountModal" class="modal">
			<div class="modal-dialog">
				<div class="modal-content">
					<form action="./addAccount" method="post"
						onsubmit="return validation()">
						<div class="modal-header">
							<h4 class="modal-title">ADD Account</h4>
							<button type="button" class="close" data-dismiss="modal"
								aria-hidden="true">&times;</button>
						</div>
						<div class="modal-body">
							<div class="form-group">
								<label>ID</label> <input name="accountID" id="accountID"
									type="text" class="form-control" required readonly>
							</div>
							<div class="form-group">
								<label>Tên tài khoản</label> <input name="accountName"
									id="accountName" type="text" class="form-control" required>
								<div id="accountNameMessage" style="color: red"></div>
							</div>
							<div class="form-group">
								<label>Tiền xu</label> <input name="coin" id="coin"
									type="number" value="0" class="form-control" required>
								<div></div>
							</div>
							<div class="form-group">
								<label>Email</label> <input name="email" id="email" type="email"
									class="form-control" required>
								<div id="emailMessage" style="color: red"></div>
							</div>
							<div class="form-group">
								<label>Nick name</label> <input name="nickName" id="nickName"
									type="text" class="form-control" required>
								<div id="nickNameMessage" style="color: red"></div>
							</div>
							<div class="form-group">
								<label>Mật khẩu</label> <input name="password" id="password"
									type="text" class="form-control" required
									pattern="[A-Za-z0-9]{10,18}">
								<p style="color: black">*Mật Khẩu từ 10-15 ký tự và không
									chứa ký tự đặc biệt</p>
							</div>
							<div class="form-group">
								<label>SDT</label> <input name="phoneNumber" id="phoneNumber"
									type="tel" class="form-control" required>
								<div id="phoneNumberMessage" style="color: red"></div>
							</div>
							<div class="form-group">
								<label>Điểm tích lũy</label> <input name="totalPoint"
									type="number" class="form-control" value="0" required readonly>
							</div>
							<div class="form-group">
								<label>Điểm tích lũy Tuần</label> <input name="weeklyPoint"
									type="number" class="form-control" value="0" required readonly>
							</div>
							<div class="form-group">
								<label>Điểm tích lũy Tháng</label> <input name="monthlyPoint"
									type="number" class="form-control" value="0" required readonly>
							</div>
							<div class="form-group">
								<label>Vai trò</label> <select name="roleName"
									class="form-select" aria-label="Default select example">
									<%
									List<RoleDTO> listRoledto = (List<RoleDTO>) request.getAttribute("listRoledto");
									for (RoleDTO roledto : listRoledto) {
									%>
									<option value="<%=roledto.getRoleName()%>"><%=roledto.getRoleName()%></option>
									<%
									}
									%>
								</select>
							</div>
							<div class="form-group">
								<label>Active</label> <input name="active" type="checkbox"
									class="form-control">
							</div>
						</div>
						<div class="modal-footer">
							<input type="button" class="btn btn-default" data-dismiss="modal"
								value="Cancel"> <input type="submit"
								class="btn btn-success" value="add">
						</div>
					</form>
				</div>
			</div>
		</div>
		<!-- Static Table End -->
		<%@ include file="footer.jsp"%>
	</div>


	<script src="../admin_page/js/ajax.js" type="text/javascript"></script>

</body>

</html>