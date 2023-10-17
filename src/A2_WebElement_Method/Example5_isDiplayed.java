package A2_WebElement_Method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example5_isDiplayed {

	public static void main(String[] args) throws InterruptedException {

		WebDriver Driver = new ChromeDriver();
		Driver.manage().window().maximize();

		Driver.get("https://www.facebook.com/");
		Thread.sleep(1000);

		boolean result = Driver.findElement( By.xpath(("//img[@class='fb_logo _8ilh img']"))).isDisplayed();
		System.out.println(result);

		if (result) {
			System.out.println("Logo Present");
		} else {
			System.out.println("Logo Present");
		}
        Driver.quit();
	}
}
