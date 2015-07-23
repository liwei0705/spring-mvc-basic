package org.jiagoushi.spring_mvc_basic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorldController {

	@RequestMapping("/")
	public String index(Model model) {
		return "index";//返回helloworld.jsp的文件名
	}
	
	@RequestMapping("/hello")
	public String hello(@RequestParam(value = "name", required = false, defaultValue = "World") String name, Model model) {
		model.addAttribute("name", name);
		return "helloworld";//返回helloworld.jsp的文件名
	}

}