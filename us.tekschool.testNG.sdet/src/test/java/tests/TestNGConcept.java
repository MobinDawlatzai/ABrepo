package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGConcept {
	
	@Test
	public void signIn() {
	String a="School";
	String b="College";
	Assert.assertEquals(a,b);
	}
	// test Homepage depends on successful execution of SignIn test.
	@Test (dependsOnMethods = {"signIn"})
	public void homepage() {
		
	System.out.println("this tes is depend on sign In test cases");
		
	}
	@Test (invocationCount = 10)
	public void checkTitle() {
		System.out.println("this test case will run 10 times");
	}
	@Test(groups = {"smokeTest"})
	public void logout() {
		System.out.println("logout tes");
	}
	
	@Test(groups = {"smokeTest"})
	public void dashboard() {
		System.out.println("dashboard tes");
	}
	@Test(groups = {"smokeTest"})
	public void customerPage() {
		System.out.println("customer page test");
	}


}
