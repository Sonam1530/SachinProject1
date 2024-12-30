package javaPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestA {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"D:\\Software\\Selemium Webdriver\\chromedriver-win64 (2)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// wait for given time
		Thread.sleep(4000);
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		// Delete all cookies
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@title='Search']")).sendKeys("Selenium");
		Thread.sleep(2000);
		List<WebElement> list =driver.findElements(By.xpath("//ul[@role='listbox']/li"));
		System.out.println("Search Elements :- ");
		Thread.sleep(4000);
		for(WebElement ele: list) {
			System.out.println(ele.getText());
		}

	//	System.out.println("My Name is Sachin");
		
	//	System.out.println("My New Changes on this code");
		
	//	System.out.println("My code reuse for only sonam");
		
    // System.out.println("I am not buying this BMW Car");

	}

}
