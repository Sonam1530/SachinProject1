package javaPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseSimulation {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"D:\\Software\\Selemium Webdriver\\chromedriver-win64 (2)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// wait for given time
		Thread.sleep(4000);
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		// Delete all cookies
		Thread.sleep(3000);
		driver.manage().deleteAllCookies();
		Thread.sleep(2000);
		WebElement electro =driver.findElement(By.xpath("//span[text()='Electronics']"));
		Actions em =new Actions(driver);
		
		//mouseHover
		em.moveToElement(electro).build().perform();
		driver.navigate().refresh();
		Thread.sleep(4000);
		
		WebElement Appli =driver.findElement(By.xpath("//span[text()='Appliances']"));
		em.sendKeys(Appli, Keys.ENTER).build().perform();
		System.out.println("Appliances clicked");
		
		//right click on web element
		Thread.sleep(4000);
		em.contextClick().build().perform();
	}
}
