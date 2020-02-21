package com.peaasInter.viram.mywebApp;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController   
{ 
	@RequestMapping("/home")
	public ModelAndView display(String name)
	{
		
		ModelAndView mv=new ModelAndView();
		mv.addObject("name",name);
		mv.setViewName("home");
		return mv;
//		System.out.println("hello " +name);
//		session.setAttribute("name", name );
//		//System.out.println("spring boot homeController display method has been called");
//		return "home";
	}

}
