package com.example.demo.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.domain.AccountInfo;
import com.example.demo.domain.AccountSearchInfo;

@Controller
public class AccountListController {
	@ModelAttribute
	private AccountSearchInfo init() {
		return new AccountSearchInfo();
	}
	
	@ModelAttribute
	private ArrayList<AccountInfo> init2() {
		return new ArrayList<AccountInfo>();
	}
	
	@GetMapping("/accountlist")
	public String accountSearchInfoList(AccountSearchInfo account, ArrayList<AccountInfo> accountInfoList, Model model) {
		account.setAge("12");
		ArrayList<String> sex = new ArrayList<>();
		sex.add("男");
		sex.add("女");
		sex.add("設定しない");
		account.setSex(sex);
		ArrayList<String> language = new ArrayList<>();
		language.add("日本語");
		language.add("英語");
		language.add("中国語");
		account.setLanguage(language);
		ArrayList<String> employmentType = new ArrayList<>();
		employmentType.add("役員");
		employmentType.add("正社員");
		employmentType.add("アルバイト");
		account.setEmploymentType(employmentType);
		
		for (int i = 0; i < 3; i++) {
			AccountInfo accountInfo = new AccountInfo();
			accountInfo.setId(i);
			accountInfo.setAccountName("yukumoto" + i);
			accountInfo.setCompany("BITZ");
			accountInfoList.add(accountInfo);
		}
		
		return "account/accountlist";
	}
	
	@PostMapping("/accountlist/search")
	public String accountSearch(Model model, @RequestParam("age") String age, @RequestParam("sex") String sex,
			@RequestParam("language") String language,@RequestParam("employmentType") String employmentType) {
		
		
		return "a";
	}
}