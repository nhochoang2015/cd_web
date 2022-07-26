package hotel_booking.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;

import hotel_booking.compositeKey.AccountMissonKey;

@Entity
@Table(name = "NHIEM_VU_TAI_KHOAN")
public class AccountMisson {

	@EmbeddedId
	private AccountMissonKey id;
	@Column(name = "SO_LAN_DA_LAM")
	private int timesDone;
	@Column(name = "NGAY_KET_THUC")
	private Date endDate;
	@Column(name = "HOAN_THANH")
	private boolean isComplete;
	@ManyToOne
	@MapsId("accountID")
	@JoinColumn(name = "MA_TAI_KHOAN")
	private Account account;
	@ManyToOne
	@MapsId("missonID")
	@JoinColumn(name = "MA_NHIEM_VU")	
	private Misson misson;
	public AccountMissonKey getId() {
		return id;
	}
	public void setId(AccountMissonKey id) {
		this.id = id;
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
	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
	}
	public Misson getMisson() {
		return misson;
	}
	public void setMisson(Misson misson) {
		this.misson = misson;
	}

}
