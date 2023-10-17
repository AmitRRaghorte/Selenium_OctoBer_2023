package A7_Pop_Up_Handling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex2_AlertPopUp {

	public void alertpopup() throws InterruptedException {
		
		WebDriver Driver = new ChromeDriver ();
		Driver.manage().window().maximize();
		Driver.manage().deleteAllCookies();
		Driver.get("https://demo.guru99.com/test/delete_customer.php");
		Thread.sleep(1000);
		
		
		WebElement input = Driver.findElement(By.xpath("//input[@type='text']"));
		input.sendKeys("amit@rraghorte");
		
		WebElement submit = Driver.findElement(By.xpath("//input[@type='submit']"));
		submit.click();
		
	
		// To get text  of pop up
		String text = Driver.switchTo().alert().getText();
		System.out.println (text);
		
		// To click on "ok" on alert pop up
		Driver.switchTo().alert().accept();
		
		// 2nd click
		//Driver.switchTo().alert().accept();
		
		// To click on "cancel"button on popup
		//Driver.switchTo().alert().dismiss();
		
		Driver.quit();
		
		

	}

	public static void main(String[] args) throws InterruptedException {

		Ex2_AlertPopUp a = new Ex2_AlertPopUp();
		a.alertpopup();

	}

}


// alert pop up can not inspect
// need to switch the focus of selenium from main page to alert pop up
// Driver.switchTo().alert();
//
