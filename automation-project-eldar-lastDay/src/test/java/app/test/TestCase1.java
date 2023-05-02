package app.test;

import java.util.List;
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
import org.openqa.selenium.support.ui.Select;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class) // enable order annotation on test methods
class TestCase1 {

	private static WebDriver driver;
	// access using http protocol (network)
	private static String url = "http://127.0.0.1:5500/index.html";
	// access using file protocol (file system)
//	private static String url = "file:///C:/eldar/qa.34/java/workspace2/automation-project-eldar-lastDay/src/main/resources/static/index.html";

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
		TimeUnit.SECONDS.sleep(1);
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

	@Test
	@Order(3)
	public void test3NumberOfInputElements() {
		// 1. number of input elements - 9
		// 2. number of input elements of type radio - 3
		// 3. all text inputs are empty
		System.out.println(">>> test 3 - input elemets");
		List<WebElement> listOfinputElements = driver.findElements(By.tagName("input"));
		System.out.println("number of input elements: " + listOfinputElements.size()); // 9
		// number of input elements - 9
		Assertions.assertEquals(9, listOfinputElements.size(), "wrong number of input elements");
		// number of input elements of type radio - 3
		int numberOfRadio = 0;

		// print the id of each element
		for (WebElement e : listOfinputElements) {
			if (e.getAttribute("type").equals("radio")) {
				numberOfRadio++;
			}
			// all text inputs are empty
			if (e.getAttribute("type").equals("text")) {
				Assertions.assertEquals("", e.getAttribute("value"), "input field is not empty");
			}
			String id = e.getAttribute("id");
			if (id != null && !id.equals("")) {
				System.out.println(id);
			} else {
				System.out.println("--- no id ---");
			}
		}
		// number of input elements of type radio - 3
		Assertions.assertEquals(3, numberOfRadio, "wrong number of radio buttons");
	}

	@Test
	@Order(4)
	public void test4NextPage() {
		System.out.println(">>> test 4 - next page title");
		// we can navigate to next page in 2 ways
		// 1. click the form button
//		WebElement sendInfoButton = driver.findElement(By.id("send"));
//		sendInfoButton.click(); // will go to the next page

		// 2. navigate to the page url
		driver.navigate().to("http://127.0.0.1:5500/next-page.html");
		Assertions.assertEquals("Welcome to Next Page", driver.getTitle(), "wrong title of next page");
	}
	
	// 

	@Test
	@Order(5)
	public void test5SendKeysToInput() throws InterruptedException {
		System.out.println(">>> test 5 - sending keys to mirror inputs");
		WebElement leftInput = driver.findElement(By.id("left"));
		leftInput.sendKeys("Hello");
		TimeUnit.SECONDS.sleep(1);
		int x = (int) (Math.random() * 101);
		leftInput.sendKeys(" " + x);
		TimeUnit.SECONDS.sleep(1);

		WebElement rightInput = driver.findElement(By.id("right"));
		TimeUnit.SECONDS.sleep(2);
		Assertions.assertEquals(leftInput.getAttribute("value"), rightInput.getAttribute("value"),
				"left and write are different");

		rightInput.sendKeys("?");
		Assertions.assertNotEquals(leftInput.getAttribute("value"), rightInput.getAttribute("value"),
				"left and write are same");
	}

	@Test
	@Order(6)
	public void test6Select() throws InterruptedException {
		System.out.println(">>> test 6 - select element and passing as parameter to next page");
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		driver.navigate().back(); // brows back to main page
		currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);

		// get a reference to the select element
		WebElement element = driver.findElement(By.id("cars"));
		// use it as Select (more methods)
		Select selectCar = new Select(element);
		// choose an option
		selectCar.selectByValue("lada");
		// sent the form data to next page (by clicking the submit button)
		element = driver.findElement(By.id("send"));
		element.click();
		TimeUnit.SECONDS.sleep(3);
		// test that the Lada car was selected and transferred to the next page
		boolean containsCarLada = driver.getCurrentUrl().contains("car=lada");
		Assertions.assertEquals(true, containsCarLada, "car lada is not sumbitted");
	}
}
