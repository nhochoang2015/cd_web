<%@page import="elementary_web.dto.SubjectDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"%>

<!doctype html>
<html class="no-js" lang="en">

<head>
<title></title>
<!--[if lt IE 8]>
            <p class="browserupgrade">You are using an <strong>outdated</strong> browser. Please <a href="admin_page/http://browsehappy.com/">upgrade your browser</a> to improve your experience.</p>
        <![endif]-->
<%@ include file="menu-bar.jsp"%>
<%@ include file="header.jsp"%>
</head>

<body>


	<!-- Start Welcome area -->
	<div class="all-content-wrapper">


		<div class="section-admin container-fluid">
			<div class="row admin text-center">
				<div class="col-md-12">
					<div class="row"></div>
				</div>
			</div>
		</div>
		<div class="product-sales-area mg-tb-30">
			<div class="container-fluid">
				<div class="row">
					<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
						<div class="product-sales-chart">
							<div class="portlet-title">
								<div class="row">
									<div class="col-lg-6 col-md-6 col-sm-6 col-xs-12">
										<div class="caption pro-sl-hd">
											<!--                                            ***********8-->
											<span class="caption-subject text-uppercase"><b>QUẢN
													LÝ CHƯƠNG</b></span>

										</div>
									</div>

								</div>
							</div>
							<ul class="list-inline cus-product-sl-rp">
					

								<li>
									<h5>Môn học: TOÁN</h5>
								</li>

							</ul>
						</div>
						<div class="product-status-wrap">
							<h4>QUẢN LÝ CHƯƠNG</h4>
							<div class="col-lg-8">
								<div class="form-group has-feedback has-search">
									<span class="glyphicon glyphicon-search form-control-feedback"></span>
									<input type="text" class="form-control"
										placeholder="Nhập tên hoặc mã chương cần tìm">
								</div>
								<button type="button" class="btn btn-primary">Tìm kiếm</button>

							</div>
							<!-- Modal -->
							<form>
								<div class="modal fade" id="deleteChapter" tabindex="-1"
									role="dialog" aria-labelledby="exampleModalLabel"
									aria-hidden="true">
									<div class="modal-dialog" role="document">
										<div class="modal-content">
											<div class="modal-header">
												<h5 class="modal-title" id="exampleModalLabel">Xóa
													chương</h5>
											</div>
											<div class="modal-body">

												<div class="mb-3">Unactive Chapter!!!</div>
											</div>
											<div class="modal-footer">
												<button type="submit" class="btn btn-danger">Xác
													nhận</button>
												<button type="button" class="btn btn-default"
													data-dismiss="modal">Close</button>
											</div>
										</div>
									</div>
								</div>
							</form>
							<!-- Modal -->
							<form>
								<div class="modal fade" id="createChapter" tabindex="-1"
									role="dialog" aria-labelledby="exampleModalLabel"
									aria-hidden="true">
									<div class="modal-dialog" role="document">
										<div class="modal-content">
											<div class="modal-header">
												<h5 class="modal-title" id="exampleModalLabel">Tạo
													chương</h5>
											</div>
											<div class="modal-body">

												<div class="mb-3">
													<label for="validationCustom01" class="form-label">Tên
														chương</label> <input type="text" class="form-control"
														id="validationCustom01" placeholder="Tên chương" required>
												</div>



											</div>
											<div class="modal-footer">
												<button type="submit" class="btn btn-primary">Tạo</button>
												<button type="button" class="btn btn-default"
													data-dismiss="modal">Close</button>
											</div>
										</div>
									</div>
								</div>
							</form>
							<!-- Modal -->
							<form>
								<div class="modal fade" id="updateChapterName" tabindex="-1"
									role="dialog" aria-labelledby="exampleModalLabel"
									aria-hidden="true">
									<div class="modal-dialog" role="document">
										<div class="modal-content">
											<div class="modal-header">
												<h5 class="modal-title" id="exampleModalLabel">Sửa tên
													chương</h5>
											</div>
											<div class="modal-body">

												<div class="mb-3">
													<label for="validationCustom01" class="form-label">Tên
														chương</label> <input type="text" class="form-control"
														id="validationCustom01" placeholder="Tên chương" required>
												</div>



											</div>
											<div class="modal-footer">
												<button type="submit" class="btn btn-primary">Xác
													nhận</button>
												<button type="button" class="btn btn-default"
													data-dismiss="modal">Close</button>
											</div>
										</div>
									</div>
								</div>
							</form>
						</div>
						<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
							<div class="product-sales-chart">
								<div class="portlet-title">
									<div class="row">
										<div class="col-lg-6 col-md-6 col-sm-6 col-xs-12">
											<div class="caption pro-sl-hd">
												<span class="caption-subject text-uppercase"><b>Danh
														sách chương</b></span>

											</div>
										</div>
										<div class="col-lg-6 col-md-6 col-sm-6 col-xs-12">
											<div class="actions graph-rp">
												<button type="button" class="btn btn-success"
													data-toggle="modal" data-target="#createChapter"
													title="Tạo chương">
													<i class="glyphicon glyphicon-plus-sign" aria-hidden="true"></i>
												</button>

											</div>
										</div>
									</div>
								</div>

								<ul class="list-group">
									<li class="list-group-item">
										<div class="portlet-title">
											<div class="row">
												<div class="col-lg-6 col-md-6 col-sm-6 col-xs-12">
													<div class="caption pro-sl-hd">

														<!--                                            ************************************************-->
														<span class="caption-subject text-uppercase"><b>Chương
																1</b></span>
														<!--                                            <span class="caption-subject text-uppercase"><b>Order Statistic</b></span>-->
													</div>
												</div>
												<div class="col-lg-6 col-md-6 col-sm-6 col-xs-12">
													<div class="actions graph-rp">
														<a href="admin_page/#"
															class="btn btn-dark-blue btn-circle active tip-top"
															data-toggle="tooltip" title="Chi tiết chương"> <!--                                            <a href="admin_page/#" class="btn btn-dark-blue btn-circle active tip-top" data-toggle="tooltip" title="Upload">-->
															<i class="glyphicon glyphicon-info-sign"
															aria-hidden="true"></i>s
														</a>
														<button type="button" class="btn btn-primary"
															data-toggle="modal" data-target="#updateChapterName"
															title="Sủa tên chương">
															<i class="glyphicon glyphicon-pencil"
																aria-pressed="false"></i>
														</button>
														<button type="button" class="btn btn-danger"
															data-toggle="modal" data-target="#deleteChapter"
															title="Xóa chương">
															<i class="fa fa-trash-o" aria-pressed="false"></i>
														</button>

														<span title="Số bài tập" class="badge">14</span>
													</div>
												</div>
											</div>
										</div>
									</li>
								</ul>
							</div>
						</div>
					</div>
				</div>
				<div class="traffic-analysis-area">
					<div class="container-fluid">
						<div class="row">
							<div class="col-lg-4 col-md-4 col-sm-4 col-xs-12"></div>
							<!--                    ///////////////////////////////////////******* SITE TRAFFIC*-->

						</div>
					</div>
				</div>

				<div class="product-sales-area mg-tb-30">
					<div class="container-fluid">
						<div class="row">
							<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12"></div>

						</div>
					</div>
				</div>
				<div class="calender-area mg-tb-30">
					<div class="container-fluid">
						<div class="row">
							<div class="col-lg-12">
								<div class="calender-inner">
									<div id='calendar'></div>
								</div>
							</div>
						</div>
					</div>
				</div>
				<%@ include file="footer.jsp"%>

			</div>
		</div>
	</div>
</body>

</html>