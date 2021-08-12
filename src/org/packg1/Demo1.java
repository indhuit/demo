package org.packg1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.batik.css.engine.value.Value;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo1 {
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
    	
    	String s1 = driver.findElement(By.xpath("(//div[@class='_4rR01T'])[1]")).getText();
    	System.out.println(s1);
    	Thread.sleep(3000);
    	String s2 = driver.findElement(By.xpath("(//div[@class='_4rR01T'])[2]")).getText();
    	System.out.println(s2);
    	Thread.sleep(3000);
    	String s3 = driver.findElement(By.xpath("(//div[@class='_4rR01T'])[3]")).getText();
    	System.out.println(s3);
    	Thread.sleep(3000);
    	String s4 = driver.findElement(By.xpath("(//div[@class='_4rR01T'])[4]")).getText();
    	System.out.println(s4);
    	Thread.sleep(3000);
    	String s5 = driver.findElement(By.xpath("(//div[@class='_4rR01T'])[5]")).getText();
    	System.out.println(s5);
    	String s6 = driver.findElement(By.xpath("(//div[@class='_4rR01T'])[6]")).getText();
    	System.out.println(s6);
    	String s7 = driver.findElement(By.xpath("(//div[@class='_4rR01T'])[7]")).getText();
    	System.out.println(s7);
    	String s8 = driver.findElement(By.xpath("(//div[@class='_4rR01T'])[8]")).getText();
    	System.out.println(s8);
    	String s9 = driver.findElement(By.xpath("(//div[@class='_4rR01T'])[9]")).getText();
    	System.out.println(s9);
    	String s10 = driver.findElement(By.xpath("(//div[@class='_4rR01T'])[10]")).getText();
    	System.out.println(s10);
    	String s11 = driver.findElement(By.xpath("(//div[@class='_4rR01T'])[11]")).getText();
    	System.out.println(s11);
    	String s12 = driver.findElement(By.xpath("(//div[@class='_4rR01T'])[12]")).getText();
    	System.out.println(s12);
    	String s13 = driver.findElement(By.xpath("(//div[@class='_4rR01T'])[13]")).getText();
    	System.out.println(s13);
    	String s14 = driver.findElement(By.xpath("(//div[@class='_4rR01T'])[14]")).getText();
    	System.out.println(s14);
    	String s15 = driver.findElement(By.xpath("(//div[@class='_4rR01T'])[15]")).getText();
    	System.out.println(s15);
    	String s16 = driver.findElement(By.xpath("(//div[@class='_4rR01T'])[16]")).getText();
    	System.out.println(s16);
    	String s17 = driver.findElement(By.xpath("(//div[@class='_4rR01T'])[17]")).getText();
    	System.out.println(s17);
    	String s18 = driver.findElement(By.xpath("(//div[@class='_4rR01T'])[18]")).getText();
    	System.out.println(s18);
    	String s19 = driver.findElement(By.xpath("(//div[@class='_4rR01T'])[19]")).getText();
    	System.out.println(s19);
    	String s20 = driver.findElement(By.xpath("(//div[@class='_4rR01T'])[20]")).getText();
    	System.out.println(s20);
    	String s21 = driver.findElement(By.xpath("(//div[@class='_4rR01T'])[21]")).getText();
    	System.out.println(s21);
    	String s22 = driver.findElement(By.xpath("(//div[@class='_4rR01T'])[22]")).getText();
    	System.out.println(s22);
    	String s23 = driver.findElement(By.xpath("(//div[@class='_4rR01T'])[23]")).getText();
    	System.out.println(s23);
    	String s24 = driver.findElement(By.xpath("(//div[@class='_4rR01T'])[24]")).getText();
    	System.out.println(s24);
    	File f=new File ("D:\\programs\\seleniumsession\\driver1\\Book2.xlsx");
		Workbook w= new XSSFWorkbook();
		Sheet z= w.createSheet("write");
		String y[] ={s1,s2,s3,s4,s5,s6,s7,s8,s9,s10,s11,s12,s13,s14,s15,s16,s17,s18,s19,s20,s21,s22,s23,s24};
		for(int i=0; i<y.length;i++){
			Row r=z.createRow(i);
			Cell c=r.createCell(0);
			c.setCellValue(y[i]);
		}
		FileOutputStream f1= new FileOutputStream(f);
		w.write(f1);
    	Thread.sleep(5000);
    	
    	driver.findElement(By.xpath("(//div[@class='_4rR01T'])[3]")).click();
    	String parent=driver.getWindowHandle();
    	Set<String> child=driver.getWindowHandles();
    	List <String> list= new ArrayList<String>(child);
    	for (String x2 : child){
    		if(!parent.equals(child)){
    			driver.switchTo().window(x2);
    		}
    	}
		String s25 = driver.findElement(By.xpath("//span[@class='B_NuCI']")).getText();
		System.out.println("website value"+s25);
		Thread.sleep(4000);
		FileInputStream f2= new FileInputStream(f);
		XSSFWorkbook w2 = new XSSFWorkbook(f2);
		XSSFSheet  sh =w2.getSheet("write");
		XSSFCell rc= sh.getRow(2).getCell(0);
		String st= rc.getStringCellValue();
		System.out.println("In excel 3th  name"+st);
		if(st.equals(s25)){
			rc.setCellValue("both r equal");
		}
		else{
				System.out.println("not equal");
			}
		
		w2.close();
	
			
		
		}
    
		
		
		
		
		

    

	public static void main(String[] args) throws InterruptedException, IOException {
			Demo1 l = new Demo1();
			l.launch();
			l.maximize();
			l.url("https://www.flipkart.com");
			l.close();
			l.passvalues();
			//l.script();
	}
}