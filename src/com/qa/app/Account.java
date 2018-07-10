package com.qa.app;

import com.qa.app.account.management.AccountService;

public class Account {

	public static void main(String[] args) {
		System.out.println("Hello World to the Standard Out");
		AccountService service = new AccountService();
		service.addAccountToMap("bob", "ross");
		service.addAccountToMap("ross", "ross");

		System.out.println(service.getCreatedAccount(1));
	}

}
