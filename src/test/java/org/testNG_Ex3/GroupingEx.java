package org.testNG_Ex3;

import org.testng.annotations.Test;

public class GroupingEx {
	@Test(groups= {"regrassion","UAT","smoke"})
	public void test_1() {
		System.out.println("test_1");
	}
	@Test(groups= {"regrassion","smoke"})
	public void test_2() {
		System.out.println("test_2");
	}
	@Test(groups= {"regrassion","UAT"})
	public void test_3() {
		System.out.println("test_3");
	}
	@Test(groups= {"UAT","smoke"})
	public void test_4() {
		System.out.println("test_4");
	}
	@Test(groups= {"smoke"})
	public void test_5() {
		System.out.println("test_5");
	}
	@Test(groups= "UAT")
	public void test_6() {
		System.out.println("test_6");
	}
	@Test(groups= "regrassion")
	public void test_7() {
		System.out.println("test_7");
	}
	@Test
	public void test_() {
		System.out.println("test_5");
	}
}
