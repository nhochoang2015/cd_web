package hotel_booking.entity;

import java.util.List;
import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name = "BAI_THI")
public class Test {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "MA_BAI_THI")
	private int testID;
	@Column(name = "TEN_BAI_THI")
	private String testName;
	@Column(name = "NGAY_BAT_DAU")
	private Date dateStart;
	@Column(name = "NGAY_KET_THUC")
	private Date dateEnd;
	@Column(name = "DIEM_THUONG")
	private int reward;
    @OneToMany(mappedBy = "test")
	private List<TestContent> testContentList;
    @OneToMany(mappedBy = "test")
	private List<TestResult> testResultList;
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
	public List<TestContent> getTestContentList() {
		return testContentList;
	}
	public void setTestContentList(List<TestContent> testContentList) {
		this.testContentList = testContentList;
	}
	public List<TestResult> getTestResultList() {
		return testResultList;
	}
	public void setTestResultList(List<TestResult> testResultList) {
		this.testResultList = testResultList;
	}

}
