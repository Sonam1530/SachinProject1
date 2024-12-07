package javaPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LoginPage {

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
		driver.findElement(By.xpath("//a[contains(text() ,'Create new account')]")).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Sachin");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Gaydhane");
		// driver.findElement(By.xpath("//h2[text()='Facebook helps you connect and
		// share with the people in your life.']"));

		WebElement element = driver.findElement(By.xpath("//select[@id='day']"));
		Select day = new Select(element);
		Thread.sleep(2000);
		day.selectByValue("25");
		// driver.findElement(By.xpath("//input[@value='2']")).click();
		// Thread.sleep(4000);
		// driver.findElement(By.xpath("//input[@value='1']")).click();

		Thread.sleep(3000);

		WebElement bm = driver.findElement(By.xpath("//select[@id='month']"));
		Select month = new Select(bm);
		month.selectByVisibleText("Jul");

		Thread.sleep(3000);

		WebElement yr = driver.findElement(By.xpath("//select[@id='year']"));
		Select year = new Select(yr);
		year.selectByIndex(8);

		Thread.sleep(3000);

		List<WebElement> radios = driver.findElements(By.xpath("//input[@type='radio']"));
		System.out.println("Total Radio button :- " + radios.size());

		System.out.println(radios.get(0).isSelected());
		System.out.println(radios.get(1).isEnabled());
		System.out.println(radios.get(2).isDisplayed());
		Thread.sleep(3000);
		radios.get(0).click();
		
		driver.findElement(By.xpath("//input[contains(@id,'u_0_h')]")).sendKeys("Sachin25gaydhane@gmail.com");
		
		driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("Sachin123.");
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//button[contains(@id,'u_0_n')]")).click();

	}

}
