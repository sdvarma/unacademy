
Feature: for loging in Unacedemy website
user wants  to login using login phone and otp
	Background: User is on unacedemy website
		Given User opens google chrome
		And User enters URL
		Then User is on Unacedemy website
		
	Scenario Outline: Successful login
		Given User is on Unacedemy website
		And User should click login button
		And User is redircted to Login page
		And user enters "<phoneno>"
		Then user should see login button
		
		Examples:
		|phoneno|
		|9035552006|
		|9738325512|
		