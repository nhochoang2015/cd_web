package hotel_booking.dto;

import java.util.List;

public class HotelDTO {
	private int hotelID;
	private String hotelName;
	private boolean active;
	private String position;
	private String pic;
	private String comment;
	private int LocationID;
	private List<RoomDTO> roomList;
	public HotelDTO(int hotelID, String hotelName, boolean active, String position, String pic, String comment,
			int locationID, List<RoomDTO> roomList) {
		super();
		this.hotelID = hotelID;
		this.hotelName = hotelName;
		this.active = active;
		this.position = position;
		this.pic = pic;
		this.comment = comment;
		LocationID = locationID;
		this.roomList = roomList;
	}
	public int getHotelID() {
		return hotelID;
	}
	public void setHotelID(int hotelID) {
		this.hotelID = hotelID;
	}
	public String getHotelName() {
		return hotelName;
	}
	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public String getPic() {
		return pic;
	}
	public void setPic(String pic) {
		this.pic = pic;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public int getLocationID() {
		return LocationID;
	}
	public void setLocationID(int locationID) {
		LocationID = locationID;
	}
	public List<RoomDTO> getRoomList() {
		return roomList;
	}
	public void setRoomList(List<RoomDTO> roomList) {
		this.roomList = roomList;
	}
	
	


	

	
}
