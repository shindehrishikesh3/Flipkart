package cucumbermap;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utility.SeleniumOperations;

public class Login {

	@Given("^user open \"([^\"]*)\" browser with exe \"([^\"]*)\"$")
	public void user_open_browser_with_exe(String arg1, String arg2) throws Throwable 
	{
		Object[] input=new Object[2];
        input[0]=arg1;
        input[1]=arg2;
        SeleniumOperations.BrowserLaunch(input);
	}

	@Given("^user open url as \"([^\"]*)\"$")
	public void user_open_url_as(String arg1) throws Throwable 
	{
		 Object[] input1=new Object[1];
         input1[0]=arg1;
         SeleniumOperations.OpenApplication(input1);
	}

	@When("^user click on cancel button$")
	public void user_click_on_cancel_button() throws Throwable 
	{
		  Object[] input2=new Object[1];
          input2[0]="//*[@class='_2KpZ6l _2doB4z']";
          SeleniumOperations.ClickOnElement(input2);
	}

	@When("^user move on login dropdown$")
	public void user_move_on_login_dropdown() throws Throwable 
	{
		 Object[] input3=new Object[1];
         input3[0]="//*[@class='_1_3w1N']";
         SeleniumOperations.MoveOnElement(input3);
	}

	@When("^user click on my profile$")
	public void user_click_on_my_profile() throws Throwable 
	{
		 Object[] input4=new Object[1];
         input4[0]="(//*[@class='_3vhnxf'])[1]";
         SeleniumOperations.ClickOnElement(input4);
	}

	@When("^user enter \"([^\"]*)\" as username$")
	public void user_enter_as_username(String arg1) throws Throwable 
	{
		Object[] input5=new Object[2];
        input5[0]="(//*[@type='text'])[2]";
        input5[1]=arg1;
        SeleniumOperations.SendKeys(input5);
	}

	@When("^user enter \"([^\"]*)\" as password$")
	public void user_enter_as_password(String arg1) throws Throwable 
	{
		 Object[] input6=new Object[2];
         input6[0]="//*[@type='password']";
         input6[1]=arg1;
         SeleniumOperations.SendKeys(input6);
	}

	@When("^user click on login button$")
	public void user_click_on_login_button() throws Throwable 
	{
		Object[] input7=new Object[1];
        input7[0]="//*[@class='_2KpZ6l _2HKlqd _3AWRsL']";
        SeleniumOperations.ClickOnElement(input7);	
	}

	@Then("^Application shows the user profile to user$")
	public void application_shows_the_user_profile_to_user() throws Throwable 
	{
	  
	}
	
	
	

}
