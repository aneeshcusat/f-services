package com.chathan.famstack.rest.services;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.chathan.famstack.manager.profile.UserProfileManager;

@Component
@Path("/user")
public class LoginServices {

	@Autowired
	UserProfileManager userProfileManager;

	@POST
	@Path("/register")
	@Produces("text/html")
	public Response registerUser() {

		String result = userProfileManager.registerUser();

		return Response.status(200).entity(result).build();

	}
	
	@POST
	@Path("/login")
	@Produces("text/html")
	public Response loginUser() {

		String result = userProfileManager.login();

		return Response.status(200).entity(result).build();

	}
	
	@GET
	@Path("/getuser")
	@Produces("text/html")
	public Response getUserDetails() {

		String result = userProfileManager.getUserDetails();

		return Response.status(200).entity(result).build();

	}

}
