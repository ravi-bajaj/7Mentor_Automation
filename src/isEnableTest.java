import static org.junit.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class isEnableTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ravib\\OneDrive\\Desktop\\7-Mentors\\Browsers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // Chrome Browser initialization
		driver.manage().window().maximize(); // Maximize Windows
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.get("https://www.spicejet.com/");
		driver.findElement(By.xpath("//input[@name='ctl00$mainContent$view_date2']")).isEnabled();
//		System.out.println("Return date is Enabled ? \n "+ driver.findElement(By.xpath("//input[@name='ctl00$mainContent$view_date2']")).isEnabled());
		
		Assert.assertTrue(driver.findElement(By.xpath("//input[@name='ctl00$mainContent$view_date2']")).isEnabled());
		Assert.assertTrue(true);
		
		
		driver.findElement(By.xpath("//a[contains(.,'Login / Signup')]")).isDisplayed();

		System.out.println(" Is Displayed Button - "
				+ driver.findElement(By.xpath("//a[contains(.,'Login / Signup')]")).isDisplayed());
	}

}
