package packagenew;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class trial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Megha\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		//driver.manage().deleteAllCookies();
		driver.manage().window().maximize();

		driver.get("https://www.google.com");
		String title = driver.getTitle();
		System.out.println("title is:"+title);
		
		if(title.equals("Google"))
			System.out.println("correct");
		else
			System.out.println("incorrect");
		
		System.out.println(driver.getCurrentUrl());
	//	System.out.println(driver.getPageSource());
		
		driver.quit();
		
		
		

	}

}
