package deleteLeadPages;

import org.openqa.selenium.By;


import basePage.BasePage;
import deleteLeadPages.FindLeadsPage;

public class FindLeadsPage extends BasePage
{
	public FindLeadsPage clickEmailTab() {
		getDriver().findElement(By.xpath("//span[text()='Email']")).click();
		return this;
	}
	public FindLeadsPage typeEmailAddress(String Eaddress) throws InterruptedException {
		getDriver().findElement(By.xpath("//input[@name='emailAddress']")).sendKeys(Eaddress);
		Thread.sleep(2000);
		return this;
	}
	public FindLeadsPage clickFind() throws InterruptedException {
		getDriver().findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
		return this;
	}
	public ViewLeadsPage clickFirstName() throws InterruptedException {
		Thread.sleep(2000);
		text = getDriver().findElement(By.xpath("(//a[@class='linktext'])[4]")).getText();
		System.out.println("orginal Number = "+text);
		getDriver().findElement(By.xpath("(//a[@class='linktext'])[4]")).click();
		return new ViewLeadsPage();
	}
}
