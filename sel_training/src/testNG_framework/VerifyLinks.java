package testNG_framework;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class VerifyLinks {

	@Test
	public void linkscheck() throws IOException {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url = "https://www.moebel.de";
		driver.get(url);
		driver.manage().window().maximize();
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Total Links are " + links.size());
       
		try {
			for (int i = 0; i < links.size(); i++) {

				WebElement ele = links.get(i);

				String urls = ele.getAttribute("href");
				/*System.out.println(urls);*/
				
		
				if (urls==null) {
					System.out.println("url is containing null");
					
				} else if (urls.contains("javascript:")) {
					
					System.out.println("url is containing javascript");
					
				} else {
					 linkActivecheck(urls);
					
					
				}
				

			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		/*System.out.println(x+"======"+ y +"=========="+ z);*/
	}

	public static void linkActivecheck(String linkurl) throws IOException {
		URL url1 = new URL(linkurl);
		HttpURLConnection httpurlconnect = (HttpURLConnection) url1.openConnection();
		httpurlconnect.setConnectTimeout(5000);
		httpurlconnect.connect();
		if (httpurlconnect.getResponseCode() == 200) {
			System.out.println(linkurl + "  " + httpurlconnect.getResponseMessage());

		}
		if (httpurlconnect.getResponseCode() == HttpURLConnection.HTTP_NOT_FOUND) {
			System.out.println(
					linkurl + "  " + httpurlconnect.getResponseMessage() + "  " + HttpURLConnection.HTTP_NOT_FOUND);
		}
	}
}
