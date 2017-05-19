package com.niit.B2b.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@SuppressWarnings("unused")
@Controller
public class HomeController {
	@RequestMapping("/")
	public String gotohome(){
		return "index";

}
	/*@RequestMapping("aboutus")
	public String aboutuspage(){
		return "aboutus";
	}
	@RequestMapping("accessories")
	public String accessoriespage(){
		return "accessories";
	}
	@RequestMapping("contactus")
	public String contactuspage(){
		return "contactus";
	}
	@RequestMapping("ecommerce")
	public String ecommercepage(){
		return "ecommerce";
	}
	@RequestMapping("footer")
	public String footerpage(){
		return "footer";
	}
	@RequestMapping("laptops")
	public String laptopspage(){
		return "laptops";
	}
	@RequestMapping("login")
	public String loginpage(){
		return "login";
	}
	@RequestMapping("navigation")
	public String navigationpage(){
		return "navigation";
	}
	@RequestMapping("photos")
	public String photospage(){
		return "photos";
	}
	@RequestMapping("signup")
	public String signuppage(){
		return "signup";
	}
	@RequestMapping("sony")
	public String sonypage(){
		return "sony";
	}
	
	
	*/
	
	

}


