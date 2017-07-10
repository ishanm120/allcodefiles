package practice;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "E:\\Automationdata\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		String url= "https://www.google.com/";
		driver.get(url);
		driver.manage().window().maximize();
		/*WebElement we= driver.findElement(By.xpath(".//*[@id='container']/div/div[2]/div[2]/div/div[1]/div/div/div[2]/section/div[3]/div[1]/div[2]/div"));
		new Actions(driver).dragAndDropBy(we, -100, 0).build().perform();*/
		
		/*New tab opening
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL +"t");
		ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		driver.get("http://www.testingexcellence.com");
		*/
		
	}

}
