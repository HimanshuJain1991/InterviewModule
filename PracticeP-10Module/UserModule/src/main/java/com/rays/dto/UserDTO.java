package com.rays.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "ST_USER")
public class UserDTO extends BaseDTO {

	@Column(name = "FIRST_NAME", length = 20)
	private String firstName;
	@Column(name = "LAST_NAME", length = 20)
	private String lastName;
	@Column(name = "MOBILE_NO", length = 10)
	private String mobileNo;
	@Column(name = "DOB")
	private Date dob;
	@Column(name = "LOGIN_ID", length = 20)
	private String loginId;
	@Column(name = "password", length = 10)
	private String password;
	@Column(name = "ROLE_NAME", length = 20)
	private String roleName;
	@Column(name = "ROLE_ID")
	private Long roleId;
	@Column(name = "IMAGE_ID")
	private Long imageId;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getLoginId() {
		return loginId;
	}

	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public Long getRoleId() {
		return roleId;
	}

	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}

	public Long getImageId() {
		return imageId;
	}

	public void setImageId(Long imageId) {
		this.imageId = imageId;
	}

	@Override
	public String getValue() {
		// TODO Auto-generated method stub
		return firstName;
	}

}
