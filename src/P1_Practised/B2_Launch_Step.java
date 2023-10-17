package P1_Practised;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class B2_Launch_Step implements B1_ListBox {
	
	public void m5() throws InterruptedException {

// URL Launch
	WebDriver Driver = new ChromeDriver ();
	Driver.manage().window().maximize();
	Driver.get(url);
	Thread.sleep(3000);
	
// Verify webpage : isDispalyed ();
	
	boolean page = Driver.findElement(By.xpath("//img[@src='/images/Toolsqa.jpg']")).isDisplayed();
	System.out.println (page);
	
	if(page) {
		System.out.println ("Correct webpage : Logo visible");
	}else {
		System.out.println ("Wrong WebPage");
	}
	Thread.sleep(2000);
	
// Verify button actionable : isEnabled ();
	
	boolean buttonn = Driver.findElement(By.xpath("(//div[@class=' css-tlfecz-indicatorContainer'])[1]")).isEnabled();
	System.out.println(buttonn);
	
	if(buttonn) {
		System.out.println ("Buttons actionable");
	}else {
		System.out.println ("Buttons not actinalble");
	}
	Thread.sleep(2000);

// get attribute 
	
	String text = Driver.findElement (By.xpath("//select[@id='oldSelectMenu']")).getAttribute("Value");
	System.out.println ("Attribute is : "+ text);
	
// select 
	
	WebElement hello = Driver.findElement(By.xpath("//select[@id='cars']"));
	
	Select s = new Select (hello);
	
	s.selectByVisibleText("Volvo");
	s.selectByIndex(0);
	s.selectByValue("opel");
	Thread.sleep(2000);

// DeselectAll 
	
	s.deselectAll();

// GetTitle 
	System.out.println ("Title : " + Driver.getTitle());

// GetCurrent Url

	String  url = Driver.getCurrentUrl();
	System.out.println (url);
	
	Driver.quit();
	
	}

	
	public void hello() {
		System.out.println ("Succeeddful All operation");
		
	}
}
