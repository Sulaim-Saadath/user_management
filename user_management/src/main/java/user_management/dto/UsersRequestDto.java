package user_management.dto;

import java.time.LocalDate;

import user_management.entity.Gender;

public class UsersRequestDto {
	private String userName;
	private String password;
	private long mobile;
	private String email;
	private LocalDate dob;
	private Gender gender;
	private String address;
	private String dpUrl;

	public UsersRequestDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UsersRequestDto(String userName, String password, long mobile, String email, LocalDate dob, Gender gender,
			String address, String dpUrl) {
		super();
		this.userName = userName;
		this.password = password;
		this.mobile = mobile;
		this.email = email;
		this.dob = dob;
		this.gender = gender;
		this.address = address;
		this.dpUrl = dpUrl;
	}

	public String getUserName() {
		return userName;
	}

	public void setUsername(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public long getMobile() {
		return mobile;
	}

	public void setMobile(long mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDpUrl() {
		return dpUrl;
	}

	public void setDpUrl(String dpUrl) {
		this.dpUrl = dpUrl;
	}

	@Override
	public String toString() {
		return "UserRequestDto [userName=" + userName + ", password=" + password + ", mobile=" + mobile + ", email="
				+ email + ", dob=" + dob + ", gender=" + gender + ", address=" + address + ", dpUrl=" + dpUrl + "]";
	}

}
