package user_management.dto;

import java.time.LocalDate;

import user_management.entity.Gender;

public class UsersRequestDto {
	private String username;
	private String password;
	private int mobile;
	private String email;
	private LocalDate dob;
	private Gender gender;
	private String address;
	private String dpUrl;
	public UsersRequestDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UsersRequestDto(String username, String password, int mobile, String email, LocalDate dob, Gender gender,
			String address, String dpUrl) {
		super();
		this.username = username;
		this.password = password;
		this.mobile = mobile;
		this.email = email;
		this.dob = dob;
		this.gender = gender;
		this.address = address;
		this.dpUrl = dpUrl;
	}
	@Override
	public String toString() {
		return "UserRequestDto [username=" + username + ", password=" + password + ", mobile=" + mobile + ", email="
				+ email + ", dob=" + dob + ", gender=" + gender + ", address=" + address + ", dpUrl=" + dpUrl + "]";
	}
	
}
