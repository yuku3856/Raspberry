package com.example.demo.login;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
	
	@GetMapping("/accountlist")
	public String accountList() {
		return "account/accountlist";
	}
}
