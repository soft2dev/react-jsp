package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {

	@GetMapping("/")
	public ModelAndView getHomePage() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("index");
		return mv;
	}
}

