package hotel_booking.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import hotel_booking.compositeKey.RoomRegisterKey;
import hotel_booking.entity.RoomRegister;

@Repository
public interface RoomRegisterRepository extends JpaRepository<RoomRegister, RoomRegisterKey> {
	@Query(value = "INSERT INTO DANG_KY_PHONG(MA_TAI_KHOAN,MA_PHONG) VALUES (MA_TAI_KHOAN=?1,MA_PHONG=?2)",nativeQuery = true)
	List<RoomRegister> addAccountByRoomID(int accountID,int roomID);
	
	
}
