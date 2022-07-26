package hotel_booking.entity;

import javax.persistence.*;

import hotel_booking.compositeKey.CollectionKey;

@Entity
@Table(name = "BO_SUU_TAP")
public class Collection {    
	@EmbeddedId
	private CollectionKey id;
	@ManyToOne
	@MapsId("accountID")
	@JoinColumn(name = "MA_TAI_KHOAN")
	private Account account;
	@ManyToOne
	@MapsId("itemID")
	@JoinColumn(name = "MA_VAT_PHAM")
	private Item item;
	public CollectionKey getId() {
		return id;
	}
	public void setId(CollectionKey id) {
		this.id = id;
	}
	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
	}
	public Item getItem() {
		return item;
	}
	public void setItem(Item item) {
		this.item = item;
	}

}
