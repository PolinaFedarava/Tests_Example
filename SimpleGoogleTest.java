package by.htp.test.google;

import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleGoogleTest {

	private static final String CHROME = "webdriver.chrome.driver";
	private static final String CHROME_PATH = "D:\\driver\\chromedriver.exe";

	private WebDriver driver;

	@Before
	public void initDriver() {

		System.setProperty(CHROME, CHROME_PATH);
		driver = new ChromeDriver();
		driver.get("http://google.com");
	}

	@Test
	public void testSearchFiledExists() throws InterruptedException {
		WebElement searchField = driver.findElement(By.name("q"));
		Assert.assertNotNull(searchField);
		Thread.sleep(3000);
		searchField.sendKeys("java");
		searchField.submit();

		List<WebElement> searchResults = driver.findElements(By.className("g"));

		String resultTabTitle = driver.getTitle();

		
		System.out.println(resultTabTitle);
		
			
	}

}
