package duplicateLeadPages;

import org.openqa.selenium.By;

import basePage.BasePage;

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
	public ViewLeadPage clickFirstName() throws InterruptedException {
		Thread.sleep(2000);
		text = getDriver().findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']//a")).getText();
		System.out.println("orginal Name = "+text);
		getDriver().findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']//a")).click();
		return new ViewLeadPage();
	}

}
