package A5_ScreenShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class T2_Tesla_Step implements T1_Tesla {
	
	
	public void m5 () throws InterruptedException, IOException {
		
		WebDriver Driver = new ChromeDriver ();
		Driver.manage().window().maximize();
		Driver.get(url1);
		Thread.sleep(2000);
		
		int TCID = 105 ;
		
// Step1 : takes scrrenshot
		File src = ((TakesScreenshot)Driver).getScreenshotAs(OutputType.FILE);
		System.out.println (src);
		
// Step 2 : desiredfolder
		File dest = new File ("E:\\Velocity NOTES\\Automation\\Advance Selenium\\ScreenShotResult\\Testcaseid"+TCID+".png");
		
// Step 3 : local to desired
		 FileHandler.copy(src, dest);
		 
		 System.out.println ("Title Name :  "  + Driver.getTitle());
		 String url = Driver.getCurrentUrl ();
		 System.out.println ("Current URL  : " + url);
		 Thread.sleep(1500);
		
	  Driver.switchTo().newWindow(WindowType.TAB);	
	  
	  Driver.get(url2);
	  Thread.sleep(2000);
	  
	  Driver.navigate().back();
	  Thread.sleep(2000);
	  
	  Driver.quit();	
		
		
	}

	public void tesla() {
		System.out.println("Buy Tesla S class");

	}

	public void rangerover() {
		System.out.println("Buy RangeRover AutoBiography");

	}

}
