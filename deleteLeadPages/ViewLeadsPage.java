package deleteLeadPages;

import org.openqa.selenium.By;


import basePage.BasePage;
import deleteLeadPages.ViewLeadsPage;

public class ViewLeadsPage extends BasePage
{
	public DeleteLeadPage ClickDelete() throws InterruptedException {
		Thread.sleep(2000);
		getDriver().findElement(By.xpath("(//a[@href='javascript:document.deleteLeadForm.submit()'])")).click();

		return new DeleteLeadPage();
	}
	public ViewLeadsPage VerifyDeleteLead() {
		getDriver().findElement(By.xpath("(//button[text()='Find Leads'])")).click();
		String noRec = getDriver().findElement(By.xpath("//div[text()='No records to display']")).getText();
		String orginal="No records to display";
		System.out.println(noRec);
		if (noRec.equals(orginal)) {
			System.out.println("Confirmation - Records Deleted");
		} else {
			System.out.println("Confirmation - Records NOT Deleted");
		}System.out.println("TC5 Successfull");
		return this;
	}
}
