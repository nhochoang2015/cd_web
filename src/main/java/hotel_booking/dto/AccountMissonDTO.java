package hotel_booking.dto;

import java.util.Date;

public class AccountMissonDTO {

	private int missonID;
	private int accountID;
	private int timesDone;
	private Date endDate;
	private boolean isComplete;

	public AccountMissonDTO(int missonID, int accountID, int timesDone, Date endDate, boolean isComplete) {
		super();
		this.missonID = missonID;
		this.accountID = accountID;
		this.timesDone = timesDone;
		this.endDate = endDate;
		this.isComplete = isComplete;
	}

	public int getMissonID() {
		return missonID;
	}

	public void setMissonID(int missonID) {
		this.missonID = missonID;
	}

	public int getAccountID() {
		return accountID;
	}

	public void setAccountID(int accountID) {
		this.accountID = accountID;
	}

	public int getTimesDone() {
		return timesDone;
	}

	public void setTimesDone(int timesDone) {
		this.timesDone = timesDone;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public boolean isComplete() {
		return isComplete;
	}

	public void setComplete(boolean isComplete) {
		this.isComplete = isComplete;
	}

}
