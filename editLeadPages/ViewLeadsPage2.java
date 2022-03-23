package editLeadPages;

import org.openqa.selenium.By;

import basePage.BasePage;

public class ViewLeadsPage2 extends BasePage
{
	public ViewLeadsPage2 verifyUpdatedCompanyName() {
		String companyName = getDriver().findElement(By.id("viewLead_companyName_sp")).getText();
		System.out.println("Updated Company Name :: "+companyName);
		String firstName = getDriver().findElement(By.id("viewLead_firstName_sp")).getText();
		System.out.println("First Name Of the Lead:: "+firstName);
		return this;
	}
}
