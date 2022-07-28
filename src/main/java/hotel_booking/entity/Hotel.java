package hotel_booking.entity;

import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name = "KHACH_SAN")
public class Hotel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "MA_KHACH_SAN")
	private int hotelID;
	@Column(name = "TEN_KHACH_SAN", columnDefinition = "nvarchar(max)")
	private String hotelName;
	@Column(name = "HOAT_DONG")
	private boolean active;
	@Column(name = "VI_TRI",columnDefinition = "nvarchar(max)")
	private String position;
	@Column(name="HINH_ANH" ,columnDefinition = "nvarchar(max)")
	private String pic;
	@Column(name="TIEN_ICH",columnDefinition = "nvarchar(max)")
	private String comment;
	
	@OneToMany(mappedBy = "hotel", fetch = FetchType.EAGER)
	private Set<Room> roomList;
	
	@ManyToOne
	@JoinColumn(name = "MA_DIA_DIEM", nullable = false)
	private Location location;

	public Hotel(int hotelID, String hotelName, boolean active, String position, String pic, String comment,
			Set<Room> roomList, Location location) {
		super();
		this.hotelID = hotelID;
		this.hotelName = hotelName;
		this.active = active;
		this.position = position;
		this.pic = pic;
		this.comment = comment;
		this.roomList = roomList;
		this.location = location;
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

	public Set<Room> getRoomList() {
		return roomList;
	}

	public void setRoomList(Set<Room> roomList) {
		this.roomList = roomList;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}
	
	
	

}
