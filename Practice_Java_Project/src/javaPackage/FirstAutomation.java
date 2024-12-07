package javaPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FirstAutomation {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Software\\Selemium Webdriver\\chromedriver-win64 (2)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://magento.softwaretestingboard.com");
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		WebElement wm= driver.findElement(By.xpath("//span[contains (text(),'Women')]"));
		Actions wom =new Actions(driver);
		//WebElement wm =driver.findElement(By.xpath(""));
		wom.moveToElement(wm).build().perform();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[contains(@id,'ui-id-9')]")).click();
	}

}
