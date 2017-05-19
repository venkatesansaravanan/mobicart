package com.niit.B2b.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.niit.modeldao.Userdao;
import com.niit.modeldto.User;

@Controller
public class UserController {
	@Autowired
	Userdao userdao;
   
	@RequestMapping("/signup")
	public String getLoginRegisterpage(Model model) {
		System.out.println("entered register");
		model.addAttribute("user", new User());
		return "signup";
	}

	@RequestMapping(value = "/signup/user", method = RequestMethod.POST)
	public String LoginRegisterUser(@ModelAttribute User user) {
		System.out.println("hello" + user.getCustomerName());
		userdao.addUser(user);
		return "signup";
	}
}

