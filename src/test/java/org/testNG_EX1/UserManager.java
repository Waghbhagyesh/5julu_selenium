package org.testNG_EX1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class UserManager {
	@BeforeClass
	public void getUserData() {
		System.out.println("Get User Data in AM");
	}
	@Test
	public void createUser() {
    System.out.println("User created");
	}
	@Test
	public void updateUser() {
    System.out.println("User updated");
	}
	@Test
	public void deleteUser() {
    System.out.println("User deleted");
	}
	@AfterClass
	public void flushUserData() {
		System.out.println("flushed User Data from AM");
	}

}
