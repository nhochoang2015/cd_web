package hotel_booking.dto;

import java.util.ArrayList;
import java.util.List;

public class PriceDTO {

	private int priceID;
	private String weekday;
	private double price;
	private int roomID;
	public PriceDTO(int priceID, String weekday, double price, int roomID) {
		super();
		this.priceID = priceID;
		this.weekday = weekday;
		this.price = price;
		this.roomID = roomID;
	}
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
	public int getRoomID() {
		return roomID;
	}
	public void setRoomID(int roomID) {
		this.roomID = roomID;
	}

	
}
