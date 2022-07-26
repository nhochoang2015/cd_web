package hotel_booking.compositeKey;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class AccountSubjectKey implements Serializable{
@Column(name="MA_TAI_KHOAN")
int accountID;

@Column(name="MA_MON_HOC")
int subjectID;

public AccountSubjectKey(int accountID, int subjectID) {
	super();
	this.accountID = accountID;
	this.subjectID = subjectID;
}

public AccountSubjectKey() {
	super();
}


}
