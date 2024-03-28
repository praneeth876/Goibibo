package com.PracticeSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SandhyaTask2 {

	public static void main(String[] args) throws InterruptedException {
		// task();
		// task2();
		// wordCount();
		// wordCountSandhyaMethod();
		// letterOccurance();
		// sandhyaTask4();
		// maniTask1();
		// occurance();
		// maxAndNext();
		// firstAndLastSwap();
		// occurance();
		//eliminate();
amazon();
	}

	public static void task() {

		String name = "Praneeth Katam reddy";

		String[] splitName = name.split(" ");
		// char[] pran;
		String pran = "";
		String red = "";
		String kata = "";

		// for(int i=0;i<splitName.length; i++) {

		for (int j = splitName[0].length() - 1; j >= 0; j--) {
			pran = pran + splitName[0].charAt(j);
		}
		for (int j = splitName[1].length() - 1; j >= 0; j--) {
			red = red + splitName[1].charAt(j);
		}
		for (int j = splitName[2].length() - 1; j >= 0; j--) {
			kata = kata + splitName[2].charAt(j);
		}
		String name1 = pran + " " + red + " " + kata;
		System.out.println("Input :" + name + "\nOutput :" + name1);

	}

	public static void task2() {
		String input = "happy20 new23 year";
		// happynewyear 2023
//
//		Map<Integer, String> name = new HashMap<>();
//
//		name.put(1, "happy20");
//		name.put(2, "new23");
//		name.put(3, "year");

		String update = "";
		String year = "";

		for (int i = 0; i <= input.length() - 1; i++) {
			if (input.charAt(i) >= 'a' && input.charAt(i) <= 'z') {
				update = update + input.charAt(i);
			} else if (input.charAt(i) >= '0' && input.charAt(i) <= '9') {
				year = year + input.charAt(i);
			}
		}
		System.out.println("Input :" + input);
		System.out.println("Output :" + update + " " + year);
	}

	public static void task3() {
		String name = "Praneeth";
		String duplicate = "";
		for (int i = 0; i <= name.length(); i++) {
			for (int j = i + 1; j < name.length(); j++) {
				if (name.charAt(i) == name.charAt(j)) {
					System.out.println();
					duplicate = duplicate + name.charAt(i);
				}
			}
		}
		System.out.println(duplicate);
	}

	public static void letterOccurance() {
		String name = "Praneeth Reddy"; // output=each letter count
		char array[] = name.toCharArray();
		boolean isequal = true;
		for (int i = 0; i < array.length; i++) {
			if (!(array[i] == ' ')) {
				isequal = true;
				for (int k = 0; k < i; k++) {
					if (array[i] == array[k]) {
						isequal = false;
					}
				}
				if (isequal) {
					int count = 0;
					for (int j = 0; j < array.length; j++) {
						if (array[i] == array[j]) {
							count++;
						}
					}
					System.out.println(array[i] + " " + count);
				}
			}
		}
	}

	public static void wordCount() {

		String name = "I am automation tester";

		String[] splitName = name.split(" ");
		String big = "";
		for (int i = 0; i < splitName.length - 1; i++) {

			if (splitName[i].length() > splitName[i + 1].length()) {

				if ((big.length() < splitName[i].length())) {
					big = splitName[i];
				}
			}
		}
		if (big.length() > (splitName[splitName.length - 1].length())) {
			System.out.println(big + " " + big.length());
		} else {
			System.out.println(splitName[splitName.length - 1] + " " + splitName[splitName.length - 1].length());
		}

	}

	public static void wordCountSandhyaMethod() {

		String name = "I am automation tester";

		String[] splitName = name.split(" ");
		int max = 10;
		for (int i = 0; i <= splitName.length - 1; i++) {
			if (splitName[i].length() < max) {
				max = splitName[i].length();
			}
		}
		for (int j = 0; j <= splitName.length - 1; j++) {
			if (max == splitName[j].length()) {
				System.out.println(splitName[j] + " " + max);
			}
		}
	}

	public static void sandhyaTask4() {

		String name = "Sandhya";
		String upName = name.toUpperCase();
		for (int i = 0; i <= upName.length() - 1; i++) {
			if (upName.charAt(i) == 'Y') {
				System.out.println(upName.charAt(i));
			}
		}
	}

	public static void maniTask1() {

		String name = "Praneeth";
		String[] split = name.split("e");
		String update = " ";
		for (int i = 0; i < split[0].length() - 1; i++) {
			update = update + split[0].charAt(i);
		}
		System.out.println(update);
	}

	public static void occurance() {
		String name = "aabbccdd";
		String upp = name.toUpperCase();
		String update="";
		for (char ch = 'A'; ch <= 'Z'; ch++) {
			int count = 0;
			for (int i = 0; i < upp.length(); i++) {
				if (ch == upp.charAt(i)) {
					count++;
				}
			}
			if (count == 1) {
				//System.out.print(ch + "" + count + " ");
				update=update+ch;
			
		}
			System.out.println(update);
	}
	}
	public static void maxAndNext() {
		int[] num = { 5, 8, 2, 6, 12, 1, 0, 4 };
		int temp = num[0];
		int[] num1 = new int[num.length];
		for (int i = 0; i <= num.length; i++) {

			for (int j = i + 1; j < num.length; j++) {
				if (num[i] < num[j]) {
					temp = num[i];
					num[i] = num[j];
					num[j] = temp;
				}
			}
		}
		System.out.println(num[0] + " " + num[1]);

	}

	public static void firstAndLastSwap() {
		String name = "Praneeth";
		char[] ch = name.toCharArray();
		char temp;
		String name1 = "";
		temp = ch[0];
		ch[0] = ch[ch.length - 1];
		ch[ch.length - 1] = temp;

		for (int i = 0; i < ch.length; i++) {
			name1 = name1 + ch[i];
		}
		System.out.println("Input :" + name + "\nOutput :" + name1);

	}

public static void amazon() throws InterruptedException {
	WebDriver driver;
	WebDriverManager.chromedriver().setup();
    driver= new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://www.amazon.com/");
    WebElement searchBox = driver.findElement(By.xpath("//input[@placeholder='Search Amazon']"));
    searchBox.sendKeys("Iphone Mobiles",Keys.ENTER);
    Thread.sleep(5000);
    //WebElement suggestedResult = driver.findElement(By.xpath("//div[@class=\"left-pane-results-container\"]"));
    WebElement suggestedResult = driver.findElement(By.xpath("//div[@class=\"a-row a-size-base a-color-base\"]"));
    System.out.println("Suggested Result: " + suggestedResult.getText());
    driver.quit();
    }
	
}
