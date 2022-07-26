package hotel_booking.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import hotel_booking.compositeKey.LessonCompleteKey;
import hotel_booking.dto.LessonCompleteDTO;
import hotel_booking.entity.Account;
import hotel_booking.entity.Lesson;
import hotel_booking.entity.LessonComplete;
import hotel_booking.service.AccountService;
import hotel_booking.service.LessonService;

@Component
public class LessonCompleteConverter {
	@Autowired
	AccountService accountService;
	@Autowired
	LessonService lessonService;

	public LessonCompleteDTO toDTO(LessonComplete entity) {
		int lessonID = entity.getLesson().getLessonID();
		int accountID = entity.getAccount().getAccountID();
		return new LessonCompleteDTO(lessonID, accountID);
	}

//	public LessonComplete toEntity(LessonCompleteDTO dto) {
//		int lessonID = dto.getLessonID();
//		int accountID = dto.getAccountID();
//		LessonCompleteKey id = new LessonCompleteKey(accountID, lessonID);
//		Account account = accountService.findByAccountID(accountID);
//		Lesson lesson = lessonService.findEntityByLessonID(lessonID);
//		return new LessonComplete(id, account, lesson);
//	}
}
