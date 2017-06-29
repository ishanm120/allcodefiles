package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class hdfcBank {

	public static void main(String[] args) throws Exception {
		String url="https://www.hdfcbank.com";
		System.setProperty("webdriver.chrome.driver", "E:\\Automationdata\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		
		/*List<WebElement> header=  driver.findElements(By.xpath("html/body/div[1]/div[1]/div[2]/div[3]/ul/li[2]/div[2]/div[2]/div[1]/ul/li/a"));
		System.out.println(header.size());*/
		
		
		WebElement messagetext= driver.findElement(By.xpath(".//*[@id='hometab1']/div[1]/div[3]/div/ul/li[1]/a"));
		System.out.println(messagetext.getText());
		String str= messagetext.getText().split(" ")[0].trim();
		System.out.println(str);
		
	    driver.quit();
		
	}

}
