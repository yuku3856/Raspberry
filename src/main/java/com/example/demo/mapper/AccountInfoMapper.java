package com.example.demo.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.example.demo.domain.AccountInfo;
@Mapper
public interface AccountInfoMapper {
	//nameでアカウント検索
	AccountInfo selectByName(@Param("accountName")String accountName);
	//アカウント登録
	//void add(AccountInfo admin);
	//アカウント削除
	//void delete(AccountInfo member);
	//アカウント編集
	//void edit(AccountInfo member);
	
}
