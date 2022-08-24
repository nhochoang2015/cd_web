<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Đăng ký</title>
<link href="user_page/css/login.css" rel="stylesheet">
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

</head>
<body>
	<!-- Header -->
	<jsp:include page="header.jsp" />



	<div class="limiter">
		<div class="container-login100"
			style="background-image: url('images/login.jpg'); padding-top: 90px">
			<div class="wrap-login100 p-l-55 p-r-55 p-t-65 p-b-54">
				<form class="login100-form validate-form" action="./SignUp"
					method="post">
					<span class="login100-form-title p-b-49"> Đăng ký </span>

					<div class="wrap-input100 validate-input m-b-23"
						data-validate="KhÃ´ng ÄÆ°á»£c bá» trá»ng">
						<span class="label-input100">Tên Đăng nhập</span> <input
							class="input100" type="text" name="Username" id="username"
							placeholder="Nhập tên đăng nhập của bạn"> <span
							class="focus-input100" data-symbol="&#xf206;" ></span>
							<p id="checkUsserr"></p>

					</div>
					<div class="wrap-input100 validate-input m-b-23"
						data-validate="KhÃ´ng ÄÆ°á»£c bá» trá»ng">
						<span class="label-input100">MẬT KHẨU</span> <input
							class="input100" type="password" id="pass1"
							placeholder="Nhập mật khẩu của bạn"> <span
							class="focus-input100" data-symbol="&#xf190;"></span>
					</div>

					<div class="wrap-input100 validate-input"
						data-validate="KhÃ´ng ÄÆ°á»£c bá» trá»ng">
						<span class="label-input100">Nhập lại mật khẩu</span> <input
							class="input100" type="password" name="pass" id="pass2"
							placeholder="Nhập lại mật khẩu" oninput="checkPass()"> <span
							class="focus-input100" data-symbol="&#xf190;" id="invalidPass"></span>
					</div>

					<script type="text/javascript">
						checkPass()
						{
							var x = document.getElementById("pass1").Value();
							var y = document.getElementById("pass2").Value();
							if (x != y) {
								document.getElementById("invalidPass").innerHTML = "nhập sai mật khẩu";
							}
						}
					</script>
					<p id="invalidPass" style="color: red"></p>
					<div class="wrap-input100 validate-input m-b-23"
						data-validate="KhÃ´ng ÄÆ°á»£c bá» trá»ng">
						<span class="label-input100">Họ Tên</span> <input class="input100"
							type="text" name="Nickname" placeholder="Nhập nick name của bạn">
						<span class="focus-input100" data-symbol="&#xf206;"></span>
					</div>
					<div class="wrap-input100 validate-input m-b-23"
						data-validate="KhÃ´ng ÄÆ°á»£c bá» trá»ng">
						<span class="label-input100">Email</span> <input class="input100"
							type="email" name="Email" placeholder="Nhập email của bạn">
						<span class="focus-input100" data-symbol="&#9993;"></span>
					</div>

					<div class="wrap-input100 validate-input m-b-23"
						data-validate="KhÃ´ng ÄÆ°á»£c bá» trá»ng">
						<span class="label-input100">Số điện thoại</span> <input
							class="input100" type="tel" name="Phonenumber"
							placeholder="Nhập số điện thoại của bạn"><span
							class="focus-input100" data-symbol="&#9742;"></span>
					</div>
					<div class="container-login100-form-btn mt-3"
						style="margin-top: 20px">
						<div class="wrap-login100-form-btn">
							<div class="login100-form-bgbtn"></div>
							<button class="login100-form-btn" type="submit">Xác nhận</button>
						</div>
					</div>

					<div class="flex-col-c p-t-155 text-center">
						<span class="txt1 p-b-17"> Bạn đã có tài khoản </span> <a
							href="./login" class="txt2"> Đăng nhập </a>
					</div>

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
	<!--===============================================================================================-->

</body>
</html>