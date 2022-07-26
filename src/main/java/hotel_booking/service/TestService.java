package hotel_booking.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hotel_booking.converter.QuestionConverter;
import hotel_booking.dto.QuestionDTO;
import hotel_booking.entity.Question;
import hotel_booking.repository.QuestionRepository;

@Service
public class TestService {
	@Autowired
	QuestionRepository questionRepository;
	@Autowired
	QuestionConverter questionConverter;

	public List<QuestionDTO> getRandomQuestion(int chapterID) {
		List<QuestionDTO> questionDTOList = new ArrayList<QuestionDTO>();
		List<Question> questionList = questionRepository.findRandomQuestionByChapterID(chapterID);
		for (Question question : questionList) {
			questionDTOList.add(questionConverter.toDTO(question));
		}
		return questionDTOList;
	}

}
