package org.packg1;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handles {
	static WebDriver driver;
	public void launch()
	{
		String path=".//driver1//chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
	    driver = new ChromeDriver();
	}
    public void maximize()
	{
		driver.manage().window().maximize();
	}
    public void url(String data)
	{
	driver.get(data);
	}
    public void close(){
    	WebElement close = driver.findElement(By.xpath("//button[text()='✕']"));
		close.click();
    }
    public void passvalues() throws InterruptedException, IOException{
    	WebElement p = driver.findElement(By.xpath("//input[@name='q']"));
    	p.sendKeys("redmi moblies");
    	WebElement q = driver.findElement(By.xpath("//button[@class='L0Z3Pu']"));
    	q.click();
    	Thread.sleep(4000);
    	String parent = driver.getWindowHandle();
    	driver.findElement(By.xpath("(//div[@class='_4rR01T'])[1]")).click();
    	driver.findElement(By.xpath("(//div[@class='_4rR01T'])[2]")).click();
    	Thread.sleep(3000);
        driver.findElement(By.xpath("(//div[@class='_4rR01T'])[3]")).click();
    	driver.findElement(By.xpath("(//div[@class='_4rR01T'])[4]")).click();
    	Thread.sleep(3000);
    	driver.findElement(By.xpath("(//div[@class='_4rR01T'])[5]")).click();
    	driver.findElement(By.xpath("(//div[@class='_4rR01T'])[6]")).click();
    	driver.findElement(By.xpath("(//div[@class='_4rR01T'])[7]")).click();
    	Thread.sleep(5000);
    	 Set<String> allwindow = driver.getWindowHandles();
    	 ArrayList <String> tab = new ArrayList <>(allwindow);
    	 driver.switchTo().window(tab.get(3)); 
    	 Thread.sleep(5000);
    	 String s = driver.findElement(By.xpath("//span[@class='B_NuCI']")).getText();
 		System.out.println("5th tab moblie name:"+s);
 		Thread.sleep(5000);
 		driver.switchTo().window(tab.get(0));
 		System.out.println(parent);
 		}
	public static void main(String[] args) throws InterruptedException, IOException {
		Handles l = new Handles();
		l.launch();
		l.maximize();
		l.url("https://www.flipkart.com");
		l.close();
		l.passvalues();


	}
}