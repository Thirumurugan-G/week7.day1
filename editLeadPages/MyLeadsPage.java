package editLeadPages;

import org.openqa.selenium.By;

import basePage.BasePage;

public class MyLeadsPage extends BasePage
{
	public ViewLeadsPage clickFindLead() {
		getDriver().findElement(By.xpath("//a[@href='/crmsfa/control/findLeads']")).click();	
		return new ViewLeadsPage();
	}
}
