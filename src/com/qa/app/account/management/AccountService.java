package com.qa.app.account.management;

import java.util.HashMap;
import java.util.Random;

public class AccountService {
	HashMap<Integer,AccountCreation> accountMap = new HashMap<Integer,AccountCreation>();
	private static Integer accountID = 0;
	
	private void generateID(){
		accountID = accountID+1;
	}
	
	public void addAccountToMap(String fName, String lName) {
		AccountCreation newAccount = createAccount(fName, lName);
		accountMap.put(getAccountID(), newAccount);
		generateID();
	}
	
	public AccountCreation  createAccount(String fName, String lName) {
		
		return new AccountCreation(fName, lName, getAccountID());
	}

	public Integer getAccountID() {
		return accountID;
	}
	
	public String getCreatedAccount(Integer nKey) {
		return accountMap.get(nKey).toString();
		}
	
	public HashMap<Integer,AccountCreation> getAccountMap(){
		return accountMap;
	}
	
	

	
	

}
