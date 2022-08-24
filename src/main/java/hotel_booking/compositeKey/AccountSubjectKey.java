package hotel_booking.compositeKey;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class AccountSubjectKey implements Serializable{
@Column(name="MA_TAI_KHOAN")
int accountID;

@Column(name="MA_PHONG")
int roomID;

public AccountSubjectKey(int accountID, int roomID) {
	super();
	this.accountID = accountID;
	this.roomID = roomID;
}

public AccountSubjectKey() {
	super();
}


}
