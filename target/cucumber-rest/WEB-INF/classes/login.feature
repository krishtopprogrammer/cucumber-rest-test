Ability: Login verification
   
  Scenario: Positive scenario with correct username and password
    Given The correct username and password 
    	When username as "xyz.abc" and password as "pqrs1234"
    	Then the response  is "{"Status":"Correct Username and Password"}"
    	
  Scenario: Invalid password
    Given The correct username and invalid password 
    	When username as "xyz.abc" and password as "pqrs1234"
    	Then the response  is "{"Status":"Correct Username and Incorrect Password"}"    	