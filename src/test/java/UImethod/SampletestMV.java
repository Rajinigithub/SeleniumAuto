package UImethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SampletestMV {
	WebDriver driver;
	
	@Test
	public void testlogin() {
			
		System.setProperty("webdriver.chrome.driver","F:\\QA Automation\\Selenium\\chromedriver_win32\\chromedriver.exe");
	     driver = new ChromeDriver();
		
		driver.manage().timeouts().pageLoadTimeout(60,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		//1.Navigate to URL 
		driver.navigate().to("https://magento.softwaretestingboard.com");
		
		driver.manage().window().maximize();
		
		//2.Validate Title of the page 
		String Stitle =driver.getTitle();
		System.out.println(Stitle);
		driver.close();
	}



@Test
public void testlogout() {
	
	System.setProperty("webdriver.chrome.driver","F:\\QA Automation\\Selenium\\chromedriver_win32\\chromedriver.exe");
    driver = new ChromeDriver();
	
	driver.manage().timeouts().pageLoadTimeout(60,TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	
	//1.Navigate to URL 
	driver.get("https://www.amazon.in/");
	//2.Validate Title of the page 
	String Stitle =driver.getTitle();
	System.out.println(Stitle);
}
}
