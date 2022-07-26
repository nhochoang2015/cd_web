package hotel_booking.entity;

import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "VAT_PHAM")
public class Item {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "MA_VAT_PHAM")
	private int itemID;
	@Column(name = "GIA")
	private int price;
	@ManyToOne
	@JoinColumn(name = "MA_LOAI_VAT_PHAM", nullable = false)	
	private ItemCategory itemCategory;
    @OneToMany(mappedBy = "item")
	private List<Collection> collectionList;
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
	public ItemCategory getItemCategory() {
		return itemCategory;
	}
	public void setItemCategory(ItemCategory itemCategory) {
		this.itemCategory = itemCategory;
	}
	public List<Collection> getCollectionList() {
		return collectionList;
	}
	public void setCollectionList(List<Collection> collectionList) {
		this.collectionList = collectionList;
	}

}
