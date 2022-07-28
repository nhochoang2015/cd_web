package hotel_booking.converter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import hotel_booking.dto.RoomDTO;
import hotel_booking.dto.PriceDTO;
import hotel_booking.entity.Room;
import hotel_booking.entity.Price;

@Component
public class RoomConverter {
	@Autowired
	PriceConverter priceConverter;

	public RoomDTO toDTO(Room entity) {
	 int roomID = entity.getRoomID();
	String roomName = entity.getRoomName();
	boolean active = entity.isActive();
	int hotelID = entity.getHotel().getHotelID();
	int day = entity.getDay();
	Date date = entity.getDate();
	List<PriceDTO> priceDTOList = new ArrayList<PriceDTO>();
	Set<Price> priceList = entity.getPriceList();
	for(Price price :priceList) {
		priceDTOList.add(priceConverter.toDTO(price));
	}

//		Collections.sort(lessonDTOList, new Comparator<LessonDTO>() {
//			public int compare(LessonDTO o1, LessonDTO o2) {
//				return o1.getLessonID() - o2.getLessonID();
//			}
//		});
//
		return new RoomDTO(roomID, roomName, active, hotelID, day, date, priceDTOList);

	}

	public RoomConverter() {
		// TODO Auto-generated constructor stub
	}

}
