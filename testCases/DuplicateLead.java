package testCases;

import org.testng.annotations.Test;

import basePage.BasePage;
import duplicateLeadPages.LoginPage;

public class DuplicateLead extends BasePage
{
	@Test
	public void duplicateLead() throws InterruptedException {
		
		new LoginPage()
		.typeUserName("DemoSalesManager")
		.typePassword("crmsfa")
		.clickLogin()
		.clickCRMSFA()
		.clickLeadsTab()
		.clickFindLead()
		.clickEmailTab()
		.typeEmailAddress("thiru110298@gmail")
		.clickFind()
		.clickFirstName()
		.clickDuplicateTab()
		.clickCreateLead()
		.verifyLeadforDuplicate();
	}	
}
