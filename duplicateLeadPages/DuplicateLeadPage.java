package duplicateLeadPages;

import org.openqa.selenium.By;

import basePage.BasePage;

public class DuplicateLeadPage extends BasePage
{
	public ViewLeadPage clickCreateLead() throws InterruptedException {
		getDriver().findElement(By.xpath("//input[@name='submitButton']")).click();
		Thread.sleep(2000);
		return new ViewLeadPage();
	}
}
