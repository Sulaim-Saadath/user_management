package user_management.dto;

import java.time.LocalDate;

import user_management.entity.Gender;

public class UsersResponseDto {
	private String username;
	private int mobile;
	private String email;
	private LocalDate dob;
	private Gender gender;
	private String address;
	private String dpUrl;

	public UsersResponseDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UsersResponseDto(String username, int mobile, String email, LocalDate dob, Gender gender, String address,
			String dpUrl) {
		super();
		this.username = username;
		this.mobile = mobile;
		this.email = email;
		this.dob = dob;
		this.gender = gender;
		this.address = address;
		this.dpUrl = dpUrl;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public int getMobile() {
		return mobile;
	}

	public void setMobile(int mobile) {
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
		return "UsersResponseDto [username=" + username + ", mobile=" + mobile + ", email=" + email + ", dob=" + dob
				+ ", gender=" + gender + ", address=" + address + ", dpUrl=" + dpUrl + "]";
	}

}
