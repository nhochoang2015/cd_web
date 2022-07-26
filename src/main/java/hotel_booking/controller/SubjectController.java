package hotel_booking.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import hotel_booking.dto.AccountDTO;
import hotel_booking.dto.SubjectDTO;
import hotel_booking.service.SubjectRegisterService;
import hotel_booking.service.SubjectService;

@Controller
public class SubjectController {
	@Autowired
	private SubjectService subjectService;
	@Autowired
	private SubjectRegisterService subjectRegisterService;
	@RequestMapping("/subject-show")
	public ModelAndView subjectPage() {
		List<SubjectDTO> subjectList = subjectService.findAllSubjectwithActiveTrue();
		ModelAndView mav = new ModelAndView("../user_page/blog");
		mav.addObject("subjectList", subjectList);
		return mav;
	}
	@RequestMapping("/subject-managenment-admin")
	public ModelAndView subjectmanagePage() {
		ModelAndView mav = new ModelAndView("./admin_page/SubjectManagement");
		List<SubjectDTO> subjectList = subjectService.findAllSubject();
		mav.addObject("subjectList", subjectList);
		return mav;
	}
	@RequestMapping("/privateSubject")
	public String unactiveSubject(@RequestParam int subjectID) {
		SubjectDTO subjectDTO = subjectService.findBySubjectID(subjectID);
		int subject = subjectDTO.getSubjectID();
		subjectService.deleteSubjectByID(subject);
		return "redirect:./subject-management";
	}
	@RequestMapping("/publicSubject")
	public String activeSubject(@RequestParam int subjectID) {
		SubjectDTO subjectDTO = subjectService.findBySubjectID(subjectID);
		int subject = subjectDTO.getSubjectID();
		subjectService.restoreSubjectByID(subject);
		return "redirect:./subject-management";
	}
	
	@RequestMapping("/regist")
	public String regist(@RequestParam int subjectID, HttpSession session) {
		AccountDTO account = (AccountDTO) session.getAttribute("account");
		int accountID = account.getAccountID();
		subjectRegisterService.Regist(accountID, subjectID);
		return "redirect:./";
	}
//	@RequestMapping("/createSubject")
//	public String createSubject(@RequestParam String subjectName) {
//		subjectService.createSubject(subjectName);
//		return "redirect:../admin/subjectmanagement";
//	}
	@RequestMapping("/renameSubject")
	public String renameSubject(@RequestParam int subjectID,@RequestParam String subjectName) {
		SubjectDTO subjectDTO = subjectService.findBySubjectID(subjectID);
		int subject = subjectDTO.getSubjectID();
		subjectService.renameSubject(subject, subjectName);
		return "redirect:./subject-management";
	}
	@RequestMapping("/updateComment")
	public String updateComment(HttpSession session,@RequestParam String comment) {
		SubjectDTO subjectDTO = (SubjectDTO) session.getAttribute("subjectDTO");
		int subject = subjectDTO.getSubjectID();
		subjectService.updateComment(subject, comment);
		return "redirect:./subject-management";
	}
	@RequestMapping("/updatePrice")
	public String updatePrice(HttpSession session,@RequestParam int price) {
		SubjectDTO subjectDTO = (SubjectDTO) session.getAttribute("subjectDTO");
		int subject = subjectDTO.getSubjectID();
		subjectService.updatePrice(subject, price);
		return "./user_page/subjectManagement";
	}
	@RequestMapping("/updateWeekday")
	public String updateWeekday(HttpSession session,@RequestParam String weekday) {
		SubjectDTO subjectDTO = (SubjectDTO) session.getAttribute("subjectDTO");
		int subject = subjectDTO.getSubjectID();
		subjectService.updateWeekday(subject, weekday);
		return "./user_page/subjectManagement";
	}
	@RequestMapping("/updateTime")
	public String updateTime(HttpSession session,@RequestParam String time) {
		SubjectDTO subjectDTO = (SubjectDTO) session.getAttribute("subjectDTO");
		int subject = subjectDTO.getSubjectID();
		subjectService.updateWeekday(subject, time);
		return "./user_page/subjectManagement";
	}
	@RequestMapping("/updateStudentCount")
	public String updateStudentCount(HttpSession session,@RequestParam int studentCount) {
		SubjectDTO subjectDTO = (SubjectDTO) session.getAttribute("subjectDTO");
		int subject = subjectDTO.getSubjectID();
		subjectService.updateStudentCount(subject, studentCount);
		return "redirect:../subject-management";
	}
	
//@PostMapping("/addSubject")
//public String addNewSubject(@RequestParam int SubjectID, @RequestParam String SubjectName,
//		 @RequestParam boolean active) {
//	SubjectDTO subjectDTO = new SubjectDTO(SubjectID, SubjectName, true, null);
//	subjectService.addNewSubject(subjectDTO);
//	
//	return "redirect: ./accountManagement";
//}

}
