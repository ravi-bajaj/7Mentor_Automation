import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ticket_Booking_SpiceJet {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ravib\\OneDrive\\Desktop\\7-Mentors\\Browsers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();       //Chrome Browser initialization
		driver.manage().window().maximize();        // Maximize Windows
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.get("https://www.spicejet.com/");
		driver.findElement(By.xpath("//input[@name='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
		driver.findElement(By.xpath("//a[@value='PNQ']")).click();
		driver.findElement(By.xpath("(//a[contains(@value,'JAI')])[2]")).click();

		WebElement Element2 = driver.findElement(By.xpath("//select[contains(@name,'DropDownListCurrency')]"));
		Select DropDown = new Select(Element2);
		DropDown.selectByVisibleText("INR");

	}

}
