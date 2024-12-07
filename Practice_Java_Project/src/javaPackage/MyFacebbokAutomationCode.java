package javaPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyFacebbokAutomationCode {

	public static void main(String[] args) throws Exception {
		//setting the property of chrome browser and passing chromedriver path
		System.setProperty("webdriver.chrome.driver",
				"D:\\Software\\Selemium Webdriver\\chromedriver-win64 (2)\\chromedriver-win64\\chromedriver.exe");
		
		//Launching chrome browser instance
		WebDriver driver = new ChromeDriver();
		
		//wait for given time
		Thread.sleep(4000);
		driver.get("https://facebook.com");
		driver.manage().window().maximize();
		
		//Delete all cookies
		Thread.sleep(3000);
		driver.manage().deleteAllCookies();
		
		//open URL using navigate() method
		Thread.sleep(3000);
		driver.navigate().to("https://google.com");
		
		//Refresh the page
		Thread.sleep(4000);
		driver.navigate().refresh();
		
		//Navigate to back
		Thread.sleep(2000);
		driver.navigate().back();
		
		//Navigate to forward
		driver.navigate().forward();
		
		//fetch current url
		Thread.sleep(4000);
		System.out.println(driver.getCurrentUrl());
		
		//fetch title of web page
		Thread.sleep(4000);
		System.out.println(driver.getTitle());
		
		Thread.sleep(4000);
		driver.close();
		
		
	}

}
