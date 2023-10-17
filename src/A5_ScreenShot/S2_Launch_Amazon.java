package A5_ScreenShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class S2_Launch_Amazon implements S1_CommonProperty_Screenshot{

	
	public void m5() throws InterruptedException, IOException {
		
		WebDriver Driver = new ChromeDriver ();
		Driver.manage().window().maximize();
		Driver.get(url);
		Driver.manage().deleteAllCookies();
		Thread.sleep(2000);
	
// Step 1 : Take Scrrenshot : this step takescreenshot and store it in local folder
		File src = ((TakesScreenshot)Driver).getScreenshotAs(OutputType.FILE);
		System.out.println (src);
		
// Step 2 : In 2nd step we want to store screenshot in our desired location so we create object of screenshot
		
		File dest = new File ("E:\\Velocity NOTES\\Automation\\Advance Selenium\\ScreenShotResult\\Amazon.png");
		
// Step 3 : To move / cut paste screenshot from local to desired folder we used "FileHnadler" class of selenium 
		
		FileHandler.copy(src, dest);
		
		Driver.quit();
	}
	public void amazon() {
		System.out.println ("ScreenSHot Takes Succeefully");
		
	}

}
