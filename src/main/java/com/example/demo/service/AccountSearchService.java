package com.example.demo.service;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

import com.example.demo.domain.AccountInfo;
import com.example.demo.domain.AccountSearchInfo;

public class AccountSearchService {
	
	public AccountSearchInfo initView() {
		AccountSearchInfo account = new AccountSearchInfo();
		account.setAge("12");
		Map<Integer, String> sex = new LinkedHashMap<>();
		sex.put(1, "男性");
		sex.put(2, "女性");
		sex.put(3, "設定しない");
		account.setSex(sex);
		Map<Integer, String> language = new LinkedHashMap<>();
		language.put(1, "日本語");
		language.put(2, "英語");
		language.put(3, "中国語");
		account.setLanguage(language);
		Map<Integer, String> employmentType = new LinkedHashMap<>();
		employmentType.put(1, "役員");
		employmentType.put(2, "正社員");
		employmentType.put(3, "アルバイト");
		account.setEmploymentType(employmentType);
		return account;
	}

	public ArrayList<AccountInfo> search(AccountSearchInfo accountSearchInfo) {
		ArrayList<AccountInfo> accountInfoList = new ArrayList<>();
		for (int i = 0; i < 3; i++) {
			AccountInfo accountInfo = new AccountInfo();
			accountInfo.setId(i);
			accountInfo.setAccountName("yukumoto" + i);
			accountInfo.setCompany("BITZ");
			accountInfoList.add(accountInfo);
		}
		return accountInfoList;
	}

}
