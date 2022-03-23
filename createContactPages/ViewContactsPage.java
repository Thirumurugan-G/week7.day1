package createContactPages;

import org.openqa.selenium.By;

import basePage.BasePage;

public class ViewContactsPage extends BasePage
{
	/**
	 * This method is to verify the FirstName in View Contact Page
	 * @return
	 */
	public ViewContactsPage verifyFirstName() 
	{
		String text = getDriver().findElement(By.id("viewContact_firstName_sp")).getText();
	    System.out.println("First name in Create Contact = "+text);
		return this;
	}
}
