package SeleniumSessions;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowPopUp {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/info/DRIVERS/chromedriver_win32_86/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		driver.get("http://popuptest.com/goodpopups.html");
		
		driver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td/font/b/a[3]")).click();
		
		Set<String> handeler = driver.getWindowHandles();
		
		Iterator<String> it = handeler.iterator();
		
		String parentWindowId = it.next();
				System.out.println("parent window id:" + parentWindowId);
		
		String childWindId = it.next();
		System.out.println("child window id:" + childWindId);
		
		driver.switchTo().window(childWindId);
		System.out.println("child" + driver.getTitle());
		
		driver.close();  // close for particular window
		
		driver.switchTo().window(parentWindowId);
		System.out.println("parent" + driver.getTitle());
		
		

	}

}
