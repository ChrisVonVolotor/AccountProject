package com.qa.app.account.management;

public class AccountCreation {
	private String firstName;
	private String lastName;
	private Integer accountNumber;
	
	public AccountCreation(String firstName, String lastName, int accountNumber) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.accountNumber = accountNumber;
	}
	
	@Override
	public String toString() {
		return this.firstName + " " + this.lastName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}


	public String getFirstName() {
		return firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public Integer getAccountNumber() {
		return accountNumber;
	}

}
