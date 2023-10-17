package A3_ListBox_Select_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ex1_Single_Selectable_FaceBook {

	public void m5() throws InterruptedException {
		WebDriver Driver = new ChromeDriver();
		Driver.manage().window().maximize();
		Driver.get("https://www.facebook.com/");
		Thread.sleep(1000);

		WebElement create = Driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		create.click();
		Thread.sleep(500);

// Step 1 : Find xpath of listbox
		
		WebElement listbox = Driver.findElement(By.xpath("//select[@id='month']"));

//Step 2: create obj of selec class
		
		Select s = new Select(listbox);

// Select class method
		s.selectByIndex(5); // jan
		//s.selectByValue("");
		//s.selectByVisibleText("");
		Driver.quit();

	}

	public static void main(String[] args) throws InterruptedException {
		Ex1_Single_Selectable_FaceBook f = new Ex1_Single_Selectable_FaceBook();
		f.m5();
	}

}
