package hotel_booking.compositeKey;

import java.io.Serializable;

import javax.persistence.*;

@Embeddable
public class TestResultKey implements Serializable{

	@Column(name = "MA_BAI_THI")
	int testID;

	@Column(name = "MA_TAI_KHOAN")
	int accountID;
}
