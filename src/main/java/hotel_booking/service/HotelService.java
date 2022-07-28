package hotel_booking.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hotel_booking.converter.HotelConverter;
import hotel_booking.dto.AccountDTO;
import hotel_booking.dto.RoomDTO;
import hotel_booking.dto.HotelDTO;
import hotel_booking.entity.Account;
import hotel_booking.entity.Room;
import hotel_booking.entity.Hotel;
import hotel_booking.repository.AccountRepository;
import hotel_booking.repository.HotelRepository;

@Service
public class HotelService {
	@Autowired
	private HotelRepository subjectRepository;
	@Autowired
	private HotelConverter subjectConverter;
	@Autowired
	private AccountRepository accountRepository;
	
	List<AccountDTO> accountDTO = new ArrayList<AccountDTO>();
	List<HotelDTO> subjects = new ArrayList<HotelDTO>();

	// Xóa môn học
//	public void deleteSubjectBySubjectID(int subjectID) {
//		for (SubjectDTO s : subjects) {
//			if (s.getSubjectID() == subjectID) {
//				subjects.remove(subjectID);
//			}
//		}
//	}

	// Tim mon hoc
//	public SubjectDTO findSubjectBySubjectNameOrSubjectID(int SubjectNameOrSubjectID) {
//		Subject subject = subjectRepository.findSubjectBySubjectNameOrSubjectID(SubjectNameOrSubjectID);
//		// Tim thay hay khong
//		if (subject == null) {
//			return null;
//		} else {
//			SubjectDTO SubjectDTO = subjectConverter.toDTO(subject);
//			return SubjectDTO;
//		}
//	}

	// Tao mon hoc
//	public void createSubject(int SubjectID,String SubjectName) {
//		for (SubjectDTO s : subjects) {
//			if (s.getSubjectID() == SubjectID) {
//				return;
//			}else {
//				subjects.add(s);
//			}
//		}
//	}
	// xóa môn
	public void deleteSubjectByID(int subjectID) {
		Hotel subject = subjectRepository.findBySubjectID(subjectID);
		subject.setActive(false);
		subjectRepository.save(subject);
	}
//Tạo môn
	
//	public void createSubjectByAccountID(String subjectName,int studentCount,String weekday,String time,int price,String comment,int accountID) {
//		Account account = accountRepository.findByAccountID(accountID);
//		Hotel subject = new Hotel();
//		subject.setAccount(account);
//		subject.setActive(false);
//		subject.setStudentCount(studentCount);
//		subject.setSubjectName(subjectName);
//		subject.setPrice(price);
//		subject.setTime(time);
//		subject.setWeekday(weekday);
//		subject.setComment(comment);	
//		subjectRepository.save(subject);
//	}
	// Sửa tên môn
//	public void updateSubjectName(int subjectID,String subjectName) {
//		Hotel subject = subjectRepository.findBySubjectID(subjectID);
//		subject.setSubjectName(subjectName);
//		subjectRepository.save(subject);
//	}
	// 
//	public List<SubjectDTO> findSubbyName(String subjectName) {
//		List<Subject> subjects = subjectRepository.findSubjectByName(subjectName);
//		List<SubjectDTO> subjecDTOtList = new ArrayList<SubjectDTO>();
//		for (Subject subject : subjectList) {
//			subjecDTOtList.add(SubjectConverter.toDTO(subject));
//		}
//		return subjecDTOtList;
//	}
	//Sửa Số lượng học sinh
//	public void updateStudentCount(int subjectID,int StudentCount) {
//		Hotel subject = subjectRepository.findBySubjectID(subjectID);
//		subject.setStudentCount(StudentCount);
//		subjectRepository.save(subject);
//	}
//	// Sửa ngày học
//	public void updateWeekday(int subjectID,String weekday) {
//		Hotel subject = subjectRepository.findBySubjectID(subjectID);
//		subject.setWeekday(weekday);
//		subjectRepository.save(subject);
//	}
//	// Sửa giá 
//	public void updatePrice(int subjectID,int price) {
//		Hotel subject = subjectRepository.findBySubjectID(subjectID);
//		subject.setPrice(price);
//		subjectRepository.save(subject);
//	}
//	//sửa giờ học
//	public void updateTime(int subjectID,String time) {
//		Hotel subject = subjectRepository.findBySubjectID(subjectID);
//		subject.setTime(time);
//		subjectRepository.save(subject);
//	}
//	//sửa nội dung ghi chú
//	public void updateComment(int subjectID,String comment) {
//		Hotel subject = subjectRepository.findBySubjectID(subjectID);
//		subject.setComment(comment);
//		subjectRepository.save(subject);
//	}
//	
//	public void createSubject(String subjectName) {
//			Subject subject = new Subject();
//			subject.setSubjectName(subjectName);
//			subject.setActive(true);
//			subjectRepository.save(subject);
//		
//	}
	
	
	// sửa tên môn học
//	public void renameSubject(int subjectID, String newSubjectName) {
//		Hotel subject = subjectRepository.findBySubjectID(subjectID);
//		subject.setSubjectName(newSubjectName);
//		subjectRepository.save(subject);
//	}

	// phục hồi môn
	public void restoreSubjectByID(int subjectID) {
		Hotel subject = subjectRepository.findBySubjectID(subjectID);
		subject.setActive(true);
		subjectRepository.save(subject);
	}

	// Tim mon hoc theo ID
	public HotelDTO findBySubjectID(int subjectID) {
		Hotel subject = subjectRepository.findBySubjectID(subjectID);
		return HotelConverter.toDTO(subject);
	}
	// tạo môn

//	public void addNewSubject(Subject subject) {
//		subjectRepository.save(subjectConverter.toDTO(subject));
//	}
	public List<HotelDTO> findAllSubjectwithActiveTrue() {
		List<Hotel> subjectList = subjectRepository.findAll();
		List<HotelDTO> subjecDTOtList = new ArrayList<HotelDTO>();
		for (Hotel subject : subjectList) {
			if (subject.isActive() == true) {
				subjecDTOtList.add(HotelConverter.toDTO(subject));
			}
		}
		return subjecDTOtList;
	}
	public Hotel findSubjectbyID(int subjectID) {
		Hotel subject = subjectRepository.findBySubjectID(subjectID);
		return subject;
	}
	public List<HotelDTO> findAllSubject() {
		List<Hotel> subjectList = subjectRepository.findAll();

		List<HotelDTO> subjecDTOtList = new ArrayList<HotelDTO>();
		for (Hotel subject : subjectList) {
			subjecDTOtList.add(HotelConverter.toDTO(subject));
		}
		return subjecDTOtList;
	}

	public List<HotelDTO> findAllSubjectbyAccountID(int account) {
		List<Hotel> subjectList = subjectRepository.findSubjectByAccountID(account);
		List<HotelDTO> subjecDTOtList = new ArrayList<HotelDTO>();
		for (Hotel subject : subjectList) {
			subjecDTOtList.add(HotelConverter.toDTO(subject));
		}
		return subjecDTOtList;
	}
}
