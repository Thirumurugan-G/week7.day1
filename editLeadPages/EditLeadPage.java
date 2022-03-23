package editLeadPages;

import org.openqa.selenium.By;

import basePage.BasePage;

public class EditLeadPage extends BasePage
{
	public EditLeadPage clearCompanyName() {
		getDriver().findElement(By.id("updateLeadForm_companyName")).clear();
		return this;
	}
	public EditLeadPage updateCompanyName() {
		getDriver().findElement(By.id("updateLeadForm_companyName")).sendKeys("TestLeaf software solutions");
		return this;
	}
	public ViewLeadsPage2 clickUpdateButton() {
		getDriver().findElement(By.xpath("(//input[@class='smallSubmit'])")).click();
		return new ViewLeadsPage2();
	}
}
