package com.rcb.testcases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.rcb.base.TestBase;

public class CreateAccountTest extends TestBase {
	
	@Test
	public void CreateRibyAccount () {
		
		driver.findElement(By.xpath(OR.getProperty("CreateOnebtn_XPATH"))).click();
		
		
	}

	
	
}
