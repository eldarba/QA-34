package selenium.only;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo4 {

	public static void main(String[] args) throws InterruptedException {

		String url = "http://127.0.0.1:5500/index.html";
		WebDriver driver = new ChromeDriver();
		driver.get(url);

		// finds all instances and returns a list
		List<WebElement> listOfElements = driver.findElements(By.tagName("div"));

		// for loop - the long way
//		for(int i = 0; i < listOfElements.size(); i++) {
//			WebElement currentElement = listOfElements.get(i);
//			System.out.println(currentElement.getText());
//		}

		// for-each loop - the short way
		for (WebElement currentElement : listOfElements) {
			System.out.println(currentElement.getText());
		}

		TimeUnit.SECONDS.sleep(1);
		driver.quit();

	}

}
