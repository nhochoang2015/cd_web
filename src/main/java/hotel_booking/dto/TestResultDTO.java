package hotel_booking.dto;

public class TestResultDTO {

	private int testID;
	private int accountID;
	private int result;

	public TestResultDTO(int testID, int accountID, int result) {
		super();
		this.testID = testID;
		this.accountID = accountID;
		this.result = result;
	}

	public int getTestID() {
		return testID;
	}

	public void setTestID(int testID) {
		this.testID = testID;
	}

	public int getAccountID() {
		return accountID;
	}

	public void setAccountID(int accountID) {
		this.accountID = accountID;
	}

	public int getResult() {
		return result;
	}

	public void setResult(int result) {
		this.result = result;
	}

}
