package testCases;

import org.testng.annotations.Test;

import basePage.BasePage;
import createLeadPages.LoginPage;

public class CreateLead extends BasePage
{
	@Test
	public void createLead() {
		new LoginPage()
		.typeUserName("DemoSalesManager")
		.typePassword("crmsfa")
		.clickLogin()
		.clickCRMSFA()
		.clickLeadsTab()
		.clickcreateLead()
		.typeCompanyName("TestLeaf")
		.typeFirstName("Thirumurugan")
		.typeLastName("G")
		.typeEmailAddress("thiru110298@gmail.com")
		.clickSubmit()
		.verifyFirstName();
	}
}
