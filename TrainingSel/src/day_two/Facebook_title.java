package day_two;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Facebook_title {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "E:\\Automationdata\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		String url= "https://www.facebook.com/";
		driver.get(url);
		String actualurl= driver.getCurrentUrl();
		 System.out.println("Actual url of page is "+ actualurl);
		if(url.equals(actualurl)){
			System.out.println("url matched");

		}
		else
			System.out.println("url not matched");
		
		
		
		String expectedtitle="Facebookee - Log In or Sign Up" ;
		 String actualtitle = driver.getTitle();
		 int titlelength= actualtitle.length();
		 System.out.println("Actual title of page is "+ actualtitle);
		 System.out.println("Length of title is "+ titlelength);
		
		if(expectedtitle.equals(actualtitle)){
			System.out.println("title matched");

		}
		else
			System.out.println("title not matched");
		
		WebElement link = driver.findElement(By.linkText("Forgotten account?"));
		
		System.out.println(link.getText());
		link.click();
		
		//driver.quit();
		
	}
	

}
