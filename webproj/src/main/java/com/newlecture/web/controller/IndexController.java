package com.newlecture.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class IndexController implements Controller{

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		//dispatcher를 하기위한 모델and뷰를 제공
		System.out.println("hello");
		ModelAndView  mv= new ModelAndView();
		mv.addObject("data","Hello Spring MVC~");
		mv.setViewName("index.jsp");
		return mv;
	}

}
