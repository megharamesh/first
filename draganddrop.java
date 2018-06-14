package packagenew;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.interactions.Actions;

public class draganddrop {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Megha\\Downloads\\chromedriver_win32\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		WebDriver driver = new HtmlUnitDriver();

		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();



		//driver.get("http://jqueryui.com/droppable/");
		driver.get("http://spicejet.com/");
		 File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

        FileUtils.copyFile(src, new File("\\Users\\Megha\\eclipse-workspace\\project\\src\\packagenew\\pint.png"));
        
        



		
	//	System.out.println(driver.getTitle());
		//driver.findElement(By.xpath("html/body/form/div[4]/div[1]/div[1]/div[2]/div[2]/div/ul/li[8]/a")).click();
		

//Actions action = new Actions(driver);
//action.moveToElement(driver.findElement(By.linkText("ADD-ONS"))).build().perform();

//Thread.sleep(3000);

//driver.findElement(By.linkText("SpiceClub Membership Offer")).click();

//System.out.println(driver.getTitle());

		//driver.switchTo().frame(0);
		//Actions action = new Actions(driver);
		//action.clickAndHold(driver.findElement(By.xpath("html/body/div[1]"	))).moveToElement(driver.findElement(By.xpath("html/body/div[2]"))).release().build().perform();
		


	}

}
