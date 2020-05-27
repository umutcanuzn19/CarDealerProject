package com.project.CarDealer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import com.project.CarDealer.model.Car;
import com.project.CarDealer.model.Dealer;
import com.project.CarDealer.service.CarDealerService;
import javax.validation.Valid;
@Controller
public class CarDealerController {

	@Autowired
	CarDealerService carDealerService;

	@RequestMapping(value = { "/form/new" }, method = RequestMethod.GET)
	public ModelAndView newForm() {
		ModelAndView mv = new ModelAndView("new_form");
		mv.addObject("car", new Car());
		mv.addObject("dealer", new Dealer());
		return mv;
	}

	@RequestMapping(value = { "/form/view/{id}" }, method = RequestMethod.GET)
	public ModelAndView viewForm(@PathVariable long id) {
		ModelAndView mv = new ModelAndView("view_form");
		Car car = new Car();
		Dealer dealer = carDealerService.findDealerById(id);
		mv.addObject("car", car);
		mv.addObject("dealer", dealer);
		return mv;
	}

	@RequestMapping(value = "/form/add", method = RequestMethod.POST)
	public ModelAndView addDealer(@Valid @ModelAttribute Dealer dealer ,@Valid @ModelAttribute Car car,BindingResult result) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("dealer", dealer);
		mv.addObject("car",car);
		
		if (result.hasErrors())
			mv.setViewName("new_form");
		else {
			mv.setViewName("list_form");
			carDealerService.createDealer(dealer);
			carDealerService.createCar(car);
			mv.addObject("dealers", carDealerService.findAllDealers());
		}

		return mv;
	}

	@RequestMapping(value = { "/form/list", "list.html" }, method = RequestMethod.GET)
	public ModelAndView listForm() {
		ModelAndView mv = new ModelAndView("list_form");
		mv.addObject("dealers", carDealerService.findAllDealers());
		mv.addObject("car",new Car());
		return mv;
	}


	@RequestMapping(value = "/form/delete/{id}", method = RequestMethod.GET)
	public ModelAndView deleteForm(@PathVariable long id) {
		ModelAndView mv = new ModelAndView("list_form");
		carDealerService.deleteDealer(id);
		mv.addObject("dealers", carDealerService.findAllDealers());

		return mv;
	}
	
	@RequestMapping(value = "/form/car/add", method = RequestMethod.POST)
	public ModelAndView addCarToDealers(@Validated @ModelAttribute Car car, BindingResult result) {
		ModelAndView mv = new ModelAndView("view_form");
		if(result.hasErrors() == false) {
			carDealerService.createCar(car);
			Car newPhone = new Car();
			mv.addObject("car", newPhone);
		}
		else
			mv.addObject("car", car);
		
		Dealer dealer= carDealerService.findDealerById(car.getDealerId().getId());
		mv.addObject("dealer", dealer);
		
		return mv;
	}


}
