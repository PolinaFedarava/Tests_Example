package by.htp.test.google;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthSpinnerUI;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class QuizfulTest {
	private static final String CHROME = "webdriver.chrome.driver";
	private static final String CHROME_PATH = "D:\\driver\\chromedriver.exe";

	private WebDriver driver;

	@Before
	public void initDriver() {

		System.setProperty(CHROME, CHROME_PATH);
		driver = new ChromeDriver();

	}

	@Test
	public void testSearchFiledExists() throws InterruptedException {
		driver.get("http://www.quizful.net/test");
		List listOfAtags = driver.findElements(By.tagName("a"));
		Iterator iteratorAtags = listOfAtags.iterator();
		while (iteratorAtags.hasNext()) {
			WebElement aTagLink = (WebElement) iteratorAtags.next();
			if (aTagLink.getAttribute("href").contains("LoginAction.registration")) {
				aTagLink.click();
				break;
			}
		}
		Thread.sleep(3000);
		// WebElement step2 = driver.findElement(By.className("content"));
		WebElement step2 = driver.findElement(By.id("login"));
		step2.sendKeys("lala1");

		WebElement step3 = driver.findElement(By.name("registrationForm.password"));
		step3.sendKeys("lala2");
		// step3.submit();

		WebElement step4 = driver.findElement(By.name("registrationForm.repassword"));
		step4.sendKeys("lala2");

		WebElement step5 = driver.findElement(By.name("registrationForm.email"));
		step5.sendKeys("lala@gmail.com");

		WebElement step6 = driver.findElement(By.id("corporate"));
		step6.click();

		// WebDriverWait wait = new WebDriverWait );
		// { return d.FindElement ; // here we can use any locator that identifies a
		// successful / unsuccessful login } );

		WebElement step7 = driver.findElement(By.name("registrationForm.captcha"));
		// if () {
		Scanner s = new Scanner(System.in);
		System.out.println("write some number");
		int x = s.nextInt();
		System.out.println("number: " + x);
		step7.sendKeys(Integer.toString(x));
		Thread.sleep(10000);
		
		WebElement step8 = driver.findElement(By.name("ok"));
		step8.click();
		
		
		
		
		// }

	}

}
