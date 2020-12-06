package SeleniumSessions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadPropFile {
	
	
	static WebDriver driver;

	public static void main(String[] args) throws IOException {
	
		Properties prop = new Properties();
		
		FileInputStream ip = new FileInputStream("C:/Users/info/workspace/Selenium/src/SeleniumSessions/config.properties");
		
		prop.load(ip);
		
		System.out.println(prop.getProperty("name"));
		
		System.out.println(prop.getProperty("age"));
		
		String url = prop.getProperty("URL");
				
		
		String browserName = prop.getProperty("browser");
		System.out.println(browserName);
		
		if(browserName.equals("chrome")){
			System.setProperty("webdriver.chrome.driver", "C:/Users/info/DRIVERS/chromedriver_win32_86/chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(browserName.equals("FF")){
			System.setProperty("webdriver.gecko.driver", "C:/Users/info/DRIVERS/geckodriver-v0.27.0-win64/geckodriver.exe");
			
		}
		
		driver.get(url);
	
		
		
		

	}

}
