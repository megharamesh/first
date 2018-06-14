package packagenew;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mousem {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

System.setProperty("webdriver.chrome.driver", "C:\\Users\\Megha\\Downloads\\chromedriver_win32\\chromedriver.exe");
WebDriver driver = new ChromeDriver();

driver.manage().deleteAllCookies();
driver.manage().window().maximize();

driver.get("http://spicejet.com/");



Actions action = new Actions(driver);
action.moveToElement(driver.findElement(By.linkText("ADD-ONS"))).build().perform();

Thread.sleep(3000);

driver.findElement(By.linkText("SpiceClub Membership Offer")).click();






	}

}
