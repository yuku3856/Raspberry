package com.example.demo.controller;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.domain.AccountRegisterInfo;
import com.example.demo.service.AccountRegisterService;

@Controller
public class AccountRegisterController {
	
	@ModelAttribute
	private AccountRegisterInfo init() {
		return new AccountRegisterInfo();
	}
	
	@GetMapping("/accountRegister")
	public String accountSearchInfoList(Model model) {
		
		
		return "account/accountRegister";
	}
	
	
	@ResponseBody
	@PostMapping(value = "/accountRegister/register", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public String accountRegister(AccountRegisterInfo accountregisterInfo) {
		AccountRegisterService accountRegisterService = new AccountRegisterService();
		accountRegisterService.register(accountregisterInfo);
		
		return "account/registerOK";
	}
}
