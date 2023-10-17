package A3_ListBox_Select_Class;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EX6_getAllSelectedOptionFrom_MultiselectedOption {
	
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
		
// Step 4 :we can not print multiple selected listbox direclty so
		//here we  will get ids of all listbox by using "getAllSelectedOptions () "  method and stored in into variable whose
		// datatype will be List<WebElement> (list of webelement)
		// Now will use for each loop 
		// whwenever we want to print multiple info then we need to used For_each loop 
		// in for_each loop ,on right side of semeicolon we wil write variable which contain ids of multiple information
		// on left side we write single information
		
		List <WebElement> allselectedOptions = s.getAllSelectedOptions();
		System.out.println (allselectedOptions.size());
		
		for (WebElement s1 : allselectedOptions) 
		{
			System.out.println (s1.getText());
		}
		
		Driver.quit();
   }
}