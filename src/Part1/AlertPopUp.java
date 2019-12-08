package Part1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class AlertPopUp {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\\\\\\\chromedriver_77\\\\\\\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.name("proceed")).click();
		
		Thread.sleep(3000);
		Alert alert=driver.switchTo().alert();
		
		System.out.println(alert.getText());
		System.out.println(alert.getClass());
		
		String s=alert.getText();
		if (s.equals("Please enter a valid user name"))
		{
			System.out.println("Pass");
		}
		else {
			System.out.println("Pass");
		}
		alert.accept();
		//alert.dismiss--- to cancel the alert

	}

}
