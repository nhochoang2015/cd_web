package hotel_booking.dto;

import java.util.Date;
import java.util.List;

public class RoomDTO {

	private int roomID;
	private String roomName;
	private boolean active;
	private int hotelID;
	
	private int person;
	private String service;
	private List<PriceDTO> priceList;
	
	public RoomDTO() {
		
	}
	public RoomDTO(int roomID, String roomName, boolean active, int hotelID,String service,int person,
			List<PriceDTO> priceList) {
		super();
		this.roomID = roomID;
		this.roomName = roomName;
		this.active = active;
		this.hotelID = hotelID;
		
		this.service=service;
		this.person=person;
		this.priceList = priceList;
		
	}
	
	public int getPerson() {
		return person;
	}

	public void setPerson(int person) {
		this.person = person;
	}

	public String getService() {
		return service;
	}

	public void setService(String service) {
		this.service = service;
	}

	public int getRoomID() {
		return roomID;
	}
	public void setRoomID(int roomID) {
		this.roomID = roomID;
	}
	public String getRoomName() {
		return roomName;
	}
	public void setRoomName(String roomName) {
		this.roomName = roomName;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	public int getHotelID() {
		return hotelID;
	}
	public void setHotelID(int hotelID) {
		this.hotelID = hotelID;
	}
	
	public List<PriceDTO> getPriceList() {
		return priceList;
	}
	public void setPriceList(List<PriceDTO> priceList) {
		this.priceList = priceList;
	}
	
	
}
