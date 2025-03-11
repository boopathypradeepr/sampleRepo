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
	// WebDriverManager.chromedriver().setup();
//	System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//driver//chromedriver.exe");
	System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
	// System.setProperty("webdriver.chrome.driver", "/var/lib/jenkins/workspace/JenkinsProject/testing-code-dir/driver/chromedriver");
	ChromeOptions options=new ChromeOptions();
//	options.addArguments("--headless");
//	options.addArguments("--no-sandbox");
//	options.addArguments("--disable-dev-shm-usage");
//	options.addArguments("--disable-gpu");
//	options.addArguments("--remote-allow-origins=*");
	WebDriver driver=new ChromeDriver(options);
	driver.get("https://google.com/");
	driver.quit();

}


}
