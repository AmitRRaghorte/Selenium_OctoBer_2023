package A1_Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class S2_Shine_Step implements S1_Shine {
	
	public void m5() throws InterruptedException {
		
		WebDriver Driver = new ChromeDriver ();
		Driver.manage().window().maximize();
		
		Driver.get(url);
		Thread.sleep(1000);
		
		System.out.println ( "Title :"  + Driver.getTitle());
		String url = Driver.getCurrentUrl();
		System.out.println ("URL : " + url);
		
		WebElement login = Driver.findElement(By.xpath("//button[text()='Login']"));
		login.click();
		Thread.sleep(1000);
		
		WebElement email = Driver.findElement(By.xpath("//input[@name='email']"));
		email.sendKeys(userid);
		Thread.sleep(1000);
		
		WebElement pass = Driver.findElement(By.xpath("//input[@type='password']"));
		pass.sendKeys(password);
		Thread.sleep(1000);
		
		WebElement loginclick =Driver.findElement(By.xpath("//button[@class='cls_base_1_pw_login_btn btn btn-secondary w-100 mt-30']"));
		loginclick.click();
		
		Driver.quit();
		
		
		
	}

	
	public void shine() {
	System.out.println ("Welcome to shine");
		
	}

}
