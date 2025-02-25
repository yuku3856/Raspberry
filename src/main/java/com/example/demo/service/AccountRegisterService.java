package com.example.demo.service;

import com.example.demo.domain.AccountRegisterInfo;

public class AccountRegisterService {
	
	public AccountRegisterInfo initView() {
		AccountRegisterInfo account = new AccountRegisterInfo();
		
		//Column名から登録項目を持ってきて名前をaccountに格納
		
		return account;
	}

	public AccountRegisterInfo register(AccountRegisterInfo accountRegisterInfo) {
		//引数のアカウント情報をDBに登録
		
		return null;
	}

}
