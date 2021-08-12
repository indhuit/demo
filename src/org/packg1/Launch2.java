package org.packg1;
import java.awt.AWTException;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Launch2 {

	static WebDriver driver; //access- same name declaration not allowed
	static int i=1;

	public static void launchbrowser()
	{
		String path=".//driver//chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);//initilaize
		driver = new ChromeDriver();//launch
		System.err.println("hi");

	}

	public void maximize()
	{
		driver.manage().window().maximize();  //dmwm
	}

	public void url(String data)
	{
		driver.get(data);
	}

	public static void screenShot() throws IOException
	{
		TakesScreenshot t = (TakesScreenshot) driver;
		File src = t.getScreenshotAs(OutputType.FILE);//screenshot
		FileUtils.copyFile(src, new File(".//report//pic"+i+".png"));// to save copy 
		i++;

	}

	public static void main(String[] args) throws AWTException, InterruptedException, InterruptedException,IOException{
		Launch2 l = new Launch2();
		l.launchbrowser();
		l.maximize();
		l.url("https://www.facebook.com");
	}
}

 
