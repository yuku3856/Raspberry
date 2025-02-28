package com.example.demo.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.domain.AccountInfo;
import com.example.demo.domain.AccountSearchInfo;
import com.example.demo.mapper.AccountInfoMapper;
import com.example.demo.service.AccountSearchService;

@Controller
public class AccountListController {
	@Autowired
	public AccountInfoMapper mapper;
	
	@ModelAttribute
	private AccountSearchInfo init() {
		return new AccountSearchInfo();
	}
	
	@GetMapping("/accountList")
	public String accountSearchInfoList(Model model) {
		AccountSearchService accountSearchService = new AccountSearchService();
		AccountSearchInfo account = new AccountSearchInfo();
		account = accountSearchService.initView();
		model.addAttribute("age", account.getAge());
		model.addAttribute("sex", account.getSex());
		model.addAttribute("language", account.getLanguage());
		model.addAttribute("employmentType", account.getEmploymentType());
		
		AccountInfo ab = mapper.selectByName("yuku");
		
		return "account/accountList";
	}
	
	@ResponseBody
	@PostMapping(value = "/accountList/search", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ArrayList<AccountInfo> accountSearch(AccountSearchInfo accountSearchInfo) {
		AccountSearchService accountSearchService = new AccountSearchService();
		ArrayList<AccountInfo> accountInfoList = accountSearchService.search(null);
		
		return accountInfoList;
	}
}