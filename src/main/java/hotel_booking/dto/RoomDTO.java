package hotel_booking.dto;

import java.util.Date;
import java.util.List;

public class RoomDTO {

	private int roomID;
	private String roomName;
	private boolean active;
	private int hotelID;
	private int day;
	private Date date;
	private List<PriceDTO> priceList;
	public RoomDTO(int roomID, String roomName, boolean active, int hotelID, int day, Date date,
			List<PriceDTO> priceList) {
		super();
		this.roomID = roomID;
		this.roomName = roomName;
		this.active = active;
		this.hotelID = hotelID;
		this.day = day;
		this.date = date;
		this.priceList = priceList;
		
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
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public List<PriceDTO> getPriceList() {
		return priceList;
	}
	public void setPriceList(List<PriceDTO> priceList) {
		this.priceList = priceList;
	}
	
	
}
