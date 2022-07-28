package hotel_booking.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hotel_booking.Utility;
import hotel_booking.converter.AccountConverter;
import hotel_booking.dto.AccountDTO;
import hotel_booking.entity.Account;
import hotel_booking.entity.Role;
import hotel_booking.entity.Hotel;
import hotel_booking.repository.AccountRepository;
import hotel_booking.repository.RoleRepository;
import hotel_booking.repository.HotelRepository;
import net.bytebuddy.utility.RandomString;

@Service
public class AccountService {
	@Autowired
	private AccountRepository accountRepository;
	@Autowired
	private AccountConverter accountConverter;
	@Autowired
	private RoleRepository repository;
	@Autowired
	private HotelRepository subjectRepository;
	
	
	// Dùng để thêm hoặc sửa thông tin tài khoản. Dùng cho quản lý tài khoản
	public void updateAccount(Account account) {
		accountRepository.save(account);
	}

	// Dùng cho quản lý thông tin cá nhân
//	public void updateAccount(AccountDTO accountDTO) {
//		accountRepository.save(accountConverter.toEntity(accountDTO));
//	}
	
		
	public void addNewAccount(Account account) {
		accountRepository.save(account);
	}

	public AccountDTO findAccountByEmailOrUserOrPhoneNumber(String emailOrUserOrPhoneNumber) {
		Account account = accountRepository.findByEmailOrUsernameOrPhoneNumber(emailOrUserOrPhoneNumber);
		// Tim thay hay khong
		if (account == null) {
			return null;
		} else {
			AccountDTO accountDTO = accountConverter.toDTO(account);
			return accountDTO;
		}
	}
	
	
	public AccountDTO findAccountByEmailOrUserOrPhoneNumberOrNickname(String emailOrUserOrPhoneNumberOrNickname) {
		Account account = accountRepository.findByEmailOrUsernameOrPhoneNumber(emailOrUserOrPhoneNumberOrNickname);
		// Tim thay hay khong
		if (account == null) {
			return null;
		} else {
			AccountDTO accountDTO = accountConverter.toDTO(account);
			return accountDTO;
		}
	}
	public static int getRandomNumber() {
	    Random rnd = new Random();
	    int number = rnd.nextInt(999999);
	    return number;
	}
	public Account registerAccount(String Username, String pass, String Nickname,String Email,String Phonenumber) throws Exception {
		Account account = new Account();
		account.setAccountName(Username.trim());
		account.setPassword(Utility.convertToMD5(pass.trim()));
		account.setNickName(Nickname.trim());
		account.setEmail(Email);
		account.setPhoneNumber(Phonenumber);
		account.setRole(repository.findByRoleName("USER"));
		account.setValidateCode(getRandomNumber());
		account.setActive(false);
		accountRepository.save(account);
		
		return account;
	}
	public void resetValidateCode(int AccountID) {
		Account account = accountRepository.findByAccountID(AccountID);;
		account.setValidateCode(getRandomNumber());
		accountRepository.save(account);
	}
	public void validateEmail(int AccountID, int validateCode) {
		Account account = accountRepository.findByAccountID(AccountID);
		if(validateCode == account.getValidateCode()) {
			account.setActive(true);
		}else {
			return;
		}
		accountRepository.save(account);
	}
	//dOI MAT KHAU
	public void changePass(int accountID,String password) {
		Account account = accountRepository.findByAccountID(accountID);
		account.setPassword(password);
		accountRepository.save(account);
	}
	
	public AccountDTO findDTOByAccountID(int accountID) {
		Account account = accountRepository.findByAccountID(accountID);
		return accountConverter.toDTO(account);
	}

	public List<AccountDTO> findAllAccount() {

		List<Account> listAccount = accountRepository.findAll();
		List<AccountDTO> listAccountDTO = new ArrayList<AccountDTO>();
		for (Account a : listAccount) {
			AccountDTO accountDTO = accountConverter.toDTO(a);
			listAccountDTO.add(accountDTO);
		}
		return listAccountDTO;
	}

	public AccountDTO findDTOByAccountName(int accountID, String accountName) {
		Account account = accountRepository.findByAccountName(accountID, accountName);
		if (account == null) {
			return null;
		}
		return accountConverter.toDTO(account);
	}

	public AccountDTO findDTOByEmail(int accountID, String email) {
		Account account = accountRepository.findByEmail(accountID, email);
		if (account == null) {
			return null;
		}
		return accountConverter.toDTO(account);
	}

	public AccountDTO findDTOByPhoneNumber(int accountID, String phoneNumber) {
		Account account = accountRepository.findByPhoneNumber(accountID, phoneNumber);
		if (account == null) {
			return null;
		}
		return accountConverter.toDTO(account);
	}

	public AccountDTO findDTOByNickName(int accountID, String nickName) {

		Account account = accountRepository.findByNickName(accountID, nickName);
		if (account == null) {
			return null;
		}
		return accountConverter.toDTO(account);
	}

	public Account findByAccountID(int accountID) {
		Account account = accountRepository.findByAccountID(accountID);
		return account;
	}
	
}
