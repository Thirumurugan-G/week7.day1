package editLeadPages;

import org.openqa.selenium.By;

import basePage.BasePage;

public class LoginPage extends BasePage
{
	public LoginPage typeUserName(String userId) {
		getDriver().findElement(By.id("username")).sendKeys(userId);
		return this;
	}

	public LoginPage typePassword(String password) {
		getDriver().findElement(By.id("password")).sendKeys(password);
		return this; 
	}

	public HomePage clickLogin() {
		getDriver().findElement(By.className("decorativeSubmit")).click();
		return new HomePage();
	}
}
