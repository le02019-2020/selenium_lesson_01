package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WeDriverBasics {

	public static void main(String[] args) {
		
				
		
		/*
		FireFox :
		System.setProperty("webdriver.gecko.driver", "C:/Users/info/DRIVERS/geckodriver-v0.27.0-win64/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		
		Safari: 
		WebDriver driver = new SafariDriver();
		> use Safari extention for selenium
		> Need to enable - Allow Remote Automation  
		
		*/
		
				
		System.setProperty("webdriver.chrome.driver", "C:/Users/info/DRIVERS/chromedriver_win32_86/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
		String title = driver.getTitle();
		System.out.println(title);
		
	

	}

}
