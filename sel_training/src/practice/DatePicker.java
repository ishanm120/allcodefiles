package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class DatePicker {
	
	@Test
	void dateframe() throws InterruptedException{
		
		
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver", "E:\\Automationdata\\geckodriver.exe");
		
		driver= new FirefoxDriver();
		String url= "https://book2.spicejet.com/";
		driver.get(url);
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='custom_date_picker_id_1']")).sendKeys("20-06-2017");
		Thread.sleep(2000);
		
		
	}

}
