package testNG_framework;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Scrollwindow {
	
/*	@Test
	public static void scrollTo() {
		
		
		System.setProperty("webdriver.gecko.driver", "E:\\Automationdata\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		String url= "https://www.flipkart.com/";
		driver.get(url);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,700)", "");
    }*/
	
	@Test
	public static void scrollToview() throws InterruptedException {
		
		
		System.setProperty("webdriver.gecko.driver", "E:\\Automationdata\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		String url= "http://manos.malihu.gr/repository/custom-scrollbar/demo/examples/complete_examples.html";
		driver.get(url);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		/*WebElement element= driver.findElement(By.xpath(".//*[@id='mCSB_9_container']/ul/li[10]/img"));
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].scrollIntoView(true);", element);
		System.out.println(element.getText());*/
		
		JavascriptExecutor jse = (JavascriptExecutor) driver;
	    jse.executeScript("window.scrollBy(0,550)", "");
		
	  	
    }
	
	
	

}
