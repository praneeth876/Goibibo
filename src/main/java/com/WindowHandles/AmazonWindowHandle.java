package com.WindowHandles;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonWindowHandle {
	public static WebDriver driver;
	  
	public static void main(String[] args) throws InterruptedException, AWTException {
		
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		
		//Navigating to Flipkart Home Page
		driver.get("https://www.flipkart.com/");
		System.out.println("Successfully navigated to the Flipkart application");
		
		
		WebElement cancelButton=driver.findElement(By.xpath("//div[@class='JFPqaw']//span[@role='button']"));
		cancelButton.click();
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("iphone");
		System.out.println("Searching IPhone in search bar");
		
		Robot robo=new Robot();
		robo.keyPress(KeyEvent.VK_ENTER);
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div/div/div[3]/div[1]/div[2]/div[2]/div/div/div/a/div[2]")).click();
		System.out.println("1st Iphone is selected");
		
		//If you are not switching the driver to the new window you can't perform actions in new window
		
		//Switching driver
		Thread.sleep(3000);
		switchToWindow("https://www.flipkart.com/apple-iphone-14-blue-128-gb/p/itmdb77f40da6b6d?pid=MOBGHWFHSV7GUFWA&lid=LSTMOBGHWFHSV7GUFWA3AV8J8&marketplace=FLIPKART&q=iphone&store=tyy%2F4io&spotlightTagId=BestsellerId_tyy%2F4io&srno=s_1_1&otracker=search&otracker1=search&fm=Search&iid=1fbd1b93-04da-4909-ac9d-62b65f4697db.MOBGHWFHSV7GUFWA.SEARCH&ppt=sp&ppn=sp&ssid=3pu2ze8p000000001698338637968&qH=0b3f45b266a97d70");
		System.out.println("Driver is successfully switched to the selected 1st iphone window");
		driver.findElement(By.xpath("//button[text()='Add to cart']")).click();
		System.out.println("Item is successfully added to cart");
		
		//Switching back to all mobiles page
		Thread.sleep(3000);
        switchToWindow("https://www.flipkart.com/search?q=iphone&otracker=search&otracker1=search&marketplace=FLIPKART&as-show=on&as=off");
        System.out.println("Driver again switched back to mobile search page");
        
        driver.findElement(By.xpath("/html/body/div/div/div[3]/div[1]/div[2]/div[3]/div/div/div/a/div[3]/div[1]/div[1]")).click();
        System.out.println("Now 2nd Iphone is selected");
		//If you are not switching the driver to the new window you can't perform actions in new window
        Thread.sleep(3000);
		switchToWindow("https://www.flipkart.com/apple-iphone-14-starlight-128-gb/p/itm3485a56f6e676?pid=MOBGHWFHABH3G73H&lid=LSTMOBGHWFHABH3G73HCNASCL&marketplace=FLIPKART&q=iphone&store=tyy%2F4io&spotlightTagId=BestsellerId_tyy%2F4io&srno=s_1_2&otracker=search&otracker1=search&fm=Search&iid=d41903f7-12b3-44fe-91a4-ec6a902305cf.MOBGHWFHABH3G73H.SEARCH&ppt=sp&ppn=sp&ssid=cexmr2yunk0000001698339083172&qH=0b3f45b266a97d70");
		System.out.println("Now driver is successfully switched to the selected 2st iphone window");
		driver.findElement(By.xpath("//button[text()='Buy Now']")).click();
		System.out.println("Buy now button is clicked successfully");
        
        
}
	
	
	//Method to switch from one window to other window by providing the Url 
		//as an argument when we are calling the method
		public static void switchToWindow(String windowUrl) {
			
			Set<String> allWindows=driver.getWindowHandles();
			
			for(String newWin:allWindows) {
				
		     String currentUrls= driver.switchTo().window(newWin).getCurrentUrl();
				if(currentUrls.equals(windowUrl)) {
					break;
				}
			}
		}
	
	
	
	
	
	
	
	
	
	
	
	
}