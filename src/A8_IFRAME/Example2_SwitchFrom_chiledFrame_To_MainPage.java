package A8_IFRAME;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example2_SwitchFrom_chiledFrame_To_MainPage {
	
	
	public static void main (String [] args ) throws InterruptedException {

		WebDriver Driver = new ChromeDriver();
		Driver.manage().window().maximize();
		Driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");

// Switch to frame
		
		Driver.switchTo().frame("iframeResult");

// perform action
		Driver.findElement(By.xpath("//button[@type='button']")).click();
		Thread.sleep(1000);

// Switch from iFrame to MainPage
		
		Driver.switchTo().defaultContent();

// perform action on main page
		
		Driver.findElement(By.xpath("//a[@id='menuButton']")).click();
		Thread.sleep(2000);
		
		Driver.quit();
		
	
	
	}
	


}
		
		
	
		
	
