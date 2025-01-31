package com.itp.ITPFirstHibernate;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.itp.ITPFirstHibernate.entity.Address;
import com.itp.ITPFirstHibernate.entity.Employee;

public class OneToOneDemo {

	public static void main(String[] args) {
		Session session1=MyHibernateSessionGenerator.getSession();
		Transaction trans=session1.beginTransaction();
		
		
		session1.close();
		MyHibernateSessionGenerator.closeFactory();
	}

}
