package com.itp.ITPFirstHibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.itp.ITPFirstHibernate.entity.Employee;

public class DriverAppLoadDemo {

	public static void main(String[] args) {
		Configuration cfg=new Configuration();
    	cfg.configure("hibernate.cfg.xml");
    	SessionFactory factory=cfg.buildSessionFactory();
 
    	Session session1=factory.openSession();
    	Transaction tranx=session1.beginTransaction();
    	
    	Employee emp1=session1.load(Employee.class,1); //not found in session, return the proxy object, db not query
    	System.out.println("hi");
    	System.out.println(emp1.getEname());
    	
    	Employee emp2=session1.load(Employee.class,1); //as found in session so not query the db
    	System.out.println(emp2.getEname());
//    	
//    	Employee emp3=session1.get(Employee.class,3); //not found in session so query the db
//    	System.out.println(emp3);
//    	
    	session1.close();
    	factory.close();

	}

}
