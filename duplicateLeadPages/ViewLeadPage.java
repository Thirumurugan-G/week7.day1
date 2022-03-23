package duplicateLeadPages;

import org.openqa.selenium.By;

import basePage.BasePage;

public class ViewLeadPage extends BasePage
{
	public DuplicateLeadPage clickDuplicateTab() {
		getDriver().findElement(By.xpath("//a[text()='Duplicate Lead']")).click();
		return new DuplicateLeadPage();
	}
	public ViewLeadPage verifyLeadforDuplicate() {
		String text2 = getDriver().findElement(By.xpath("//span[@id=\"viewLead_firstName_sp\"]")).getText();
		System.out.println("Duplicate name"+text2);
		if (text2.equals(text)) {
			System.out.println("Duplicated name is same as captured name");

		} else {
			System.out.println("Duplicated name is NOT same as captured name");
		}
		return this;
	}
}
