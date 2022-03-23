package editLeadPages;

import org.openqa.selenium.By;

import basePage.BasePage;

public class MyHomePage extends BasePage
{
	public MyLeadsPage clickLeadsTab() {
		getDriver().findElement(By.linkText("Leads")).click();
		return new MyLeadsPage();
	}
}
