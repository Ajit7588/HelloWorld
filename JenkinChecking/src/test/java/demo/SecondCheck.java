package demo;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class SecondCheck 
{
	private WebDriver driver;
	@Test(priority=1)
	public void second_one() throws IOException
	{		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Ajeet\\eclipse-workspace\\JenkinChecking\\src\\test\\resource\\driver\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("useAutomationExtension", false);
		options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});

		 driver = new ChromeDriver(options);
		//WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		System.out.println("hello ajit test=2");
	}
	
	@Test(priority=2)
	public void second_second() throws InterruptedException
	{	  
		System.out.println("hello ajit test=2");
		//  driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}
	
	@Test(priority=3)
	public void second_three() throws InterruptedException
	{
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		Thread.sleep(500);
		driver.findElement(By.xpath("//*[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")).click();
	}
}
