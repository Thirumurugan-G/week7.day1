package createContactPages;

import org.openqa.selenium.By;

import basePage.BasePage;

public class CreateContactsPage extends BasePage
{
	/**
	 * Type the First Name in the firstNameField
	 * @return
	 */
	public CreateContactsPage typeFirstName(String fname) {
		getDriver().findElement(By.id("firstNameField")).sendKeys(fname);
		return this;
	}

	/**
	 * Type the Last Name in the lastNameField
	 * @return
	] */
	public CreateContactsPage typeLastName(String lname) {
		getDriver().findElement(By.id("lastNameField")).sendKeys(lname);
		return this;
	}
	/**
	 * This method is to click on Submit Button in Create Contact Page
	 * @return
	 */
	public ViewContactsPage clickSubmit() {
		getDriver().findElement(By.name("submitButton")).click();
		return new ViewContactsPage();
	}
}
