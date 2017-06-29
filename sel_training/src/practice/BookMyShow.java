package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BookMyShow {

	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver", "E:\\Automationdata\\geckodriver.exe");
		
		driver= new FirefoxDriver();
		String url= "https://in.bookmyshow.com/";
		
		driver.get(url);
		driver.manage().window().maximize();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath(".//*[@id='inp_RegionSearch_top']")).sendKeys("gurgaon");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath(".//*[@id='inp_RegionSearch_top']")).submit();

	}

}
