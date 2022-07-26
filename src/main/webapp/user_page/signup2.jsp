<%@page import="hotel_booking.dto.AccountDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Đăng ký</title>
<link href="user_page/css/login.css" rel="stylesheet">


</head>
<body>
	<!-- Header -->
	<jsp:include page="header.jsp" />



	<div class="limiter">
		<%AccountDTO account = (AccountDTO)request.getAttribute("account"); %>
		<div class="container-login100"
			style="background-image: url('images/login.jpg'); padding-top: 90px">
			<div class="wrap-login100 p-l-55 p-r-55 p-t-65 p-b-54">
				<form class="login100-form validate-form" action="./varity-mail?accountID=<%=account.getAccountID() %>"
					method="POST">
					<span class="login100-form-title p-b-49"> Xác nhận Email </span>

					<div class="wrap-input100 validate-input m-b-23"
						data-validate="KhÃ´ng ÄÆ°á»£c bá» trá»ng">
						<span class="label-input100">Nhập mã code</span> <input
							class="input100" type="text" name="validateCode"
							placeholder="Nhập tên đăng nhập của bạn"> <span
							class="focus-input100" data-symbol="&#xf206;"></span>
					</div>
					<a class="btn btn-primary" href="#">Gửi lại mã</a>
					<div class="container-login100-form-btn mt-3">
						<div class="wrap-login100-form-btn">
							<div class="login100-form-bgbtn"></div>
							<button class="login100-form-btn">Xác nhận</button>
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