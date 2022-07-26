<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@page import="hotel_booking.dto.QuestionDTO"%>
<%@page import="java.util.List"%>

<!DOCTYPE html>
<html lang="en">

<head>
<link rel="stylesheet" type="text/css" href="user_page/css/test.css" />
</head>
</head>

<body>
	<%@include file="header.jsp"%>
	<div class="container py-5" id="count-down-container">
		<div class="row pt-5">
			<div class="col-lg-12" id="count-down-timer">
				<span class="fa-solid fa-clock fa-2x"></span>
				<p></p>
			</div>
		</div>
		<%
		int subjectID = (int) request.getAttribute("subjectID");

		int chapterID = (int) request.getAttribute("chapterID");
		List<QuestionDTO> questionList = (List<QuestionDTO>) request.getAttribute("questionList");
		%>
		<div class="row pt-5">
			<div class="col-lg-12" id="questions-slick">
				<%
				int index = 1;
				for (QuestionDTO question : questionList) {
				%>
				<div class="page question">
					<div class="col-lg-12 question-container">
						<div class="row">
							<div class="col-lg-12 question-number">
								<span>Câu hỏi số <%=index %></span>
							</div>
						</div>
						<div class="row">
							<div class="col-lg-12 question-content">
								<p><%=question.getContent()%></p>
							</div>
						</div>
						<div class="row">
							<div class="col-lg-12 question-answer">
								<%
								String answer = question.getAnswers();
								String[] arrayAnswer = answer.split(";");
								for (int i = 1; i < arrayAnswer.length; i++) {
								%>
								<div class="answer" onclick="answerQuestion(this)">
									<input type="radio" name="<%=question.getQuestionID()%>"
										value="<%=i%>" class="radioButton" disabled="disabled">
									<label><%=arrayAnswer[i]%></label>
								</div>
								<%
								}
								%>

							</div>
						</div>


					</div>
				</div>

				<%
				index++;
				}
				%>
			</div>

			<div class="col-lg-12" id="page-list">
				<ul class="col-lg-12">
					<li class="col-lg-1"><a id="prev"><i
							class="fa-solid fa-circle-arrow-left fa-4x"></i> </a></li>
					<li class="col-lg-1 page-number"><a>1</a></li>
					<li class="col-lg-1 page-number"><a>2</a></li>
					<li class="col-lg-1 page-number"><a>3</a></li>
					<li class="col-lg-1 page-number"><a>4</a></li>
					<li class="col-lg-1 page-number"><a>5</a></li>
					<li class="col-lg-1 page-number"><a>6</a></li>
					<li class="col-lg-1 page-number"><a>7</a></li>
					<li class="col-lg-1 page-number"><a>8</a></li>
					<li class="col-lg-1 page-number"><a>9</a></li>
					<li class="col-lg-1 page-number"><a>10</a></li>

					<li class="col-lg-1"><a id="next"> <i
							class="fa-solid fa-circle-arrow-right fa-4x"></i>
					</a></li>

				</ul>
			</div>
		</div>
		<div id="submit-button-container" class="col-lg-12 text-center">
			<button id="submit-button" data-toggle="modal"
				data-target="#submitTestModal">Nộp bài</button>
		</div>

		<!-- Modal Nộp bài-->
		<div class="modal fade" id="submitTestModal" tabindex="-1"
			role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
			<div class="modal-dialog" role="document">
				<div class="modal-content">
					<div class="modal-header">
						<h4 class="modal-title w-100 text-center">Thông báo</h4>
						<button type="button" class="close" data-dismiss="modal"
							aria-label="Close">
							<span aria-hidden="true">&times;</span>
						</button>
					</div>
					<div class="modal-body">
						<p>Bạn có chắc chắn là muốn nộp bài ?</p>
					</div>
					<div class="modal-footer">
						<button type="button" class="btn btn-secondary"
							data-dismiss="modal">Không</button>
						<button type="button" class="btn btn-primary"
							onclick="submitTest()">Có</button>
					</div>
				</div>
			</div>
		</div>
	</div>
	<%@include file="footer.jsp"%>
	<script type="text/javascript">
		var userAnswers = Array(10).fill(0); // Mảng câu trả lời của người dùng
		var questionIDArray = Array(10); // Mảng id các câu hỏi
		var chapterID =<%=chapterID%>;
		var subjectID =<%=subjectID%>;
	<%int i = 0;
	for (QuestionDTO question : questionList) {%>
		questionIDArray[<%=i%>] =<%=question.getQuestionID()%>;
	<%i++;
}%>
		
	</script>
	<script type="text/javascript" src="user_page/lib/turnjs4/turn.js"></script>
	<script type="text/javascript" src="user_page/js/test.js"></script>
</body>

</html>