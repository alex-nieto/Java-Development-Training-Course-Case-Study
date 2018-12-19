package springwork.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@RequestMapping("/")
	public ModelAndView welcome() {
		ModelAndView mav = new ModelAndView("index");
		return mav;
	}
	
	@RequestMapping("/first")
	public ModelAndView firstPage() {
		ModelAndView mav = new ModelAndView("first");
		return mav;
	}
	
	@RequestMapping("/sec")
	public ModelAndView secPage() {
		ModelAndView mav = new ModelAndView("sec");
		return mav;
	}
	
	@RequestMapping("/third")
	public ModelAndView thidPage() {
		ModelAndView mav = new ModelAndView("third");
		return mav;
	}
	
}
