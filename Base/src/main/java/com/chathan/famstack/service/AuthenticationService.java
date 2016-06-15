package com.chathan.famstack.service;

import java.util.StringTokenizer;

public class AuthenticationService {
	public boolean authenticate(String authCredentials) {
		if (null == authCredentials)
			return false;
		// header value format will be "Basic encodedstring" for Basic
		// authentication. Example "Basic YWRtaW46YWRtaW4="
		final String encodedUserPassword = authCredentials.replaceFirst("Basic"
				+ " ", "");
		String usernameAndPassword = null;
		/*byte[] decodedBytes = Base64.getDecoder().decode(
				encodedUserPassword);*/
		usernameAndPassword = new String("pass");
		final StringTokenizer tokenizer = new StringTokenizer(
				usernameAndPassword, ":");
		final String username = tokenizer.nextToken();
		final String password = tokenizer.nextToken();

		boolean authenticationStatus = "admin".equals(username)
				&& "admin".equals(password);
		return authenticationStatus;
	}
}