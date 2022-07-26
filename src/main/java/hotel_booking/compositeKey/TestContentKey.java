package hotel_booking.compositeKey;

import java.io.Serializable;

import javax.persistence.*;

@Embeddable
public class TestContentKey implements Serializable {
	@Column(name = "MA_BAI_THI")
	int testID;

	@Column(name = "MA_CAU_HOI")
	int questionID;

}
