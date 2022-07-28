package hotel_booking.dto;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

public class AccountDTO implements UserDetails {

	private int accountID;
	private String accountName;
	private String nickName;
	private String password;
	private String email;
	private String phoneNumber;
	private int validateCode;
	private String roleName;
	private boolean active;
	private List<LocationDTO> locationList;

	
	public AccountDTO(int accountID, String accountName, String nickName, String password, String email,
			String phoneNumber, int validateCode, String roleName, boolean active, List<LocationDTO> locationList) {
		super();
		this.accountID = accountID;
		this.accountName = accountName;
		this.nickName = nickName;
		this.password = password;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.validateCode = validateCode;
		this.roleName = roleName;
		this.active = active;
		this.locationList = locationList;
	}

	public AccountDTO(String accountName, String nickName, String password, String email, String phoneNumber,
			int validateCode, String roleName, boolean active) {
		this.accountName = accountName;
		this.nickName = nickName;
		this.password = password;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.validateCode = validateCode;
		this.roleName = roleName;
		this.active = active;
	}
	

	

	public List<LocationDTO> getLocationList() {
		return locationList;
	}

	public void setLocationList(List<LocationDTO> locationList) {
		this.locationList = locationList;
	}

	public void setValidateCode(int validateCode) {
		this.validateCode = validateCode;
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

	public String getRoleName() {
		return roleName;
	}

	public void setRoleID(String roleName) {
		this.roleName = roleName;
	}

	public boolean isActive() {
		return active;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public int getValidateCode() {
		return validateCode;
	}

	public void setValidationCode(int validateCode) {
		this.validateCode = validateCode;
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		List<GrantedAuthority> result = new ArrayList<GrantedAuthority>();
		result.add(new SimpleGrantedAuthority(this.roleName));
		return result;
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return this.accountName;
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isEnabled() {
		return this.active;
	}

}
