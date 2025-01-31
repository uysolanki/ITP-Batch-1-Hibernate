package com.itp.ITPFirstHibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MyHibernateSessionGenerator {
	static SessionFactory factory;
	public static Session getSession()
	{
		Configuration cfg=new Configuration();
    	cfg.configure("hibernate.cfg.xml");
    	factory=cfg.buildSessionFactory();
 
    	Session session1=factory.openSession();
    	return session1;
	}
	
	public static void closeFactory()
	{
		factory.close();
	}
}
