import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class salesforce {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ravib\\OneDrive\\Desktop\\7-Mentors\\Browsers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.get("https://www.salesforce.com/in");
		driver.findElement(By.xpath("(//a[contains(.,'Login')])[1]")).click();
		driver.findElement(By.id("username")).sendKeys("abcd@gmail.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("123456789");
		driver.findElement(By.xpath("//input[@id='Login']")).click();
		Thread.sleep(200);
		driver.navigate().back();
		driver.findElement(By.partialLinkText("Try for Free")).click();
		driver.findElement(By.xpath("//input[@name='UserFirstName']")).sendKeys("ABC");
		driver.findElement(By.xpath("//input[@name='UserLastName']")).sendKeys("XYZ");
		driver.findElement(By.xpath("//select[@name='UserTitle']")).sendKeys("IT Manager");
		driver.findElement(By.name("CompanyName")).sendKeys("Seven Mentors");
		WebElement Element = driver.findElement(By.xpath("//select[@name='CompanyEmployees']"));
		Select sel = new Select(Element);
		sel.selectByVisibleText("15 - 100 employees");
		driver.findElement(By.xpath("//input[@name='UserPhone']")).sendKeys("1234567890");
//		driver.findElement(By.xpath("//select[@name='CompanyCountry']")).sendKeys("India");
		driver.findElement(By.xpath("//select[@name='CompanyCountry']")).sendKeys("Iceland");
	}

}
