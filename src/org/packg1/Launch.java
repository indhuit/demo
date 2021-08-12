package org.packg1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*public class Launch 
{
	static WebDriver driver;
	
	public void launchbrowser()
	{
		//System.setProperty("web");
		String path=".//driver//chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);//Initialize
		 ChromeDriver driver = new ChromeDriver();//launch
		System.err.println("hi");
		
	}
	public void maximize()
	{
		driver.manage().window().maximize();
	}

	public void url(String data)
	{
	   driver.get(data);
	}

	public static void main(String[] args) {
		Launch l=new Launch();
		l.launchbrowser();
		l.maximize();
		l.url("https://www.flipkart.com");

	}

}*/
public class Launch {

	static WebDriver driver; //access- same name declaration not allowed
	
	public void launchbrowser()
	{
		String path=".//driver//chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);//initilaize
		 driver = new ChromeDriver();//launch
		System.err.println("hi");
		
	}

	public void maximize()
	{
		driver.manage().window().maximize();
	}

	public void url(String data)
	{
	driver.get(data);
	}
	public static void main(String[] args) 
	{
		Launch l = new Launch();
		l.launchbrowser();
		l.maximize();
		l.url("https://www.flipkart.com");

	}

}
/*static WebDriver driver; //access- same name declaration not allowed

public void launchbrowser()
{
	String path=".//driver//chromedriver.exe";
	System.setProperty("webdriver.chrome.driver", path);//initilaize
	 driver = new ChromeDriver();//launch
	System.err.println("hi");
	
}

public void maximize()
{
	driver.manage().window().maximize();
}

public void url(String data)
{
driver.get(data);
}
public static void main(String[] args) 
{
	Launch l = new Launch();
	l.launchbrowser();
	l.maximize();
	l.url("https://www.flipkart.com");

}

}*/
