<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<link href="user_page/css/index.css" rel="stylesheet">
</head>

<body>
	<%@include file="header.jsp"%>
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
					<span class="px-2">Tìm kiếm</span>
				</p>

				<h1 class="mb-4">Danh sách khách sạn</h1>
				<nav class="navbar navbar-light bg-light">
					<button type="button" class="btn btn-primary" data-toggle="modal"
						data-target=".bd-example-modal-lg">Large modal</button>

					<div class="modal fade bd-example-modal-lg" tabindex="-1"
						role="dialog" aria-labelledby="myLargeModalLabel"
						aria-hidden="true">
						<div class="modal-dialog modal-lg">
							<div class="modal-content">
								<div class="modal-header">
									<button type="button" class="close" data-dismiss="modal"
										aria-label="Close">
										<span aria-hidden="true">&times;</span>
									</button>
								</div>
								<div class="modal-body">
									<iframe
										src="https://www.google.com/maps/d/u/0/embed?mid=1O0bAuF9j6C8hOsrQSaM3qDI81Rs11Xo&ehbc=2E312F"
										width="640" height="480"></iframe>
								</div>
								
							</div>
						</div>
					</div>

				</nav>
			</div>

			<div class="row pb-3">

				<div class="col-lg-4 mb-4">
					<div class="card border-0 shadow-sm mb-2">
						<img class="card-img-top mb-2" src="img/blog-1.jpg" alt="">
						<div class="card-body bg-light text-center p-4">
							<h4 class="">kjabfklaaj</h4>
							<div class="d-flex justify-content-center mb-3">
								<small class="mr-3"><i class="fa fa-user text-primary"></i>
									Giáo viên: Thu Minh </small> <small class="mr-3"><i
									class="fa fa-folder text-primary"></i></small> <small class="mr-3"><i
									class="fa fa-comments text-primary"></i> 15</small>
							</div>
							<p>hìhaioahflafhil</p>
							<p>HDLFHLAALFA</p>
							<p>Học phí: CÂ vnđ/ tháng</p>
							<a class="btn btn-primary px-4 mx-auto my-2">Xem chi tiết</a>
						</div>
					</div>

				</div>
				<div class="card col-sm-8" style="width: 30rem;">
					<div class="row">
						<img src="user_page/img/header.png" alt="..."
							class="img-thumbnail col"
							style="max-width: 250px; max-height: 250px; margin-top: 10px; margin-left: 10px">
						<div class="col">
							<a style="font-size: 20px" href="#">Khách sạn Melody</a>
							<h5 class="card-title">Card title</h5>
							<p class="card-text">Some quick example text to build on the
								card title and make up the bulk of the card's content.</p>
							<a href="#" class="btn btn-primary">Go somewhere</a>
						</div>
					</div>
				</div>
				<div class="col-md-12 mb-4">
					<nav aria-label="Page navigation">
						<ul class="pagination justify-content-center mb-0">
							<li class="page-item disabled"><a class="page-link" href="#"
								aria-label="Previous"> <span aria-hidden="true">&laquo;</span>
									<span class="sr-only">Previous</span>
							</a></li>
							<li class="page-item active"><a class="page-link" href="#">1</a></li>
							<li class="page-item"><a class="page-link" href="#">2</a></li>
							<li class="page-item"><a class="page-link" href="#">3</a></li>
							<li class="page-item"><a class="page-link" href="#"
								aria-label="Next"> <span aria-hidden="true">&raquo;</span> <span
									class="sr-only">Next</span>
							</a></li>
						</ul>
					</nav>
				</div>
			</div>
		</div>
	</div>











	<%@include file="footer.jsp"%>
</body>

</html>