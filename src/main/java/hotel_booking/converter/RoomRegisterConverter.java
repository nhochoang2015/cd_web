package hotel_booking.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import hotel_booking.compositeKey.RoomRegisterKey;
import hotel_booking.dto.RoomRegisterDTO;
import hotel_booking.entity.Account;
import hotel_booking.entity.Price;
import hotel_booking.entity.Room;
import hotel_booking.entity.Hotel;
import hotel_booking.entity.RoomRegister;
import hotel_booking.service.AccountService;
import hotel_booking.service.HotelService;
import hotel_booking.service.RoomService;

@Component
public class RoomRegisterConverter {
	@Autowired
	AccountService accountService;
	@Autowired
	RoomService roomService;
	
	public RoomRegisterDTO toDTO(RoomRegister entity) {
		int accountID = entity.getAccount().getAccountID();
		int roomID = entity.getRoom().getRoomID();
		return new RoomRegisterDTO( accountID,roomID);
	}
	public RoomRegister toEntity(RoomRegisterDTO dto) {
		
		int accountID = dto.getAccountID();
		int roomID = dto.getRoomID();
		RoomRegisterKey id = new RoomRegisterKey(accountID,roomID);
		Account account = accountService.findByAccountID(accountID);
		Room room = roomService.findEntityByRoomID(roomID);
		return new RoomRegister(id, account, room);
	}
}
