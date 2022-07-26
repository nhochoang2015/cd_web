package hotel_booking.dto;




public class MissonDTO {

	
	private int missonID;
	private String missonName;
	private int timeNeedToComplete;
	private int reward;
	
	public MissonDTO(int missonID, String missonName, int timeNeedToComplete, int reward) {
		super();
		this.missonID = missonID;
		this.missonName = missonName;
		this.timeNeedToComplete = timeNeedToComplete;
		this.reward = reward;
	}
	public int getMissonID() {
		return missonID;
	}
	public void setMissonID(int missonID) {
		this.missonID = missonID;
	}
	public String getMissonName() {
		return missonName;
	}
	public void setMissonName(String missonName) {
		this.missonName = missonName;
	}
	public int getTimeNeedToComplete() {
		return timeNeedToComplete;
	}
	public void setTimeNeedToComplete(int timeNeedToComplete) {
		this.timeNeedToComplete = timeNeedToComplete;
	}
	public int getReward() {
		return reward;
	}
	public void setReward(int reward) {
		this.reward = reward;
	}
	
   
}


