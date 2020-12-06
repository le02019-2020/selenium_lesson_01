package com.datadriven.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.excel.utility.Xls_Reader;

public class ParameterizeTest {

	public static void main(String[] args) {
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:/Users/info/DRIVERS/chromedriver_win32_86/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://signup.ebay.com/pa/crte?ru=https%3A%2F%2Fwww.ebay.com%2F");
		
		Xls_Reader reader = new Xls_Reader("C:/Users/info/workspace/Selenium/src/com/testData/EbayTestData.xlsx");
		
		int rowCount = reader.getRowCount("RegTestData");
		
		
		// Parameterization: 
		for(int rowNum = 2; rowNum<=rowCount; rowNum++){
			String firstName = reader.getCellData("RegTestData", "firstname", rowNum);
			System.out.println(firstName);
			
			String lastName = reader.getCellData("RegTestData", "lastname", rowNum);
			System.out.println(lastName);
			
			String Email = reader.getCellData("RegTestData", "email", rowNum);
			System.out.println(Email);
			
			
			driver.findElement(By.xpath("//*[@id='firstname']")).clear();	
			driver.findElement(By.xpath("//*[@id='firstname']")).sendKeys(firstName);
			driver.findElement(By.xpath("//*[@id='lastname']")).clear();
			driver.findElement(By.xpath("//*[@id='lastname']")).sendKeys(lastName);
			driver.findElement(By.xpath("//*[@id='Email']")).clear();
			driver.findElement(By.xpath("//*[@id='Email']")).sendKeys(Email);
		}
		

	}

}
