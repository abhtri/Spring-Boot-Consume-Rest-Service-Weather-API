package com.test;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@Controller
//@EnableAutoConfiguration
public class BasicController {

	@RequestMapping("/")
	public String Hello( Model model) {
	//	 ModelAndView model = new ModelAndView();
		model.addAttribute("name", "Abhishek");
			return "index";
	}
}
