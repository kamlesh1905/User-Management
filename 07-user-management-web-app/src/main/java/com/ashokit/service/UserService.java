package com.ashokit.service;

import java.util.Map;

import com.ashokit.domain.UnlockAccount;
import com.ashokit.entity.UserAccountEntity;

public interface UserService {

	// This is for login-screen
	public String loginCheck(String email, String pwd);

	// Below methods are for registration screen
	public Map<Integer, String> getCountries();

	public Map<Integer, String> getStates(Integer countryId);

	public Map<Integer, String> getCities(Integer stateId);

	public UserAccountEntity getUserByEmail(String emailId);

	public Boolean saveUser(UserAccountEntity userAcc);

	// this method is for unlock account screen
	public String unlockAccount(UnlockAccount acc);

	// This method is for forgot password screen
	public Boolean forgotPassword(String emailId);
}
