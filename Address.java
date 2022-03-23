package com;

import java.io.Serializable;

public class Address implements Serializable{
	private String customerAddress;
	public Address() {}
	public Address(String customerAddress) {
		this.customerAddress = customerAddress;
	}
	public String getCustomerAddress() {
		return customerAddress;
	}
	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}
	@Override
	public String toString() {
		return customerAddress;
	}
	

}