package org.TestNGTutorial;

import org.testng.annotations.Test;

public class Annotation {
	@Test
	public void A() {
		System.out.println("test A");
	}
	@Test
	public void B() {
		System.out.println("test B");
	}
	@Test
	public void C() {
		System.out.println("test C");
	}
	@Test
	public void a() {
		System.out.println("test a");
	}
	@Test
	public void b() {
		System.out.println("test b");
	}
	@Test(priority=-1)
	public void c() {
		System.out.println("test c");
	}
}
/* 
 Execution will happened 
 -Negative priority
 -zero priority==Default Priority(according to ASCI value)
 -According ASCI Value(Upper Case=1st,lower case=2nd) 
*/


