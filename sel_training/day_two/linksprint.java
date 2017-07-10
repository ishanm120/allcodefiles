package day_two;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class linksprint {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "E:\\Automationdata\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		String url= "http://google.com";
		driver.get(url);
		List<WebElement> exp = driver.findElements(By.tagName("a"));
		int exp_size= exp.size();
		System.out.println(exp_size);
		
		for(int i=0;i<exp_size;i++){
			System.out.println(exp.get(i).getText());
		}
		
		}
	}


