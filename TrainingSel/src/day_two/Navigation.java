package day_two;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Navigation {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "E:\\Automationdata\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		String url= "https://www.facebook.com/";
		driver.get(url);
		
		
		System.out.println("facebook opened");
		Thread.sleep(2000);
		 //driver.findElement(By.linkText("Forgotten account?")).click();
		 driver.findElement(By.partialLinkText("Forgotten")).click();
		//driver.navigate().to("https://www.facebook.com/login/identify?ctx=recover&lwv=110");
		System.out.println("navigated to forgot password");
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='identify_email']")).sendKeys("test");
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='identify_email']")).clear();
		Thread.sleep(2000);
		driver.navigate().refresh();
		System.out.println("page refreshed");
		Thread.sleep(2000);
		driver.navigate().back();
		System.out.println("back to facebook login page");
		driver.quit();
	}

}
