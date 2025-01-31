package com.itp.ITPFirstHibernate;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.itp.ITPFirstHibernate.entity.Employee;

public class DriverAppDeleteUpdate {

	public static void main(String[] args) {
		Session session1=MyHibernateSessionGenerator.getSession();
		Transaction trans=session1.beginTransaction();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Employee Number to Delete");//1
		int n=sc.nextInt();
		Employee emp1=session1.get(Employee.class, n);
		session1.remove(emp1);
		trans.commit();
		System.out.println("Record Deleted");
		
//		Employee emp1=session1.get(Employee.class, 2);
//		emp1.setEname("Sachin");
//		session1.save(emp1);
//		trans.commit();
//		System.out.println("Record Updated");
//		
		session1.close();
		MyHibernateSessionGenerator.closeFactory();
	}

}
