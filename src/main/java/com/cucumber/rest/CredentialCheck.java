package com.cucumber.rest;

import java.util.HashMap;
import java.util.Map;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.stereotype.Controller;

@Controller
@Path("/login")
public class CredentialCheck {

	@GET
	@Path("/hello")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response hello() throws JSONException {
		return Response.status(200).entity("Hello World!!!").build();
	}

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public JSONObject checkLogin(JSONObject inputJsonObj) throws JSONException {
		String username = (String) inputJsonObj.get("username");
		String password = (String) inputJsonObj.get("password");
		String status = null;
		if (username.equals("xyz.abc") && password.equals("pqrs1234")) {
			status = "Correct Username and Password";
		} else if ((username.equals("xyz.abc")) && (!password.equals("pqrs1234"))) {
			status = "Correct Username and Incorrect Password";
		} else if ((!username.equals("xyz.abc")) && (password.equals("pqrs1234"))) {
			status = "Incorrect Username and Correct Password";
		} else {
			status = "Incorrect Username and Password";
		}
		JSONObject outputJsonObj = new JSONObject();
		outputJsonObj.put("Status", status);
		return outputJsonObj;
	}

	@POST
	@Path("/validate")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Map<String, String> checkLoginUsingMap(Map<String, String> inputJsonObj) throws JSONException {
		String username = (String) inputJsonObj.get("username");
		String password = (String) inputJsonObj.get("password");
		String status = null;
		if (username.equals("xyz.abc") && password.equals("pqrs1234")) {
			status = "Correct Username and Password";
		} else if ((username.equals("xyz.abc")) && (!password.equals("pqrs1234"))) {
			status = "Correct Username and Incorrect Password";
		} else if ((!username.equals("xyz.abc")) && (password.equals("pqrs1234"))) {
			status = "Incorrect Username and Correct Password";
		} else {
			status = "Incorrect Username and Password";
		}
		Map<String, String> outputJsonObj = new HashMap<String, String>();
		outputJsonObj.put("Status", status);
		return outputJsonObj;
	}
}