package hotel_booking.controller;

import java.util.ArrayList;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import hotel_booking.dto.AccountDTO;
import hotel_booking.dto.RoomDTO;
import hotel_booking.dto.PriceDTO;
import hotel_booking.service.AccountService;
import hotel_booking.service.RoomService;

@Controller
public class TestController {

	@Autowired
	AccountService accountService;
	@Autowired
	RoomService chapterService;
//	@PostMapping("/checkTestAnswer")
//	public @ResponseBody String checkAnswer(HttpSession session, @RequestParam int questionID,
//			@RequestParam int userAnswer) {
//		QuestionDTO question = questionService.findByQuestionID(questionID);
//		String answer = question.getAnswers();
//		String[] answersArray = answer.split(";");
//		int correctAnswer = Integer.parseInt(answersArray[0]);
//		if (correctAnswer == userAnswer)
//			return "true";
//		return "false";
//
//	}

//	@PostMapping(value = "/submitTestResult")
//	public @ResponseBody String submitTestResult(@RequestParam(value = "userAnswers[]") Integer[] userAnswers,
//			@RequestParam(value = "questionIDArray[]") Integer[] questionIDArray, HttpSession session,
//			@RequestParam int chapterID) {
//		int correctAnswers = 0;
//		for (int i = 0; i < questionIDArray.length; i++) {
//			QuestionDTO question = questionService.findByQuestionID(questionIDArray[i]);
//			int correctAnswer = Integer.parseInt(question.getAnswers().split(";")[0]);
//			int userAnswer = userAnswers[i];
//			if (correctAnswer == userAnswer) {
//				correctAnswers++;
//			}
//		}
//		ChapterDTO chapter = chapterService.findByChapterID(chapterID);
//		int chapterScore = chapter.getScore();
//		int userScore = Math.round((chapterScore / 10) * correctAnswers);
//		AccountDTO account = (AccountDTO) session.getAttribute("account");
//		account.addCoin(userScore);
//		account.addMonthlyPoint(userScore);
//		account.addWeeklyPoint(userScore);
//		accountService.updateAccount(account);
//		return "" + correctAnswers;
//	}


}