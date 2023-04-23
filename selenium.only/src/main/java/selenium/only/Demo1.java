package selenium.only;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {

	public static void main(String[] args) throws InterruptedException {

		String url1 = "https://www.selenium.dev/selenium/web/web-form.html";
		String url2 = "http://www.google.com";
		String url3 = "http://127.0.0.1:5500/index.html";

		// open chrome browser
		WebDriver driver = new ChromeDriver();
		// edge
//		WebDriver driver = new EdgeDriver();
		// firefox
//		WebDriver driver = new FirefoxDriver();

		// go to a url
		driver.get(url1);

		// ask for the page title and print it
		String title = driver.getTitle();
		System.out.println("page title is: " + title);

		// wait 3 seconds
		TimeUnit.SECONDS.sleep(3);
		driver.get(url2);

		// wait 3 seconds
		TimeUnit.SECONDS.sleep(3);
		driver.get(url3);

		TimeUnit.SECONDS.sleep(3);

		// close the browser
		driver.quit();

	}

}
