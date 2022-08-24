package hotel_booking.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import hotel_booking.dto.AccountDTO;
import hotel_booking.dto.HotelDTO;
import hotel_booking.dto.LocationDTO;
import hotel_booking.dto.RoomDTO;
import hotel_booking.service.RoomRegisterService;
import hotel_booking.service.RoomService;
import hotel_booking.service.HotelService;
import hotel_booking.service.LocationService;

import org.springframework.util.StringUtils;
@Controller
public class HotelController {
	@Autowired
	private HotelService hotelService;
	@Autowired
	private RoomRegisterService subjectRegisterService;
	@Autowired
	private LocationService locationService;
	@Autowired
	private RoomService roomService;
	
	
	@RequestMapping("/search")
	public ModelAndView searchLocation(@RequestParam int locationID){
		List<HotelDTO> hotelDTOList = hotelService.findAllHotelByLocationID(locationID);
		ModelAndView mav = new ModelAndView("./user_page/search");	
		mav.addObject("hotelDTOList", hotelDTOList);
		return mav;
	}
	@GetMapping("/hotel")
	public ModelAndView hotelPage(@RequestParam int hotelID) {
		HotelDTO hotelDTO = hotelService.findHotelByID(hotelID);
		List<RoomDTO> roomDTOList = roomService.findAllRoomByID(hotelID);
		ModelAndView mav = new ModelAndView("./user_page/hotel");
		mav.addObject("hotelDTO", hotelDTO);
		mav.addObject("roomDTOList", roomDTOList);
		return mav;
	}
	
	
	
	@GetMapping("/room")
	public ModelAndView roomPage(@RequestParam int roomID ) {
		RoomDTO roomDTO = roomService.findEntityByRoomID(roomID);
		ModelAndView mav = new ModelAndView("./user_page/room");
		mav.addObject("roomDTO", roomDTO);
		return mav;
	}
	
	
	
//	@RequestMapping("/subject-show")
//	public ModelAndView subjectPage() {
//		List<HotelDTO> subjectList = subjectService.findAllSubjectwithActiveTrue();
//		ModelAndView mav = new ModelAndView("../user_page/blog");
//		mav.addObject("subjectList", subjectList);
//		return mav;
	
//	}
//	@RequestMapping("/subject-managenment-admin")
//	public ModelAndView subjectmanagePage() {
//		ModelAndView mav = new ModelAndView("./admin_page/SubjectManagement");
//		List<HotelDTO> subjectList = subjectService.findAllSubject();
//		mav.addObject("subjectList", subjectList);
//		return mav;
//	}
//	@RequestMapping("/privateSubject")
//	public String unactiveSubject(@RequestParam int subjectID) {
//		HotelDTO subjectDTO = subjectService.findBySubjectID(subjectID);
//		int subject = subjectDTO.getSubjectID();
//		subjectService.deleteSubjectByID(subject);
//		return "redirect:./subject-management";
//	}
//	@RequestMapping("/publicSubject")
//	public String activeSubject(@RequestParam int subjectID) {
//		HotelDTO subjectDTO = subjectService.findBySubjectID(subjectID);
//		int subject = subjectDTO.getSubjectID();
//		subjectService.restoreSubjectByID(subject);
//		return "redirect:./subject-management";
//	}
//	
//	@RequestMapping("/regist")
//	public String regist(@RequestParam int subjectID, HttpSession session) {
//		AccountDTO account = (AccountDTO) session.getAttribute("account");
//		int accountID = account.getAccountID();
//		subjectRegisterService.Regist(accountID, subjectID);
//		return "redirect:./";
//	}
//	@RequestMapping("/createSubject")
//	public String createSubject(@RequestParam String subjectName) {
//		subjectService.createSubject(subjectName);
//		return "redirect:../admin/subjectmanagement";
//	}
//	@RequestMapping("/renameSubject")
//	public String renameSubject(@RequestParam int subjectID,@RequestParam String subjectName) {
//		HotelDTO subjectDTO = subjectService.findBySubjectID(subjectID);
//		int subject = subjectDTO.getSubjectID();
//		subjectService.renameSubject(subject, subjectName);
//		return "redirect:./subject-management";
//	}
//	@RequestMapping("/updateComment")
//	public String updateComment(HttpSession session,@RequestParam String comment) {
//		HotelDTO subjectDTO = (HotelDTO) session.getAttribute("subjectDTO");
//		int subject = subjectDTO.getSubjectID();
//		subjectService.updateComment(subject, comment);
//		return "redirect:./subject-management";
//	}
//	@RequestMapping("/updatePrice")
//	public String updatePrice(HttpSession session,@RequestParam int price) {
//		HotelDTO subjectDTO = (HotelDTO) session.getAttribute("subjectDTO");
//		int subject = subjectDTO.getSubjectID();
//		subjectService.updatePrice(subject, price);
//		return "./user_page/subjectManagement";
//	}
//	@RequestMapping("/updateWeekday")
//	public String updateWeekday(HttpSession session,@RequestParam String weekday) {
//		HotelDTO subjectDTO = (HotelDTO) session.getAttribute("subjectDTO");
//		int subject = subjectDTO.getSubjectID();
//		subjectService.updateWeekday(subject, weekday);
//		return "./user_page/subjectManagement";
//	}
//	@RequestMapping("/updateTime")
//	public String updateTime(HttpSession session,@RequestParam String time) {
//		HotelDTO subjectDTO = (HotelDTO) session.getAttribute("subjectDTO");
//		int subject = subjectDTO.getSubjectID();
//		subjectService.updateWeekday(subject, time);
//		return "./user_page/subjectManagement";
//	}
//	@RequestMapping("/updateStudentCount")
//	public String updateStudentCount(HttpSession session,@RequestParam int studentCount) {
//		HotelDTO subjectDTO = (HotelDTO) session.getAttribute("subjectDTO");
//		int subject = subjectDTO.getSubjectID();
//		subjectService.updateStudentCount(subject, studentCount);
//		return "redirect:../subject-management";
//	}
	
//@PostMapping("/addSubject")
//public String addNewSubject(@RequestParam int SubjectID, @RequestParam String SubjectName,
//		 @RequestParam boolean active) {
//	SubjectDTO subjectDTO = new SubjectDTO(SubjectID, SubjectName, true, null);
//	subjectService.addNewSubject(subjectDTO);
//	
//	return "redirect: ./accountManagement";
//}

}
