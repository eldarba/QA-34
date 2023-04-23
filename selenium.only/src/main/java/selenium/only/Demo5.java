package selenium.only;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo5 {

	public static void main(String[] args) throws InterruptedException {

		String url = "http://127.0.0.1:5500/index.html";
		WebDriver driver = new ChromeDriver();
		driver.get(url);

		// find element by id
		WebElement element = driver.findElement(By.id("bt-1"));
		System.out.println(element.getTagName());
		System.out.println(element.getText());
		
		TimeUnit.SECONDS.sleep(1);
		driver.quit();

	}

}
