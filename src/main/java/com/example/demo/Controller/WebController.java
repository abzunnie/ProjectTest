package com.example.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {
	
	@GetMapping("/test")
	public String getFile(Model model)
	{
		model.addAttribute("username","Admin");
		model.addAttribute("email","test@test.com");
		return "Test";
	}

}
