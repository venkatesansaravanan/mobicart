package com.niit.modeldaoimpl;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.modeldao.Productdao;
import com.niit.modeldto.Product;
import com.niit.modeldto.User;

@Repository("productdao")
@Transactional
public class Productdaoimpl implements Productdao
{
	@Autowired
	SessionFactory sessionFactory;
	public void addProduct(Product product) {
		Session session = sessionFactory.openSession();
		Transaction transaction = (Transaction) session.beginTransaction();
		session.persist(product);
		transaction.commit();
		session.close();
		
	}

	public void updateProduct(Product product) {
		Session session = sessionFactory.openSession();
		Transaction transaction = (Transaction) session.beginTransaction();
		session.update(product);
		transaction.commit();
		session.close();
		
	}

	public void deleteProduct(int prodid) {
		Session session = sessionFactory.openSession();
		Transaction transaction = (Transaction) session.beginTransaction();
		session.delete(prodid);
		transaction.commit();
		session.close();
		
	}

	public Product getProductByProductId(int prodid) {
		Session session=sessionFactory.openSession();
		Product product=(Product)session.get(Product.class,prodid);
		session.close();
		return product;
	}

	public List<Product> displayAll() 
	{
		Session session=sessionFactory.openSession();
		Query query=session.createQuery("from Product");
		@SuppressWarnings("unchecked")
		List<Product> list=(List<Product>)query.list();
		session.close();
		return list;
	}

}
