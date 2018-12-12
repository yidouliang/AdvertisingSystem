package com.boot.security.server.model;

import java.util.Date;

public class AdvertisingCompany extends BaseEntity<Long> {

	private String companyname;
	private String address;
	private Date registrationdate;
	private String chairman;
	private String email;
	private String phone;
	private String businessscope;
	private String staffsize;
	private String companycode;

	public String getCompanyname() {
		return companyname;
	}
	public String setCompanyname() {
		return companyname;
	}
	public String getAddress() {
		return address;
	}
	public String setAddress() {
		return address;
	}
	public Date getRegistrationdate() {
		return registrationdate;
	}
	public Date setRegistrationdate() {
		return registrationdate;
	}
	public String getChairman() {
		return chairman;
	}
	public String setChairman() {
		return chairman;
	}
	public String getEmail() {
		return email;
	}
	public String setEmail() {
		return email;
	}
	public String getPhone() {
		return phone;
	}
	public String setPhone() {
		return phone;
	}
	public String getBusinessscope() {
		return businessscope;
	}
	public String setBusinessscope() {
		return businessscope;
	}
	public String getStaffsize() {
		return staffsize;
	}
	public String setStaffsize() {
		return staffsize;
	}
	public String getCompanycode() {
		return companycode;
	}
	public String setCompanycode() {
		return companycode;
	}

}
