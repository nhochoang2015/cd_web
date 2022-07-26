package hotel_booking.sendmail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import hotel_booking.dto.AccountDTO;
import hotel_booking.repository.AccountRepository;
import hotel_booking.service.AccountService;

@Service
public class EmailSendService {
@Autowired
private JavaMailSender mailSender;
@Autowired
private AccountService accountService;
@Autowired
private AccountRepository accountRepository;


public void sendMail(String toEmail, String subject,String body) {
	SimpleMailMessage message = new SimpleMailMessage();
	message.setFrom("nguyencaohoang7422@gmail.com");
	message.setTo(toEmail);
	message.setText(body);
	message.setSubject(subject);
	mailSender.send(message);
}

}
