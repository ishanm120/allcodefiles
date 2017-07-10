package practice;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BookMyShow1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		String url = "https://in.bookmyshow.com/";
		System.setProperty("webdriver.chrome.driver", "E:\\Automationdata\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='inp_RegionSearch_top']")).sendKeys("gur");

		driver.findElement(By.xpath(".//*[@id='inp_RegionSearch_top']")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath(".//*[@id='inp_RegionSearch_top']")).sendKeys(Keys.ENTER);
		Thread.sleep(5000);
		try {
			// driver.switchTo().frame(driver.findElement(By.className("wzrk-alert
			// wiz-show-animate")));
			driver.findElement(By.id("wzrk-cancel")).click();
		} catch (Exception e) {
			e.printStackTrace();
		}
		driver.findElement(By.xpath(".//*[@id='view-more-link']")).click();
		Thread.sleep(2000);
		List<WebElement> oelelist = driver.findElements(
				By.xpath(".//*[@id='now-showing']/section[1]/div/div[2]/div[2]/div/div/div/div[3]/div[1]/a"));
		System.out.println("size of page is " + oelelist.size());

		for (WebElement element : oelelist) {

			System.out.println(element.getText());
		}

	}

}
