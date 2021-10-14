package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import model.Address;
import model.Customer;

@Controller
public class Customercontroller {
	
	@RequestMapping(value="/InputForm", method=RequestMethod.GET)
	public  ModelAndView getInputForm()
	{
		ModelAndView model = new ModelAndView("inputform");
		return model;
	}
	
	
	@RequestMapping(value="/Welcomepage", method=RequestMethod.POST)
	public ModelAndView submitForm(@ModelAttribute("address") Address address,@ModelAttribute("customer") Customer customer)
	{
	     customer.setAddress(address);
	     System.out.println(customer.getCustName()+"   "+customer.getAddress().getCity());
	     
	     ModelAndView model = new ModelAndView("welcomepage");
	     model.addObject("customer",customer);
	     
	     return model;
	}
	
	
	}

