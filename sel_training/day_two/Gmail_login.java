package day_two;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Gmail_login {

	public static void main(String[] args) throws InterruptedException {
		/*System.setProperty("webdriver.gecko.driver", "E:\\Automationdata\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();*/
		
		System.setProperty("webdriver.chrome.driver", "E:\\Automationdata\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		
		
		
		driver.get("https://accounts.google.com/signin/v2/sl/pwd?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin&cid=1");
		driver.findElement(By.xpath(".//*[@id='identifierId']")).sendKeys("ishanmittal120");
		driver.findElement(By.xpath(".//*[@id='identifierNext']/content/span")).click();
		driver.manage().timeouts().implicitlyWait(3000,TimeUnit.MILLISECONDS );
		driver.findElement(By.xpath(".//*[@id='password']/div[1]/div/div[1]/input")).sendKeys("test123");
		driver.findElement(By.xpath(".//*[@id='passwordNext']/content/span")).click();
		
		/*driver.findElement(By.id("identifierId")).sendKeys("ishanmittal120");
		
		driver.findElement(By.className("CwaK9")).click();
		driver.manage().timeouts().implicitlyWait(1000,TimeUnit.MILLISECONDS );

		driver.findElement(By.name("password")).sendKeys("test123");
		driver.findElement(By.className("CwaK9")).click();*/
		System.out.println("test");
		driver.quit();
	}

}
