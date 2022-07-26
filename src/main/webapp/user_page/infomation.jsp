<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<link href="user_page/css/index.css" rel="stylesheet">
</head>

<body>
	<%@include file="header.jsp"%>
	<%@include file="banner.jsp"%>
	<!-- Banner Start -->

	<!-- Banner End -->
	<nav aria-label="breadcrumb">
		<ol class="breadcrumb" style="text-align: center">
			<li class="breadcrumb-item"><a href="./">Trang chủ</a></li>
			<li class="breadcrumb-item active" aria-current="page">Thông tin
				cá nhân</li>
		</ol>
	</nav>
	<ul class="nav nav-tabs" id="myTab" role="tablist">
		<li class="nav-item"><a class="nav-link active" id="home-tab"
			data-toggle="tab" href="#home" role="tab" aria-controls="home"
			aria-selected="true">Thông tin</a></li>
	</ul>
	<%
	AccountDTO account = (AccountDTO) request.getAttribute("accountDTO");
	%>
	<div class="tab-pane fade show active" id="home" role="tabpanel"
		aria-labelledby="profile-tab">
		<form class="form-inline" style="margin-top: 20px; margin-left: 20px">
			<div class="form-group mb-2">
				<label for="staticEmail2" class="sr-only"></label> <input
					type="text" readonly class="form-control-plaintext"
					id="staticEmail2" value="Họ tên">
			</div>
			<div class="form-group mx-sm-3 mb-2">
				<label for="inputPassword2" class="sr-only">Password</label> <input
					type="text" class="form-control" id="inputPassword2"
					value="<%=account.getNickName()%>" disabled="disabled">
			</div>
			<button type="submit" class="btn btn-primary mb-2">ok</button>
		</form>
		<form class="form-inline" style="margin-top: 20px; margin-left: 20px">
			<div class="form-group mb-2">
				<label for="staticEmail2" class="sr-only"></label> <input
					type="text" readonly class="form-control-plaintext"
					id="staticEmail2" value="Gmail">
			</div>
			<div class="form-group mx-sm-3 mb-2">
				<label for="inputPassword2" class="sr-only">Password</label> <input
					type="email" class="form-control" id="inputPassword2"
					value="<%=account.getEmail()%>" disabled="disabled">
			</div>
			<button type="submit" class="btn btn-primary mb-2">ok</button>
		</form>
		<form class="form-inline" style="margin-top: 20px; margin-left: 20px">
			<div class="form-group mb-2">
				<label for="staticEmail2" class="sr-only"></label> <input
					type="text" readonly class="form-control-plaintext"
					id="staticEmail2" value="Số điện thoại">
			</div>
			<div class="form-group mx-sm-3 mb-2">
				<label for="inputPassword2" class="sr-only">Password</label> <input
					type="text" class="form-control" id="inputPassword2"
					value="<%=account.getPhoneNumber()%>" disabled="disabled">
			</div>
			<button type="submit" class="btn btn-primary mb-2">ok</button>
		</form>
	</div>
	<%@include file="footer.jsp"%>
</body>

</html>