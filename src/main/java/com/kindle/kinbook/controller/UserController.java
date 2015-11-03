package com.kindle.kinbook.controller;

import java.io.IOException;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.kindle.kinbook.bean.User;
import com.kindle.kinbook.service.IUserService;

@Controller
@RequestMapping("/user")
public class UserController {
	@Resource
	private IUserService userService;
	
	@RequestMapping("/showUser")
	public @ResponseBody User test(HttpServletRequest request,HttpServletResponse response,Model model){
		int uid = Integer.parseInt(request.getParameter("id"));
		User user = this.userService.queryUserById(uid);
		return user ;
	}
	
	@RequestMapping("/login")
	public String login(HttpServletRequest request,Model model){
		
		return null ;
	}
	
}
