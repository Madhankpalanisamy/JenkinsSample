package com.browserlaunch.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxBrowserLaunch {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\Madhan Kumar\\eclipse-workspace\\RevSeleniumDay1\\src\\test\\resources\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java");
		driver.get("http://www.greenstechnologys.com/");
		driver.get("https://www.facebook.com/");
		driver.get("https://www.amazon.in");
		driver.get("http://greenstech.in/selenium-course-content.html");
		driver.close();

	}

}
