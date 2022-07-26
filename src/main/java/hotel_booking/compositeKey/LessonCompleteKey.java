package hotel_booking.compositeKey;

import java.io.Serializable;

import javax.persistence.*;

@Embeddable
public class LessonCompleteKey implements Serializable {

	@Column(name = "MA_BAI_HOC")
	int lessonID;

	@Column(name = "MA_TAI_KHOAN")
	int accountID;

	public LessonCompleteKey(int lessonID, int accountID) {
		super();
		this.lessonID = lessonID;
		this.accountID = accountID;
	}

	public LessonCompleteKey() {
		super();
	}

}
