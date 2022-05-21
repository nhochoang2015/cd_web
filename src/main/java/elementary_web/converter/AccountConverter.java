package elementary_web.converter;

import org.springframework.stereotype.Component;

import elementary_web.dto.AccountDTO;
import elementary_web.entity.Account;

@Component
public class AccountConverter {
	public AccountDTO toDTO(Account entity) {
		int accountID = entity.getAccountID();
		String accountName = entity.getAccountName();
		String nickName = entity.getNickName();
		String password = entity.getPassword();
		String email = entity.getEmail();
		String phoneNumber = entity.getPhoneNumber();
		int coin = entity.getCoin();
		int totalPoint = entity.getTotalPoint();
		int weeklyPoint = entity.getWeeklyPoint();
		int monthlyPoint = entity.getMonthlyPoint();
		String roleName = entity.getRole().getRoleName();
		boolean active = entity.isActive();
		AccountDTO dto = new AccountDTO(accountID, accountName, nickName, password, email, phoneNumber, coin,
				totalPoint, weeklyPoint, monthlyPoint, roleName, active);
		return dto;
	}

}
