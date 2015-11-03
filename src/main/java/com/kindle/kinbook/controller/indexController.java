package com.kindle.kinbook.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/page")
public class indexController {
	@RequestMapping("/skip")	
	public String skip(HttpServletRequest request,Model model){
		String url = request.getParameter("file");
		return url;
	}
	@RequestMapping("/validate")
	public String operate(HttpServletRequest request,Model model){
		request.getSession().getAttribute("") ;
		String url = request.getParameter("file");
		return url;
	}
	
	@RequestMapping("/binding")
	public String push(HttpServletRequest request,Model model){
		request.getSession().getAttribute("") ;
		String url = request.getParameter("file");
		return url;
	}
	
}
