package hotel_booking.dto;

public class LessonCompleteDTO {

	private int lessonID;
	private int accountID;

	public LessonCompleteDTO(int lessonID, int accountID) {
		super();
		this.lessonID = lessonID;
		this.accountID = accountID;
	}

	public int getAccountID() {
		return accountID;
	}

	public void setAccountID(int accountID) {
		this.accountID = accountID;
	}

	public int getLessonID() {
		return lessonID;
	}

	public void setLessonID(int lessonID) {
		this.lessonID = lessonID;
	}

}
