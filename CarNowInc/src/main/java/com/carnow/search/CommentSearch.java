package com.carnow.search;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.carnow.DAO.ProductDAO;
import com.carnow.pojo.ContactUs;

@Controller
public class CommentSearch {
	@Autowired
	private ProductDAO productDao;
	
	public static void main(String[] args) {
		
		

	}

	public List<ContactUs> getAllComments(){
		return productDao.getAllComments();
	
}
}