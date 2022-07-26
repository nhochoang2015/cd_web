package hotel_booking.controller.config;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

import hotel_booking.dto.AccountDTO;

@Component
public class AuthenticationSuccessHandlerImpl implements AuthenticationSuccessHandler {
	@Autowired
	private HttpSession session;

	public AuthenticationSuccessHandlerImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response,
			Authentication authentication) throws IOException, ServletException {
		AccountDTO account = (AccountDTO) authentication.getPrincipal();
		session.setAttribute("account", account);
		response.sendRedirect("./");
	}

}
