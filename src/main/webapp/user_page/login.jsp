<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<link href="user_page/css/login.css" rel="stylesheet">
</head>
<body>
	<!-- Header -->
	<jsp:include page="header.jsp" />


	<div class="limiter">

		<div class="container-login100"
			style="background-image: url('images/login.jpg'); padding-top: 90px">
			<div class="wrap-login100 p-l-55 p-r-55 p-t-65 p-b-54">

				<form class="login100-form validate-form" action="./handleLogin"
					method="POST">
					<span class="login100-form-title p-b-49"> Đăng nhập </span>

					<div class="wrap-input100 validate-input m-b-23"
						data-validate="KhÃ´ng ÄÆ°á»£c bá» trá»ng">
						<span class="label-input100">Tên đăng nhập</span> <input
							class="input100" type="text" id="username" name="username"
							placeholder="Tên đăng nhập/Email/Số điện thoại"> <span
							class="focus-input100" data-symbol="&#xf206;"></span>

					</div>

					<div class="wrap-input100 validate-input"
						data-validate="KhÃ´ng ÄÆ°á»£c bá» trá»ng">
						<span class="label-input100">Mật khẩu</span> <input
							class="input100" type="password" id="pass" name="password"
							placeholder="Mật khẩu"> <span class="focus-input100"
							data-symbol="&#xf190;"></span>
					</div>



					<div class="container-login100-form-btn mt-3">
						<div class="wrap-login100-form-btn">
							<div class="login100-form-bgbtn"></div>
							<button class="login100-form-btn">Đăng nhập</button>
						</div>
					</div>

					<div class="txt1 text-center p-t-54 p-b-20">
						<span class="txt1 p-b-17">Chưa có tài khoản </span> <a
							href="signup.jsp" class="txt2"> Đăng ký </a>

					</div>
					<div class="txt1 text-center p-t-54 p-b-20">
						<a href="forgotpassword.jsp"> Quên mật khẩu </a>


					</div>

					<!-- 	<div class="flex-c-m">
						<a href="#" class="login100-social-item bg1" id="facebook"> <i
							class="fa fa-facebook"></i>
						</a> <a href="#" class="login100-social-item bg2" id="twit"> <i
							class="fa fa-twitter"></i>
						</a> <a href="#" class="login100-social-item bg3"> <i
							class="fa fa-google"></i>
						</a>
					</div> -->

				</form>
			</div>
		</div>
	</div>
	<jsp:include page="footer.jsp" />
	<!-- Back to top -->
	<div class="btn-back-to-top" id="myBtn">
		<span class="symbol-btn-back-to-top"> <i
			class="zmdi zmdi-chevron-up"></i>
		</span>
	</div>

	<div id="dropDownSelect1"></div>
	<%
	String status = (String) request.getParameter("loginStatus");
	if (status != null) {
	%>
	<script type="text/javascript">
		alert("Đăng nhập không thành công. Xin kiểm tra lại tài khoản hoặc mật khẩu");
	</script>
	<%
	}
	%>
</body>
</html>