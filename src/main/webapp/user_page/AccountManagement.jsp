<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<link href="user_page/css/index.css" rel="stylesheet">
</head>

<body>
	<%@include file="header.jsp"%>
	<nav aria-label="breadcrumb">
		<ol class="breadcrumb" style="text-align: center">
			<li class="breadcrumb-item"><a href="./">Home</a></li>
			<li class="breadcrumb-item active" aria-current="page">Account</li>
		</ol>
	</nav>
	<ul class="nav nav-tabs" id="myTab" role="tablist">
		<li class="nav-item"><a class="nav-link active" id="home-tab"
			data-toggle="tab" href="#home" role="tab" aria-controls="home"
			aria-selected="true">Tài khoản</a></li>
		<li class="nav-item"><a class="nav-link" id="profile-tab"
			data-toggle="tab" href="#profile" role="tab" aria-controls="profile"
			aria-selected="false">Đổi mật khẩu</a></li>
		<%if(accountDTO.getRoleName().equals("HOC_SINH")){ %>
		<li class="nav-item"><a class="nav-link" id="contact-tab"
			data-toggle="tab" href="#contact" role="tab" aria-controls="contact"
			aria-selected="false">Môn học đã đăng ký</a></li>
			<%} %>
	</ul>
	<%AccountDTO account =(AccountDTO) request.getAttribute("account"); %>
	<div class="tab-content" id="myTabContent">
		<div class="tab-pane fade show active" id="home" role="tabpanel"
			aria-labelledby="home-tab">
			<form class="form-inline" style="margin-top: 20px; margin-left: 20px">
				<div class="form-group mb-2">
					<label for="staticEmail2" class="sr-only">Email</label> <input
						type="text" readonly class="form-control-plaintext"
						id="staticEmail2" value="Tên tài khoản">
				</div>
				<div class="form-group mx-sm-3 mb-2">
					<label for="inputPassword2" class="sr-only">Password</label> <input
						type="text" class="form-control" id="inputPassword2"
						value="<%=account.getUsername()%>" disabled="disabled">
				</div>
				<button type="submit" class="btn btn-primary mb-2">ok</button>
			</form>
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
		<div class="tab-pane fade" id="profile" role="tabpanel"
			aria-labelledby="profile-tab">
			<form style="margin-top: 20px;margin-left: 20px" class="w-50 p-3" action="/changePass" method ="post">
				<div class="form-group mx-sm-3 mb-2">
					<label for="exampleInputEmail1">Nhập mật khẩu hiện tại:</label> <input
						type="password" class="form-control" id="exampleInputEmail1"
						aria-describedby="emailHelp" placeholder="Enter email"> 
				</div>
				<div class="form-group mx-sm-3 mb-2">
					<label for="exampleInputPassword1">Nhập mật khẩu mới</label> <input
						type="password" class="form-control" id="exampleInputPassword1"
						placeholder="Password" >
				</div>
				<div class="form-group mx-sm-3 mb-2">
					<label for="exampleInputPassword1">Nhập lại mật khẩu mới</label> <input
						type="password" class="form-control" id="exampleInputPassword1" name ="pass"
						placeholder="Password">
				</div>
				<button style="margin-top: 20px;margin-left: 20px" type="submit" class="btn btn-primary">Xác nhận</button>
			</form>

		</div>
		<div class="tab-pane fade" id="contact" role="tabpanel"
			aria-labelledby="contact-tab">Hiện chưa đăng ký môn học nào.</div>
	</div>



	<%@include file="footer.jsp"%>
</body>

</html>