package com.carnow.service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.carnow.DAO.ProductDAO;
import com.carnow.pojo.ContactUs;
import com.carnow.pojo.Product;


@Service
public class ProductService {
	@Autowired
	private ProductDAO productDao;
	
	public List<Product> getAllProducts(){
		return productDao.getAllProducts();
	}

	public String insertProduct(ContactUs contact) {
		Integer id = productDao.insertProduct(contact);
		
		if(id!= null && id>0){
			return "success";
		}else{
			return "fail";
		}
		
	}
	
	
}
