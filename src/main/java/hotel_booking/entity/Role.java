package hotel_booking.entity;

import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "VAI_TRO")
public class Role {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "MA_VAI_TRO")
	private int roleID;
	@Column(name = "TEN_VAI_TRO")
	private String roleName;
	@OneToMany(mappedBy = "role")
	private List<Account> accountList;
	public int getRoleID() {
		return roleID;
	}
	public void setRoleID(int roleID) {
		this.roleID = roleID;
	}
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	public List<Account> getAccountList() {
		return accountList;
	}
	public void setAccountList(List<Account> accountList) {
		this.accountList = accountList;
	}
	
}
