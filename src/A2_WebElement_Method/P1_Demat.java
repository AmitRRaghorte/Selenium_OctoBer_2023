package A2_WebElement_Method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class P1_Demat {
	
	public static void main (String [] args) throws InterruptedException {

// Launch URL
		WebDriver Driver = new ChromeDriver ();
		Driver.manage().window().maximize();
		Driver.get("https://www.zkoss.org/zkdemo/getting_started/listbox");
		Driver.manage().deleteAllCookies();
		Thread.sleep(2000);
		
// Verify we landed in correct webpage after launchin url
		
		boolean result = Driver.findElement(By.xpath("//a[@class='logo']")).isDisplayed();
		System.out.println (result);
		if(result) {
			System.out.println ("Correct WebPage");
		}else {
			System.out.println ("Wrong WebPage");
		}
		Thread.sleep(2000);

// Verify button are active means it will perform action after clicking on it
		
		boolean resultt = Driver.findElement(By.xpath("//a[@class='download']")).isEnabled();
		System.out.println (resultt);
		if(resultt) {
			System.out.println ("Button are active");
		}else {
			System.out.println ("Button are not active");
		}
		Thread.sleep(2000);

// gettext and currenURL
		
		System.out.println ("Title : " + Driver.getTitle());
		
		String url = Driver.getCurrentUrl();
		System.out.println (url);
		Thread.sleep(2000);

//select multiple listbox
		
  WebElement listbox = Driver.findElement(By.xpath("//span[@id='w0nBb-cm']"));
  
  Select s = new Select(listbox);
  
  s.selectByIndex(0);
  s.selectByIndex(1);
  s.selectByIndex(2);
  s.selectByIndex(3);
  Thread.sleep(2000);
 //  Deslect alll
  
  s.deselectAll();
  Thread.sleep(2000);
  
 // close
  Driver.quit();
		
	
		
		
		
	}

}
