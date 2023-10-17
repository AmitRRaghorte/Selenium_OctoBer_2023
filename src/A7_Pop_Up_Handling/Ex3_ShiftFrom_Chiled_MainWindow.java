package A7_Pop_Up_Handling;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex3_ShiftFrom_Chiled_MainWindow {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://skpatro.github.io/demo/links/");
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.findElement(By.xpath("//input[@name='NewTab']")).click();

		Set<String> allIds = driver.getWindowHandles();
		ArrayList<String> a1 = new ArrayList<String>(allIds); // (mainpag (0) , childpg (1))
		
        driver.switchTo().window(a1.get(1));
		
		driver.findElement(By.xpath("//span[text()='Training'][1]")).click();
		
// Switch from ChildWindow to MainWindow
		
		driver.switchTo().window(a1.get(0));
		

// Now if again want to handle another child window then
		
		driver.findElement(By.xpath("(//input[@type='button'])[3]")).click();
		
		Set <String>ids = driver.getWindowHandles();
		ArrayList <String> a2 = new ArrayList<String> (ids);
		
		driver.switchTo().window(a2.get(2));
		driver.findElement(By.xpath("(//div[@class='lines-button '])[2]")).click();

	}

}
