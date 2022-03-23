# jpa-lab2
package com;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Customer {
	@Id
	private String customerName;
	private String customerEmail;
	private Address customerAddress;
	public Customer() {}
	public Customer(String customerName, String customerEmail, Address customerAddress) {
		this.customerName = customerName;
		this.customerEmail = customerEmail;
		this.customerAddress = customerAddress;
	}
	public Address getCustomerAddress() {
		return customerAddress;
	}
	public void setCustomerAddress(Address customerAddress) {
		this.customerAddress = customerAddress;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerEmail() {
		return customerEmail;
	}
	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}
	
	
	
}