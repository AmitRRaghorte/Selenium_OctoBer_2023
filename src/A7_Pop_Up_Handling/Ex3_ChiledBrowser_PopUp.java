package A7_Pop_Up_Handling;



import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex3_ChiledBrowser_PopUp {
	
	public static void main (String [] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://skpatro.github.io/demo/links/");
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//input[@name='NewTab']")).click();
		
		// to get id of window
		
		Set<String> allIds = driver.getWindowHandles();// (mainpgid , childpage ids in table format but we need in index format)
		
		ArrayList <String> a1 = new ArrayList <String>(allIds); // (mainpag (0) , childpg (1))
		
		// to switch to child window
	
		driver.switchTo().window(a1.get(1));
		
		driver.findElement(By.xpath("//span[text()='Training'][1]")).click();
		
		
	}
	

}
