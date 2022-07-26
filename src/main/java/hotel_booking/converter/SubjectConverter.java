package hotel_booking.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import hotel_booking.dto.SubjectDTO;
import hotel_booking.entity.Subject;

@Component
public class SubjectConverter {
	@Autowired
	ChapterConverter chapterConverter;

	public static SubjectDTO toDTO(Subject entity) {
		int subjectID = entity.getSubjectID();
		int accountID = entity.getAccount().getAccountID();
		String subjectName = entity.getSubjectName();
		boolean active = entity.isActive();
		int studentCount = entity.getStudentCount();
		String weekday = entity.getWeekday();
		String time = entity.getTime();
		int price = entity.getPrice();
		String comment = entity.getComment();
		
		return new SubjectDTO(subjectID,subjectName, accountID, active,studentCount, weekday, time,price,comment);

	}
	
}
