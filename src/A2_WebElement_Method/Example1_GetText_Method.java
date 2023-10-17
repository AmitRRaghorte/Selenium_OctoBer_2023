package A2_WebElement_Method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

// How to get Text of Webelement ?
public class Example1_GetText_Method {
	
	public static void main (String [] args) throws InterruptedException {
		
		WebDriver Driver = new ChromeDriver ();
		Driver.manage().window().maximize();
		
		Driver.get ("https://www.facebook.com/");
		Thread.sleep(1000);
	    
		String text = Driver.findElement(By.xpath("//a[text()='Forgotten password?']")).getText();
		System.out.println (text);
		
		//System.out.println (Driver.findElement(By.xpath("//a[text()='Forgotten password?']")).getText());
		Driver.quit();
	}

}

// Explanation : 1.Find xpath of webelement whose text we want ot get
//               Driver.findElement(By.xpath("//a[text()='Forgotten password?']"))

//              2.store it in variable and used getText method whose  return type "String" (return type of getText method is STRING)
// 3.printing statemement