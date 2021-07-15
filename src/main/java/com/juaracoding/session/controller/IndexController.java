package com.juaracoding.session.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.juaracoding.session.entity.UserModel;
import com.juaracoding.session.repository.UserRepository;

@Controller
public class IndexController {
	
	@Autowired
	UserRepository userRepo;
	
	@GetMapping("/")
	public String indexPage(Model model) {
		return "index2.html";
	}
	
	@GetMapping("/login")
	public String loginPage(Model model) {
		model.addAttribute("user", new UserModel());
		return "login.html";
	}
	
	
	@GetMapping("/userprofile")
	public String userProfilePage(Model model) {
		
		return "user-profile.html";
	}
	
	
	@GetMapping("/widgets")
	public String widgetPage(Model model) {
		
		return "widgets.html";
	}
	
	@PostMapping("/register")
	public String register(UserModel user) {
		BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
		String encodePassword = passwordEncoder.encode(user.getPassword());
		user.setPassword(encodePassword);
		System.out.println(user.toString());
		userRepo.save(user);
		return "redirect:/";
		
	}

}
