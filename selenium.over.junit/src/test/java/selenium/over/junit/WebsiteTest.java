package selenium.over.junit;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class WebsiteTest {

	private static WebDriver driver = new ChromeDriver();

	@BeforeAll
	public static void beforeAll() {
		System.out.println("Start");
		driver.get("C:\\eldar\\qa.34\\java\\workspace\\selenium.over.junit\\src\\main\\resources\\static\\index.html");
	}

	@AfterAll
	public static void afterAll() {
		System.out.println("End");
		driver.quit();
	}

	@Test
	void testTitle() {
		System.out.println("Test 1 - title");
		Assertions.assertEquals("Eldar", driver.getTitle());
	}

	@Test
	void testButton() throws InterruptedException {
		System.out.println("Test 2 - button");
		WebElement div3 = driver.findElement(By.id("div-3"));
		WebElement button = driver.findElement(By.id("bt-1"));
		Assertions.assertEquals("Bye", div3.getText());
		TimeUnit.SECONDS.sleep(3);
		// click the button
		button.click();
		TimeUnit.SECONDS.sleep(3);
		Assertions.assertEquals("Selenium", div3.getText());
	}
}
