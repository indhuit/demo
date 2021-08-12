package org.packg1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Locators  extends Launch2{
	
	public void passvalues() throws InterruptedException  {

		//WebElement pwd = driver.findElement(By.xpath("//input[@name='pass']"));
		//WebElement pwdcontains = driver.findElement(By.xpath("//input[contains(@name,'pas')]"));

		//WebElement classcontains = driver.findElement(By.xpath("//input[contains(@class,'inputtext')]"));

		
		WebElement pass = driver.findElement(By.name("pass"));
		WebElement uname = driver.findElement(By.id("email"));
		String s="hi";
		//String h="hi"; 
		System.out.println(s);
		
		//driver.findElement(By.className("inputtext"));
		WebElement loginbutton = driver.findElement(By.tagName("button"));// not used  mostly
		
		//WebElement logintext = driver.findElement(By.linkText("Log In"));
		//WebElement loginpartial = driver.findElement(By.partialLinkText("Log"));
		
		uname.sendKeys("yuvarajnandhak@gmail.com");
		Thread.sleep(2000); // 2sec
		pass.sendKeys("B@posi1");
		Thread.sleep(2000);
		loginbutton.click();
		Thread.sleep(2000);

		
		
		
	}
	
	public void linktext() {

		//WebElement logintext = driver.findElement(By.linkText("Forgotten password?"));
		//WebElement xpathtext = driver.findElement(By.xpath("//a[text()='Forgotten password?']"));
		
		WebElement loginpartial = driver.findElement(By.partialLinkText("Forgotten"));
		//WebElement xpathpartialtext = driver.findElement(By.xpath("//a[contains(text(),'Forgotten')]"));

		//logintext.click();
		loginpartial.click();
		
		
	}
	public static void main(String[] args) throws InterruptedException {
			
		Locators l = new Locators();
		//l.launchbrowser();
		l.maximize();
		l.url("https://www.facebook.com");
		//l.passvalues();
		//l.linktext();
	}

}


           
	