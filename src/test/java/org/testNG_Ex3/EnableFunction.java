package org.testNG_Ex3;

import org.testng.annotations.Test;

public class EnableFunction {
	@Test
	public void createAccount() {
		System.out.println("A/c created");
	}
	@Test(enabled=false)
	public void updateAccount() {
		System.out.println("A/c updated");
	}
	@Test
	public void deleteAccount() {
		System.out.println("A/c deleted");
	}
}
