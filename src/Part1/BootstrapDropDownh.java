package Part1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootstrapDropDownh {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_77\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://getbootstrap.com/docs/4.0/components/dropdowns/");
		
		driver.findElement(By.id("dropdownMenuButton")).click();
		List <WebElement>list=driver.findElements(By.xpath("//div[@class='dropdown-menu show' and @aria-labelledby='dropdownMenuButton']//a"));
		
		System.out.println(list.size());
		
		for (int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i).getText());
			if (list.get(i).getText().contains("Something else here")) {
				list.get(i).click();
			break;
			}
		}

	}

}
