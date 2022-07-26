package hotel_booking.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.FilenameUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import hotel_booking.dto.LessonDTO;
import hotel_booking.dto.QuestionDTO;
import hotel_booking.service.LessonService;
import hotel_booking.service.QuestionService;

@Controller
@RequestMapping("/admin")
public class QuestionManagementController {

	@Autowired
	LessonService lessonService;
	@Autowired
	QuestionService questionService;
//
//	// Trang quản lý câu hỏi
//	@RequestMapping("/questionManagement")
//	public ModelAndView questionManagementPage(@RequestParam int lessonID) {
//		ModelAndView mav = new ModelAndView("../admin_page/question-management");
//		LessonDTO lesson = lessonService.findByLessonID(lessonID);
//		mav.addObject("lesson", lesson);
//		return mav;
//
//	}

//	@PostMapping("/updateQuestion")
//	public @ResponseBody String updateQuestion(@RequestParam int questionID, @RequestParam String content,
//			@RequestParam String explain, @RequestParam String answers) {
//		QuestionDTO question = questionService.findByQuestionID(questionID);
//		question.setAnswers(answers);
//		question.setContent(content);
//		question.setExplain(explain);
//		try {
//			questionService.save(question);
//		} catch (IllegalArgumentException e) {
//			e.printStackTrace();
//			return "false;";
//		}
//		return "true";
//	}

	@PostMapping("/questionImageUpload")
	public @ResponseBody String uploadImage(@RequestPart MultipartFile upload, HttpServletRequest requests,
			HttpServletResponse response) throws IllegalStateException, IOException {
		String imageFolderPath = requests.getServletContext().getRealPath("/question_image");
		System.out.println(imageFolderPath);
		String fileName = upload.getOriginalFilename();
		String fileNameWithoutExtension = FilenameUtils.removeExtension(fileName);
		String fileExtension = FilenameUtils.getExtension(fileName);

		File image = new File(imageFolderPath, fileName);
		if (image.exists()) {
			int index = 1;
			while (image.exists()) {
				image = new File(imageFolderPath, fileNameWithoutExtension + "_" + index + "." + fileExtension);
				index += 1;
			}
		} else {
			image.createNewFile();
		}
		FileOutputStream fot = new FileOutputStream(image);
		fot.write(upload.getBytes());
		fot.flush();
		fot.close();
		String url = "/elementary_web/question_image/" + image.getName();
		return url;

	}

}
