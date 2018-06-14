package packagenew;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class popup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Megha\\Downloads\\chromedriver_win32\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		WebDriver driver = new ChromeDriver();

		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    
		driver.get("http://popuptest.com/goodpopups.html");
		Thread.sleep(2000);
		driver.findElement(By.linkText("Good PopUp #2")).click();
		
		Set <String> handler = 	driver.getWindowHandles();
		Iterator <String> it = handler.iterator();
		
		String parentWindowId =it.next();
		System.out.println("parentwindowid is" + parentWindowId);
		
		String childWindowId = it.next();
		System.out.println("childwindowid is" + childWindowId);
		
		driver.switchTo().window(childWindowId);
		Thread.sleep(2000);
		
	   System.out.println("childwindow title is" +driver.getTitle());
	   
	  driver.close();
	  driver.switchTo().window(parentWindowId);
	  Thread.sleep(2000);
	  
	  System.out.println("parentWindow title is"+ driver.getTitle());
	  
		
		

	}

}
