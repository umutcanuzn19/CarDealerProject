package com.project.CarDealer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.project.CarDealer.model.Car;
import com.project.CarDealer.model.Dealer;
import com.project.CarDealer.service.CarDealerService;

@Controller
public class CarDealerController {
	
	@Autowired
	CarDealerService carDealerService;
	
	@RequestMapping(value= {"/form/new"},method= RequestMethod.GET)
	public ModelAndView newForm() {
		ModelAndView mv = new ModelAndView("new_form");
		mv.addObject("car",new Car());
		mv.addObject("dealer",new Dealer());
		return mv ;
	}
	
	
}
