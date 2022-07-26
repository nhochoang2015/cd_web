package hotel_booking.compositeKey;

import java.io.Serializable;

import javax.persistence.*;

@Embeddable
public class AccountMissonKey implements Serializable {

	@Column(name = "MA_TAI_KHOAN")
	int accountID;

	@Column(name = "MA_NHIEM_VU")
	int missonID;
}
