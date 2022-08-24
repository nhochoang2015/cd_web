package hotel_booking.converter;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import hotel_booking.dto.PriceDTO;
import hotel_booking.entity.Room;
import hotel_booking.entity.Price;
import hotel_booking.service.RoomService;
import hotel_booking.service.PriceService;

@Component
public class PriceConverter {

	@Autowired
	PriceService priceService;
	@Autowired
	RoomService roomService;

	public PriceDTO toDTO(Price entity) {
	 int priceID =entity.getPriceID();
		 String weekday =entity.getWeekday();
		 double price =entity.getPrice();
		 int roomID = entity.getRoomid().getRoomID();
		return new PriceDTO(priceID, weekday, price, roomID);
	}

//	public Price toEntity(PriceDTO dto) {
//		Price price = new Price();
//		price.setPriceID(dto.getPriceID());
//		price.setWeekday(dto.getWeekday());
//		price.setPrice(dto.getPrice());
//		int roomID = dto.getRoomID();
//		Room room = roomService.findEntityByRoomID(roomID);
//		price.setRoomid(room);
//		return price;
//	
//	}

}
