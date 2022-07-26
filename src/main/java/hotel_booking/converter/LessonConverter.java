package hotel_booking.converter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import hotel_booking.dto.LessonDTO;
import hotel_booking.dto.QuestionDTO;
import hotel_booking.entity.Chapter;
import hotel_booking.entity.Lesson;
import hotel_booking.entity.Question;
import hotel_booking.service.ChapterService;
import hotel_booking.service.LessonService;

@Component
public class LessonConverter {
	@Autowired
	QuestionConverter questionConverter;
	@Autowired
	LessonService lessonService;
	@Autowired
	ChapterService chapterService;

//	public LessonDTO toDTO(Lesson entity) {
//		int lessonID = entity.getLessonID();
//		String lessonName = entity.getLessonName();
//		int chapterID = entity.getChapter().getChapterID();
//		int score = entity.getScore();
//		boolean active = entity.isActive();
//		Lesson lessonBefore = entity.getLessonBefore();
//		Integer lessonBeforeID = null;
//		if (lessonBefore != null) {
//			lessonBeforeID = entity.getLessonBefore().getLessonID();
//		}
//		List<QuestionDTO> questionDTOList = new ArrayList<QuestionDTO>();
//		List<Question> questionList = entity.getQuestionList();
//		for (Question question : questionList) {
//			questionDTOList.add(questionConverter.toDTO(question));
//
//		}
//		return new LessonDTO(lessonID, lessonName, chapterID, lessonBeforeID, questionDTOList, score, active);
//	}

//	public Lesson toEntity(LessonDTO dto) {
//		Lesson lesson = new Lesson();
//		lesson.setLessonID(dto.getLessonID());
//		lesson.setLessonName(dto.getLessonName());
//		lesson.setActive(dto.isActive());
//		lesson.setScore(dto.getScore());
//		Integer lessonBeforeID = dto.getLessonBeforeID();
//		int chapterID = dto.getChapterID();
//		if (lessonBeforeID != null) {
//			Lesson lessonBefore = lessonService.findEntityByLessonID(lessonBeforeID);
//			lesson.setLessonBefore(lessonBefore);
//		}
//		Chapter chapter = chapterService.findEntityByChapterID(chapterID);
//		lesson.setChapter(chapter);
//		return lesson;
//
//	}

}
