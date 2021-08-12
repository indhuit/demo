package org.packg1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Mouse extends Launch2{



	public void moveTo() throws InterruptedException {
		WebElement close = driver.findElement(By.xpath("//button[text()='✕']"));
		close.click();
		Thread.sleep(3000);
		Actions a= new Actions(driver);

		WebElement fashion = driver.findElement(By.xpath("//div[text()='Fashion']"));
		a.moveToElement(fashion).build().perform(); //yes- load issue //build- refresh the webelement


		WebElement kids = driver.findElement(By.xpath("//*[text()='Kids']"));
		kids.click(); //direct

		/*	a.contextClick()
		a.click()
		a.doubleClick()
		a.dragAndDrop(source, target)
		a.moveToElement(target)*/





	}


	public void rightDoubleclick() throws InterruptedException
	{
		Thread.sleep(2000);
		Actions a= new Actions(driver);
		Thread.sleep(3000);
		a.contextClick().build().perform();
		Thread.sleep(3000);

		WebElement dc = driver.findElement(By.id("dblClkBtn"));
		a.doubleClick(dc).build().perform();


	}
	
	
	public void dd()
	{
		WebElement frame = driver.findElement(By.xpath("//iframe[contains(@class,'demo-frame')]"));
		driver.switchTo().frame(frame);
		
		WebElement src = driver.findElement(By.xpath("//h5[text()='High Tatras']"));
		WebElement des = driver.findElement(By.id("trash"));
		Actions aa= new Actions(driver);
		aa.dragAndDrop(src, des).build().perform();

		
	}
	public static void main(String[] args) throws InterruptedException {
		Mouse m = new Mouse();
		m.launchbrowser();
		m.maximize();
		//m.url("https://www.flipkart.com/");
		//m.moveTo();
		//m.url("http://demo.guru99.com/test/simple_context_menu.html");
		//m.url("https://www.testandquiz.com/selenium/testing.html");
		//m.rightDoubleclick();
		
		m.url("https://www.globalsqa.com/demo-site/draganddrop");
		m.dd();


	}

}
 