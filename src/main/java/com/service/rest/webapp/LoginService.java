package com.service.rest.webapp;

import java.util.HashMap;

import org.apache.coyote.http2.Setting;
import org.springframework.stereotype.Component;

@Component
public class LoginService {
	
	
	
	public boolean validate(String username, String password){
		String passwordR= "1";
		String userR= "in28Minutes";
		if (username.equals(userR) && passwordR.equals(password)){
			return true;
		}
		return false;
	}

}
