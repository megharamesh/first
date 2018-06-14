package packagenew;

import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class objectrepository {
	static WebDriver driver;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Properties prop = new Properties();
		FileInputStream ip= new FileInputStream("/Users/Megha/eclipse-workspace/project/src/packagenew/test.properties");
		prop.load(ip);
		
		System.out.println(prop.getProperty("name"));
		System.out.println(prop.getProperty("age"));
		//System.out.println(prop.getProperty("browser"));
		//System.out.println(prop.getProperty("URL"));
		
		String url = prop.getProperty("URL");
		System.out.println(url);
		
		String browser = prop.getProperty("browser");
		System.out.println(browser);
		
	//if(browser.equals("chrome")) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Megha\\Downloads\\chromedriver_win32\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			
		//}
		System.out.println("test");
		driver.get(url);
		driver.findElement(By.xpath(prop.getProperty("xpath_email"))).sendKeys(prop.getProperty("emailid"));
		driver.findElement(By.xpath(prop.getProperty("xpath_password"))).sendKeys(prop.getProperty("passwordid"));
		




	}

}
