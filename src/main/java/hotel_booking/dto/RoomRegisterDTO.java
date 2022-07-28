package hotel_booking.dto;

public class RoomRegisterDTO {
	private int accountID;
	private int roomID;
	public RoomRegisterDTO(int accountID, int roomID) {
		super();
		this.accountID = accountID;
		this.roomID = roomID;
	}
	public int getAccountID() {
		return accountID;
	}
	public void setAccountID(int accountID) {
		this.accountID = accountID;
	}
	public int getRoomID() {
		return roomID;
	}
	public void setRoomID(int roomID) {
		this.roomID = roomID;
	}
	
	
}
