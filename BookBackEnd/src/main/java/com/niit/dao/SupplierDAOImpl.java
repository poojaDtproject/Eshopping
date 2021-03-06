package com.niit.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.model.Books;
import com.niit.model.Supplier;

@Repository
public class SupplierDAOImpl implements SupplierDAO{
	
	@Autowired
	SessionFactory sessionFactory;

	public Supplier insertSupplier(Supplier supplier) {
		Session session=sessionFactory.openSession();
		session.save(supplier);
		session.flush();
		session.close();
		return supplier;
	}

	public void deleteSupplier(int id) {
		// TODO Auto-generated method stub
		
	}

	public Supplier updateSupplier(Supplier supplier) {
		// TODO Auto-generated method stub
		return null;
	}

	public Supplier getSupplierById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Supplier> getAllSuppliers() {
		Session session=sessionFactory.openSession();
		Query query=session.createQuery("from Supplier");
		List<Supplier> suppliers=query.list();
		return suppliers;
	}

}
