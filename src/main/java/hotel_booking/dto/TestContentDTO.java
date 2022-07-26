package hotel_booking.dto;

public class TestContentDTO {
	private int questionID;
	private int testID;

	public TestContentDTO(int questionID, int testID) {
		super();
		this.questionID = questionID;
		this.testID = testID;
	}

	public int getQuestionID() {
		return questionID;
	}

	public void setQuestionID(int questionID) {
		this.questionID = questionID;
	}

	public int getTestID() {
		return testID;
	}

	public void setTestID(int testID) {
		this.testID = testID;
	}

}
