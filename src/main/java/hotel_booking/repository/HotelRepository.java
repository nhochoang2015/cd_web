package hotel_booking.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import hotel_booking.entity.Hotel;

@Repository
public interface HotelRepository extends JpaRepository<Hotel, Integer> {
//	@Query(value = "SELECT * FROM MON_HOC WHERE (MA_MON_HOC = ?1) OR (TEN_MON_HOC = ?1)", nativeQuery = true)
//	Hotel findSubjectBySubjectNameOrSubjectID(int SubjectNameOrSubjectID);
//
//	@Query(value = "INSERT MON_HOC(MA_MON_HOC,TEN_MON_HOC) INTO (?1,?2)", nativeQuery = true)
//	Hotel createSubjectBySubjectIDAndSubjectName(int subjectID, String subjectName);
	@Query(value = "SELECT*FROM KHACH_SAN WHERE (MA_KHACH_SAN = ?1)",nativeQuery = true)
	Hotel findByHotelID(int hotelID);
	
	@Query(value = "SELECT*FROM KHACH_SAN WHERE (MA_DIA_DIEM = ?1)",nativeQuery = true)
	List<Hotel> findAllHotelByLocationID(int locationID);
	
//	@Query(value = "UPDATE MON_HOC SET HOAT_DONG = 0 WHERE (MA_MON_HOC = ?1)",nativeQuery = true)
//	void deleteSubjectByID(int SubjectID);
//	
//	@Query(value = "UPDATE MON_HOC SET HOAT_DONG = 1 WHERE (MA_MON_HOC = ?1)",nativeQuery = true)
//	Hotel restoreSubjectByID(int SubjectID);
//	
//	@Query(value = "SELECT * FROM MON_HOC WHERE (MA_TAI_KHOAN = ?1)", nativeQuery = true)
//	List<Hotel> findSubjectByAccountID(int AccountID);
//	
//	@Query(value = "SELECT * FROM MON_HOC WHERE HOAT_DONG = 1", nativeQuery = true)
//	List<Hotel> findAllSubjectByActive();
//	@Query(value = "SELECT * FROM MON_HOC WHERE (MA_TAI_KHOAN = ?1)", nativeQuery = true)
//	List<Hotel> findSubjectByName(String name); 
	
}
