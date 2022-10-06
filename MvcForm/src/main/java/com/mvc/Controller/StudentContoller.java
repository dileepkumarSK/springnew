package com.mvc.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentContoller {

	public String showdetils()
	{
		return "students-deatils";
	}
}
