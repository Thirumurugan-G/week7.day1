package createContactPages;

import org.openqa.selenium.By;

import basePage.BasePage;

public class MyHomePage extends BasePage
{
	/**
	 * This method is to click on ContactTab link in My Home Page
	 * @return
	 */
	public MyContactsPage ClickContactsTab() {
		getDriver().findElement(By.linkText("Contacts")).click();
		return new MyContactsPage();
	}
}
