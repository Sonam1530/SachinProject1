package javaPackage;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandales {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"D:\\Software\\Selemium Webdriver\\chromedriver-win64 (2)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.get("https://demoqa.com/browser-windows");
		driver.manage().window().maximize();
		// Delete all cookies
		Thread.sleep(3000);
		driver.manage().deleteAllCookies();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='tabButton']")).click();
		//get String total number of windows
		Set<String> allWindowsID = driver.getWindowHandles();
		System.out.println(allWindowsID);
		Iterator<String> abc = allWindowsID.iterator();
		String win1= abc.next();
		String win2=abc.next();
		driver.switchTo().window(win2);
		Thread.sleep(4000);
		System.out.println("child window ID :-" +win2);
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(4000);
		driver.switchTo().window(win1);
		System.out.println("Root window ID :-" +win1);
		System.out.println(driver.getCurrentUrl());
		driver.quit();
		
	}

}
