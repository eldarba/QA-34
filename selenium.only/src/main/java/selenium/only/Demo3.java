package selenium.only;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo3 {

	public static void main(String[] args) throws InterruptedException {

		String url = "http://127.0.0.1:5500/index.html";
		WebDriver driver = new ChromeDriver();
		driver.get(url);

		// finds the first instance
		WebElement element = driver.findElement(By.tagName("div"));
		System.out.println(element.getText());

		TimeUnit.SECONDS.sleep(1);
		driver.quit();

	}

}
