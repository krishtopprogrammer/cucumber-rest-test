package com.cucumber;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.client.RestTemplate;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps {

	private RestTemplate restTemplate;
	private String correctUsernameAndPasswordJson;
	private String correctUsernameAndInvalidPasswordJson;
	private String incorrectUsernameAndPasswordJson;
	private String incorrectUsernameAndInvalidPasswordJson;
	private String serviceUrl;

	@Before
	public void setUp() {
		restTemplate = new RestTemplate();

		correctUsernameAndPasswordJson = "{ \"username\":\"xyz.abc\", \"password\":\"pqrs1234\" }";

		correctUsernameAndInvalidPasswordJson = "{ \"username\":\"xyz.abc\", \"password\":\"12nv\" }";

		incorrectUsernameAndPasswordJson = "{ \"username\":\"abc\", \"password\":\"pqrs1234\" }";

		incorrectUsernameAndInvalidPasswordJson = "{ \"username\":\"abc\", \"password\":\"12nv\" }";

		serviceUrl = "http://localhost:8080/cucumber-rest-test/rest/login/validate";
	}

	@Given("^The correct username and password$")
	public void the_login_username_and_password() throws Throwable {

		assertNotNull(restTemplate);
		assertNotNull(correctUsernameAndPasswordJson);

		assertNotNull(serviceUrl);

	}

	@When("^username as \"([^\"]*)\" and password as \"([^\"]*)\"$")
	public void username_as_and_password_as(String arg1, String arg2) throws Throwable {

		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		HttpEntity<String> entity = new HttpEntity<String>(correctUsernameAndPasswordJson, headers);
		String answer = restTemplate.postForObject(serviceUrl, entity, String.class);

		assertNotNull(answer);
		assertEquals("{\"Status\":\"Correct Username and Password\"}", answer);
	}

	@Then("^the response  is \"([^\"]*)\"$")
	public void the_response_is(String response) throws Throwable {

		assertNotNull(response);
		assertTrue(response.contains("Correct Username and Password"));

	}

	@Given("^The correct username and invalid password$")
	public void the_correct_username_and_invalid_password() throws Throwable {
		assertNotNull(restTemplate);
		assertNotNull(correctUsernameAndInvalidPasswordJson);

		assertNotNull(serviceUrl);
	}

	@When("^username as \"([^\"]*)\" and invalid password as \"([^\"]*)\"$")
	public void username_as_and_invalid_password_as(String arg1, String arg2) throws Throwable {
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		HttpEntity<String> entity = new HttpEntity<String>(correctUsernameAndInvalidPasswordJson, headers);
		String answer = restTemplate.postForObject(serviceUrl, entity, String.class);

		assertNotNull(answer);
		assertEquals("{\"Status\":\"Correct Username and Incorrect Password\"}", answer);
	}

	@Then("^the response  is \"([^\"]*)\" Username and \"([^\"]*)\" Password$")
	public void the_response_is_Username_and_Password(String userNameResponse, String passwordResponse)
			throws Throwable {

		assertNotNull(userNameResponse);
		assertNotNull(userNameResponse);
		assertEquals("Correct", userNameResponse);
		assertEquals("Incorrect", passwordResponse);

	}

	@Given("^The incorrect username and valid password$")
	public void the_incorrect_username_and_valid_password() throws Throwable {
		assertNotNull(incorrectUsernameAndPasswordJson);
	}

	@When("^invalid username as \"([^\"]*)\" and valid password as \"([^\"]*)\"$")
	public void invalid_username_as_and_valid_password_as(String arg1, String arg2) throws Throwable {
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		HttpEntity<String> entity = new HttpEntity<String>(incorrectUsernameAndPasswordJson, headers);
		String answer = restTemplate.postForObject(serviceUrl, entity, String.class);

		assertNotNull(answer);
		assertEquals("{\"Status\":\"Incorrect Username and Correct Password\"}", answer);

	}

	@Then("^the response is username is invalid \"([^\"]*)\"$")
	public void the_response_is_username_is_invalid(String response) throws Throwable {

		assertNotNull(response);
		assertEquals("Invalid username", response);
	}

	@Given("^The incorrect username and invalid password$")
	public void the_incorrect_username_and_invalid_password() throws Throwable {
		assertNotNull(incorrectUsernameAndInvalidPasswordJson);
	}

	@When("^invalid username as \"([^\"]*)\" and invalid password as \"([^\"]*)\"$")
	public void invalid_username_as_and_invalid_password_as(String arg1, String arg2) throws Throwable {
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		HttpEntity<String> entity = new HttpEntity<String>(incorrectUsernameAndInvalidPasswordJson, headers);
		String answer = restTemplate.postForObject(serviceUrl, entity, String.class);

		assertNotNull(answer);
		assertEquals("{\"Status\":\"Incorrect Username and Password\"}", answer);

	}

	@Then("^the response is both username and password is invalid \"([^\"]*)\"$")
	public void the_response_is_both_username_and_password_is_invalid(String response) throws Throwable {
		assertNotNull(response);
		assertEquals("Invalid username and password", response);
	}

}
