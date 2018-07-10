package javaTest;

import static org.junit.Assert.*;

import org.hamcrest.collection.IsMapContaining;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

import com.qa.app.account.management.AccountService;

public class AccountServiceTest {
	
	AccountService service = new AccountService();

	
	@Test
	public void sizeOfMap() {
		service.addAccountToMap("abbas", "ross");
		service.addAccountToMap("scott", "bob");
		assertEquals(service.getAccountMap().size(), 2);		
	}
	@Test
	public void mapHasKey(){
		service.addAccountToMap("bob", "milner");
		service.addAccountToMap("charly", "ales"
				+ "");
		assertTrue(service.getAccountMap().containsKey(4));
	}
	@Test
	public void mapHasValue() {
		service.addAccountToMap("bob", "ross");
		service.addAccountToMap("ross", "bob");

		assertEquals(service.getCreatedAccount(0),"bob ross");
		assertEquals(service.getCreatedAccount(1),"ross bob");
	}
	
	 

}
