package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementsVisibility {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/Users/info/DRIVERS/chromedriver_win32_86/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://classic.freecrm.com/register");
		
		boolean b1 = driver.findElement(By.id("submitButton")).isDisplayed();
		System.out.println(b1);
		
		boolean b2 = driver.findElement(By.id("submitButton")).isEnabled();
		System.out.println(b2);
		
		driver.findElement(By.name("agreeTerms")).click();
		
		boolean b3 = driver.findElement(By.id("submitButton")).isEnabled();
		System.out.println(b3);
	

		

	}

}
