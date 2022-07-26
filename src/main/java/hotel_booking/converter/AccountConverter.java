package hotel_booking.converter;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import hotel_booking.dto.AccountDTO;
import hotel_booking.dto.SubjectDTO;
import hotel_booking.entity.Account;
import hotel_booking.entity.Role;
import hotel_booking.entity.Subject;
import hotel_booking.service.RoleService;

@Component
public class AccountConverter {
	@Autowired
	private RoleService roleService;

	public static AccountDTO toDTO(Account entity) {
		int accountID = entity.getAccountID();
		String accountName = entity.getAccountName();
		String nickName = entity.getNickName();
		String password = entity.getPassword();
		String email = entity.getEmail();
		String phoneNumber = entity.getPhoneNumber();
		int validateCode = entity.getValidateCode();
		String roleName = entity.getRole().getRoleName();
		boolean active = entity.isActive();
		List<Subject> subjects = entity.getSubject();
		List<SubjectDTO> subjectDTOList = new ArrayList<SubjectDTO>();
		for(Subject subject : subjects) {
			subjectDTOList.add(SubjectConverter.toDTO(subject));
		}
		AccountDTO dto = new AccountDTO(accountID, accountName, nickName, password, email, phoneNumber,validateCode, roleName, active,subjectDTOList);
		return dto;
	}

//	public Account toEntity(AccountDTO dto) {
//		int accountID = dto.getAccountID();
//		String accountName = dto.getAccountName();
//		String nickName = dto.getNickName();
//		String password = dto.getPassword();
//		String email = dto.getEmail();
//		String phoneNumber = dto.getPhoneNumber();
//		String validateCode = dto.getValidateCode();
//		String roleName = dto.getRoleName();
//		Role role = roleService.findByRoleName(roleName);
//		List<Subject> subject = 
//		boolean active = dto.isActive();
//		int subjectID = dto.getSubjectID();
//		return new Account(accountID, accountName, nickName, password, email, phoneNumber,validateCode, active, subject, role, subjectID);
//	}

}
