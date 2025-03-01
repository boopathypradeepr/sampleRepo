package com.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Example {
@Test
public void launchUrl() {
//	WebDriverManager.chromedriver().setup();
	System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//driver//chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://google.com/");
	driver.quit();

}


}
