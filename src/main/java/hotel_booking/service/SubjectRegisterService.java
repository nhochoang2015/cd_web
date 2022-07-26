package hotel_booking.service;

import javax.security.auth.Subject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hotel_booking.converter.SubjectRegisterConverter;
import hotel_booking.dto.SubjectRegisterDTO;
import hotel_booking.entity.SubjectRegister;
import hotel_booking.repository.AccountRepository;
import hotel_booking.repository.SubjectRegisterRepository;
import hotel_booking.repository.SubjectRepository;

@Service
public class SubjectRegisterService {
@Autowired
private SubjectRegisterRepository subjectRegisterRepository;
@Autowired
private SubjectRepository subjectRepository;
@Autowired
private AccountRepository accountRepository;
@Autowired
private SubjectRegisterConverter subjectRegisterConverter;
//Đăng ký môn
public void Regist(int accountID,int subjectID) {
	SubjectRegisterDTO registDTO = new SubjectRegisterDTO(accountID, subjectID);
	SubjectRegister register = subjectRegisterConverter.toEntity(registDTO);
	subjectRegisterRepository.save(register);
	
}


}
