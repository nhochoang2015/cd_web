package hotel_booking.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import hotel_booking.service.AccountService;

// Controller dùng cho quản lý thông tin tài khoản
@Controller
public class PersonalController {
	@Autowired
	private AccountService accountService;

	@RequestMapping("/editInformation")
	public ModelAndView editInformation(HttpServletRequest request, HttpSession session) {
		return null;
		
	}
}
