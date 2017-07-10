package day_two;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook_register {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "E:\\Automationdata\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		String url= "https://www.facebook.com/";
		driver.get(url);
		
		/*driver.findElement(By.xpath(".//*[@id='u_0_1']")).sendKeys("ishan");
		System.out.println("name entered");
		driver.findElement(By.xpath(".//*[@id='u_0_3']")).sendKeys("mittal");
		System.out.println("surname entered");
		driver.findElement(By.xpath(".//*[@id='u_0_6']")).sendKeys("9999776630");
		System.out.println("Number entered");
		driver.findElement(By.xpath(".//*[@id='u_0_d']")).sendKeys("test123");
		System.out.println("Password entered");*/
		
		
		
		
		//WebElement Day = driver.findElement(By.xpath(".//*[@id='day']"));
		WebElement Month = driver.findElement(By.xpath(".//*[@id='month']"));
	//	WebElement Year = driver.findElement(By.xpath(".//*[@id='year']"));
		
		/*Select s1 = new Select(Day);
		s1.selectByIndex(6);
		System.out.println("Day entered 6");*/
		Select s2 = new Select(Month);
		s2.selectByVisibleText("Jan");
		List<WebElement> months= s2.getOptions();
		int monthsize=months.size();
		System.out.println("total months are "+monthsize);
		for(int i=1;i<monthsize;i++){
			String name = s2.getOptions().get(i).getText();
			System.out.println(name);
		}
		
		System.out.println("Month entered Jan");
		driver.quit();
		/*Select s3 = new Select(Year);
		s3.selectByValue("1989");
		System.out.println("Year entered 1989");
		
		driver.findElement(By.xpath(".//*[@id='u_0_h']")).click();
		System.out.println("Male checkbox selected");
		
		driver.findElement(By.xpath(".//*[@id='u_0_l']")).click();
		System.out.println("Clecked on Create button");*/
	}

}
