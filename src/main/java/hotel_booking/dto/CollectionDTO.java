package hotel_booking.dto;



public class CollectionDTO {

	private int itemID;
	private int accountID;
	public CollectionDTO(int itemID, int accountID) {
		super();
		this.itemID = itemID;
		this.accountID = accountID;
	}
	public int getItemID() {
		return itemID;
	}
	public void setItemID(int itemID) {
		this.itemID = itemID;
	}
	public int getAccountID() {
		return accountID;
	}
	public void setAccountID(int accountID) {
		this.accountID = accountID;
	}


}
