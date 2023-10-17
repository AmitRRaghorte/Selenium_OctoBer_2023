package A2_WebElement_Method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example6_getAttribute_method {
	
	public static void main(String[] args) throws InterruptedException {

		WebDriver Driver = new ChromeDriver();
		Driver.manage().window().maximize();

		Driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		
		Driver.findElement(By.xpath("//input[@id='email']")).sendKeys("amit.rraghorte09@gmail.com");
		
		Thread.sleep(2000);
		
		String text = 	Driver.findElement(By.xpath("//input[@id='email']")).getAttribute("Value");
		System.out.println (text);
		Driver.quit();
		
		
	
	
	
	
	}

}
