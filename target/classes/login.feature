Ability: Login verification
   
  Scenario: Positive scenario with correct username and password
    Given The correct username and password 
    	When username as "xyz.abc" and password as "pqrs1234"
    	Then the response  is "Correct Username and Password"
    	
  Scenario: Invalid password
    Given The correct username and invalid password 
    	When username as "xyz.abc" and invalid password as "nv12"
    	Then the response  is "Correct" Username and "Incorrect" Password    	
    	
  Scenario: Invalid username
    Given The incorrect username and valid password 
    	When invalid username as "abc" and valid password as "pqrs1234"
    	Then the response is username is invalid "Invalid username"    	    	
    	
  Scenario: Invalid username and password
    Given The incorrect username and invalid password 
    	When invalid username as "abc" and invalid password as "nv12"
    	Then the response is both username and password is invalid "Invalid username and password"     	