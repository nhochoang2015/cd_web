package hotel_booking.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hotel_booking.converter.PriceConverter;
import hotel_booking.dto.PriceDTO;
import hotel_booking.entity.Price;
import hotel_booking.repository.PriceRepository;

@Service
public class PriceService {

	@Autowired
	PriceRepository lessonRepository;
	@Autowired
	PriceConverter lessonConverter;

//	public LessonDTO findByLessonID(int lessonID) {
//		Lesson lesson = lessonRepository.findByLessonID(lessonID);
//		return lessonConverter.toDTO(lesson);
//
//	}
//
//	public Lesson findEntityByLessonID(int lessonID) {
//		Lesson lesson = lessonRepository.findByLessonID(lessonID);
//		return lesson;
//
//	}
//
//	public List<LessonDTO> findLessonsByChapterID(int chapterID) {
//		List<Lesson> lessonList = lessonRepository.findByChapter_ChapterID(chapterID);
//		List<LessonDTO> lessonDTOList = new ArrayList<LessonDTO>();
//		for (Lesson lesson : lessonList) {
//			lessonDTOList.add(lessonConverter.toDTO(lesson));
//		}
//		return lessonDTOList;
//	}
//
//	public int save(LessonDTO lessonDTO) {
//		return lessonRepository.save(lessonConverter.toEntity(lessonDTO)).getLessonID();
//
//	}

	
}
