package hotel_booking.entity;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;

import hotel_booking.compositeKey.RoomRegisterKey;

@Entity
@Table(name = "DANG_KY_PHONG")
public class RoomRegister {
	@EmbeddedId
	private RoomRegisterKey id;
	@ManyToOne
	@MapsId("accountID")
	@JoinColumn(name = "MA_TAI_KHOAN")
	private Account account;
	@ManyToOne
	@MapsId("roomID")
	@JoinColumn(name = "MA_PHONG")
	private Room room;

	public RoomRegister() {
		super();
	}

	public RoomRegister(RoomRegisterKey id, Account account, Room room) {
		super();
		this.id = id;
		this.account = account;
		this.room = room;
	}

	public Room getRoom() {
		return room;
	}

	public void setRoom(Room room) {
		this.room = room;
	}

	public RoomRegisterKey getId() {
		return id;
	}

	public void setId(RoomRegisterKey id) {
		this.id = id;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

}
