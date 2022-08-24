package hotel_booking.service;

import javax.security.auth.Subject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hotel_booking.converter.RoomRegisterConverter;
import hotel_booking.dto.RoomRegisterDTO;
import hotel_booking.entity.RoomRegister;
import hotel_booking.repository.AccountRepository;
import hotel_booking.repository.RoomRegisterRepository;
import hotel_booking.repository.HotelRepository;

@Service
public class RoomRegisterService {
@Autowired
private RoomRegisterRepository subjectRegisterRepository;
@Autowired
private HotelRepository subjectRepository;
@Autowired
private AccountRepository accountRepository;
@Autowired
private RoomRegisterConverter subjectRegisterConverter;
//Đăng ký môn
public void Regist(int accountID,int roomID) {
//	RoomRegisterDTO registDTO = new RoomRegisterDTO(accountID, roomID);
//	RoomRegister register = subjectRegisterConverter.toEntity(registDTO);
//	subjectRegisterRepository.save(register);
//	
}


}
