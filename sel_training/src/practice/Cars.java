package practice;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Cars {

	public static void main(String[] args) throws Exception {
		WebDriver driver;
		String url = "https://www.bigboytoyz.com/";
		System.setProperty("webdriver.chrome.driver", "E:\\Automationdata\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		Actions action = new Actions(driver);
		WebElement we = driver.findElement(By.xpath("html/body/div[1]/header/nav/ul/li[2]/a/span"));
		action.moveToElement(we).build().perform();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//img[@src='https://www.bigboytoyz.com/images/brands/jaguar.png']")).click();
		
		List<WebElement> list = driver.findElements(By.xpath(".//*[@id='searchResultCars']/li/div/a/span/strong"));
		List<WebElement> price= driver.findElements(By.xpath(".//*[@id='searchResultCars']/li/div/div/div[3]/div/span[2]"));
		
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i).getText()+ "    "+ price.get(i).getText());
			
		}
		
}
}

