package hotel_booking.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import hotel_booking.dto.RoomDTO;
import hotel_booking.dto.AccountDTO;
import hotel_booking.dto.HotelDTO;
import hotel_booking.dto.LocationDTO;
import hotel_booking.service.RoomService;
import hotel_booking.service.AccountService;
import hotel_booking.service.HotelService;
import hotel_booking.service.LocationService;

@Controller
@RequestMapping("/admin")
public class RoomController {
	@Autowired
	private RoomService roomService;
	@Autowired
	private HotelService hotelService;
	@Autowired
	private AccountService accountService;
	@Autowired
	private LocationService locationService;
	@GetMapping("/account-Management")
	public ModelAndView AdminPage() {
		ModelAndView mav = new ModelAndView("../admin_page/account-management");
		List<AccountDTO> accountDTOList = accountService.findAllAccount();
		mav.addObject("accountDTOList",accountDTOList);
		return mav;
	}
	@GetMapping("/location-Management")
	public ModelAndView LocationPage() {
		ModelAndView mav = new ModelAndView("../admin_page/locationManagement");
		List<LocationDTO> locationDTOList = locationService.findAllLocation();
		mav.addObject("locationDTOList",locationDTOList);
		return mav;
	}
	
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
