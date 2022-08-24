package hotel_booking.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import hotel_booking.entity.Room;

@Repository
public interface LessonRepository extends JpaRepository<Room, Integer> {
	@Query(value = " SELECT * FROM PHONG WHERE ( MA_PHONG= ?1 )",nativeQuery = true)
	 Room findRoomByHotelID(int hotelID);
	
	@Query(value = " SELECT * FROM PHONG WHERE (MA_KHACH_SAN = ?1 )",nativeQuery = true)
	List<Room> findAllByRoomID(int roomID);
}
