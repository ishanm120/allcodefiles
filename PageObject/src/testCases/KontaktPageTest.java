package testCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.KontaktPage;
import utility.Base;
import utility.Util;

public class KontaktPageTest extends Base {

	@DataProvider(name = "logindata")

	public Object[][] testData() throws Exception {

		Util.DataProviderExcel("E:\\Automation Projects\\PageObject\\testDataFolder\\inputtext.xlsx");

		int rows = Util.getRowCount(0);

		Object[][] data = new Object[4][5];
		for (int i = 0; i < rows; i++) {

			data[i][0] = Util.getData(0, i, 0);
			data[i][1] = Util.getData(0, i, 1);
			data[i][2] = Util.getData(0, i, 2);
			data[i][3] = Util.getData(0, i, 3);
			data[i][4] = Util.getData(0, i, 4);
		}
		return data;
	}

	@Test(dataProvider = "logindata")
	public void formfillUp(String uid, String sid, String mailid, String datatext, String msginput) throws InterruptedException {

		

		KontaktPage kp = new KontaktPage(driver);
		
		
		kp.formSubmit(uid, sid, mailid, datatext,msginput );
		
		

		

	}
}
