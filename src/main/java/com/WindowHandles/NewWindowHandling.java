package com.WindowHandles;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewWindowHandling {
  
	public static WebDriver driver;
	  static String currentWin;
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		
		//Navigating to HYR Tutorials Home Page
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		//scroll down the page
		scrollDown();
		
		//clicking on the Open multiple windows Button
		WebElement newWindowButton=driver.findElement(By.id("newWindowsBtn"));
		newWindowButton.click();
		Thread.sleep(4000);
		
// Window 1  ----> Switching to basic control window
		switchToWindow("https://www.hyrtutorials.com/p/basic-controls.html");
		scrollDown();
		driver.manage().window().maximize();
		//Now actions can be performed in new window because we have switched to new window
		driver.findElement(By.id("firstName")).sendKeys("Vennela");
		Thread.sleep(4000);
        // If u want to close window after entering data then use----> driver.close();
		driver.close();
		
// Window 2  ----> Switching to add-padding-to-containers window
		switchToWindow("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
		scrollDown();
		driver.manage().window().maximize();
		driver.findElement(By.name("name")).sendKeys("Vennela");
		Thread.sleep(4000);
		driver.close();
		
//Default Window  ----> Driver switching back to Home page window		
		switchToWindow("https://www.hyrtutorials.com/p/window-handles-practice.html");
		Thread.sleep(4000);
		driver.close();
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
	
	//Method to scroll down the page (Also you can change the co-ordinates as required)
	public static void scrollDown() {
		
		((JavascriptExecutor)driver).executeScript("window.scrollTo(0,400)");
	}
	
	
	
	
	
}
