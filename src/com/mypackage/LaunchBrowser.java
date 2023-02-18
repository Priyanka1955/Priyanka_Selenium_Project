package com.mypackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	public static void main(String[] args) throws InterruptedException{
 

		
		//System.setproprty - to set the path of chromediver.exe in your system
		System.setProperty("webdriver.chrome.driver", "C://Drivers//chromedriver.exe");
		
		//Create an object of the chrome driver class
		WebDriver driver = new ChromeDriver();
		System.out.println("chrome object has been created");
		
		//Open the client url
		String url= "https://www.rediff.com";
		driver.get(url);
		System.out.println("open the client url in chrome browser");
		
	    //maximize the browser window...
		driver.manage().window().maximize();
		System.out.println("Chrome driver window got maximized");
	    Thread.sleep(2000);
		
	    //title of page...
	    System.out.println("Tiltle of the opened page.....");
	    System.out.println(driver.getTitle());
	    
	    //minimize the browse window
	    driver.manage().window().minimize();
		System.out.println("Chrome driver window got minimized");
		
		//closing the chrome browser
		driver.close();
		System.out.println("Chrome browser will get closed here....");
		
		
		
		
		
	    
	    
	          }
		// TODO Auto-generated method stub

	}


