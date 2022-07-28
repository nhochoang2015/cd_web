package hotel_booking.entity;

import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name="DIA_DIEM")
public class Location {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "MA_DIA_DIEM")
	private int locationID;
	@ManyToOne
	@JoinColumn(name="MA_TAI_KHOAN", nullable=false)
	private Account account;
	@Column(name = "TEN_DIA_DIEM", columnDefinition = "nvarchar(max)")
	private String locationName;
	@Column(name = "VI_TRI", columnDefinition = "nvarchar(max)")
	private String position;
	@Column(name = "HINH_ANH", columnDefinition = "nvarchar(max)")
	private String pic;
	@OneToMany(mappedBy = "location", fetch = FetchType.EAGER)
	private Set<Hotel> hotelList;
	
	
	
	public Location(int locationID, String locationName, String position, String pic, Set<Hotel> hotelList) {
		super();
		this.locationID = locationID;
		this.locationName = locationName;
		this.position = position;
		this.pic = pic;
		this.hotelList = hotelList;
	}
	public int getLocationID() {
		return locationID;
	}
	public void setLocationID(int locationID) {
		this.locationID = locationID;
	}
	public String getLocationName() {
		return locationName;
	}
	public void setLocationName(String locationName) {
		this.locationName = locationName;
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
	public Set<Hotel> getHotelList() {
		return hotelList;
	}
	public void setHotelList(Set<Hotel> hotelList) {
		this.hotelList = hotelList;
	}
	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
	}
	
	
}
