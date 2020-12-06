package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/info/DRIVERS/chromedriver_win32_86/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://html.com/input-type-file/");
		driver.findElement(By.xpath("//*[@id='fileupload']")).sendKeys("C:/Users/info/DRIVERS/chromedriver_win32_86/chromedriver.exe");
	}

}
