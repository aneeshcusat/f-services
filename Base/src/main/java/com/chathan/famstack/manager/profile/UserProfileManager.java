package com.chathan.famstack.manager.profile;

import org.springframework.beans.factory.annotation.Autowired;

import com.chathan.famstack.rest.services.BaseFamStackServices;
import com.chathan.xsd.profileservices.ObjectFactory;
import com.chathan.xsd.profileservices.UserProfile;

public class UserProfileManager extends BaseFamStackServices {
	
	@Autowired
	ObjectFactory objectFactory;
	
	public String registerUser() {
		return "user registered";
	}

	public String login() {
		return "logged in";
	}

	public UserProfile getUserDetails() {
		
		logDebug("Executing user profilermanager");
		
		UserProfile userProfile = objectFactory.createUserProfile();
		userProfile.setFirstName("aneesh");
		userProfile.setLastName("sundareswaran");
		return userProfile;
	}

}
