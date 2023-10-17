package A2_WebElement_Method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example2_IsEnabled_method {
	
public static void main (String [] args) throws InterruptedException {
		
		WebDriver Driver = new ChromeDriver ();
		Driver.manage().window().maximize();
		
		Driver.get ("https://www.facebook.com/");
		Thread.sleep(1000);
		
		
		boolean result =Driver.findElement(By.xpath ("//button[@name='login']")).isEnabled();
		System.out.println (result);
		
		if(result) {
			System.out.println ("Element is enabled");
		}else {
			System.out.println ("Element id disabled");
		}

}
}

//Step 1 : Find xpath of element ,
//Step2  :store it in variable (result).
//Step3  :Used return type boolean ==> this method return boolean value i.e true or false
//Step4 : compare result using if_Else