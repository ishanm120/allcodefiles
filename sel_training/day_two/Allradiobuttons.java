package day_two;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Allradiobuttons {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "E:\\Automationdata\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		String url= "https://www.facebook.com/";
		driver.get(url);
		List<WebElement> exp = driver.findElements(By.name("sex"));
		int exp_size= exp.size();
		System.out.println(exp_size);
		
		for(int i=0;i<exp_size;i++){
			System.out.println(exp.get(i).getText());

	}
		boolean value= false;
		
		value= exp.get(0).isSelected();
		System.out.println(value);
		exp.get(0).click();
		Thread.sleep(5000);
		value= exp.get(0).isSelected();
		System.out.println(value);
		
		driver.quit();

}
}