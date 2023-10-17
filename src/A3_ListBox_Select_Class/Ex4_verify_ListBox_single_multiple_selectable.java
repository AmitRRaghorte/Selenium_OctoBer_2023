package A3_ListBox_Select_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ex4_verify_ListBox_single_multiple_selectable {
	
	
	public static void main (String [] args) throws InterruptedException {
		
		WebDriver Driver = new ChromeDriver ();
		Driver.manage().window().maximize();
		Driver.get("https://demoqa.com/select-menu");
		Thread.sleep(2000);
		
//Step 1 : Findout xpath ,store it into variable whose retrun type is WebRlement
		
		WebElement hello = Driver.findElement(By.xpath("//select[@id='cars']"));
		;
		
//Step 2 : Create obj of select class
		
		Select s = new Select(hello);
		
//Step 3 :Used isMultiple();
		
		boolean result = s.isMultiple();
		System.out.println (result);
        
		if (result) {
			System.out.println ("ListBox is Multi Selecatable");
		}else {
			System.out.println ("ListBox is not Multi Selecatable");
		}
	}

}
