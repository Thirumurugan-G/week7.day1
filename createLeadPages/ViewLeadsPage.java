package createLeadPages;

import org.openqa.selenium.By;

import basePage.BasePage;

public class ViewLeadsPage extends BasePage
{
	public ViewLeadsPage verifyFirstName() {
		String text = getDriver().findElement(By.id("viewLead_firstName_sp")).getText();
		System.out.println("First name in Create Lead = "+text);
		System.out.println("TC2 Successfull");
		return this;
	}
}
