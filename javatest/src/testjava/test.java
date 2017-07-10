package testjava;

import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import java.util.*; 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class test {
	static String eles = "";  

	public static void main(String[] args) throws IOException
	{
		List<WebElement> urllist = new ArrayList();
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.yahoo.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		urllist = driver.findElements(By.tagName("a"));
		// List<WebElement> urlslist = driver.findElements(By.tagName("a"));
		for(WebElement ele : urllist)
		{
			if ((ele.getAttribute("href").trim().length() > 1) && (ele.getAttribute("href").trim().contains("yahoo.com")) 
					&& !(ele.getAttribute("href").trim().contains("javascript:void(0)"))) {  
		          
				
				eles = eles + ele.getAttribute("href").trim() + "\n";  
				System.out.println(eles);
		         }  
		}
	}
}
