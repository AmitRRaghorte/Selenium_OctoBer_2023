package A3_ListBox_Select_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ex6_getFisrctSelectedOption_from_Multiselecatable {
	
public static void main (String [] args) throws InterruptedException {
		
		WebDriver Driver = new ChromeDriver ();
		Driver.manage().window().maximize();
		Driver.get("https://demoqa.com/select-menu");
		Thread.sleep(2000);

// Step 1 :
		WebElement multiple = Driver.findElement (By.xpath("//select[@id='cars']"));
		
//Step 2 :
		Select s = new Select (multiple);

// Step 3 : selecct multiple otpion
		
		s.selectByIndex(0); // volvo
		s.selectByIndex(1); // saab
		s.selectByIndex(3);  // audi
		Thread.sleep(1000);

// Step 4 : s.getFirstSelectedOption ();
		
		String text = s.getFirstSelectedOption().getText();
		System.out.println (text);
		Driver.quit();


}
}