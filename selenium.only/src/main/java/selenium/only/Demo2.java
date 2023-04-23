package selenium.only;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {

	public static void main(String[] args) throws InterruptedException {

		String url = "http://127.0.0.1:5500/index.html";
		WebDriver driver = new ChromeDriver();
		driver.get(url);

		// find an element in the page - by the tag name
		WebElement element = driver.findElement(By.tagName("p"));
		// print the text of this element
		System.out.println(element.getText());

		TimeUnit.SECONDS.sleep(1);
		driver.quit();

	}

}
