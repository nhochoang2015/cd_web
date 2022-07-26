package hotel_booking.dto;

import java.util.Date;

public class TestDTO {

	private int testID;

	private String testName;
	private Date dateStart;
	private Date dateEnd;
	private int reward;

	public TestDTO(int testID, String testName, Date dateStart, Date dateEnd, int reward) {
		super();
		this.testID = testID;
		this.testName = testName;
		this.dateStart = dateStart;
		this.dateEnd = dateEnd;
		this.reward = reward;
	}

	public int getTestID() {
		return testID;
	}

	public void setTestID(int testID) {
		this.testID = testID;
	}

	public String getTestName() {
		return testName;
	}

	public void setTestName(String testName) {
		this.testName = testName;
	}

	public Date getDateStart() {
		return dateStart;
	}

	public void setDateStart(Date dateStart) {
		this.dateStart = dateStart;
	}

	public Date getDateEnd() {
		return dateEnd;
	}

	public void setDateEnd(Date dateEnd) {
		this.dateEnd = dateEnd;
	}

	public int getReward() {
		return reward;
	}

	public void setReward(int reward) {
		this.reward = reward;
	}

}
