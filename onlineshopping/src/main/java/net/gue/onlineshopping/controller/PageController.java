package net.gue.onlineshopping.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;




@Controller
public class PageController {

	
	
	@RequestMapping(value= {"/", "/home", "/index"})
	public ModelAndView index() {
		
		ModelAndView mv=new ModelAndView("page");
		mv.addObject("title","home");
		mv.addObject("userClickHome",true);
		return mv ;	
	}			
	@RequestMapping(value= {"/About"})
	public ModelAndView About() {
		
		ModelAndView mv=new ModelAndView("page");
		mv.addObject("title","About");
		mv.addObject("userClickAbout",true);
		return mv ;	
	}	
	
	@RequestMapping(value= {"/Contact"})
	public ModelAndView Contact() {
		
		ModelAndView mv=new ModelAndView("page");
		mv.addObject("title","Contacts Us");
		mv.addObject("userClickContact",true);
		return mv ;	
	}	
	
	@RequestMapping(value= {"/Product"})
	public ModelAndView Product() {
		
		ModelAndView mv=new ModelAndView("page");
		mv.addObject("title","Product");
		mv.addObject("userClickProduct",true);
		return mv ;	
	}	
	
	
	
	
	
	@RequestMapping(value= "/test")
	public ModelAndView test(@RequestParam(value="greeting", required=false)String greeting) {
		if (greeting==null) {
			greeting="hello there ! ";
			
			
			
		}
		ModelAndView mv=new ModelAndView("page");
		mv.addObject("greeting",greeting);
		return mv ;
		
	}
	
	
}
