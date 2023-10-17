package A2_WebElement_Method;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practised_Linkdln_subclass implements P1_Linkdln_interface {
	
	public void m5() throws InterruptedException {
		
		WebDriver Driver = new ChromeDriver ();
		Driver.manage().window().maximize();
		Driver.get(url);
		Thread.sleep(2000);
		
// verify webpage
		
		boolean page = Driver.findElement(By.xpath("(//icon[@aria-hidden='true'])[2]")).isDisplayed();
		System.out.println (page);
		
		if(page) {
			System.out.println ("Landed on correct page-Linkdln page");
			
		}else {
			System.out.println ("Wrong page");
		}
		Thread.sleep(1000);
// verify active webelement
	
	boolean active = Driver.findElement(By.xpath("//a[@class='nav__button-secondary btn-md btn-secondary-emphasis']")).isEnabled();
	System.out.println (active);
	
	if(active) {
		System.out.println ("clickable");
		
	}else {
		System.out.println ("Not_Clickable");
	}
	Thread.sleep(1000);
// getText
	String text = Driver.findElement(By.xpath("//a[@data-test-id='sign-in-join-cta']")).getText();
	System.out.println (text);
	Thread.sleep(1000);

// enter url
	
	WebElement emailid = Driver.findElement(By.xpath("//input[@id='session_key']"));
	emailid.sendKeys("amit.rraghorte@gmail.com");
	Thread.sleep(500);
	emailid.clear();
	Thread.sleep(500);
	emailid.sendKeys(userid);
	Thread.sleep(500);
	
	
// enter password
	WebElement pass = Driver.findElement(By.xpath("//input[@name='session_password']"));
	emailid.sendKeys("PaeVLe()&%@Amit@1993");
	Thread.sleep(500);
	emailid.clear();
	Thread.sleep(500);
	emailid.sendKeys(password);
	Thread.sleep(500);
	
// login click
	
	WebElement loginclick = Driver.findElement(By.xpath("//button[@type='submit']"));
	loginclick.click();
	Thread.sleep(1000);
	
	Driver.quit();
	
	}
	
	public void linkdln() {
	System.out.println ("WebElement Operation Successful on Linkdln");
	}

}
