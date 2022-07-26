package hotel_booking.dto;




public class ItemDTO {

	private int itemID;
	private int price;
	private int itemCategoryID;
	public ItemDTO(int itemID, int price, int itemCategoryID) {
		super();
		this.itemID = itemID;
		this.price = price;
		this.itemCategoryID = itemCategoryID;
	}
	public int getItemID() {
		return itemID;
	}
	public void setItemID(int itemID) {
		this.itemID = itemID;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getItemCategoryID() {
		return itemCategoryID;
	}
	public void setItemCategoryID(int itemCategoryID) {
		this.itemCategoryID = itemCategoryID;
	}

}
