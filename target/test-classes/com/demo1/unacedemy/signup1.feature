Feature:	signup functionality of unacademy
	i want to use this template for my feature file
	
	Scenario:	signup sucess
		Given user is on home page
		And user clicks join for free
		When user enters mobile number
		And user clicks on submit buttom
		And user enters email address
		And user needs to select the state from dropdown menu
		And user clicks on contiune buttom
		Then user is in home page

 Scenario: Login process
    Given User launch the chrome browser
    When User opens URL "https://unacademy.com/goal/jee-main-and-advanced-preparation/TMUVD"
    And User choose the login button
    And User enters the mobile number
    Then the page should be opened successfully

