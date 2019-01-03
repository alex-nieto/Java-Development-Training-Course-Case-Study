package springwork.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@RequestMapping("/")
	public ModelAndView Home() {
		ModelAndView mav = new ModelAndView("index");
		return mav;
	}
	
	@RequestMapping("/review")
	public ModelAndView reviewPage() {
		ModelAndView mav = new ModelAndView("review");
		return mav;
	}
	
	@RequestMapping("/profile")
	public ModelAndView profilePage() {
		ModelAndView mav = new ModelAndView("profile");
		return mav;
	}
	
	@RequestMapping("/editProfile")
	public ModelAndView editProfilePage() {
		ModelAndView mav = new ModelAndView("editProfile");
		return mav;
	}
	
	@RequestMapping("/signup")
	public ModelAndView signupPage() {
		ModelAndView mav = new ModelAndView("signup");
		return mav;
	}
	
	@RequestMapping("/company")
	public ModelAndView companyPage() {
		ModelAndView mav = new ModelAndView("company");
		return mav;
	}
	
	@RequestMapping("/repSignup")
	public ModelAndView repSignupPage() {
		ModelAndView mav = new ModelAndView("repSignup");
		return mav;
	}
	
	@RequestMapping("/companies")
	public ModelAndView companiesPage() {
		ModelAndView mav = new ModelAndView("companies");
		return mav;
	}
	
	@RequestMapping("/contact")
	public ModelAndView contactPage() {
		ModelAndView mav = new ModelAndView("contact");
		return mav;
	}
	
	@RequestMapping("/about")
	public ModelAndView aboutPage() {
		ModelAndView mav = new ModelAndView("about");
		return mav;
	}
}
