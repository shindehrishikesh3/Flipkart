package utility;

public class Trial {
public static void main(String[] args) {
		
	//Browser Launch
	          Object[] input=new Object[2];
			           input[0]="Chrome";
		               input[1]="E:\\2022\\Automation Support 1\\chromedriver.exe";
		               SeleniumOperations.BrowserLaunch(input);
	        
	//Open Application
		      Object[] input1=new Object[1];
		               input1[0]="https://www.flipkart.com/";
		               SeleniumOperations.OpenApplication(input1);
		               
	//Click on Cancel
		      Object[] input2=new Object[1];
		               input2[0]="//*[@class='_2KpZ6l _2doB4z']";
		               SeleniumOperations.ClickOnElement(input2);
		               
	//Move to Login (Move on element)
		      Object[] input3=new Object[1];
		               input3[0]="//*[@class='_1_3w1N']";
		               SeleniumOperations.MoveOnElement(input3);
		               
	//Click on My Profile
		      Object[] input4=new Object[1];
		               input4[0]="(//*[@class='_3vhnxf'])[1]";
		               SeleniumOperations.ClickOnElement(input4);
		               
	//Enter id (Send Keys)	            
		      Object[] input5=new Object[2];
			           input5[0]="(//*[@type='text'])[2]";
		               input5[1]="8793443479";
		               SeleniumOperations.SendKeys(input5);
		               
	//Enter Password (Send Keys)	            
		      Object[] input6=new Object[2];
			           input6[0]="//*[@type='password']";
		               input6[1]="abcd@1234";
		               SeleniumOperations.SendKeys(input6);
		               
	//Click on Login 	
		      Object[] input7=new Object[1];
		               input7[0]="//*[@class='_2KpZ6l _2HKlqd _3AWRsL']";
		               SeleniumOperations.ClickOnElement(input7);	               
		               	                            	   	        
	}

}
