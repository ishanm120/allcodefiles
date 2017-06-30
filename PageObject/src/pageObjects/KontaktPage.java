package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.relevantcodes.extentreports.LogStatus;

import utility.Base;

public class KontaktPage extends Base {
	
	
	By sex = By.xpath(".//*[@id='herrId']");
	By username = By.xpath(".//*[@id='vorname']");
	By lastname = By.xpath(".//*[@id='name']");
	By email = By.xpath(".//*[@id='emailAddress']");

	By checkbox = By.xpath(".//*[@id='kontaktform']/div[8]/div/input");

	By textArea = By.xpath(".//*[@id='nachricht']");

	By submitButton = By.xpath(".//*[@id='kontaktform']/div[15]/input");

	By successMessage = By.xpath(".//*[@id='successFullySent']");

	By errorMessage = By.xpath(".//*[@id='popup_message']");
	
	

	public KontaktPage(WebDriver driver) {

		Base.driver = driver;

	}

	public void formSubmit(String uname, String sname, String mail, String text, String msg)
			throws InterruptedException {
		
	
		driver.findElement(sex).click();
		utility.ExtentTestManager.getTest().log(LogStatus.INFO, "Radiobutton: Sex is selected");
	
		
		driver.findElement(username).sendKeys(uname);
		utility.ExtentTestManager.getTest().log(LogStatus.INFO, "User firstname is enetred");
		
		driver.findElement(lastname).sendKeys(sname);
		utility.ExtentTestManager.getTest().log(LogStatus.INFO, "Last name is entered");
		driver.findElement(email).sendKeys(mail);
		utility.ExtentTestManager.getTest().log(LogStatus.INFO, "Email id is entered");
		driver.findElement(checkbox).click();
		utility.ExtentTestManager.getTest().log(LogStatus.INFO, "checbox is selected");
		driver.findElement(textArea).sendKeys(text);
		utility.ExtentTestManager.getTest().log(LogStatus.INFO, "text is written");
		driver.findElement(submitButton).click();
		utility.ExtentTestManager.getTest().log(LogStatus.INFO, "Clicked on submit button.");

		Thread.sleep(5000);

		formvalidation(msg);

	}
	
	

	public void formvalidation(String message) {
		String expected = "Die Nachricht wurde erfolgreich übermittelt.";
		String actual = null;

		if (driver.findElement(successMessage).isDisplayed()) {

			actual = driver.findElement(successMessage).getText();
			utility.ExtentTestManager.getTest().log(LogStatus.INFO, "page is submitted successfully");

		} else if (driver.findElement(errorMessage).isDisplayed()) {

			actual = driver.findElement(errorMessage).getText();
			utility.ExtentTestManager.getTest().log(LogStatus.INFO, "Error message is appeared");
		}

		Assert.assertEquals(actual, expected, message);

	}
}
