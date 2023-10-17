package A1_Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class F2_Index_Locator implements  F1_ByIndexLocator_FB{
	
	
	public void m5 () throws InterruptedException {
		
		WebDriver Driver = new ChromeDriver ();
		Driver.manage().window().maximize();
		
		Driver.get (url1);
		Thread.sleep(1000);
		
		WebElement createnew = Driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		createnew.click();
		Thread.sleep(1000);
		
		WebElement fn = Driver.findElement (By.xpath ("(//input[@type='text'])[2]"));
		fn.sendKeys(firstname);
		Thread.sleep(1000);
		
		WebElement ln = Driver.findElement(By.xpath("(//input[@type='text'])[3]"));
		ln.sendKeys(lastname);
		Thread.sleep(1000);
		
		WebElement mobno  = Driver.findElement(By.xpath("(//input[@type='text'])[4]"));
		mobno.sendKeys(mob);
		Thread.sleep(1000);
		
	}

}
