package org.packg1;
import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Demo2 {
	static WebDriver driver;
	@AfterClass
	public static void quit(){
		driver.quit();
	}
	@BeforeClass
	public static void launch() {
		String path=".//driver1//chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
	    driver = new ChromeDriver();
	    driver.navigate().to("https://en-gb.facebook.com/");
	    driver.manage().window().maximize();
	}
	@Before
	public void date(){
		Date d= new Date();
		System.out.println(d);
	}
	@After
	public void dat(){
		Date d1= new Date();
		System.out.println(d1);
	}
	@Test
	public void test(){
		WebElement login = driver.findElement(By.id("email"));
		login.sendKeys("indhumathicse16@gmail.com");
		WebElement pas = driver.findElement(By.id("pass"));
		pas.sendKeys("indhu");
	}
	@Test
	public void test1(){
		WebElement c = driver.findElement(By.xpath("//button[@type='submit']"));
		c.click();
	}
}
