package P1_Practised;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class B4_PrintallOptions_ofListBox {

	public static void main(String[] args) throws InterruptedException {
		// launch url
		// find xpath
		// create obj of select class
		// get ids of all option using getOptions () method store in varible whose
		// datatype is listof webelemtnt
		// print size of listbox
		// used for each loop

		WebDriver Driver = new ChromeDriver();
		Driver.manage().window().maximize();
		Driver.get("https://demos.devexpress.com/aspxeditorsdemos/listeditors/multiselect.aspx");
		Driver.manage().deleteAllCookies();
		Thread.sleep(2000);

		WebElement text = Driver.findElement(By.xpath("")); 
		
		Select s = new Select (text);
		
		List <WebElement> alloptions = s.getOptions();
		System.out.println (alloptions.size());
		
		for(WebElement s1 :alloptions) {
			System.out.println (s1.getText());
			
		}
		Driver.quit();
	}
}
