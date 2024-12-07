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
				driver.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_5szpgfto9i_e&adgrpid=155259813593&hvpone=&hvptwo=&hvadid=713930225169&hvpos=&hvnetw=g&hvrand=7621698402109511345&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9182035&hvtargid=kwd-64107830&hydadcr=14452_2402225&gad_source=1");
				driver.manage().window().maximize();

				// Delete all cookies
				Thread.sleep(3000);
				driver.manage().deleteAllCookies();
driver.findElement(By.xpath("//a[contains(text(),'Start here.')]")).click();
				Thread.sleep(2000);
	}

}
