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
	// 받은편지
	@RequestMapping("/usr/home/getCount")
	// 보낼편지
	@ResponseBody
	public int getCount() {
		return count;
	}
	
	@RequestMapping("/usr/home/doSetCount")
	@ResponseBody
	public String doSetCount(int count) {
		this.count = count;
		return "count의 값이 "+ this.count + "으로 초기화 되었습니다.";
	}
}
