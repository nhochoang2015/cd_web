package hotel_booking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import hotel_booking.entity.Room;
import hotel_booking.entity.Hotel;

@Repository
public interface RoomRepository extends JpaRepository<Room, Integer> {
	public Room findByRoomID(int roomID);
}
