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
			<li class="breadcrumb-item active" aria-current="page">Home</li>
		</ol>
	</nav>
	<%@include file="blog.jsp"%>
	<div class="container-fluid pt-5" id="blog">
		<div class="container">
			<div class="text-center pb-2">
				<p class="section-title px-5">
					<span class="px-2">Trang chủ</span>
				</p>
				<%
				List<SubjectDTO> subjectList = (ArrayList<SubjectDTO>) request.getAttribute("subjectList");
				%>

				<h1 class="mb-4">Tìm kiếm khách sạn bạn cần tìm</h1>
				<nav class="navbar navbar-light bg-light">
					<span>Nhập tên khách sạn hoặc vị trí thành phố bạn muốn đến:</span>
					<form class="form-inline">

						<input class="form-control" type="search" style="width: 500px"
							placeholder="Search" aria-label="Search">
						<button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
					</form>
				</nav>
			</div>
			<h1 class="mb-4">Khám phá</h1>
			<nav class="navbar navbar-light bg-light">
				<div class="card-deck">
					<div class="card">
						<img class="card-img-top" src="user_page/img/header.png" alt="Card image cap">
						<div class="card-body">
							<h5 class="card-title">Card title</h5>
							<p class="card-text">This is a wider card with supporting
								text below as a natural lead-in to additional content. This
								content is a little bit longer.</p>
						</div>
						<div class="card-footer">
							<small class="text-muted">Last updated 3 mins ago</small>
						</div>
					</div>
					<div class="card">
						<img class="card-img-top" src="user_page/img/header.png" alt="Card image cap">
						<div class="card-body">
							<h5 class="card-title">Card title</h5>
							<p class="card-text">This card has supporting text below as a
								natural lead-in to additional content.</p>
						</div>
						<div class="card-footer">
							<small class="text-muted">Last updated 3 mins ago</small>
						</div>
					</div>
					<div class="card">
						<img class="card-img-top" src="user_page/img/header.png" alt="Card image cap">
						<div class="card-body">
							<h5 class="card-title">Card title</h5>
							<p class="card-text">This is a wider card with supporting
								text below as a natural lead-in to additional content. This card
								has even longer content than the first to show that equal height
								action.</p>
						</div>
						<div class="card-footer">
							<small class="text-muted">Last updated 3 mins ago</small>
						</div>
					</div>
				</div>
			</nav>
			<h1 class="mb-4">Khách sạn có đánh giá tốt</h1>
			<nav class="navbar navbar-light bg-light">
				<div class="card " style="width: 18rem; margin-bottom: 20px">
					<img class="card-img-top" src="user_page/img/header.png"
						alt="Card image cap" style="max-height: 180; max-width: 286">
					<div class="card-body">
						<h5 class="card-title">Vũng tàu</h5>
						<a href="#" class="btn btn-primary">Xem thêm</a>
					</div>
				</div>
				<div class="card " style="width: 18rem; margin-bottom: 20px">
					<img class="card-img-top" src="user_page/img/header.png"
						alt="Card image cap" style="max-height: 286; max-width: 180">
					<div class="card-body">
						<h5 class="card-title">Vũng tàu</h5>
						<a href="#" class="btn btn-primary">Xem thêm</a>
					</div>
				</div>
				<div class="card " style="width: 18rem; margin-bottom: 20px">
					<img class="card-img-top" src="user_page/img/header.png"
						alt="Card image cap" style="max-height: 286; max-width: 180">
					<div class="card-body">
						<h5 class="card-title">Vũng tàu</h5>
						<a href="#" class="btn btn-primary">Xem thêm</a>
					</div>
				</div>
				<div class="card " style="width: 18rem; margin-bottom: 20px">
					<img class="card-img-top" src="user_page/img/header.png"
						alt="Card image cap" style="max-height: 286; max-width: 180">
					<div class="card-body">
						<h5 class="card-title">Vũng tàu</h5>
						<a href="#" class="btn btn-primary">Xem thêm</a>
					</div>
				</div>
				<div class="card " style="width: 18rem; margin-bottom: 20px">
					<img class="card-img-top" src="user_page/img/header.png"
						alt="Card image cap" style="max-height: 286; max-width: 180">
					<div class="card-body">
						<h5 class="card-title">Vũng tàu</h5>
						<a href="#" class="btn btn-primary">Xem thêm</a>
					</div>
				</div>
				<div class="card " style="width: 18rem; margin-bottom: 20px">
					<img class="card-img-top" src="user_page/img/header.png"
						alt="Card image cap" style="max-height: 286; max-width: 180">
					<div class="card-body">
						<h5 class="card-title">Vũng tàu</h5>
						<a href="#" class="btn btn-primary">Xem thêm</a>
					</div>
				</div>
			</nav>



		</div>
	</div>











	<%@include file="footer.jsp"%>
</body>

</html>