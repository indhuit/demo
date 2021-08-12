package org.packg1;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Resume {
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
	    public void passvalues() throws InterruptedException, AWTException{
	    	String parent = driver.getWindowHandle();
	        Set<String> allwindow = driver.getWindowHandles();
	        int count=allwindow.size();
	        System.out.println("total window counts "+count);
	        Thread.sleep(4000);
	        for(String child:allwindow){
	        	if(!parent.equalsIgnoreCase(child)){
	        		driver.switchTo().window(child);
	        		System.out.println("child window title"+driver.getTitle());
	        		Thread.sleep(4000);
	        		driver.close();
	        	}
	        }
	        
	        Thread.sleep(4000);
	        driver.switchTo().window(parent);
	        System.out.println("parent window title"+driver.getTitle());
	        Thread.sleep(3000);
    		WebElement w = driver.findElement(By.xpath("(//label[@class='btn'])[1]"));
    		w.click();
    		String path="D:\\INDHUMATHI RESUME.pdf";
    		StringSelection s=new StringSelection(path);
    		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s, null);
    		Thread.sleep(5000);
    		Robot r= new Robot();
    		r.keyPress(KeyEvent.VK_CONTROL);
    		r.keyPress(KeyEvent.VK_V);
    		r.keyRelease(KeyEvent.VK_CONTROL);
    		r.keyRelease(KeyEvent.VK_V);
    		r.keyPress(KeyEvent.VK_ENTER);
    		r.keyPress(KeyEvent.VK_ENTER);
	    }
	public static void main(String[] args) throws InterruptedException, AWTException {
		Resume l = new Resume();
		l.launch();
		l.maximize();
		l.url("https://www.naukri.com/");
		l.passvalues();
	}

}
