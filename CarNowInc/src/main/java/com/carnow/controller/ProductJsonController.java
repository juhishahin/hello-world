package com.carnow.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.carnow.pojo.ContactUs;
import com.carnow.pojo.Product;
import com.carnow.service.ProductService;

@Controller
public class ProductJsonController {
	
//	private static Logger log= Logger.getLogger(ProductJsonController.class);
	
	@Autowired
	private ProductService ProductService;
	
	

	@RequestMapping(value="/contact.html", method = RequestMethod.GET)
	public String loadPage(){
		System.out.println("I am here!");
		return "/contactUs.jsp";
	}
	
	@RequestMapping(value="/getAllProducts.html" ,method = RequestMethod.GET)
	@ResponseBody
	public List<Product> getAllProducts(){
		return ProductService.getAllProducts();
		
	}
	
	
	@RequestMapping(value="/insertContact.html" ,method = RequestMethod.POST)	
	@ResponseBody
	public String insertProduct(@RequestBody ContactUs contact){
		
		return ProductService.insertProduct(contact);
	}
	
	
}
