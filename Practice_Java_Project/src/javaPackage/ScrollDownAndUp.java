package javaPackage;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollDownAndUp {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"D:\\Software\\Selemium Webdriver\\chromedriver-win64 (2)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// wait for given time
		Thread.sleep(4000);
		driver.get("https://facebook.com");
		driver.manage().window().maximize();

		// Delete all cookies
		Thread.sleep(3000);
		driver.manage().deleteAllCookies();
		Thread.sleep(2000);

		// JavaScriptExecutor
		JavascriptExecutor jse = (JavascriptExecutor) driver;

		// Scroll Down using Javascript
		Thread.sleep(3000);
		jse.executeScript("window.scrollBy(0,500)");

		// Scroll Up using Javascript.
		Thread.sleep(3000);
		jse.executeScript("window.scrollBy(0,-500)");
	}

}
