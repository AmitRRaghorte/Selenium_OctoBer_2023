package A3_ListBox_Select_Class;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Examaple6_PrintAllOptionsOfListBox {

	
	public static void main (String [] args) throws InterruptedException {
		
		WebDriver Driver = new ChromeDriver ();
		Driver.manage().window().maximize();
		Driver.get("https://demoqa.com/select-menu");
		Thread.sleep(2000);

// Step 1 :
		WebElement multiple = Driver.findElement (By.xpath("//select[@id='cars']"));
		
//Step 2 :
		Select s = new Select (multiple);
		
// step 3 : use getOptions ();
		
		List <WebElement> alloptions = s.getOptions();
		System.out.println (alloptions.size());
		
		for (WebElement s1 : alloptions) {
			System.out.println (s1.getText());
			
		}
		Driver.quit();
	}
	
}
