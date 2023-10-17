package A1_Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class N2_Naukri_Locators implements N1_Naukri_Interface{

	public void loginnaukri () throws InterruptedException {
		
		WebDriver Driver = new ChromeDriver ();
		Driver.manage().window().maximize();
		
		Driver.get(url);
		Thread.sleep(1000);
		
		WebElement login = Driver.findElement(By.xpath("//a[@id='login_Layer']"));
		login.click();
		Thread.sleep(1000);
		
		WebElement ui = Driver.findElement (By.xpath("//input[@type='text']"));
		ui.sendKeys(userid);
		Thread.sleep(1000);
		
		WebElement pass = Driver.findElement(By.xpath("//input[@type='password']"));
		pass.sendKeys(password);
		Thread.sleep(1000);
		
		WebElement loginButton = Driver.findElement(By.xpath("//button[text()='Login']"));
		loginButton.click();
		Thread.sleep(3000);
		Driver.quit();
		
	}
	
	public void job() {
	System.out.println ("Automation Test Engineer");
		
	}

}
