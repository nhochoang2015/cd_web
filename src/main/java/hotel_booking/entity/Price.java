package hotel_booking.entity;

import javax.persistence.*;

@Entity
@Table(name = "GIA_PHONG")
public class Price {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "MA_GIA_PHONG")
	private int priceID;
	@Column(name = "THU")
	private String weekday;
	@Column(name = "GIA")
	private double price;
	@ManyToOne
	@JoinColumn(name = "MA_PHONG", nullable = false)
	private Room room;
	
	
	public int getPriceID() {
		return priceID;
	}
	public void setPriceID(int priceID) {
		this.priceID = priceID;
	}
	public String getWeekday() {
		return weekday;
	}
	public void setWeekday(String weekday) {
		this.weekday = weekday;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Room getRoom() {
		return room;
	}
	public void setRoom(Room room) {
		this.room = room;
	}
	
	
	
	
	
	
}
