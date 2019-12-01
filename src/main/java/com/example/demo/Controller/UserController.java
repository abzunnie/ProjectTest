package com.example.demo.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.User;

@Controller
public class UserController {
	
	@RequestMapping("/users")
	public String users(Model model)
	{
		model.addAttribute("users",getUserList());
		return "User";
	}
	
	public List<User> getUserList(){
		
		List<User> userList = new ArrayList<User>();
		userList.add(new User(1,"Abhishek","abhishek@gmail.com"));
		userList.add(new User(2,"Abhimanyu","abhimanyuk@gmail.com"));
		return userList;
		
	}
}
