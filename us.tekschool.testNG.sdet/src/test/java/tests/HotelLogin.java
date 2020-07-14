package tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import core.Base;
import pageObj.HotelLoginPageObj;
import utilities.DriverUtility;

public class HotelLogin extends Base {
	HotelLoginPageObj hotelpageObj;

	@BeforeMethod
	public void beforeMethod() {
		Base.initializeDriver();
		logger.info("Browser opened successfully");

	}

	@Test(enabled = false)// testng will skip test case
	public void loginToHotelPage() {
		hotelpageObj = new HotelLoginPageObj();
		hotelpageObj.clickonSignIn();
		logger.info("user clicked on sign in");
		hotelpageObj.enterEmail(getUserName());
		logger.info("user entered email address");
		hotelpageObj.enterPassword(getPassword());
		logger.info("user enter password");
		hotelpageObj.clickonSignInButton();
		logger.info("user clicked on sign In button");
		DriverUtility.screenShot();
	}

	@Test(priority = 2)
	@Parameters({ "userName", "password" })
	public void loginWithParameters(String userName, String Password) {
		hotelpageObj = new HotelLoginPageObj();
		hotelpageObj.clickonSignIn();
		logger.info("user clicked on sign in");
		hotelpageObj.enterEmail(getUserName());
		logger.info("user entered email address from parameter");
		hotelpageObj.enterPassword(getPassword());
		logger.info("user enter password from parameters");
		hotelpageObj.clickonSignInButton();
		logger.info("user clicked on sign In button");
		DriverUtility.screenShot();

	}

	@Test(enabled = false)
	public void testthree() {
		logger.info("this i just a sample test 3");
	}

	@Test(enabled = false)
	public void testfive() {
		logger.info("this i just a sample test 5");
	}

	@Ignore
	public void testsix() {
		logger.info("this i just a sample test 6");
	}

	@Test(priority = 3,enabled = false)
	public void testfour() {
		logger.info("this i just a sample test 4");
	}

	@AfterMethod
	public void afterMethod() {
		Base.tearDown();
		logger.info("Browser closed");
	}

}
