package hotel_booking.dto;

import java.util.List;

public class LocationDTO {
	private int locationID;
	private String locationName;
	private String position;
	private String pic;
	private List<HotelDTO> hotelList;
	public LocationDTO(int locationID, String locationName, String position, String pic,
			List<HotelDTO> hotelList) {
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
	public List<HotelDTO> getHotelList() {
		return hotelList;
	}
	public void setHotelList(List<HotelDTO> hotelList) {
		this.hotelList = hotelList;
	}
	
	
}
