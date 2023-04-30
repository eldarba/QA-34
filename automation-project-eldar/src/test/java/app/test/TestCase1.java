package app.test;


import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class) // enable order annotation on test methods
class TestCase1 {

	private static WebDriver driver;
	private static String url = "file:///C:/eldar/qa.34/java/workspace/automation-project-eldar/src/main/resources/static/index.html";

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		driver = new ChromeDriver(); // open browser
		TimeUnit.SECONDS.sleep(1);
		driver.get(url); // go to our html file
		TimeUnit.SECONDS.sleep(1);
		driver.manage().window().fullscreen();
		TimeUnit.SECONDS.sleep(1);
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		driver.quit(); // close the browser
	}

	@Test
	@Order(1)
	public void test1Title() {
		System.out.println(">>> test 1 - title");
		String expected = "Automation Project";
		String actual = driver.getTitle();
		String errorMsg = "title";
		Assertions.assertEquals(expected, actual, errorMsg);
	}

	@Test
	@Order(2)
	public void test2HeadingH1() {
		System.out.println(">>> test 2 - heading");
		String expected = "Eldar's Automation Project"; // מה שמצפים שיהיה כתוב שם
		WebElement h1Element = driver.findElement(By.tagName("h1"));
		String actual = h1Element.getText(); // מה שבאמת כתוב שם לפי הבדיקה
		String errorMsg = "heading"; // הודעת השגיאה שתופיע אם הטסט לא יצליח
		Assertions.assertEquals(expected, actual, errorMsg);
	}

}
