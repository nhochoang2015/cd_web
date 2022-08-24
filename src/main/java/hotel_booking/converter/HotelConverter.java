package hotel_booking.converter;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.persistence.Converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import hotel_booking.dto.HotelDTO;
import hotel_booking.dto.RoomDTO;
import hotel_booking.entity.Hotel;
import hotel_booking.entity.Room;

@Component
public class HotelConverter {
	@Autowired
	RoomConverter roomConverter;

	public HotelDTO toDTO(Hotel entity) {
		int hotelID = entity.getHotelID();
		String hotelName = entity.getHotelName();
		boolean active = entity.isActive();
		String position = entity.getPosition();
		String pic = entity.getPic();
		String comment = entity.getComment();
		int LocationID = entity.getLocation().getLocationID();
		List<RoomDTO> roomDTOList = new ArrayList<RoomDTO>();
		Set<Room> roomList = entity.getRoomList();
		for (Room room : roomList) {
			roomDTOList.add(roomConverter.toDTO(room));
		}
		return new HotelDTO(hotelID, hotelName, active, position, pic, comment, LocationID, roomDTOList);

	}

}
