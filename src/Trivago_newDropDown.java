import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Trivago_newDropDown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ravib\\OneDrive\\Desktop\\7-Mentors\\Browsers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.get("https://www.trivago.in/");
		driver.findElement(By.xpath("//span[@class='dealform-button__label'][contains(.,'2 Guests')]")).click();
		int i = 0;
		while (i < 3) {
			driver.findElement(By.xpath("//button[contains(@data-role,'addAdult')]")).click();
			i++;
		}

		for (i = 0; i < 3; i++) {

			driver.findElement(By.xpath("//button[@data-role='addChild']")).click();

		}

		driver.findElement(By.xpath("(//button[contains(@type,'button')])[14]")).click();
	}

}
