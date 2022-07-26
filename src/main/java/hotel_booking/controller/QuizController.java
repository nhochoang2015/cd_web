package hotel_booking.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import hotel_booking.dto.AccountDTO;
import hotel_booking.dto.LessonDTO;
import hotel_booking.entity.LessonComplete;
import hotel_booking.service.AccountService;
import hotel_booking.service.LessonCompleteService;

@Controller
public class QuizController {
	@Autowired
	AccountService accountService;
	@Autowired
	LessonCompleteService lessonCompleteService;

//	@PostMapping("/updateLessonProcress")
//	public @ResponseBody void updateProgress(HttpSession session, @RequestParam int lessonID,
//			@RequestParam int numberOfRightAnswer) {
//		String lessonString = "lesson" + lessonID;
//		LessonDTO lesson = (LessonDTO) session.getAttribute(lessonString);
//		int reward = Math.round((lesson.getScore() / 10) * numberOfRightAnswer);
//		AccountDTO account = (AccountDTO) session.getAttribute("account");
//		lessonCompleteService.updateProcess(account.getAccountID(), lessonID);
//		account.setCoin(account.getCoin() + reward);
//		accountService.updateAccount(account);
//		session.removeAttribute(lessonString);
//	}
//
//	@PostMapping("/checkQuizAnswer")
//	public @ResponseBody String checkAnswer(HttpSession session, @RequestParam int lessonID,
//			@RequestParam int questionNumber, @RequestParam int userAnswer) {
//		LessonDTO lesson = (LessonDTO) session.getAttribute("lesson" + lessonID);
//		ArrayList<String> correctAnswerArray = lesson.getCorrectAnswerArray();
//		int correctAnswer = Integer.parseInt(correctAnswerArray.get(questionNumber - 1));
//		if (correctAnswer == userAnswer)
//			return "true:" + correctAnswer + ":" + lesson.getExplain(questionNumber);
//		return "false:" + correctAnswer + ":" + lesson.getExplain(questionNumber);
//
//	}

}
