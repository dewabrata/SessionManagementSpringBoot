package com.juaracoding.session.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.juaracoding.session.entity.UserModel;

@Controller
public class IndexController {
	
	@GetMapping("/")
	public String indexPage(Model model) {
		return "index2.html";
	}
	
	@GetMapping("/login")
	public String loginPage(Model model) {
		model.addAttribute("user", new UserModel());
		return "login.html";
	}
	
	@PostMapping("/register")
	public String register(UserModel user) {
		
		System.out.println(user.toString());
		
		return "redirect:/";
		
	}

}
