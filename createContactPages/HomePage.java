package createContactPages;

import org.openqa.selenium.By;

import basePage.BasePage;

public class HomePage extends BasePage
{
	/**
	 * This method is to click on CRM/SFA link in Home Page
	 * @return 
	 */
	public MyHomePage clickCRMSFA() {
		getDriver().findElement(By.linkText("CRM/SFA")).click();
		return new MyHomePage();
	}

}
