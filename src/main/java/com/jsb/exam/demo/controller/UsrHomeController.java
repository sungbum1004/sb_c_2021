package com.jsb.exam.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

// @RequestMapping/@ResponseBody 메서드들을 품고 있으려면 붙여야함
@Controller
public class UsrHomeController {
	private int count;

	public UsrHomeController() {
		count = -1;
	}

	// 받은편지 (usr/home/main의 요청이 들어옴)
	@RequestMapping("/usr/home/main")
	// 보낼편지
	@ResponseBody
	public String showMain() {
		return "안녕하세요.";
	}

	@RequestMapping("/usr/home/main2")
	@ResponseBody
	public String showMain2() {
		return "반갑습니다.";
	}

	@RequestMapping("/usr/home/main3")
	@ResponseBody
	public String showMain3() {
		return "또만나요";
	}

	@RequestMapping("/usr/home/main4")
	@ResponseBody
	public int showMain4() {
		count++;
		return count;
	}
	
	@RequestMapping("/usr/home/main5")
	@ResponseBody
	public String showMain5() {
		count = 0;
		return "count이 값이 0으로 초기화 되었습니다.";
	}
}
