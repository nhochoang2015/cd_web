package hotel_booking.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import hotel_booking.compositeKey.AccountSubjectKey;
import hotel_booking.entity.SubjectRegister;

@Repository
public interface SubjectRegisterRepository extends JpaRepository<SubjectRegister, AccountSubjectKey> {
	@Query(value = "INSERT INTO MON_HOC_DANG_KY(MA_TAI_KHOAN,MA_MON_HOC) VALUES (MA_TAI_KHOAN=?1,MA_MON_HOC=?2)",nativeQuery = true)
	List<SubjectRegister> addAccountBySubjectID(int accountID,int subjectID);
	
	
}
