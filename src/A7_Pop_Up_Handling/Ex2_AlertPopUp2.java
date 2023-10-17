package A7_Pop_Up_Handling;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex2_AlertPopUp2 {

	public void m5() throws InterruptedException {

		WebDriver Driver = new ChromeDriver();
		Driver.manage().window().maximize();
		Driver.manage().deleteAllCookies();
		Driver.get("https://nxtgenaiacademy.com/alertandpopup/");
		Thread.sleep(1000);

		Driver.findElement(By.xpath("//button[text()='Prompt Alert Box']")).click();
		
        Alert alt = Driver.switchTo().alert();
        
       String text = alt.getText();
       System.out.println (text);
      
        alt.accept();
        
       // alt.dismiss();
        
        Driver.quit();
		

	}

	public static void main(String[] args) throws InterruptedException {

		Ex2_AlertPopUp2 a = new Ex2_AlertPopUp2();
		a.m5();
	}
}