package com.practice.qa.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {

	public WebDriver driver;

	// launch the browser and application
	
	public WebDriver launchBrowserAndOpenApplication() {

		System.setProperty("webdriver.chrome.driver", "E:\\Selenium Work\\chromedriver.exe");

		String browserName = "chrome";

		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");

		if (browserName.equalsIgnoreCase("chrome"))
			driver = new ChromeDriver(opt);

		else if (browserName.equalsIgnoreCase("firefox"))
			driver = new FirefoxDriver();

		else if (browserName.equalsIgnoreCase("edge"))
			driver = new EdgeDriver();

		else
			System.out.println("Enter the Valid Browser");

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");

		return driver;
	}

}
