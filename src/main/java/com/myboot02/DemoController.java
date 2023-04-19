package com.myboot02;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DemoController {

	@ResponseBody
	@RequestMapping("/")
	public String home() {
		System.out.println("nice");
		return "hi";
	}

	@RequestMapping("/hello.do")
	public String hello(Model model) {

		return "hello";
		 
	}
	
	@RequestMapping("/zzz.do")
	public String zzz(Model model) {
	    model.addAttribute("zzzz", "고양이");
	    return "hello";
	}
	

	@RequestMapping("/hello3.do")
	public String hello3() {
		return "hello2";
		
	}

	@RequestMapping("/hi.do")
	public String hi(Model model) {
	    model.addAttribute("message", "hi.jsp입니다");
	    return "hi";
	}

}
