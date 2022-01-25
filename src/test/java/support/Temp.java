package support;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Temp {
	public static WebDriver driver=null;

//Browser Launch
public static void BrowserLaunch(Object[]inputparameters)
{
	String browsername= (String) inputparameters[0];
	String path= (String) inputparameters[1];
	
	if(browsername.equalsIgnoreCase("Chrome"))
	{
		System.setProperty("webdriver.chrome.driver", path);
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}	
	else if(browsername.equalsIgnoreCase("MSEdge"))
	{
	   System.setProperty("webdriver.edge.driver", path);
	   driver=new EdgeDriver();
	   driver.manage().window().maximize();
	}
}

//Open Application
public static void OpenApplication(Object[]inputparameters)
{
	String url=(String) inputparameters[0];
	driver.get(url);
}

//Click On Element
public static void ClickOnElement(Object[]inputparameters) 
{
    String clickk=(String) inputparameters[0];
    driver.findElement(By.xpath(clickk)).click();
}

//Move on Element
public static void MoveOnElement(Object[]inputparameters)
{
    Actions act=new Actions(driver);
     String move1=(String) inputparameters[0];
     WebElement moveon=driver.findElement(By.xpath(move1));
     act.moveToElement(moveon).build().perform();
}

//Send Keys
public static void SendKeys(Object[]inputparameters)
{
	String sendkeyy=(String) inputparameters[0];
	String sendkeyy1=(String) inputparameters[1];
	WebElement sk=driver.findElement(By.xpath(sendkeyy));
	sk.sendKeys(sendkeyy1);

}





	
public static void main(String[] args) {
	
//Browser Launch
          Object[] input=new Object[2];
		           input[0]="Chrome";
	               input[1]="E:\\Automation Support\\chromedriver.exe";
	               BrowserLaunch(input);
        
//Open Application
	      Object[] input1=new Object[1];
	               input1[0]="https://www.flipkart.com/";
	               OpenApplication(input1);
	               
//Click on Cancel
	      Object[] input2=new Object[1];
	               input2[0]="//*[@class='_2KpZ6l _2doB4z']";
	               ClickOnElement(input2);
	               
//Move to Login (Move on element)
	      Object[] input3=new Object[1];
	               input3[0]="//*[@class='_1_3w1N']";
	               MoveOnElement(input3);
	               
//Click on My Profile
	      Object[] input4=new Object[1];
	               input4[0]="(//*[@class='_3vhnxf'])[1]";
	               ClickOnElement(input4);
	               
//Enter id (Send Keys)	            
	      Object[] input5=new Object[2];
		           input5[0]="(//*[@type='text'])[2]";
	               input5[1]="8793443479";
	               SendKeys(input5);
	               
//Enter Password (Send Keys)	            
	      Object[] input6=new Object[2];
		           input6[0]="//*[@type='password']";
	               input6[1]="abcd@1234";
	               SendKeys(input6);
	               
//Click on Login 	
	      Object[] input7=new Object[1];
	               input7[0]="//*[@class='_2KpZ6l _2HKlqd _3AWRsL']";
	               ClickOnElement(input7);	               
	               	                            	   	        
}

}
