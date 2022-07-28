<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@page import="hotel_booking.dto.PriceDTO"%>
<%@page import="hotel_booking.dto.QuestionDTO"%>

<!DOCTYPE html>
<html lang="en">

<head>
<link rel="stylesheet" type="text/css" href="user_page/css/quiz.css" />
</head>
</head>

<body>
	<%@include file="header.jsp"%>
	<div class="container py-5">
		<div class="row pt-5">
			<div class="col-lg-12" id="flipbook">
				<div class="hard"></div>
				<%
				String lessonString = "lesson" + request.getAttribute("lessonID");
						int subjectID = (int) request.getAttribute("subjectID");
						PriceDTO lesson = (PriceDTO) session.getAttribute(lessonString);
						ArrayList<QuestionDTO> questionList = (ArrayList<QuestionDTO>) lesson.getQuestionList();
						int index = 1;
						for (QuestionDTO question : questionList) {
				%>
				<div class="page question">
					<div class="col-lg-12 question-container">
						<div class="row">
							<div class="col-lg-12 question-number">
								<span>Câu hỏi số <%=index%></span>
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
									<input type="radio" name="<%=index%>" value="<%=i%>"
										class="radioButton" disabled="disabled"> <label><%=arrayAnswer[i]%></label>
								</div>
								<%
								}
								%>


							</div>
						</div>


					</div>
				</div>
				<div class="page explain">
					<div class="col-lg-12 explain-container">
						<div class="row">
							<div class="col-lg-12 explain-title">
								<span>Giải thích</span>
							</div>
						</div>
						<div class="row">
							<div id="ex_<%=index%>" class="col-lg-12 explain-content"
								hidden="true">
								<p></p>
							</div>
						</div>

					</div>
				</div>

				<%
				index++;
				}
				%>
				<div class="hard"></div>
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

			<div id="back-button-container" class="col-lg-12" hidden="true">
				<button onclick="location.href = './'">Trang chủ</button>
				<button
					onclick="location.href = './subject-details?subjectID=<%=subjectID%>';">Chi
					tiết môn học</button>
			</div>
		</div>

	</div>
	<%
	ArrayList<String> correctArrayAnswer = lesson.getCorrectAnswerArray();
	%>

	<script type="text/javascript">
		var lessonID =
	<%=lesson.getLessonID()%>
		;
		var lessonScore =
	<%=lesson.getScore()%>
		;
	</script>
	<%@include file="footer.jsp"%>

	<script type="text/javascript" src="user_page/lib/turnjs4/turn.js"></script>
	<script type="text/javascript" src="user_page/js/quiz.js"></script>
</body>

</html>