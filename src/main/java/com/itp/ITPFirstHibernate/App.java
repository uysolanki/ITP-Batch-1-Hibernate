package com.itp.ITPFirstHibernate;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.itp.ITPFirstHibernate.entity.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Configuration cfg=new Configuration();
    	cfg.configure("hibernate.cfg.xml");
    	SessionFactory factory=cfg.buildSessionFactory();
 
    	Session session1=factory.openSession();
    	Transaction tranx=session1.beginTransaction();
    	
    	Employee e1=new Employee();
    	e1.setEname("Ben");
    	e1.setEno(2);
    	e1.setSalary(800);
    	
    	session1.save(e1);
    	tranx.commit();
    	
    	session1.close();
    	factory.close();
    	
    	System.out.println(factory);
    	System.out.println(factory.isClosed());
    }
}
