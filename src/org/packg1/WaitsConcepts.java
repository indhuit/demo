package org.packg1;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitsConcepts {
	static WebDriver driver; 
	public void launch()
	{
		String path=".//driver//chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/web-table-element.php");
		//driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);  // 5 to 10 sec

	}
	public static void implicitWait()
	{
		try
		{
			String text1 = driver.findElement(By.xpath("//tr[0]/td[4]")).getText();  // 0.01 sec
			System.out.println(text1);
		}
		catch(Exception e)
		{
			System.out.println("element not found");
		}
	}

	public void expWait()
	{
		WebDriverWait w = new WebDriverWait(driver, 30);// 500
		try
		{WebElement until = w.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//tr[1]/td[4]"))));
		if(until.isDisplayed())
		{
			System.out.println("web element found");
		}}
		catch(Exception e)
		{
			System.out.println("explicit wait not handled for the webelement");
		}

		//30 - 60 times ()
		Boolean until2 = w.until(ExpectedConditions.urlToBe("emo.guru99.com/test/web-table-element.php"));
		System.out.println(until2);
	}

	public void fluWait()
	{
		Wait w = new FluentWait(driver).withTimeout(30, TimeUnit.SECONDS).pollingEvery(5, TimeUnit.SECONDS).ignoring(NoSuchElementException.class);
		try
		{
			Object until = w.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//tr[1]/td[4]"))));			
		}
		catch(Exception e)
		{
			System.out.println("explicit wait not handled for the webelement");
		}
	}

	public static void main(String[] args) {
			WaitsConcepts w = new WaitsConcepts();
			w.launch();
			//w.implicitWait();
			//w.expWait();
			w.fluWait();		// TODO Auto-generated method stub

	}

}
