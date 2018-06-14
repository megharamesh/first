package packagenew;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.interactions.Actions;

public class mexample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Megha\\Downloads\\chromedriver_win32\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		WebDriver driver = new HtmlUnitDriver();
		
driver.get("https://google.com");
//File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		
//FileUtils.copyFile(src, new File("/Users/Megha/eclipse-workspace/project/src/packagenew/pics.png"));

System.out.println("before");
//System.out.println("after");

//driver.findElement(By.xpath("html/body/div[1]/div/div/div[1]/div/div[3]/div/div[2]/div[2]/button")).click();

//driver.findElement(By.xpath("//input[@id='email']")).sendKeys("93rmegha@gmail.com");
//driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Megha@123");

//driver.findElement(By.id("email")).sendKeys("93rmegha@gmail.com");
//driver.findElement(By.id("password")).sendKeys("Megha@123");

//driver.findElement(By.xpath("html/body/div[1]/div/div/div[1]/div/div/div[4]/div[1]/form/fieldset[1]/span/input")).sendKeys("93rmegha@gmail.com");
//driver.findElement(By.xpath("html/body/div[1]/div/div/div[1]/div/div/div[4]/div[1]/form/fieldset[2]/span/input")).sendKeys("Megha@123");

	}



}
