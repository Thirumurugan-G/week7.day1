package basePage;

import java.io.IOException;

import java.time.Duration;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasePage 
{
	public static String text;
	private static final ThreadLocal<ChromeDriver> tlDriver =new ThreadLocal<ChromeDriver>();
	
	public void setDriver(ChromeDriver driver)
	{
		tlDriver.set(driver);
	}
	
	public ChromeDriver getDriver()
	{
		return tlDriver.get();
	}

	@BeforeMethod
	public void launchBrowser() throws IOException 
	{
		WebDriverManager.chromedriver().setup();
		setDriver(new ChromeDriver());
		getDriver().get("http://leaftaps.com/opentaps/");
		getDriver().manage().window().maximize();
		getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}

	@AfterMethod
	public void tearDown() {
		getDriver().close();
	}

}

