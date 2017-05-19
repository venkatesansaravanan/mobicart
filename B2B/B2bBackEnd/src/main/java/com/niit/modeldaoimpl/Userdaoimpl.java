package com.niit.modeldaoimpl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.modeldao.Userdao;
import com.niit.modeldto.User;

@Transactional
@Repository("userdao")
public class Userdaoimpl implements Userdao
{
	@Autowired
	SessionFactory sessionFactory;
	

	public void addUser(User user) {
		Session session=sessionFactory.openSession();
		Transaction transaction=(Transaction)session.beginTransaction();
		session.saveOrUpdate(user);
		System.out.println("TRANSACTION INITIALISED");
		transaction.commit();
		session.close();
		System.out.println("TRANSACTION CLOSED");
		
	}

	public void updateUser() {
		
		
	}

	public void deleteUser() {
		
		
	}

	public User getUserByUserName(String username) {
		
		return null;
	}

	
	
}


