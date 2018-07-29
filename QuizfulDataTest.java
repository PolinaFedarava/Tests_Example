package by.htp.test.google;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class QuizfulDataTest 
{

	private static final String CHROME = "webdriver.chrome.driver";
	private static final String CHROME_PATH = "D:\\driver\\chromedriver.exe";

	private WebDriver driver;

	@Before
	public void initDriver() 
	{

		System.setProperty(CHROME, CHROME_PATH);
		driver = new ChromeDriver();

	}

	@Test
	public void testSearchFiledExists() throws InterruptedException 
	{
		driver.get("http://www.quizful.net/test");
		List listOfAtags1 = driver.findElements(By.tagName("a"));
		Iterator iteratorAtags1 = listOfAtags1.iterator();
		while (iteratorAtags1.hasNext()) 
		{
			WebElement aTagLink = (WebElement) iteratorAtags1.next();
			if (aTagLink.getAttribute("href").contains("LoginAction.loginForm")) 
			{
				aTagLink.click();
				break;
			}
		}
		
		//Thread.sleep(3000);
		
		WebElement step2 = driver.findElement(By.id("login"));
		step2.sendKeys("******");

		WebElement step3 = driver.findElement(By.name("loginForm.password"));
		step3.sendKeys("******");;

		WebElement step4 = driver.findElement(By.name("ok"));
		step4.click();

		List listOfAtags2 = driver.findElements(By.tagName("a"));
		Iterator iteratorAtags2 = listOfAtags2.iterator();
		while (iteratorAtags2.hasNext()) 
		{
			WebElement aTagLink = (WebElement) iteratorAtags2.next();
			if (aTagLink.getAttribute("href").contains("user/")) 
			{
				aTagLink.click();
				break;
			}
		}
		
		List listOfAtags3 = driver.findElements(By.tagName("a"));
		Iterator iteratorAtags3 = listOfAtags3.iterator();
		while (iteratorAtags3.hasNext()) 
		{
			WebElement aTagLink = (WebElement) iteratorAtags3.next();
			if (aTagLink.getAttribute("href").contains("ProfileAction.settings")) 
			{
				aTagLink.click();
				break;
			}
		}
		
		WebElement step5 = driver.findElement(By.id("profile-personal-form"));
		WebElement step6= step5.findElement(By.className("arrow"));
		step6.click();

		WebElement stepName = step5.findElement(By.name("personalForm.name"));
		stepName.clear();
		stepName.sendKeys("Polina");
		
		WebElement stepSurname = step5.findElement(By.name("personalForm.surname"));
		stepSurname.clear();
		stepSurname.sendKeys("Fedarava");
		
		WebElement stepBirthyear = step5.findElement(By.name("personalForm.birthyear"));
		stepBirthyear.clear();
		stepBirthyear.sendKeys("1996");
		
		WebElement stepWebsite = step5.findElement(By.name("personalForm.site"));
		stepWebsite.clear();
		stepWebsite.sendKeys("www.Poli.by");
		
		WebElement stepCompany = step5.findElement(By.name("personalForm.company"));
		stepCompany.clear();
		stepCompany.sendKeys("BSUIR");
		
		Select stepCountry = new Select(step5.findElement(By.name("personalForm.countryId")));
		stepCountry.selectByValue("XisgEe4sJp28");
		
//		Select stepCity = new Select(step5.findElement(By.name("personalForm.cityId")));
//		stepCity.selectByValue("lfJgkLla3uGg");
		
		Select stepTimeZone = new Select(step5.findElement(By.name("personalForm.zone")));
		stepTimeZone.selectByValue("Europe/Minsk");
		
		WebElement stepAboutMe = step5.findElement(By.name("personalForm.about"));
		stepAboutMe.clear();
		stepAboutMe.sendKeys("I'm studying automated testing");
		
		
		WebElement stepSave = step5.findElement(By.name("personalForm.save"));
		stepSave.click(); 
		
		List listOfAtags4 = driver.findElements(By.tagName("a"));
		Iterator iteratorAtags4 = listOfAtags4.iterator();
		while (iteratorAtags4.hasNext()) 
		{
			WebElement aTagLink = (WebElement) iteratorAtags4.next();
			if (aTagLink.getAttribute("href").contains("ProfileAction.settings")) 
			{
				aTagLink.click();
				break;
			}
		}
		
		WebElement stepUpdateNotifications = driver.findElement(By.id("profile-notifications-form"));
		WebElement stepUpdate = stepUpdateNotifications.findElement(By.className("arrow"));
		stepUpdate.click();
		
		WebElement stepBoxNotifications = stepUpdateNotifications.findElement(By.name("notificationsForm.notificationsEnabled") );
		stepBoxNotifications.click();
		
		WebElement stepDeliveries = stepUpdateNotifications.findElement(By.name("notificationsForm.deliveryEnabled") );
		stepDeliveries.click();
		
		WebElement stepSave2 = stepUpdateNotifications.findElement(By.name("notificationsForm.save"));
		stepSave2.click();
		
		List listOfAtags41 = driver.findElements(By.tagName("a"));
		Iterator iteratorAtags41 = listOfAtags41.iterator();
		while (iteratorAtags41.hasNext()) 
		{
			WebElement aTagLink = (WebElement) iteratorAtags41.next();
			if (aTagLink.getAttribute("href").contains("ProfileAction.settings")) 
			{
				aTagLink.click();
				break;
			}
		}

		
		
	}
}
