package hotel_booking.controller;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.util.StringUtils;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import hotel_booking.dto.AccountDTO;
import hotel_booking.dto.RoomDTO;
import hotel_booking.dto.PriceDTO;
import hotel_booking.dto.NotificationDTO;
import hotel_booking.dto.HotelDTO;
import hotel_booking.dto.LocationDTO;
import hotel_booking.entity.Account;
import hotel_booking.entity.Hotel;
import hotel_booking.sendmail.EmailSendService;
import hotel_booking.service.AccountService;
import hotel_booking.service.RoomService;
import hotel_booking.service.PriceService;
import hotel_booking.service.NotificationService;
import hotel_booking.service.HotelService;
import hotel_booking.service.LocationService;

@Controller
public class UserController {
	@Autowired
	private HotelService subjectService;
	@Autowired
	private PriceService lessonService;
	@Autowired
	private RoomService chapterService;
	@Autowired
	private NotificationService notificationService;
	@Autowired
	private EmailSendService emailSendService;
	@Autowired
	private AccountService accountService;
	@Autowired
	private AccountController accountController;
	@Autowired
	private LocationService locationService;

	@RequestMapping("/")
	public ModelAndView homePage(@RequestParam(name = "locationName", required = false) String locationName) {
		ModelAndView mav = new ModelAndView("user_page/index");
		List<LocationDTO> locationDTOList = new ArrayList<LocationDTO>();
		if (StringUtils.hasText(locationName)) {
			 locationDTOList = locationService.findAllByLocationName(locationName);
		} else  {
			 locationDTOList = locationService.findAllLocation();
		}
		mav.addObject("locationDTOList", locationDTOList);
		return mav;
	}
	@RequestMapping("/searchLocation")
	public @ResponseBody List<LocationDTO> searchLocation(@RequestParam(name = "locationName", required = false) String locationName) {
		List<LocationDTO> locationDTOList = new ArrayList<LocationDTO>();
		if (StringUtils.hasText(locationName)) {
			 locationDTOList = locationService.findAllByLocationName(locationName);
		} else  {
			 locationDTOList = locationService.findAllLocation();
			
		}
		return locationDTOList;
	}
	
	@RequestMapping("/account")
	public ModelAndView accountPage(@RequestParam int accountID) {
		ModelAndView mav = new ModelAndView("/user_page/AccountManagement");
		AccountDTO account = accountService.findDTOByAccountID(accountID);
		mav.addObject("account", account);
		return mav;
	}

	@RequestMapping("/notificationPage")
	public ModelAndView notifiactionPage(@RequestParam int notificationID) {
		ModelAndView mav = new ModelAndView("./user_page/NotificationPage");
		NotificationDTO note = notificationService.findNotificationByID(notificationID);
		mav.addObject("note", note);
		return mav;
	}

	@PostMapping("/varity-mail")
	public String validateMail(@RequestParam int validateCode, @RequestParam int accountID, HttpSession session) {
		AccountDTO accountDTO = accountService.findDTOByAccountID(accountID);
		int accountcID = accountDTO.getAccountID();
		String username = accountDTO.getAccountName();
		String pass = accountDTO.getPassword();
		accountService.validateEmail(accountcID, validateCode);

		try {
			session.setAttribute("account", accountDTO);
			accountController.handleLogin(username, pass, session);
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		ModelAndView mav = new ModelAndView("/user_page/index");
		mav.addObject("account", accountDTO);
		return "redirect:./";
	}

	@GetMapping("/create-subject")
	public String createSubjectPage(Model model) {
		return "./user_page/createSubject";
	}

	@PostMapping("/changePass")
	public String changPass(@RequestParam String pass, HttpSession session) {
		System.out.println("0");
		AccountDTO account = (AccountDTO) session.getAttribute("account");
		System.out.println("2");
		int accountID = account.getAccountID();
		System.out.println("3");
		accountService.changePass(accountID, pass);
		System.out.println("4");
		return "./";
	}

//	@PostMapping("/create-newSubject")
//	public String createNewSubject(HttpSession session, @RequestParam String subjectName, @RequestParam String comment,
//			@RequestParam int studentCount, @RequestParam String weekday, @RequestParam String time,
//			@RequestParam int price) {
//		AccountDTO account = (AccountDTO) session.getAttribute("account");
//		int accountID = account.getAccountID();
//		subjectService.createSubjectByAccountID(subjectName, studentCount, weekday, time, price, comment, accountID);
//		return "./user_page/createSubject";
//	}

//	@RequestMapping("/subject-management")
//	public ModelAndView subjectPage(HttpSession session) {
//		AccountDTO account = (AccountDTO) session.getAttribute("account");
//		int accountID = account.getAccountID();
//		List<HotelDTO> subjectList = subjectService.findAllSubjectbyAccountID(accountID);
//		ModelAndView mav = new ModelAndView("./user_page/subjectManagement");
//		mav.addObject("subjectList", subjectList);
//		return mav;
//	}

	@GetMapping("/about")
	public String aboutPage(Model model) {
		return "./user_page/about";
	}

	@GetMapping("/infomation")
	public ModelAndView infoPage(@RequestParam int accountID) {
		AccountDTO accountDTO = accountService.findDTOByAccountID(accountID);
		ModelAndView mav = new ModelAndView("./user_page/infomation");
		mav.addObject("accountDTO", accountDTO);
		return mav;
	}

//	@GetMapping("/subject-details")
//	public ModelAndView subjetDetailPage(@RequestParam int subjectID) {
//		HotelDTO subject = subjectService.findBySubjectID(subjectID);
//		ModelAndView mav = new ModelAndView("./user_page/subject-details");
//		mav.addObject("subject", subject);
//		return mav;
//	}

	@GetMapping("/class")
	public String classPage(Model model) {
		return "./user_page/class";
	}

	@GetMapping("/contact")
	public String contactPage(Model model) {
		return "./user_page/contact";
	}

	@GetMapping("/q&a")
	public String qaPage(Model model) {
		return "./user_page/qa";
	}

	@GetMapping("/gallery")
	public String galleryPage(Model model) {
		return "./user_page/gallery";
	}

	@GetMapping("/single")
	public String singlePage(Model model) {
		return "./user_page/single";
	}

	@GetMapping("/team")
	public String homepage(Model model) {
		return "./user_page/team";
	}

//	@RequestMapping("/quiz")
//	public ModelAndView quizPage(@RequestParam int lessonID, @RequestParam int subjectID, HttpSession session) {
//		ModelAndView mav = new ModelAndView("user_page/quiz");
//		AccountDTO account = (AccountDTO) session.getAttribute("account");
//		int accountID = account.getAccountID();
//		LessonDTO lesson = lessonService.findByLessonID(lessonID);
//		if (lessonCompleteService.checkIfLessonBeforeComplete(accountID, lessonID)) {
//			session.setAttribute("lesson" + lesson.getLessonID(), lesson);
//			mav.addObject("lessonID", lesson.getLessonID());
//			mav.addObject("subjectID", subjectID);
//		} else {
//			mav = new ModelAndView("redirect:./subject-details?subjectID=" + subjectID);
//			mav.addObject("lessonID", lesson.getLessonBeforeID());
//		}
//
//		return mav;
//	}

//	@RequestMapping("/test")
//	public ModelAndView testPage(@RequestParam int chapterID, HttpSession session) {
//		ModelAndView mav = new ModelAndView("user_page/test");
//		AccountDTO account = (AccountDTO) session.getAttribute("account");
//		ChapterDTO chapter = chapterService.findByChapterID(chapterID);
//		boolean isChapterComplete = chapter
//				.isChapterComplete(lessonCompleteService.findByAccountID(account.getAccountID()));
//		// Kiểm tra xem tất cả bài học trong chương hoàn thành chưa
//		int subjectID = chapter.getSubjectID();
//		if (isChapterComplete) {
//			List<QuestionDTO> questionList = testService.getRandomQuestion(chapterID);
//			mav.addObject("questionList", questionList);
//			mav.addObject("chapterID", chapter.getChapterID());
//			mav.addObject("subjectID", subjectID);
//		} else {
//			// Nếu chưa hoàn thành thì chuyển về trang chi tiết môn học
//			mav = new ModelAndView("redirect:./subject-details?subjectID=" + subjectID);
//		}
//		return mav;
//	}

	@GetMapping("/weekly-ranking")
	public String weeklyRankingPage(Model model) {
		return "./user_page/weekly-ranking";

	}

//	@GetMapping("/subject-details")
//	public ModelAndView subjectDetailsPage(@RequestParam int subjectID, HttpSession session, HttpServletRequest request)
//			throws UnsupportedEncodingException {
//		String lessonIDString = (String) request.getParameter("lessonID");
//		System.out.println("LessonString: " + lessonIDString);
//		SubjectDTO subjectDTO = subjectService.findBySubjectID(subjectID);
//		AccountDTO account = (AccountDTO) session.getAttribute("account");
//		ModelAndView mav = new ModelAndView("user_page/subject-details");
//		mav.addObject("subject", subjectDTO);
//		if (account != null) {
//			int accountID = account.getAccountID();
//			List<LessonCompleteDTO> lessonCompleteDTOList = lessonCompleteService.findByAccountID(accountID);
//			mav.addObject("lessonCompleteList", lessonCompleteDTOList);
//			if (lessonIDString != null) {
//				System.out.println("CODE IS HERE");
//				int lessonID = Integer.parseInt(lessonIDString);
//				LessonDTO lessonBefore = lessonService.findByLessonID(lessonID);
//				mav.addObject("notify",
//						"Bạn chưa thể tham gia bài học này vì " + lessonBefore.getLessonName() + " chưa hoàn thành.");
//			}
//		}
//		return mav;
//	}

	@GetMapping("/mission")
	public String mission(Model model) {
		return "./user_page/mission";
	}

//	@GetMapping("/search")
//	public String searchPage(Model model) {
//		return "./user_page/search";
//		Vậy là đúng rồi. Request của ông được chuyển đến cái này nên code ông đúng nó cũng không in ra gì
//	}

	@GetMapping("/personal")
	public String personalInformationManagement(Model model) {
		return "./user_page/personal-information-management";
	}

	@GetMapping("/change-pass")
	public String changePass(Model model) {
		return "./user_page/change-password";
	}

	@RequestMapping("/login")
	public ModelAndView loginPage(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView("user_page/login");
		String status = request.getParameter("loginStatus");
		if (status != null && status.equals("fail")) {
			mav.addObject("loginStatus", "fail");
			return mav;
		}
		return mav;
	}

	@RequestMapping("/signup2")
	public ModelAndView signupPage2(@RequestParam int accountID) {
		AccountDTO account = accountService.findDTOByAccountID(accountID);
		ModelAndView mav = new ModelAndView("/user_page/signup2");
		mav.addObject("account", account);
		return mav;
	}

	@RequestMapping("/signup")
	public String signupPage(Model model) {
		return "./user_page/signup";
	}

	@PostMapping("/SignUp")
	public String signUp(@RequestParam String Username, @RequestParam String pass, @RequestParam String Nickname,
			@RequestParam String Email, @RequestParam String Phonenumber,
			@Validated @ModelAttribute("account") AccountDTO accountDTO, BindingResult rs) throws Exception {
		if (rs.hasErrors()) {
			return "redirect./signup";
		}
		Account account = accountService.registerAccount(Username, pass, Nickname, Email, Phonenumber);
		emailSendService.sendMail(Email, "GỬI MÃ XÁC NHẬN", "Mã xác nhận của bạn là " + account.getValidateCode());
		int accountid = account.getAccountID();
		return "redirect:./signup2?accountID=" + accountid;
	}

	@RequestMapping("/forgotpassword")
	public String forgotPassPage(Model model) {
		return "./user_page/forgotpassword";
	}

	@RequestMapping("/accessDenied")
	public String accessDeniedPage(Model model) {
		return "./user_page/accessDenied";
	}

}
