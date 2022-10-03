package org.testNG_EX1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AccountManager {
	@BeforeClass
	public void getUserData() {
		System.out.println("Get Test Data in AM");
	}
	@Test
	public void createAccount() {
    System.out.println("A/c created");
	}
	@Test
	public void updateAccount() {
    System.out.println("A/c updated");
	}
	@Test
	public void deleteAccount() {
    System.out.println("A/c deleted");
	}
	@AfterClass
	public void flushUserData() {
		System.out.println("flushed Test Data from AM");
	}

}
