package hotel_booking.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hotel_booking.converter.SubjectConverter;
import hotel_booking.dto.AccountDTO;
import hotel_booking.dto.ChapterDTO;
import hotel_booking.dto.SubjectDTO;
import hotel_booking.entity.Account;
import hotel_booking.entity.Chapter;
import hotel_booking.entity.Subject;
import hotel_booking.repository.AccountRepository;
import hotel_booking.repository.SubjectRepository;

@Service
public class SubjectService {
	@Autowired
	private SubjectRepository subjectRepository;
	@Autowired
	private SubjectConverter subjectConverter;
	@Autowired
	private AccountRepository accountRepository;
	
	List<AccountDTO> accountDTO = new ArrayList<AccountDTO>();
	List<SubjectDTO> subjects = new ArrayList<SubjectDTO>();

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
		Subject subject = subjectRepository.findBySubjectID(subjectID);
		subject.setActive(false);
		subjectRepository.save(subject);
	}
//Tạo môn
	
	public void createSubjectByAccountID(String subjectName,int studentCount,String weekday,String time,int price,String comment,int accountID) {
		Account account = accountRepository.findByAccountID(accountID);
		Subject subject = new Subject();
		subject.setAccount(account);
		subject.setActive(false);
		subject.setStudentCount(studentCount);
		subject.setSubjectName(subjectName);
		subject.setPrice(price);
		subject.setTime(time);
		subject.setWeekday(weekday);
		subject.setComment(comment);	
		subjectRepository.save(subject);
	}
	// Sửa tên môn
	public void updateSubjectName(int subjectID,String subjectName) {
		Subject subject = subjectRepository.findBySubjectID(subjectID);
		subject.setSubjectName(subjectName);
		subjectRepository.save(subject);
	}
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
	public void updateStudentCount(int subjectID,int StudentCount) {
		Subject subject = subjectRepository.findBySubjectID(subjectID);
		subject.setStudentCount(StudentCount);
		subjectRepository.save(subject);
	}
	// Sửa ngày học
	public void updateWeekday(int subjectID,String weekday) {
		Subject subject = subjectRepository.findBySubjectID(subjectID);
		subject.setWeekday(weekday);
		subjectRepository.save(subject);
	}
	// Sửa giá 
	public void updatePrice(int subjectID,int price) {
		Subject subject = subjectRepository.findBySubjectID(subjectID);
		subject.setPrice(price);
		subjectRepository.save(subject);
	}
	//sửa giờ học
	public void updateTime(int subjectID,String time) {
		Subject subject = subjectRepository.findBySubjectID(subjectID);
		subject.setTime(time);
		subjectRepository.save(subject);
	}
	//sửa nội dung ghi chú
	public void updateComment(int subjectID,String comment) {
		Subject subject = subjectRepository.findBySubjectID(subjectID);
		subject.setComment(comment);
		subjectRepository.save(subject);
	}
	
//	public void createSubject(String subjectName) {
//			Subject subject = new Subject();
//			subject.setSubjectName(subjectName);
//			subject.setActive(true);
//			subjectRepository.save(subject);
//		
//	}
	
	
	// sửa tên môn học
	public void renameSubject(int subjectID, String newSubjectName) {
		Subject subject = subjectRepository.findBySubjectID(subjectID);
		subject.setSubjectName(newSubjectName);
		subjectRepository.save(subject);
	}

	// phục hồi môn
	public void restoreSubjectByID(int subjectID) {
		Subject subject = subjectRepository.findBySubjectID(subjectID);
		subject.setActive(true);
		subjectRepository.save(subject);
	}

	// Tim mon hoc theo ID
	public SubjectDTO findBySubjectID(int subjectID) {
		Subject subject = subjectRepository.findBySubjectID(subjectID);
		return SubjectConverter.toDTO(subject);
	}
	// tạo môn

//	public void addNewSubject(Subject subject) {
//		subjectRepository.save(subjectConverter.toDTO(subject));
//	}
	public List<SubjectDTO> findAllSubjectwithActiveTrue() {
		List<Subject> subjectList = subjectRepository.findAll();
		List<SubjectDTO> subjecDTOtList = new ArrayList<SubjectDTO>();
		for (Subject subject : subjectList) {
			if (subject.isActive() == true) {
				subjecDTOtList.add(SubjectConverter.toDTO(subject));
			}
		}
		return subjecDTOtList;
	}
	public Subject findSubjectbyID(int subjectID) {
		Subject subject = subjectRepository.findBySubjectID(subjectID);
		return subject;
	}
	public List<SubjectDTO> findAllSubject() {
		List<Subject> subjectList = subjectRepository.findAll();

		List<SubjectDTO> subjecDTOtList = new ArrayList<SubjectDTO>();
		for (Subject subject : subjectList) {
			subjecDTOtList.add(SubjectConverter.toDTO(subject));
		}
		return subjecDTOtList;
	}

	public List<SubjectDTO> findAllSubjectbyAccountID(int account) {
		List<Subject> subjectList = subjectRepository.findSubjectByAccountID(account);
		List<SubjectDTO> subjecDTOtList = new ArrayList<SubjectDTO>();
		for (Subject subject : subjectList) {
			subjecDTOtList.add(SubjectConverter.toDTO(subject));
		}
		return subjecDTOtList;
	}
}
