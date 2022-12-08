package com.mvc.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MVCController {

	@RequestMapping("/")
	public String home() {
		return "index";
	}
	@RequestMapping("/hello")
	public @ResponseBody String hello() {
		return "hi Dileep";
	}
}
