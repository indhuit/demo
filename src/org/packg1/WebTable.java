package org.packg1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {
	public static void main(String[] args){
		String path=".//driver1//chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
	   // driver = new ChromeDriver();
	//System.setProperty("webdriver.gecko.driver","C:/Users/siva/workspace/Selenium/driver/geckodriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("http://toolsqa.com/automation-practice-table/");
	List<WebElement> tRows= driver.findElements(By.tagName("tr"));
	for(int i=0;i<tRows.size();i++){
		List<WebElement> tData= driver.findElements(By.tagName("td"));
		for(int j=0;j<tData.size();j++){
			if(tData.get(j).getText().equals("Dubai")){
				driver.findElement(By.xpath(".//*[@id='content']/table/tbody/tr["+i+"]/td[6]/a"));
				System.out.println(tData.get(j).getText()); }}}}


}
