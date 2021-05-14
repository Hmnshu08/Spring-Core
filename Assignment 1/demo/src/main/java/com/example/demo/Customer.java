package com.example.demo;

import java.util.List;

public class Customer {

	
	private int customerId;
	private String customerName;
	private int customerContact;
	private List<Address> customerAddress;
	
	
	public void showInfo(){
		for (Address address : customerAddress) {
            System.out.println(customerAddress);
        }
	}
	
	
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public int getCustomerContact() {
		return customerContact;
	}
	public void setCustomerContact(int customerContact) {
		this.customerContact = customerContact;
	}


	public List<Address> getCustomerAddress() {
		return customerAddress;
	}


	public void setCustomerAddress(List<Address> customerAddress) {
		this.customerAddress = customerAddress;
	}


	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", customerContact="
				+ customerContact + ", customerAddress=" + customerAddress + "]";
	}
	
	
	
}
