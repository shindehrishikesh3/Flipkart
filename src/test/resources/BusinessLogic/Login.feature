Feature: Login Functionality

Background: User is successfully logged in
Given user open "Chrome" browser with exe "E:\\Automation Support\\chromedriver.exe"
Given user open url as "https://www.flipkart.com/"

Scenario: Login Functionality with valid credentials
When user click on cancel button
When user move on login dropdown
When user click on my profile
When user enter "8793443479" as username
When user enter "abcd@1234" as password
When user click on login button
Then Application shows the user profile to user