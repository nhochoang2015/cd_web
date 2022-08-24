package hotel_booking.converter;

import javax.persistence.Converter;

import org.springframework.stereotype.Component;

import hotel_booking.dto.AccountDTO;
import hotel_booking.entity.Account;

@Component
public class AccountConverter {

	public AccountDTO toDTO(Account entity) {
		int accountID = entity.getAccountID();
		String accountName = entity.getAccountName();
		String nickName = entity.getNickName();
		String password = entity.getPassword();
		String email = entity.getEmail();
		String phoneNumber = entity.getPhoneNumber();
		int validateCode = entity.getValidateCode();
		String roleName = entity.getRole().getRoleName();
		boolean active = entity.isActive();
		
		AccountDTO dto = new AccountDTO(accountID, accountName, nickName, password, email, phoneNumber,validateCode, roleName, active);
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
