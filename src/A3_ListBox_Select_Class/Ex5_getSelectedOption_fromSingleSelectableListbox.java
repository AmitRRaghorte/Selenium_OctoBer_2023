package A3_ListBox_Select_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ex5_getSelectedOption_fromSingleSelectableListbox {
	
	public static void main (String []  args) throws InterruptedException {
		
		WebDriver Driver = new ChromeDriver();
		Driver.manage().window().maximize();
		Driver.get("https://www.facebook.com/");
		Thread.sleep(1000);

		WebElement create = Driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		create.click();
		Thread.sleep(500);

// Step 1 : Find xpath of listbox
		
		WebElement listbox = Driver.findElement(By.xpath("//select[@id='month']"));
		
//Step 2 :Obj select class
		Select s = new Select (listbox);
		
// Step 3 : method :getFirstSelectedOption();which return string
		
		String text = s.getFirstSelectedOption().getText();
		System.out.println (text);
		Driver.quit();
	
	 // WebElement selectedoption = s.getFirstSelectedOp
    //  String text =selectedoption.getText();
    //  System.out.println (text);
		
	}

}
