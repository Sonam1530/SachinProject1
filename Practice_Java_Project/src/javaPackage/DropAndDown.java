package javaPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DropAndDown {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"D:\\Software\\Selemium Webdriver\\chromedriver-win64 (2)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		// wait for given time
		Thread.sleep(4000);
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();

		// Delete all cookies
		Thread.sleep(3000);
		driver.manage().deleteAllCookies();
		Thread.sleep(2000);
		
		//Switch to frame
		driver.switchTo().frame(0);
		System.out.println("Switched to frame");
		
		//find drag element
		WebElement drag =driver.findElement(By.xpath("//div[@id='draggable']"));
		Thread.sleep(3000);
		//find drop element
		WebElement drop =driver.findElement(By.xpath("//div[@id='droppable']"));
		Thread.sleep(3000);
		
		//Create action class for dragAndDrop 
		Actions act = new Actions(driver);
		act.dragAndDrop(drag,drop).build().perform();
	}

}
