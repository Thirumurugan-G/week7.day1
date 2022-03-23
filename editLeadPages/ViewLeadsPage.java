package editLeadPages;

import org.openqa.selenium.By;
import basePage.BasePage;

public class ViewLeadsPage extends BasePage
{
	public  ViewLeadsPage clickFirstLead() {
		getDriver().findElement(By.xpath("(//a[@class='linktext'])[4]")).click();
		return this;
	}
	public EditLeadPage clickEditButton() 
	{
		getDriver().findElement(By.xpath("//a[text()='Edit']")).click();
		return new EditLeadPage();
	}
}
