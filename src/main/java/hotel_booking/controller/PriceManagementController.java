package hotel_booking.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import hotel_booking.dto.RoomDTO;
import hotel_booking.dto.PriceDTO;
import hotel_booking.service.RoomService;
import hotel_booking.service.PriceService;

@Controller
@RequestMapping("/admin")
public class PriceManagementController {
	@Autowired
	PriceService lessonService;
	@Autowired
	RoomService chapterService;

//	@RequestMapping("/lessonManagement")
//	public ModelAndView lessonManagementPage(@RequestParam int chapterID) {
//		ModelAndView mav = new ModelAndView("../admin_page/lesson-management");
//		ChapterDTO chapter = chapterService.findByChapterID(chapterID);
//		mav.addObject("chapter", chapter);
//		return mav;
//
//	}

//	@RequestMapping("/editLessonPage")
//	public ModelAndView editLessonPage(@RequestParam int chapterID, @RequestParam int lessonID) {
//		ModelAndView mav = new ModelAndView("../admin_page/edit-lesson");
//		LessonDTO lesson = lessonService.findByLessonID(lessonID);
//		List<LessonDTO> lessonList = lessonService.findLessonsByChapterID(chapterID);
//		mav.addObject("lesson", lesson);
//		mav.addObject("lessonList", lessonList);
//		mav.addObject("chapterID", chapterID);
//
//		return mav;
//
//	}

//	@PostMapping("/addLesson")
//	public String addLesson(@RequestParam int chapterID, @RequestParam String lessonName,
//			@RequestParam Integer lessonBeforeID, @RequestParam int score) {
//
//		LessonDTO newLesson = new LessonDTO(lessonName, chapterID, lessonBeforeID, score, false);
//		int newLessonID = lessonService.save(newLesson);
//		for (int i = 0; i < 10; i++) {
//			QuestionDTO newQuestion = new QuestionDTO(lessonName, newLessonID, "1;0;0;0;0", "");
//			questionService.save(newQuestion);
//		}
//
//		return "redirect:../admin/lessonManagement?chapterID=" + chapterID;
//
//	}

//	@PostMapping("/editLesson")
//	public String editLesson(@RequestParam int lessonID, @RequestParam int chapterID, @RequestParam String lessonName,
//			@RequestParam Integer lessonBeforeID, @RequestParam int score,
//			@RequestParam(required = false) boolean active) {
//
//		LessonDTO newLesson = new LessonDTO(lessonID, lessonName, chapterID, lessonBeforeID, score, active);
//		lessonService.save(newLesson);
//		return "redirect:../admin/lessonManagement?chapterID=" + chapterID;
//
//	}

}
