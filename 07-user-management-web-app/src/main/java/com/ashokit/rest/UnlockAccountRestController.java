package com.ashokit.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ashokit.domain.UnlockAccount;
import com.ashokit.service.UserService;

@RestController
public class UnlockAccountRestController {

	@Autowired
	private UserService service;

	@PostMapping("/unlock")
	public String unlockAccount(@RequestBody UnlockAccount unlockAcc) {
		String unlockAccount = service.unlockAccount(unlockAcc);
		return unlockAccount;
	}
}
