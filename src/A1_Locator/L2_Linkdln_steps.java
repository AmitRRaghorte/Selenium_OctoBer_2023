package A1_Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class L2_Linkdln_steps implements L1_Lindln_interface {

	public void signin() throws InterruptedException {

		// Launch URL
		WebDriver Driver = new ChromeDriver();
		Driver.manage().window().maximize();
		Driver.get(url);
		Thread.sleep(1000);

		// Click on Signin

		//WebElement sign = Driver.findElement(By.xpath("// a[@class='nav__button-secondary btn-md btn-secondary-emphasis']"));
		//sign.click();
		//Thread.sleep(500);

		// Enter userid
		   WebElement user = Driver.findElement(By.xpath("//input[@id='session_key']"));
		   user.sendKeys(userid);
		   Thread.sleep(1000);
		
		// Enterpassword
		   WebElement pass = Driver.findElement(By.xpath("//input[@name='session_password']"));
		   pass.sendKeys(password);
		   Thread.sleep(1000);
		   
        // click on sign final 
		   WebElement sgn = Driver.findElement(By.xpath("//button[@type='submit']"));
		   sgn.click();
		   Thread.sleep(2000);

	}

	public void linkdln() {
		System.out.println("Welcome To Linkdln");

	}

}
