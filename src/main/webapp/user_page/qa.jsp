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
			<li class="breadcrumb-item active" aria-current="page">Q&A</li>
		</ol>
	</nav>
	<div id="accordion">
		<div class="card">
			<div class="card-header" id="headingOne">
				<h5 class="mb-0">
					<button class="btn btn-link" data-toggle="collapse"
						data-target="#collapseOne" aria-expanded="true"
						aria-controls="collapseOne">Làm sao để liên lạc admin.</button>
				</h5>
			</div>

			<div id="collapseOne" class="collapse show"
				aria-labelledby="headingOne" data-parent="#accordion">
				<div class="card-body">Mọi thắc mắc hoặc yêu cầu xin mọi người
					liên hệ admin theo gmail: nguyencaohoang7422@gmai.com. Chúc các bạn
					có trải nghiệm tốt ở trang web chúng tôi.</div>
			</div>
		</div>
		<div class="card">
			<div class="card-header" id="headingTwo">
				<h5 class="mb-0">
					<button class="btn btn-link collapsed" data-toggle="collapse"
						data-target="#collapseTwo" aria-expanded="false"
						aria-controls="collapseTwo">Collapsible Group Item #2</button>
				</h5>
			</div>
			<div id="collapseTwo" class="collapse" aria-labelledby="headingTwo"
				data-parent="#accordion">
				<div class="card-body">Anim pariatur cliche reprehenderit,
					enim eiusmod high life accusamus terry richardson ad squid. 3 wolf
					moon officia aute, non cupidatat skateboard dolor brunch. Food
					truck quinoa nesciunt laborum eiusmod. Brunch 3 wolf moon tempor,
					sunt aliqua put a bird on it squid single-origin coffee nulla
					assumenda shoreditch et. Nihil anim keffiyeh helvetica, craft beer
					labore wes anderson cred nesciunt sapiente ea proident. Ad vegan
					excepteur butcher vice lomo. Leggings occaecat craft beer
					farm-to-table, raw denim aesthetic synth nesciunt you probably
					haven't heard of them accusamus labore sustainable VHS.</div>
			</div>
		</div>
		<div class="card">
			<div class="card-header" id="headingThree">
				<h5 class="mb-0">
					<button class="btn btn-link collapsed" data-toggle="collapse"
						data-target="#collapseThree" aria-expanded="false"
						aria-controls="collapseThree">Collapsible Group Item #3</button>
				</h5>
			</div>
			<div id="collapseThree" class="collapse"
				aria-labelledby="headingThree" data-parent="#accordion">
				<div class="card-body">Anim pariatur cliche reprehenderit,
					enim eiusmod high life accusamus terry richardson ad squid. 3 wolf
					moon officia aute, non cupidatat skateboard dolor brunch. Food
					truck quinoa nesciunt laborum eiusmod. Brunch 3 wolf moon tempor,
					sunt aliqua put a bird on it squid single-origin coffee nulla
					assumenda shoreditch et. Nihil anim keffiyeh helvetica, craft beer
					labore wes anderson cred nesciunt sapiente ea proident. Ad vegan
					excepteur butcher vice lomo. Leggings occaecat craft beer
					farm-to-table, raw denim aesthetic synth nesciunt you probably
					haven't heard of them accusamus labore sustainable VHS.</div>
			</div>
		</div>
	</div>



	<%@include file="footer.jsp"%>
</body>

</html>