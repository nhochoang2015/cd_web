package hotel_booking.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import hotel_booking.dto.RoomDTO;
import hotel_booking.dto.HotelDTO;
import hotel_booking.service.RoomService;
import hotel_booking.service.HotelService;

@Controller
@RequestMapping("/admin")
public class RoomController {
	@Autowired
	private RoomService chapterService;
	@Autowired
	private HotelService subjectService;
	
//	@RequestMapping("/chapter")
//	public ModelAndView chapterPage(@RequestParam int subjectID) {
//		SubjectDTO subject = subjectService.findBySubjectID(subjectID);
//		List<ChapterDTO> chapterList = subject.getChapterList();
//		ModelAndView mav = new ModelAndView("../admin_page/Chapter");
//		mav.addObject("chapterList", chapterList);
//		return mav;
//	}

//	@RequestMapping("/unactiveChapter")
//	public String unactiveChapter(@RequestParam int chapterID) {
//		chapterService.deleteChapterbyID(chapterID);
//		return "redirect:../admin/chapter";
//	}
//
//	@RequestMapping("/createChapter")
//	public String createChapter(@RequestParam String chapterName,@RequestParam int subjectID) {
//		chapterService.createChapter(chapterName, subjectID);
//		return "redirect: ../admin/chapter?subjectID="+subjectID;
//	}
//
//	@RequestMapping("/renameChapter")
//	public String renameChapter(@RequestParam int chapterID, @RequestParam String chaptertName) {
//		chapterService.renameChapter(chapterID, chaptertName);
//		return "redirect:../admin/chapter";
//	}
//
//	@RequestMapping("/activeChapter")
//	public String activeChapter(@RequestParam int chapterID) {
//		chapterService.restoreChapterbyID(chapterID);
//		return "redirect:../admin/chapter";
//	}
}
