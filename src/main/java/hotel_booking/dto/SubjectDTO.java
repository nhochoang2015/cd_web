package hotel_booking.dto;

public class SubjectDTO {
	private int subjectID;
	private String subjectName;
	private int accountID;
	private boolean active;
	private int studentCount;
	private String weekday;
	private String time;
	private int price;
	private String comment;
	
	


	public SubjectDTO(int subjectID, String subjectName, int accountID, boolean active, int studentCount,
			String weekday, String time, int price, String comment) {
		super();
		this.subjectID = subjectID;
		this.subjectName = subjectName;
		this.accountID = accountID;
		this.active = active;
		this.studentCount = studentCount;
		this.weekday = weekday;
		this.time = time;
		this.price = price;
		this.comment = comment;
		
	}
	
	
	public String getComment() {
		return comment;
	}


	public void setComment(String comment) {
		this.comment = comment;
	}


	public int getSubjectID() {
		return subjectID;
	}

	public void setSubjectID(int subjectID) {
		this.subjectID = subjectID;
	}

	public String getSubjectName() {
		return subjectName;
	}
	
	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public int getAccountID() {
		return accountID;
	}

	public void setAccountID(int accountID) {
		this.accountID = accountID;
	}

	public int getStudentCount() {
		return studentCount;
	}

	public void setStudentCount(int studentCount) {
		this.studentCount = studentCount;
	}

	public String getWeekday() {
		return weekday;
	}

	public void setWeekday(String weekday) {
		this.weekday = weekday;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}
	
	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}


	
}
