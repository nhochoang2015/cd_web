package hotel_booking.entity;

import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "MON_HOC")
public class Subject {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "MA_MON_HOC")
	private int subjectID;
	@ManyToOne
	@JoinColumn(name="MA_TAI_KHOAN", nullable=false)
	private Account account;
	@Column(name = "TEN_MON_HOC", columnDefinition = "nvarchar(max)")
	private String subjectName;
	@Column(name = "HOAT_DONG")
	private boolean active;
	@Column(name="SO_HOC_SINH")
	private int studentCount;
	@Column(name = "NGAY_HOC",columnDefinition = "nvarchar(max)")
	private String weekday;
	@Column(name="GIO" ,columnDefinition = "nvarchar(max)")
	private String time;
	@Column(name="GIA")
	private int price;
	@Column(name="MO_TA",columnDefinition = "nvarchar(max)")
	private String comment;
	@OneToMany(mappedBy = "subject", fetch = FetchType.EAGER)
	private List<SubjectRegister> subjectRegisters;


	
	public Subject(int subjectID, Account account, String subjectName, boolean active, int studentCount, String weekday,
			String time, int price, String comment) {
		super();
		this.subjectID = subjectID;
		this.account = account;
		this.subjectName = subjectName;
		this.active = active;
		this.studentCount = studentCount;
		this.weekday = weekday;
		this.time = time;
		this.price = price;
		this.comment = comment;
		
	}
	
	public Subject() {
		super();
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

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void setSubjectID(int subjectID) {
		this.subjectID = subjectID;
	}

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}
	
	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	
	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
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
	
	

}
