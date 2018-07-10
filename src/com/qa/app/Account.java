package com.qa.app;

import com.qa.app.account.management.AccountService;

import DataManager.AccountJSON;
import DataManager.AccountXML;


public class Account {

	public static void main(String[] args) {
		System.out.println("Hello World to the Standard Out");
		AccountService account = new AccountService();
account.addAccountToMap("Miles", "Moralis");
		AccountJSON json = new AccountJSON();
		AccountXML xml = new AccountXML();

		json.jsonify(account.getAccountMap());
		json.printJson();
		xml.xmlify(account.getAccountMap());
		
	}

}
