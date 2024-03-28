package com.PracticeSelenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UdayTaskFrame {
	public static WebDriver driver;

	@Test
	public static void main2() throws InterruptedException, AWTException {
		WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.goibibo.com/");
        Thread.sleep(2000);
        WebElement popup=driver.findElement(By.xpath("//div[@data-id=\"auth-flow-section\"]//span[@class=\"logSprite icClose\"]"));
        Thread.sleep(2000);
        popup.click();
        WebElement clickFrom=driver.findElement(By.xpath("(//div[@class=\"sc-12foipm-16 wRKJm fswFld \"])[1]"));
        clickFrom.click();
        WebElement sendText=driver.findElement(By.xpath("//input[@type='text']"));
        sendText.sendKeys("Hyderabad");
        Thread.sleep(5000);
        Actions actions = new Actions(driver);
       	actions.sendKeys(Keys.ENTER).build().perform();
       	WebElement sendTextOnTOAddress=driver.findElement(By.xpath("//div[@class=\"sc-12foipm-39 igCzmm\"]//input[@type='text']"));
       	sendTextOnTOAddress.sendKeys("Vishaka");
       	Thread.sleep(5000);
       	actions.sendKeys(Keys.ENTER).build().perform();
        driver.findElement(By.xpath("//body[1]/div[1]/div[4]/div[1]/div[1]/div[2]/div[3]/div[1]")).click();
        driver.findElement(By.xpath("//span[@class=\"DayPicker-NavButton DayPicker-NavButton--next\"]")).click();
      //  driver.findElement(By.xpath("//div[@aria-label=\"Sun May 05 2024\"]")).click();
//        driver.findElement(By.xpath("//p[text()='Click to add a return flight for better discounts']")).click();
//        driver.findElement(By.xpath("//div[@class='sc-12foipm-34 imEUuQ']//div[contains(@class,'sc-12foipm-16 wRKJm fswFld')]")).click();
//        driver.findElement(By.xpath("//body/div[1]/div[3]/div[1]/div[1]/div[2]/div[5]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/span[3]")).click();
//        driver.findElement(By.xpath("//p[text()='Click to add a return flight for better discounts']")).click();

        
List<WebElement> list=driver.findElements(By.xpath("(//div[@class=\"DayPicker-Body\"])[1]//div[@role=\"gridcell\"]"));

//for(WebElement ele : list) {
//	System.out.println(ele.getText()+" ");
//}

System.out.println(list.get(0).getText());
System.out.println(list.get(1).getText());
//for(int i=0;i<list.size();i++) {
//	//System.out.print("");
//	System.out.print(list.get(i).getText());
//}
//System.out.println();
       
      

}
		
		
		

	}


