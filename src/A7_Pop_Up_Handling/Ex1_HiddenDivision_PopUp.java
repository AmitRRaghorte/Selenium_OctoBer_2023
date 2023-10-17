package A7_Pop_Up_Handling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex1_HiddenDivision_PopUp {
	
	public static void main (String [] args) throws InterruptedException {
		
		WebDriver Driver = new ChromeDriver ();
		Driver.manage().window().maximize();
		Driver.manage().deleteAllCookies();
		Driver.get("https://www.flipkart.com/account/login?ret=/");
		Thread.sleep(2000);
		
		WebElement email =Driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		email.sendKeys("amit@RRaghorte");
		Thread.sleep(500);
		Driver.quit();
	}

}

// Hidden division pop-up is colourful
// we can inspect it directly
// no need to shift focus of selenium form main pg 