package com.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Example {
@Test
public void launchUrl() {
	System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
	ChromeOptions options=new ChromeOptions();
	options.addArguments("--headless");
	options.addArguments("--no-sandbox");
	options.addArguments("--disable-dev-shm-usage");
	options.addArguments("--disable-gpu");
	options.addArguments("--remote-allow-origins=*");
	options.addArguments("remote-debugging-port=9222");
	WebDriver driver=new ChromeDriver(options);
	driver.get("https://google.com/");
	driver.quit();

}


}
