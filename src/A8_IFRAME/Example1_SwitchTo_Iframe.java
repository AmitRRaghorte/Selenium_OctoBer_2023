package A8_IFRAME;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1_SwitchTo_Iframe {

	public void m5() throws InterruptedException {

		WebDriver Driver = new ChromeDriver();
		Driver.manage().window().maximize();
		Driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");

		// 4 Types to switch to iframe from main pg

		//Driver.switchTo().frame("iframeResult"); // String FrameName
		
		//Driver.switchTo().frame("iframeResult"); // String Frameid
		
		Driver.switchTo().frame(Driver.findElement(By.xpath("//iframe[@id='iframeResult']"))); // WebElment
	   
		//Driver.switchTo().frame(0);
		
		// Action 
		Driver.findElement(By.xpath("//button[@type='button']")).click();
		Thread.sleep(1000);
		Driver.quit();

	}

	public static void main(String[] args) throws InterruptedException {
		Example1_SwitchTo_Iframe v = new Example1_SwitchTo_Iframe();
		v.m5();
	}
}
