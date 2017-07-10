package day_two;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Alerts_test {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "E:\\Automationdata\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		String url= "http://output.jsbin.com/usidix/1";
		driver.get(url);
		driver.findElement(By.xpath("html/body/input")).click();
		Thread.sleep(2000);
		Alert t= driver.switchTo().alert();
		String text= t.getText();
		
		System.out.println(text);
		t.accept();
		driver.quit();
	}

}
