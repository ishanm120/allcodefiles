package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

public class Imagesize {

	static WebDriver driver;
	static WebElement Image;

	public static void main(String[] args) {

		String url;

		System.setProperty("webdriver.chrome.driver", "E:\\Automationdata\\chromedriver.exe");
		driver = new ChromeDriver();
		url = "https://www.linkedin.com/";
		driver.get(url);

		driver.manage().window().maximize();

		Imagedimensions();
		
	//	Rgbatohexa();

		driver.quit();

	}

	public static void Imagedimensions() {
		Image = driver.findElement(By.xpath(".//*[@id='login-submit']"));

		int Imagewidth = Image.getSize().getWidth();
		int Imageheight = Image.getSize().getHeight();
		String Imagecolor=Image.getCssValue("color");
		String Imagebackground=Image.getCssValue("bottom-color");
		System.out.println("Image dimenion is " + Imagewidth + " X " + Imageheight);
		System.out.println("Image color is " + Image.getCssValue("color"));
		System.out.println("Image font size is " + Image.getCssValue("font-size"));
		System.out.println("Hexa color is "+Color.fromString(Imagecolor).asHex());
		System.out.println("Hexa backcolor is "+Color.fromString(Imagebackground).asHex());
		
	
		

	}

	
}
