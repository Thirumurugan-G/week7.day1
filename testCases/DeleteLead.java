package testCases;

import org.testng.annotations.Test;

import basePage.BasePage;
import deleteLeadPages.LoginPage;

public class DeleteLead extends BasePage{

	@Test
	public void deleteLead() throws InterruptedException {
		new LoginPage()
		.typeUserName("DemoSalesManager")
		.typePassword("crmsfa")
		.clickLogin()
		.clickCRMSFA()
		.clickLeadsTab()
		.clickFindLead()
		.clickEmailTab()
		.typeEmailAddress("thiru110298@gmail.com")
		.clickFind()
		.clickFirstName()
		.ClickDelete()
		.ClickfindLeadToDelete()
		.ClickNameTab()
		.VerifyDeleteLead();
		}
	
}
