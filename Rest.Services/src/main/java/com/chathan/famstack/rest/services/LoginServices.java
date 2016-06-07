package com.chathan.famstack.rest.services;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.chathan.famstack.manager.profile.UserProfileManager;
import com.chathan.xsd.profileservices.UserProfile;

@Component
@Path("/user")
public class LoginServices {

	@Autowired
	UserProfileManager userProfileManager;

	@POST
	@Path("/register")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response registerUser(UserProfile userProfile) {

		String result = userProfileManager.registerUser();

		return Response.status(200).entity(result).build();

	}
	
	@POST
	@Path("/login")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response loginUser(UserProfile userProfile) {

		String result = userProfileManager.login();

		return Response.status(200).entity(result).build();

	}
	
	@GET
	@Path("/getuser")
	@Produces(MediaType.APPLICATION_JSON)
	public UserProfile getUserDetails() {
		return userProfileManager.getUserDetails();
	}

}
