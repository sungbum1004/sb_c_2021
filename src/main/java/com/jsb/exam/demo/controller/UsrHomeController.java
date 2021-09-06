package com.jsb.exam.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

// @RequestMapping/@ResponseBody 메서드들을 품고 있으려면 붙여야함
@Controller
public class UsrHomeController {
	// 받은편지 (usr/home/main의 요청이 들어옴)
	@RequestMapping("/usr/home/main")
	// 보낼편지 
	@ResponseBody
	public String showMain() {
		return "안녕하세요.";
	}
}
