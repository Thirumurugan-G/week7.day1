package deleteLeadPages;

import org.openqa.selenium.By;


import basePage.BasePage;
import deleteLeadPages.DeleteLeadPage;

public class DeleteLeadPage extends BasePage
{
	public DeleteLeadPage ClickfindLeadToDelete() {
		getDriver().findElement(By.xpath("//a[@href='/crmsfa/control/findLeads']")).click();
		return this;
	}
	public ViewLeadsPage ClickNameTab() {
		getDriver().findElement(By.xpath("//input[@name='id']")).sendKeys(text);
		return new ViewLeadsPage();
	}

}

