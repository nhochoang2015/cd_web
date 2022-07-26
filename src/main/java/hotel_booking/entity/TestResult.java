package hotel_booking.entity;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;

import hotel_booking.compositeKey.TestResultKey;

@Entity
@Table(name = "KET_QUA_BAI_THI")
public class TestResult {

	@EmbeddedId
	private TestResultKey id;
	@ManyToOne
	@MapsId("accountID")
	@JoinColumn(name = "MA_TAI_KHOAN")
	private Account account;
	@ManyToOne
	@MapsId("testID")
	@JoinColumn(name = "MA_BAI_THI")
	private Test test;
	@Column(name = "DIEM")
	private int result;

	public TestResultKey getId() {
		return id;
	}

	public void setId(TestResultKey id) {
		this.id = id;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public Test getTest() {
		return test;
	}

	public void setTest(Test test) {
		this.test = test;
	}

	public int getResult() {
		return result;
	}

	public void setResult(int result) {
		this.result = result;
	}

}
