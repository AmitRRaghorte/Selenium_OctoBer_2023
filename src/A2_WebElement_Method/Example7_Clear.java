package A2_WebElement_Method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example7_Clear {
	
	public static void main (String [] args) throws InterruptedException {
		
		WebDriver Driver = new ChromeDriver ();
		Driver.manage().window().maximize();
		Driver.get("https://www.naukri.com/");
		Thread.sleep(3000);

//1.isDisplayed
		
	boolean	logo = Driver.findElement(By.xpath("(//img[@alt='Naukri Logo'])[1]")).isDisplayed();
	System.out.println (logo);
	
	if(logo) {
		System.out.println ("Welcome To naukri.com");
	}else {
		System.out.println ("");
	}
	Thread.sleep(1000);
			
//2.isEnabled
		
				boolean register = Driver.findElement(By.xpath("//a[text()='Register']")).isEnabled();
				System.out.println (register);
				
				if (register) {
					System.out.println ("Register is enabled");
				}
				else {
					System.out.println ("Register is disabled");
				}
				Thread.sleep(1000);
		
		WebElement login = Driver.findElement (By.xpath("//a[text()='Login']"));
		login.click();
		Thread.sleep(2000);
		
		WebElement email = Driver.findElement (By.xpath("(//input[@type='text'])[1]"));
		email.sendKeys("amit.rraghorte4@gmail.com");
		Thread.sleep(1000);
		
//2.clear
		email.clear();
		Thread.sleep(1000);
		
		email.sendKeys("amit.rragjorte5@gmail.com");
		Thread.sleep(2000);
		
		Driver.quit();
		
	}
	
	

}
