package com.shift.Guru98;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class GoogleTest extends Google {
	@Test
	public void test01() {
	  WebElement element= driver.findElement(By.name("q"));
	  element.sendKeys("32 degree Celcious to Farnheight");
	  
	}

}
