package UImethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class AddtoCart {
	
	
	@Test

	public void Addcart() throws Exception {
		
		WebDriver driver;
		
System.setProperty("webdriver.chrome.driver","F:\\QA Automation\\Selenium\\chromedriver_win32\\chromedriver.exe");
			     driver = new ChromeDriver();
				
				driver.manage().timeouts().pageLoadTimeout(60,TimeUnit.SECONDS);
				driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
				
				//1.Navigate to URL 
				driver.navigate().to("https://magento.softwaretestingboard.com");
				
				driver.manage().window().maximize();
				//2.Sign In details 
				driver.findElement(By.linkText("Sign In")).click();
				
				driver.findElement(By.xpath("//input[@id='email']")).sendKeys("rajra1430@gmail.com");
				driver.findElement(By.xpath("//input[@title='Password']")).sendKeys("Password@123");
				driver.findElement(By.xpath("//button[@class='action login primary']")).click();
			
			
	
		//3.Hovering on Gear Then click on watches
				WebElement WGear=driver.findElement(By.linkText("Gear"));
				Actions Act= new Actions(driver);
				Act.moveToElement(WGear).build().perform();
				
				
		        WebElement WWatches =driver.findElement(By.xpath("//a[@id='ui-id-27']/span"));
		        WWatches.click();
				
				WebElement WdashDigital =driver.findElement(By.xpath("//img[@alt='Dash Digital Watch']"));
				
				WdashDigital.click();
				Thread.sleep(3000);
		
			//4. Select an item  then Add to cart 
	        driver.findElement(By.xpath("//button[@title='Add to Cart']")).click();
		    Thread.sleep(3000);
			
			//5.Go to Shopping page then proceed to checkout 
			driver.findElement(By.xpath("//span[@class='counter qty']/span")).click();
			
			driver.findElement(By.xpath("//div[@class='actions']/div/button")).click();
			
			
		
			//6. Enter then  shipping address and clicking on next button 
					driver.findElement(By.xpath("//div[@name='shippingAddress.street.0']/div/input")).sendKeys("14 Gatefield St");
					driver.findElement(By.xpath("//input[@name='city']")).sendKeys("Crewe");
					
				    driver.findElement(By.xpath("//input[@name='postcode']")).sendKeys("CW1 2JP");
				
				   WebElement CountryList= driver.findElement(By.xpath("//select[@name='country_id']"));
				   Select objsel= new Select(CountryList);
				   objsel.selectByVisibleText("United Kingdom");
				
				   driver.findElement(By.xpath("//input[@name='telephone']")).sendKeys("07393154631");
				
				   Thread.sleep(3000);
				
				
				   driver.findElement(By.xpath("//button[@class='button action continue primary']/span")).click();
				   Thread.sleep(3000);
				
		
			//7.Validate the Shipping Address Then click on place order 
			  String SshippingA= driver.findElement(By.xpath("//div[@id='checkout-payment-method-load']/div/div/div[2]/div[2]/div[2]/div/div[2]")).getText();
			
			  System.out.println("Shipping Address :-" +SshippingA);
			  driver.findElement(By.xpath("//div[@id='checkout-payment-method-load']/div/div/div[2]/div[2]/div[4]/div/button")).click();
			
		
			//8.validate the Thank you Message and check order no is 9 digits 
			  String Stext=driver.findElement(By.xpath("//span[text()='Thank you for your purchase!']")).getText();
			  System.out.println(Stext);
			
			  String Stext1 =driver.findElement(By.xpath("//a[@class='order-number']/strong")).getText();
			  System.out.println("Order Number:-" +Stext1);
				
			  boolean bool =driver.findElement(By.xpath("//a[@class='order-number']/strong")).isDisplayed();

			  if(bool)
			  {
				
			 System.out.println("Order number contains 9 digits is correct");
			 }
			 else
			
			 {
				System.out.println("Order number doesn't contains 9 digits is wrong");
			 }
			
			
			driver.close();
		}
	}


		

	