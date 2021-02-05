import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ravib\\OneDrive\\Desktop\\7-Mentors\\Browsers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in");
		System.out.println(" Title of Page is :- " + driver.getTitle());
		System.out.println(" Current Url :- " + driver.getCurrentUrl());
//		System.out.println(" Page Source :-"+driver.getPageSource());
		driver.navigate().to("https://www.spicejet.com/");
		System.out.println(" Title of Page is :- " + driver.getTitle());
		System.out.println(" Current Url :- " + driver.getCurrentUrl());
		driver.navigate().back();
		driver.close();
	}

}
