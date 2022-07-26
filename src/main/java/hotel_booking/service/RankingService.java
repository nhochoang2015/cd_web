package hotel_booking.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hotel_booking.converter.AccountConverter;
import hotel_booking.dto.AccountDTO;
import hotel_booking.entity.Account;
import hotel_booking.repository.AccountRepository;

@Service
public class RankingService {

	@Autowired
	public AccountRepository accountRepository;
	@Autowired
	private AccountConverter accountConverter;
	
//	public List<AccountDTO> getMonthlyRankingList(){
//		List<AccountDTO> accountDTOList =  new ArrayList<AccountDTO>();
//		List<Account> accountList =accountRepository.findByOrderByMonthlyPointDesc();
//		if(accountList == null) {
//			return null;
//		}else {
//			for(Account account : accountList) {
//				AccountDTO accountDTO = accountConverter.toDTO(account);
//				accountDTOList.add(accountDTO);
//			}
//			System.out.println(accountList.size());
//			return accountDTOList;
//		}
//		
//	}
}
