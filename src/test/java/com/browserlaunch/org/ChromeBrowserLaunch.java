package com.browserlaunch.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowserLaunch {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Madhan Kumar\\eclipse-workspace\\RevSeleniumDay1\\src\\test\\resources\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.greenstechnologys.com");
		driver.get("http://gmail.com/");
		driver.get("http://www.flipkart.com/");
		driver.get("http://greenstech.in/selenium-course-content.html");
		driver.close();

	}

}
