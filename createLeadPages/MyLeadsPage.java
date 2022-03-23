package createLeadPages;

import org.openqa.selenium.By;

import basePage.BasePage;

public class MyLeadsPage extends BasePage
{
	public CreateLeadPage clickcreateLead() {
		getDriver().findElement(By.xpath("//a[text()='Create Lead']")).click();	
		return new CreateLeadPage();
	}
}
