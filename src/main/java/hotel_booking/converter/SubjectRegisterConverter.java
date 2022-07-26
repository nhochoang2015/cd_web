package hotel_booking.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import hotel_booking.compositeKey.AccountSubjectKey;
import hotel_booking.compositeKey.LessonCompleteKey;
import hotel_booking.dto.LessonCompleteDTO;
import hotel_booking.dto.SubjectRegisterDTO;
import hotel_booking.entity.Account;
import hotel_booking.entity.Lesson;
import hotel_booking.entity.LessonComplete;
import hotel_booking.entity.Subject;
import hotel_booking.entity.SubjectRegister;
import hotel_booking.service.AccountService;
import hotel_booking.service.SubjectService;

@Component
public class SubjectRegisterConverter {
	@Autowired
	AccountService accountService;
	@Autowired
	SubjectService subjectService;
	
	public SubjectRegisterDTO toDTO(SubjectRegister entity) {
		int accountID = entity.getAccount().getAccountID();
		int subjectID = entity.getSubject().getSubjectID();
		return new SubjectRegisterDTO( accountID,subjectID);
	}
	public SubjectRegister toEntity(SubjectRegisterDTO dto) {
		
		int accountID = dto.getAccountID();
		int subjectID =dto.getSubjectID();
		AccountSubjectKey id = new AccountSubjectKey(accountID,subjectID);
		Account account = accountService.findByAccountID(accountID);
		Subject subject = subjectService.findSubjectbyID(subjectID);
		return new SubjectRegister(id, account, subject);
	}
}
