package hotel_booking.controller;

import java.security.NoSuchAlgorithmException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import hotel_booking.Utility;
import hotel_booking.dto.AccountDTO;
import hotel_booking.entity.Account;
import hotel_booking.service.AccountService;

@Controller
public class AccountController {
	@Autowired
	private AccountService accountService ;

	@PostMapping("/handleLogin")
	public String handleLogin(@RequestParam("username") String username, @RequestParam("password") String password,
			HttpSession session) throws NoSuchAlgorithmException {
		AccountDTO accountDTO = accountService.findAccountByEmailOrUserOrPhoneNumber(username);
		if (accountDTO == null) {
			return "redirect:./login?loginStatus=fail";
		} else {
			if (!accountDTO.getPassword().equals(Utility.convertToMD5(password))) {
				return "redirect:./login?loginStatus=fail";
			} else {
				session.setAttribute("account", accountDTO);
				return "redirect:./";
			}
		}

	}

	@RequestMapping("/logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "redirect: ./";

	}
	@RequestMapping("/signUp")
	public String signUp(HttpServletRequest request) {
		return "";

	}

}
