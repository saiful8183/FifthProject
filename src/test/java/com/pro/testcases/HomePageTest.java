package com.pro.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import org.testng.annotations.Test;

import com.pro.pages.TestBase;
import com.pro.pages.AddToCart;
import com.pro.pages.CheckOutComplet;
import com.pro.pages.CheckOutPageStepOne;
import com.pro.pages.CheckOutStepTwo;
import com.pro.pages.ChectOut;
import com.pro.pages.LoginPage;
import com.pro.pages.LoginPageToHomePage;

public class HomePageTest extends TestBase {

	@Test(priority = 1)
	public void Testswaglablogin() {

		extentTest.info("Browser launched");
		LoginPage logipage = PageFactory.initElements(driver, LoginPage.class);

		extentTest.info("Loged in Swaglab");

		logipage.swaglabUserPass(excel.getStringData("UserPass", 1, 0), excel.getStringData("UserPass", 1, 1));
		logipage.swaglablogin();

		LoginPageToHomePage loginPageToHomePage = PageFactory.initElements(driver, LoginPageToHomePage.class);

		System.out.println(loginPageToHomePage.checkElements());
		Assert.assertTrue(loginPageToHomePage.checkElements());

	

	
	}

	@Test(priority = 2)

	public void TestAddToCart() {

		extentTest.info("Browser launched");
		AddToCart addToCart = PageFactory.initElements(driver, AddToCart.class);

		extentTest.info("Loged in Swaglab");

		// System.out.println(addToCart.checkElements());
		// Assert.assertTrue(addToCart.checkElements());
		addToCart.swaglabAddCart();

		addToCart.TestCartItems();

	}

	
	
	
	
}
