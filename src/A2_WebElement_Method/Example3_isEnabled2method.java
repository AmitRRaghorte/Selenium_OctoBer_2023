
package A2_WebElement_Method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example3_isEnabled2method {
	
     public static void main (String [] args) throws InterruptedException {
	
	WebDriver Driver = new ChromeDriver ();
	Driver.manage().window().maximize();
	
	Driver.get ("https://www.instagram.com/");
	Thread.sleep(1000);
	
	boolean result = Driver.findElement(By.xpath("//button[@type='submit']")).isEnabled();
	System.out.println (result);
	
	if (result) {
		System.out.println ("Element is enabled");
		
	}else {
	
		System.out.println ("Element is Disabled");
	}

}
}