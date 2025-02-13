package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AccountListController {
	
	@GetMapping("/accountlist")
	public String accountList(Model model) {
		
		return "account/accountlist";
	}
}
