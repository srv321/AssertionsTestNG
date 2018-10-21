package MyTests;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Testcases {

	// hard assertion: hard validation: if a hard assertion is getting
	// failed-->immed. tc'll b marked as failed &
	// tc will be terminated
	// soft assertion: soft validation: if a soft assertion is getting
	// failed-->tc'll not b marked as failed as well as
	// next lines will be executed
	// asserAll() : to mark the tc as failed , if any soft assertion is getting
	// failed

	@Test
	public void test1() {
		SoftAssert softassert1 = new SoftAssert();
		System.out.println("Open Browser");
		Assert.assertEquals(true, true);// hard assert

		System.out.println("enter username");
		System.out.println("enter password");
		System.out.println("click on sign in button");

		Assert.assertEquals(true, true);

		System.out.println("validate Home Page");
		softassert1.assertEquals(true, false, "home page title is missing");// soft assertion

		System.out.println("go to deals page");
		System.out.println("create a deal");
		softassert1.assertEquals(true, false, "not able to create a deal");

		System.out.println("go to contacts page");
		System.out.println("create a contact");
		softassert1.assertEquals(true, false, "not able to create a contact");

		softassert1.assertAll();
	}

	@Test
	public void test2() {
		SoftAssert softassert2 = new SoftAssert();
		System.out.println("logout");
		Assert.assertEquals(true, false);
		softassert2.assertAll();
	}

	@AfterClass
	public void tearDown() {
		// softassert.assertAll();
	}

}
