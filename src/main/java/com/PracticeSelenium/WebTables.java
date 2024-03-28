package com.PracticeSelenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTables {
   public static WebDriver driver;
	
public static void main(String[] args) {

	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	// driver.get("https://www.hyrtutorials.com/p/basic-controls.html");

	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().deleteAllCookies();
	driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");

	((JavascriptExecutor)driver).executeScript("window.scrollTo(0,1000)");
//	List <WebElement> table=driver.findElements(By.id("contactList"));
//
//	for(WebElement tabledata : table) {
//		System.out.println(tabledata.getText());
//	}
	
	handletable("Francisco Chang");
	
	
}
	

public static void handletable(String data) {
	//((JavascriptExecutor)driver).executeScript("window.scrollTo(0,1000)");
	WebElement Table=driver.findElement(By.id("contactList"));
	
	List <WebElement> tableRows=Table.findElements(By.tagName("tr"));
	
	List <WebElement> checkBoxes=Table.findElements(By.cssSelector("[type=\"checkbox\"]"));
	for(int i=0;i<tableRows.size()-1;i++) {
		List<WebElement> tableColumns=tableRows.get(i+1).findElements(By.tagName("td"));
		for(int j=0;j<tableColumns.size();j++) {
			
			
		String cellData=tableColumns.get(j).getText();
		//System.out.println(cellData);
		if(cellData.equals(data)) {
			System.out.println(cellData);
			System.out.println(tableRows.get(i+1).getText());
			checkBoxes.get(i).click();
			
			
		}
		
	}
	
	}
}



	
}
