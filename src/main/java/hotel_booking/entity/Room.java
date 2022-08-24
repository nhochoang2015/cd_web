package hotel_booking.entity;

import java.sql.Date;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "PHONG")
public class Room {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "MA_PHONG")
	private int roomID;
	@Column(name = "TEN_PHONG", columnDefinition = "nvarchar(max)")
	private String roomName;
	@Column(name = "HOAT_DONG")
	private boolean active;
	@Column(name = "SO_NGUOI")
	private int person;
	@Column(name = "TIEN_ICH", columnDefinition = "nvarchar(max)")
	private String service;
	@OneToMany(mappedBy = "roomid", fetch = FetchType.EAGER)
	private Set<Price> priceList;
	@OneToMany(mappedBy = "room", fetch = FetchType.EAGER)
	private List<RoomRegister> roomRegisters;
	@ManyToOne
	@JoinColumn(name = "MA_KHACH_SAN", nullable = false)
	private Hotel hotel;
	
	public Room() {
		
	}
	public Room(int roomID, String roomName, Hotel hotelID, boolean active,
			Set<Price> priceList, List<RoomRegister> roomRegisters, Hotel hotel, int person,String service) {
		super();
		this.roomID = roomID;
		this.roomName = roomName;
		this.active = active;
		
		this.priceList = priceList;
		this.roomRegisters = roomRegisters;
		this.hotel = hotel;
		this.person=person;
		this.service=service;
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
	public String getService() {
		return service;
	}
	public void setService(String service) {
		this.service = service;
	}
	public int getPerson() {
		return person;
	}
	public void setPerson(int person) {
		this.person = person;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	
	public Set<Price> getPriceList() {
		return priceList;
	}
	public void setPriceList(Set<Price> priceList) {
		this.priceList = priceList;
	}
	public List<RoomRegister> getRoomRegisters() {
		return roomRegisters;
	}
	public void setRoomRegisters(List<RoomRegister> roomRegisters) {
		this.roomRegisters = roomRegisters;
	}
	public Hotel getHotel() {
		return hotel;
	}
	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}
	
	
	
}
