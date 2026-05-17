package user_management.entity;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Users {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String username;
	private String password;
	private int mobile;
	private String email;
	private Date dob;
	private String gender;
	private String address;
	private String dpUrl;

	public Users() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Users(long id, String username, String password, int mobile, String email, Date dob, String gender,
			String address, String dpUrl) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.mobile = mobile;
		this.email = email;
		this.dob = dob;
		this.gender = gender;
		this.address = address;
		this.dpUrl = dpUrl;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
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

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
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
		return "User [id=" + id + ", username=" + username + ", password=" + password + ", mobile=" + mobile
				+ ", email=" + email + ", dob=" + dob + ", gender=" + gender + ", address=" + address + ", dpUrl="
				+ dpUrl + "]";
	}
	
	
}
