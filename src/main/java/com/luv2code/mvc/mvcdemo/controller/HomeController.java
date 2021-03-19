package com.luv2code.mvc.mvcdemo.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.luv2code.mvc.mvcdemo.vo.Student;

@Controller
public class HomeController {
	
	@RequestMapping(value = { "/", "/showForm" }, method = RequestMethod.GET)
	public ModelAndView showForm(Model model) {
		// return new ModelAndView("show-form");
		model.addAttribute("student", new Student());
		return new ModelAndView("student-form");
	}
	
	@PostMapping("processform")
	public ModelAndView processStudentForm(@Valid @ModelAttribute Student student, BindingResult bindingResult) {
		if(bindingResult.hasErrors()) {
			return new ModelAndView("student-form"); 
		}
		ModelAndView model = new ModelAndView("student-confirmation");
		model.addObject("student", student);
		return model;
	}
	
	@RequestMapping(value = "/processForm", method = RequestMethod.GET)
	public ModelAndView processForm(HttpServletRequest request, HttpSession session, @RequestParam("studentName") String studentname) {
		ModelAndView model = new ModelAndView("helloworld");
		model.addObject("studentName", studentname);
		return model;
	}
	
	

}
