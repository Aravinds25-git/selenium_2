package Part1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DropDown_Select {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\\\\\\\\\\\\\\\chromedriver_77\\\\\\\\\\\\\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.flipkart.com");
		
		driver.findElement(By.xpath("//input[@type='text' and @class='_2zrpKA _1dBPDZ']")).sendKeys("9715566940");

		driver.findElement(By.xpath("//input[@type='password' and @class='_2zrpKA _3v41xv _1dBPDZ']")).sendKeys("aravind@1");
		
		driver.findElement(By.xpath("//button[@type='submit' and @class='_2AkmmA _1LctnI _7UHT_c']")).click();
		
		Actions action =new Actions(driver);
		action.moveToElement(driver.findElement(By.className("_34Yjv1"))).build().perform();
	}

}
