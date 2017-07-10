package day_two;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Zkossradiobutton {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "E:\\Automationdata\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		String url= "http://toolsqa.com/automation-practice-form/";
		
		driver.get(url);
		driver.findElement(By.cssSelector("css=input#photo")).sendKeys("C:\\Users\\Ishan\\Desktop\\nike.jpg");
	}
}
