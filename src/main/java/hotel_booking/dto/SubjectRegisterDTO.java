package hotel_booking.dto;

public class SubjectRegisterDTO {
	private int accountID;
	private int subjectID;
	public SubjectRegisterDTO(int accountID, int subjectID) {
		super();
		this.accountID = accountID;
		this.subjectID = subjectID;
	}
	public int getAccountID() {
		return accountID;
	}
	public void setAccountID(int accountID) {
		this.accountID = accountID;
	}
	public int getSubjectID() {
		return subjectID;
	}
	public void setSubjectID(int subjectID) {
		this.subjectID = subjectID;
	}
	
	
}
