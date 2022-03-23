package testCases;

import org.testng.annotations.Test;

import basePage.BasePage;
import editLeadPages.LoginPage;

public class EditLead extends BasePage
{
	@Test
	public void EditLeadTest() throws InterruptedException {
		new LoginPage()
		.typeUserName("Demosalesmanager")
		.typePassword("crmsfa")
		.clickLogin()
		.clickCRMSFA()
		.clickLeadsTab()
		.clickFindLead()
		.clickFirstLead()
		.clickEditButton()
		.clearCompanyName()
		.updateCompanyName()
		.clickUpdateButton()
		.verifyUpdatedCompanyName();		
	}
}
