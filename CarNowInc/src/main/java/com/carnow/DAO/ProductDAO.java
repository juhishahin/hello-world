package com.carnow.DAO;



import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.carnow.pojo.ContactUs;
import com.carnow.pojo.Product;


@Repository
public class ProductDAO {
	@Autowired
	private SessionFactory sessionFactory;
	
	public List<Product> getAllProducts(){
		
		Session session = null;
		
		try{
			session = sessionFactory.openSession();
			
			Criteria criteria = session.createCriteria(Product.class);
			
			return criteria.list();
			
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}finally {
			session.close();
		}
		
		
		
	}

	
public List<ContactUs> getAllComments(){
		
		Session session = null;
		
		try{
			session = sessionFactory.openSession();
			
			Criteria criteria = session.createCriteria(ContactUs.class);
			
			return criteria.list();
			
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}finally {
			session.close();
		}
		
		
		
	}
	
	
	public Integer insertProduct(ContactUs contact) {
		Session session = null;
		
		try{
			session = sessionFactory.openSession();
			session.beginTransaction();
			
			Integer id = (Integer) session.save(contact);
			
			session.getTransaction().commit();;
			return id;
		}catch(Exception e){
			e.printStackTrace();
			session.getTransaction().rollback();
			return 0;
		}finally {
			session.close();
		}
	}
	
	
	
}
