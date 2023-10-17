package A2_WebElement_Method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example4_isSelected_method {
	
	public static void main (String [] args) throws InterruptedException {
		
		WebDriver Driver = new ChromeDriver ();
		Driver.manage().window().maximize();
		
		Driver.get ("https://www.facebook.com/");
		Thread.sleep(1000);
		
		WebElement create = Driver.findElement(By.xpath("//a[text()='Create new account']"));
		create.click();
		
		Thread.sleep(3000);
		
		boolean result = Driver.findElement(By.xpath("(//input[@class='_8esa'])[1]")).isSelected();
		System.out.println (result);
		
		if (result) {
			System.out.println ("Radio button selected ");
			
		}else {
		
			System.out.println ("Radio Button is  DeSelected");
		}
		
		Driver.quit();

}}
