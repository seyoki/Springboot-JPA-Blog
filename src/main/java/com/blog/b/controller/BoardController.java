package com.blog.b.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class BoardController{
	@GetMapping({"","/"})
	public String index() {
		return "index";
	}
	public String saveForm() {
		return "";
	}
}