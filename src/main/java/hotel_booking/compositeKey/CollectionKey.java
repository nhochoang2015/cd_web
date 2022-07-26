package hotel_booking.compositeKey;

import java.io.Serializable;

import javax.persistence.*;

@Embeddable
public class CollectionKey implements Serializable {

	@Column(name = "MA_VAT_PHAM")
	int itemID;

	@Column(name = "MA_TAI_KHOAN")
	int accountID;
}
