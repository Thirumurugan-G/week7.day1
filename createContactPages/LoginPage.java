package createContactPages;

import org.openqa.selenium.By;
import basePage.BasePage;

public class LoginPage extends BasePage
{	
	/**
	 * Type the user name in the login screen
	 * @param userId -- The different username to login
	 * @return 
	 */
	
	public LoginPage typeUserName(String userId) {
		getDriver().findElement(By.id("username")).sendKeys(userId);
		return this;
	}
	
	/**
	 * Type the password in the login screen
	 * @param password -- The different password to login
	 * @return 
	 */

	public LoginPage typePassword(String password) {
		getDriver().findElement(By.id("password")).sendKeys(password);
		return this; 
	}
	
	/**
	 * Click the login button
	 * @return 
	 */
	public HomePage clickLogin() {
		getDriver().findElement(By.className("decorativeSubmit")).click();
		return new HomePage();
	}
}
