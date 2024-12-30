package javaPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Online {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				System.setProperty("webdriver.chrome.driver",
						"D:\\Software\\Selemium Webdriver\\chromedriver-win64 (2)\\chromedriver-win64\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				// wait for given time
				Thread.sleep(4000);
				driver.get("https://www.amazon.in/home");
				driver.manage().window().maximize();

				// Delete all cookies
				Thread.sleep(3000);
				driver.manage().deleteAllCookies();
                driver.findElement(By.xpath("//span[@class='icp-nav-link-inner']//span[@class='nav-icon nav-arrow']")).click();
				Thread.sleep(2000);
				
			
	
	}

}
