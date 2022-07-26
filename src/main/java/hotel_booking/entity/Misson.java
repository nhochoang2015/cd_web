package hotel_booking.entity;

import java.util.List;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import hotel_booking.compositeKey.AccountMissonKey;

@Entity
@Table(name = "NHIEM_VU")
public class Misson {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "MA_NHIEM_VU")
	private int missonID;
	@Column(name = "TEN_NHIEM_VU")
	private String missonName;
	@Column(name = "SO_LAN_PHAI_LAM")
	private int timeNeedToComplete;
	@Column(name = "DIEM_THUONG")
	private int reward;
    @OneToMany(mappedBy = "misson")
	private List<AccountMisson> accountMissonList;
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
	public List<AccountMisson> getAccountMissonList() {
		return accountMissonList;
	}
	public void setAccountMissonList(List<AccountMisson> accountMissonList) {
		this.accountMissonList = accountMissonList;
	}

}
