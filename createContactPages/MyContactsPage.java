package createContactPages;

import org.openqa.selenium.By;

import basePage.BasePage;

public class MyContactsPage extends BasePage
{
	/**
	 * This method is to click on Create ContactTab link in My Contact Page
	 * @return
	 */
	public CreateContactsPage clickcontact() {
		getDriver().findElement(By.linkText("Create Contact")).click();	
		return new CreateContactsPage();
	}

}
