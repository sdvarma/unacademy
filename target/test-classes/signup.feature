Feature:	signup functionality of unacademy
	i want to use this template for my feature file
	
	
	 Background: User is on unacedemy website
		 Given User opens google chrome
		 And User enters URL
		 Then User is on Unacedemy website
	 Scenario:	signup sucess
		 Given user is on home page
		 When user clicks join for free
		 And user enters mobile number
		 And user clicks on submit buttom
		 And user enters email address
		 And user needs to select the state from dropdown menu
		 And user clicks on contiune buttom
		 Then user is in home page
		
		
		
		Scenario:	signup fail with existing email
			Given user is on home page
			When user clicks join for free
			And user enters mobile number
			And user clicks on submit buttom
			And user enters email address
			And user needs to select the state from dropdown menu
			And user clicks on contiune buttom
			Then user should see an error message indicating the email is already registered 
		
		
		Scenario:	signup fail with existing mobile number
			Given user is on home page
			When user clicks join for free
			And user enters mobile number
			And user clicks on submit buttom
			And user enters email address
			And user needs to select the state from dropdown menu
			And user clicks on contiune buttom
			Then user should see an error message indicating the mobile no is already registered 
		
		
		
		Scenario:	signup fail with incorrect opt
			Given user is on home page
			When user clicks join for free
			And user enters mobile number
			And user clicks on submit buttom
			And user enters email address
			And user needs to select the state from dropdown menu
			And user clicks on contiune buttom
			Then user should see an error message indicating the opt is invaild 
			
		Scenario Outline: Successful login
			Given User is on Unacedemy website
			And User should click login button
			And User is redircted to Login page
			And user enters "<phoneno>"
			Then user should see login button
		
		Examples:
		|phoneno   |
		|9035552006|
		|9738325512|	
	
		
		