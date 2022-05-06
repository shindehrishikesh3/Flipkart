Feature: Login Functionality

Background: User is successfully logged in
Given user open "Chrome" browser with exe "E:\\Automation Support\\chromedriver.exe"
Given user open url as "https://www.amazon.in/"

Scenario: Login Functionality with valid credentials
Then Application shows the user profile to user


