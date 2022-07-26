package hotel_booking.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hotel_booking.converter.QuestionConverter;
import hotel_booking.dto.QuestionDTO;
import hotel_booking.repository.QuestionRepository;

@Service
public class QuestionService {
	@Autowired
	QuestionConverter questionConverter;
	@Autowired
	QuestionRepository questionRepository;

	public QuestionDTO findByQuestionID(int questionID) {
		return questionConverter.toDTO(questionRepository.findByQuestionID(questionID));
	}
//	public void save (QuestionDTO questionDTO) {
//		questionRepository.save(questionConverter.toEntity(questionDTO));
//		
//	}
}
