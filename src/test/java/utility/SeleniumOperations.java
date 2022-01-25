package utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class SeleniumOperations {
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





		


}
