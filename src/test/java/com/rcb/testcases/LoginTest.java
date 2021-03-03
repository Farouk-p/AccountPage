package com.rcb.testcases;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.rcb.base.TestBase;

public class LoginTest extends TestBase {
	
	@Test
	public void loginToAccountPage () throws InterruptedException {
		
		driver.findElement(By.xpath(OR.getProperty("Email_XPATH"))).sendKeys(OR.getProperty("Email"));
		driver.findElement(By.xpath(OR.getProperty("Password_XPATH"))).sendKeys(OR.getProperty("Password"));
		driver.findElement(By.xpath(OR.getProperty("Loginbtn_XPATH"))).click();
		Thread.sleep(3000);
		Assert.assertTrue(isElementPresent(By.xpath(OR.getProperty("FundWallet_XPATH"))),"Login not successful");

		//Alert alert = wait.until(ExpectedConditions.alertIsPresent());
		//Assert.assertTrue(alert.getText().contains(OR.getProperty("AlertText")));
		//alert.accept();
		
		
	}

}
