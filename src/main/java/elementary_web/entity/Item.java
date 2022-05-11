package elementary_web.entity;

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

}
