package hotel_booking.entity;

import java.util.List;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "TAI_KHOAN")
public class Account {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "MA_TAI_KHOAN")
	private int accountID;
	@NotEmpty(message = "Chưa nhập tên tài khoản")
	@Column(name = "TEN_TAI_KHOAN", unique = true)
	private String accountName;
	@Column(name = "NICK_NAME",columnDefinition = "nvarchar(max)")
	private String nickName;
	@Column(name = "MAT_KHAU")
	private String password;
	@Column(name = "EMAIL", unique = true)
	private String email;
	@Column(name = "SDT", unique = true)
	private String phoneNumber;
	@Column(name = "MA_XAC_NHAN")
	private int validateCode;
	@Column(name = "HOAT_DONG")
	private boolean active;
	@OneToMany(mappedBy ="account",fetch = FetchType.EAGER)
	private List<Subject> subject;
	@ManyToOne
	@JoinColumn(name = "MA_VAI_TRO", nullable = false)
	private Role role;
	@OneToMany(mappedBy = "account")
	List<SubjectRegister> subjectRegisters;
	
	
	



	public Account(int accountID, String accountName, String nickName, String password, String email,
			String phoneNumber, int validateCode, boolean active, List<Subject> subject, Role role,
			Subject subjectby) {
		super();
		this.accountID = accountID;
		this.accountName = accountName;
		this.nickName = nickName;
		this.password = password;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.validateCode = validateCode;
		this.active = active;
		this.subject = subject;
		this.role = role;
	}
	
	public Account() {
		super();
	}

	public int getAccountID() {
		return accountID;
	}

	public void setAccountID(int accountID) {
		this.accountID = accountID;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public int getValidateCode() {
		return validateCode;
	}

	public void setValidateCode(int validateCode) {
		this.validateCode = validateCode;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}


	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public List<Subject> getSubject() {
		return subject;
	}

	public void setSubject(List<Subject> subject) {
		this.subject = subject;
	}

	

	
}
