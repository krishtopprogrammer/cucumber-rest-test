# cucumber-rest-test
Cucumber test for a Login REST API

GET:-

http://localhost:8080/cucumber-rest-test/rest/login/hello


POST:-

http://localhost:8080/cucumber-rest-test/rest/login/validate

{
	"username" : "xyz.abc",
	"password" : "pqrs1234"
}

1) mvn test

There are four cucumber scenarias defined. Please refer login.feature file.
