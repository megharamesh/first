package packagenew;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.gargoylesoftware.htmlunit.javascript.host.file.File;
//import org.openqa.selenium.WebDriverException;




public class pinterest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Megha\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		//driver.manage().deleteAllCookies();
		driver.manage().window().maximize();

		driver.get("https://www.pinterest.com");
		//Thread.sleep(3000);
		
		//login
		
	   // driver.findElement(By.xpath("//input[@id='email']")).sendKeys("@gmail.com");
	    //driver.findElement(By.xpath("//input[@id='password']")).sendKeys("xyz@123" + Keys.ENTER);
	    
	    //Thread.sleep(3000);
		
		driver.findElement(By.id("email")).sendKeys("@gmail.com");
	    driver.findElement(By.id("password")).sendKeys("xyz@123" + Keys.ENTER);
	    
	    Thread.sleep(3000);
	    //driver.findElement(By.xpath("html/body/div[1]/div/div/div[1]/div/div[3]/div/div[2]/div[1]/div/div/div/div/div[3]/div[1]/div/div/div[1]/form/fieldset[1]/span/input")).sendKeys("@gmail.com");
	    //driver.findElement(By.xpath("html/body/div[1]/div/div/div[1]/div/div[3]/div/div[2]/div[1]/div/div/div/div/div[3]/div[1]/div/div/div[1]/form/fieldset[2]/span/input")).sendKeys("xyz@123");
	    
	    //search
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    
	    driver.findElement(By.xpath("html/body/div[2]/div/div[1]/div/div[1]/div[1]/div[2]/div[1]/div/div[2]/div/div/div[2]/div/div/div/div/div[1]/div[2]/input")).sendKeys("paintings"+Keys.ENTER);
        //driver.findElement(By.className("SearchBoxInput")).sendKeys("painting" +Keys.ENTER);
        Thread.sleep(3000);
	    
        //mousehover
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("html/body/div[2]/div/div[1]/div/div[1]/div[1]/div[3]/div/div/div[2]/div[1]/div/div/div/div/div[1]/div[1]/div/div/div/div/div/div/div[1]/a/div[2]"))).build().perform();
        Thread.sleep(3000);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    
	    //save
        driver.findElement(By.xpath("html/body/div[2]/div/div[1]/div/div[1]/div[1]/div[3]/div/div/div[2]/div[1]/div/div/div/div/div[1]/div[1]/div/div/div/div/div/div/div[1]/div[1]/div/div/div/div")).click();
        
        
	

	}

}
