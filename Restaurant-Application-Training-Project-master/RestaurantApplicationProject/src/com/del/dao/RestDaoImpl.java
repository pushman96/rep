package com.del.dao;

import java.util.List;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.del.bean.Login;
import com.del.bean.NonVegMenu;
import com.del.bean.NonVegSelected;
import com.del.bean.VegMenu;

@Repository("rDao")
public class RestDaoImpl implements RestDao{

	@Override
	public boolean checklogin(Login login) {
		boolean success = false;
		Login l = new Login();
		
		// System.out.println(login);
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("restentity");
		EntityManager em = emf.createEntityManager();
		l = em.find(Login.class, login.getUsername());
		
		// System.out.println(l);
		
		if(l!=null && l.getPassword().equals(login.getPassword()))
			success = true;
		return success;
	}

	@Override
	public boolean register(Login login) {
		boolean success = false;
		try {
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("restentity");
			EntityManager em = emf.createEntityManager();
			em.getTransaction().begin();
			em.persist(login);
			em.getTransaction().commit();
			em.detach(login);
			success = true;
		} catch (Exception e) {
			System.err.println("ERROR! Could not save data");
		}
		
		return success;
	}
	
	@Override
	public List<VegMenu> getVegMenu() {
		List<VegMenu> vegList= null;
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("restentity");
		EntityManager em = emf.createEntityManager();
		
		String qry = "select veg from VegMenu veg";
		TypedQuery<VegMenu> query = em.createQuery(qry, VegMenu.class);

		vegList = query.getResultList();
		
		System.out.println("veg list:"+vegList);
		
		return vegList;
	}

	@Override
	public List<NonVegMenu> getNonVegMenu() {
		List<NonVegMenu> nonvegList= null;
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("restentity");
		EntityManager em = emf.createEntityManager();
		
		String qry = "select nonveg from NonVegMenu nonveg";
		TypedQuery<NonVegMenu> query = em.createQuery(qry, NonVegMenu.class);

		nonvegList = query.getResultList();
		
		System.out.println("veg list:"+nonvegList);
		
		return nonvegList;
	}

	@Override
	public boolean updateQuantity(NonVegSelected nonveg) {
		boolean success = false;
		try {
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("restentity");
			EntityManager em = emf.createEntityManager();
			//String deducted = Integer.toString(nonveg.getSelctedQuant());
			int deducted = nonveg.getAvailableQuant()-nonveg.getSelctedQuant();
			System.out.println(deducted);
			String dishaname = nonveg.getDishname();
			String qry = "update NonVegMenu nveg set nveg.quantity =:deducted where nveg.dishname =:dishname\"";
			TypedQuery<NonVegSelected> query = em.createQuery(qry, NonVegSelected.class);
			int result = query.executeUpdate();
			if(result==1)
			{
				success = true;
			}
				
		} catch (Exception e) {
			System.err.println("ERROR! Could not save data");
		}
		
		return success;
	}

	

}
