package com.chathan.famstack.manager.profile;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.chathan.famstack.dataaccess.entity.UserEntity;
import com.chathan.famstack.dataaccess.entity.manager.FamStackEntityManager;
import com.chathan.famstack.rest.services.BaseFamStackServices;
import com.chathan.xsd.profileservices.ObjectFactory;
import com.chathan.xsd.profileservices.UserProfile;

public class UserProfileManager extends BaseFamStackServices {
	
	@Autowired
	ObjectFactory objectFactory;
	
	@Autowired
	FamStackEntityManager<UserEntity> famStackEntityManager;
	
	public String registerUser() {
		return "user registered";
	}

	public String login() {
		return "logged in";
	}

	public UserProfile getUserDetails() {
		
		logDebug("Executing user profilermanager");
		List<UserEntity> userEntity = famStackEntityManager.getAllUsers(UserEntity.class);
		UserProfile userProfile = objectFactory.createUserProfile();
		userProfile.setFirstName(userEntity.get(0).getFirstName());
		userProfile.setLastName(userEntity.get(0).getLastName());
		return userProfile;
	}

}
