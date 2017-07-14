package com.sample.mavenproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class SecondTest {
	
 WebDriver driver;

  @Test
  public void verifySearch() {
   driver = new FirefoxDriver();
   driver.get("http://only-testing-blog.blogspot.in/");
   driver.quit();
  }
}

