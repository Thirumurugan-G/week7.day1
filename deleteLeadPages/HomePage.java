package deleteLeadPages;

import org.openqa.selenium.By;


import basePage.BasePage;

public class HomePage extends BasePage
{
	public MyHomePage clickCRMSFA() {
		getDriver().findElement(By.linkText("CRM/SFA")).click();
		return new MyHomePage();
	}
}
