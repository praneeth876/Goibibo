package com.PracticeSelenium;

import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Practice001 {
	public static WebDriver driver;
	String Actyear;
	String Actmonth;
	String Acttitle;
	WebElement monthElements;
	WebElement yearElements;

	public static void main(String[] args) throws InterruptedException {
		Practice001 obj1 = new Practice001();
		// obj1.datePicker("12","March","2021");
		System.err.println("Select required Date from calender:");
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter day");
		int day = scan.nextInt();
		System.out.println("Enter month");
		String month = scan.next();
		System.out.println("Enter year");
		String year = scan.next();

		obj1.datePicker(day, month, year);
	}
	
	public void datePicker(int ExpDay, String ExpMonth, String ExpYear) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		// driver.get("https://www.hyrtutorials.com/p/basic-controls.html");

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();

		driver.get("https://jqueryui.com/datepicker/");
		By exampleL = By.cssSelector("div.demo-list>h2");
		WebElement example = driver.findElement(exampleL);

		JavascriptExecutor javascriptexecutor = (JavascriptExecutor) driver;

		javascriptexecutor.executeScript("arguments[0].scrollIntoView(true)", example);
		// WebElement
		// frame=driver.findElement(By.cssSelector("[class=\"demo-frame\"]"));
		driver.switchTo().frame(0);
		driver.findElement(By.id("datepicker")).click();

		// October 2023
		WebElement titleElement = driver.findElement(By.xpath("//div[@class=\"ui-datepicker-title\"]"));
		Acttitle = titleElement.getText();
		// 2023
		WebElement yearElement = driver.findElement(By.cssSelector("[class=\"ui-datepicker-year\"]"));
		Actyear = yearElement.getText();
		// October
		WebElement monthElement = driver.findElement(By.cssSelector("[class=\"ui-datepicker-month\"]"));
		Actmonth = monthElement.getText();

		while (true) {
			int ActyearInt = Integer.parseInt(Actyear);
			int ExpYearInt = Integer.parseInt(ExpYear);
			String ExpTitle = ExpMonth + " " + ExpYear;
			if (ActyearInt > ExpYearInt) {
				if (!(Acttitle.equalsIgnoreCase(ExpTitle))) {
					WebElement prev = driver.findElement(By.cssSelector("[title='Prev']"));
					WebDriverWait wait = new WebDriverWait(driver, 10);
					wait.until(ExpectedConditions.elementToBeClickable(prev));
					prev.click();
					WebElement titleElements = driver.findElement(By.xpath("//div[@class=\"ui-datepicker-title\"]"));
					Acttitle = titleElements.getText();
				} else {
					String ActDay;
					System.out.println("Im in " + ExpTitle);
					List<WebElement> ActDayElement = driver.findElements(
							By.xpath("//table[@class=\"ui-datepicker-calendar\"]//td[@data-handler=\"selectDay\"]"));
					for (WebElement days : ActDayElement) {
						ActDay = days.getText();
						int day = Integer.parseInt(ActDay);
						System.out.println(day + "=" + ExpDay);
						if (day == ExpDay) {
							WebElement selection = driver.findElement(By.cssSelector("[data-date='" + ExpDay + "']"));
							selection.click();
							break;
						}
					}
					break;
				}
			} else {
				if (!(Acttitle.equalsIgnoreCase(ExpTitle))) {
					WebElement next = driver.findElement(By.cssSelector("[title='Next']"));
					WebDriverWait wait = new WebDriverWait(driver, 10);
					wait.until(ExpectedConditions.elementToBeClickable(next));
					next.click();
					WebElement titleElements = driver.findElement(By.xpath("//div[@class=\"ui-datepicker-title\"]"));
					Acttitle = titleElements.getText();
					System.out.println(Acttitle);
				} else {
					String ActDay;
					System.out.println("Im in " + ExpTitle);
					List<WebElement> ActDayElement = driver.findElements(
							By.xpath("//table[@class=\"ui-datepicker-calendar\"]//td[@data-handler=\"selectDay\"]"));
					for (WebElement days : ActDayElement) {
						ActDay = days.getText();
						int day = Integer.parseInt(ActDay);
						// System.out.println(day + "=" + ExpDay);
						if (day == ExpDay) {
							WebElement selection = driver.findElement(By.cssSelector("[data-date='" + ExpDay + "']"));
							selection.click();
							break;
						}
					}

					break;

				}
			}

		}
	}

}
