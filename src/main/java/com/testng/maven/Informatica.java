package com.testng.maven;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Informatica {
	
	static WebDriver driver = null;

	public static WebDriver launchDriver(String browser) {
		if (browser.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.drive", "Path to the chromedriver.exe");
			driver = new ChromeDriver();
		}
		return driver;

	}
	
	public void launcFacebook(String url)
	{
		
		HashMap<Integer,List<String>> tableDataPerRow = new HashMap<Integer,List<String>>();
		driver.get("http://www.facebook.com");
		try{
		driver.findElement(By.id("username")).sendKeys("username");
		driver.findElement(By.className("passwordClassname"));
		int countOfRows = driver.findElements(By.xpath("//table[@id='someid']//tr")).size();
		for(int i=1;i<=countOfRows;i++)
		{
		List<String> dataFromTable = new ArrayList<String>();
		int noOfColumns = driver.findElements(By.xpath("//table[@id='someid']//tr["+i+"]/td")).size();
		for(int x =1;x<=noOfColumns;x++)
		{
			
			dataFromTable.add(driver.findElement(By.xpath("//table[@id='someid']//tr["+i+"]/td["+x+"]")).getText());
		}
		tableDataPerRow.put(i, dataFromTable);
		}
		}
		catch(Exception e)
		{
			System.out.println("Some exception while logging into the facebook "+e.getMessage());
		}
	}
	
	

	Gson gson = new Gson();
				gson.
	
	
	
	
	//input[@id='login_username']

}
