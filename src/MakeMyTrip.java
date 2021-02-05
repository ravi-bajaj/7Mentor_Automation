import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MakeMyTrip {

	public static void main(String[] args) throws InterruptedException {		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ravib\\OneDrive\\Desktop\\7-Mentors\\Browsers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // Chrome Browser initialization
		driver.manage().window().maximize(); // Maximize Windows
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.get("https://www.makemytrip.com");
		driver.findElement(By.xpath("//div[@data-cy='outsideModal']")).click();
//		driver.findElement(By.cssSelector(".landingContainer")).click();
		driver.findElement(By.cssSelector(".makeFlex.ctryArrow.undefined")).click();
		driver.findElement(By.cssSelector(".flagSprite.appendRight5.ae")).click();
//		driver.navigate().refresh();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".makeFlex.hrtlCenter.font10.makeRelative.lhUser")).click();
//		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("8669143798");
//		driver.findElement(By.xpath("//span[contains(.,'Continue')]")).click();
//		driver.findElement(By.xpath("//div[@data-cy='outsideModal']")).click();
		driver.findElement(By.cssSelector(".fsw_inputField.lineHeight36.latoBlack.font30")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//p[contains(.,'Mumbai, India')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[contains(@for,'toCity')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//p[contains(.,'Delhi, India')]")).click();
		driver.findElement(By.cssSelector(".fsw_inputField.lineHeight36.latoBlack.font30")).click();
		driver.findElement(By.xpath(".fsw_inputBox.dates.inactiveWidget")).click();
		
	}

}
