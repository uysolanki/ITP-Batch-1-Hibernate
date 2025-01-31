package com.itp.ITPFirstHibernate.entity;

import javax.persistence.Embeddable;

@Embeddable
public class Address {
	
	private int houseNo;
	private String areaName;
	private String city;
	private int pinCode;
	public int getHouseNo() {
		return houseNo;
	}
	public void setHouseNo(int houseNo) {
		this.houseNo = houseNo;
	}
	public String getAreaName() {
		return areaName;
	}
	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPinCode() {
		return pinCode;
	}
	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}
	public Address() {}
	public Address(int houseNo, String areaName, String city, int pinCode) {
		this.houseNo = houseNo;
		this.areaName = areaName;
		this.city = city;
		this.pinCode = pinCode;
	}
	@Override
	public String toString() {
		return "Address [houseNo=" + houseNo + ", areaName=" + areaName + ", city=" + city + ", pinCode=" + pinCode
				+ "]";
	}
}
