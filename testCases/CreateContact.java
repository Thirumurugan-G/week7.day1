package testCases;

import org.testng.annotations.Test;

import basePage.BasePage;
import createContactPages.LoginPage;

public class CreateContact extends BasePage
{
	@Test
	public void createContact() {
		new LoginPage()
		.typeUserName("DemoSalesManager")
		.typePassword("crmsfa")
		.clickLogin()
		.clickCRMSFA()
		.ClickContactsTab()
		.clickcontact()
		.typeFirstName("Thirumurugan")
		.typeLastName("G")
		.clickSubmit()
		.verifyFirstName();
	}
}
