package com.browserlaunch.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IEBrowserLaunch {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.ie.driver",
				"C:\\Users\\Madhan Kumar\\eclipse-workspace\\RevSeleniumDay1\\src\\test\\resources\\IEDriverServer.exe");

		WebDriver driver = new InternetExplorerDriver();
		driver.get("https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java");
		driver.get("http://www.greenstechnologys.com/");
		driver.get("https://www.facebook.com/");
		driver.get("https://www.amazon.in");
		driver.get("http://greenstech.in/selenium-course-content.html");
		driver.close();

	}

}
