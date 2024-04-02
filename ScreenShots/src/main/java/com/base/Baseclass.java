package com.base;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Baseclass {
	WebDriver driver;
	public void DriverSetting(String url) {
		System.setProperty("webdriver.chrome.driver","H:/chromedriver.exe");
		driver= new ChromeDriver();
		driver.get(url);
	}
	public void takeScreenshots() throws Exception{
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File target=new File("C:\\Users\\PRITAM\\Desktop\\screen shot\\pic.png");
		FileHandler.copy(src, target);
	}

}
