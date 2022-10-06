package com.mvc.beans;

import java.net.http.HttpRequest;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@org.springframework.stereotype.Controller
public class Controller {
	
	
	@RequestMapping("/hello")
	public @ResponseBody String hello() {
		return "hi Dileep";
	}

	@RequestMapping("/")
	public String showmypage() {
		return "main-menu";
	}

	@RequestMapping("/formdata")
	public String formdata(HttpServletRequest req, Model m) {
		String fn = req.getParameter("firstname");
		String ln = req.getParameter("secondname");
		String fullname = fn + ln;
		m.addAttribute("full", fullname);
		return "formview";
	}

	@RequestMapping("/formdata1")
	public String form(@RequestParam("firstname") String fn, @RequestParam("secondname") String ln, Model m) {

		String fullname = fn + ln;
		m.addAttribute("full", fullname);
		return "formview";
	}
}
