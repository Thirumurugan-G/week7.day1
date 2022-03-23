package createLeadPages;

import org.openqa.selenium.By;

import basePage.BasePage;

public class CreateLeadPage extends BasePage
{
	public CreateLeadPage typeCompanyName(String compname) {
		getDriver().findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys(compname);
		return this;
	}

	public CreateLeadPage typeFirstName(String fname) {
		getDriver().findElement(By.id("createLeadForm_firstName")).sendKeys(fname);
		return this;
	}
	public CreateLeadPage typeLastName(String lname) {
		getDriver().findElement(By.id("createLeadForm_lastName")).sendKeys(lname);
		return this;
	}
	public CreateLeadPage typeEmailAddress(String EmailADD) {
		getDriver().findElement(By.xpath("//input[@id='createLeadForm_primaryEmail']")).sendKeys(EmailADD);
		return this;
	}

	public ViewLeadsPage clickSubmit() {
		getDriver().findElement(By.xpath("//input[@value='Create Lead']")).click();
		return new ViewLeadsPage();
	}
}
