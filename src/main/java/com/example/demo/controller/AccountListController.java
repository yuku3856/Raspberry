package com.example.demo.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.domain.AccountInfo;
import com.example.demo.domain.AccountSearchInfo;
import com.example.demo.service.AccountSearchService;

@Controller
public class AccountListController {
	
	@GetMapping("/accountlist")
	public String accountSearchInfoList(Model model) {
		AccountSearchService accountSearchService = new AccountSearchService();
		AccountSearchInfo account = new AccountSearchInfo();
		account = accountSearchService.initView();
		model.addAttribute("age", account.getAge());
		model.addAttribute("sex", account.getSex());
		model.addAttribute("language", account.getLanguage());
		model.addAttribute("employmentType", account.getEmploymentType());
		
		return "account/accountlist";
	}
	
	@ResponseBody
	@PostMapping("/accountlist/search")
	public ArrayList<AccountInfo> accountSearch(Model model, @RequestParam("age") String age, @RequestParam("sex") String sex,
			@RequestParam("language") String language,@RequestParam("employmentType") String employmentType) {
		AccountSearchService accountSearchService = new AccountSearchService();
		ArrayList<AccountInfo> accountInfoList = accountSearchService.search(null);
		
		return accountInfoList;
	}
}