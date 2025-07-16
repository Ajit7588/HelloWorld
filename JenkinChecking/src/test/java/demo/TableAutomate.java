package demo;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class TableAutomate 
{
	@Test
	public void f() throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","../JenkinChecking/src/test/resource/driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/html/jsref/tryit.asp?filename=tryjsref_alert");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		// here <th- header tag
		// here <td-column
		// here <tr-row


		for(int i=2;i<7;i++)
		{
			String xpath="//table[@id='customers']//tr["+"i"+"]//td[1]";
			System.out.println(xpath);
			WebElement list=driver.findElement(By.xpath(xpath));
			System.out.println(list.getText());
		}

	}

	@Test
	public void frameHandle() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","../JenkinChecking/src/test/resource/driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		String secondW=driver.getWindowHandle();
		WebElement link=driver.findElement(By.xpath("//span[contains(@class,'a-price-whole')][number(translate(., ',', '')) < 60000]"));
		link.click();
		wait.until(ExpectedConditions.numberOfWindowsToBe(2));

		Set<String> tabs=driver.getWindowHandles();
		for(String i:tabs)
		{
			if(!i.equals(secondW))
			{
				driver.switchTo().window(driver.getWindowHandle());			
			}
		}


	}











}
