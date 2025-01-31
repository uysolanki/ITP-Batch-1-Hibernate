package com.itp.ITPFirstHibernate;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.itp.ITPFirstHibernate.entity.Address;
import com.itp.ITPFirstHibernate.entity.Employee;

public class EmbedaDemo {

	public static void main(String[] args) {
		Session session1=MyHibernateSessionGenerator.getSession();
		Transaction trans=session1.beginTransaction();
		
		Employee e1=new Employee();
		e1.setEname("Alice");
		e1.setSalary(800);
		e1.setAddress(new Address(15,"Viman Nagar","Pune",411014));
		
		session1.save(e1);
		trans.commit();
		
		session1.close();
		MyHibernateSessionGenerator.closeFactory();

	}

}
