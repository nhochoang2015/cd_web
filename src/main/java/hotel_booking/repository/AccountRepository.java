package hotel_booking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import hotel_booking.entity.Account;

@Repository
public interface AccountRepository extends JpaRepository<Account, Integer> {
	@Query(value = "SELECT * FROM TAI_KHOAN WHERE ((EMAIL = ?1) OR (TEN_TAI_KHOAN = ?1) OR (SDT = ?1)) AND HOAT_DONG = 1", nativeQuery = true)
	Account findByEmailOrUsernameOrPhoneNumber(String emailOrUserOrPhoneNumber);

	@Query(value = "SELECT * FROM TAI_KHOAN WHERE (TEN_TAI_KHOAN = ?1) AND HOAT_DONG = 1", nativeQuery = true)
	Account findByUsername(String username);
	
	@Query(value = "SELECT * FROM TAI_KHOAN WHERE (MA_TAI_KHOAN = ?1) ",nativeQuery = true)
	Account findByAccountID(int accountID);
	@Query(value = "SELECT * FROM TAI_KHOAN WHERE ((EMAIL = ?1) OR (TEN_TAI_KHOAN = ?1) OR (SDT = ?1)) OR(NICK_NAME = ?1)",nativeQuery = true)
	Account findAccountByEmailOrUserOrPhoneNumberOrNickname(String emailOrUserOrPhoneNumberOrNickname);
	@Query(value = "SELECT * FROM TAI_KHOAN WHERE (MA_TAI_KHOAN != ?1) AND (TEN_TAI_KHOAN = ?2)  ",nativeQuery = true)
	Account findByAccountName(int accountID,String accountName);
	@Query(value = "SELECT * FROM TAI_KHOAN WHERE (MA_TAI_KHOAN != ?1) AND (EMAIL = ?2)  ",nativeQuery = true)
	Account findByEmail(int accountID, String email);
	@Query(value = "SELECT * FROM TAI_KHOAN WHERE (MA_TAI_KHOAN != ?1) AND (SDT = ?2)  ",nativeQuery = true)
	Account findByPhoneNumber(int accountID, String phoneNumber);
	@Query(value = "SELECT * FROM TAI_KHOAN WHERE (MA_TAI_KHOAN != ?1) AND (NICK_NAME = ?2)  ",nativeQuery = true)
	Account findByNickName(int accountID, String nickName);
}
