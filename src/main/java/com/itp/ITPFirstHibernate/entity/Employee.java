package com.itp.ITPFirstHibernate.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="myemployee")
public class Employee {

	@Id
	@GeneratedValue(strategy =GenerationType.SEQUENCE,generator = "amey_seq")
	@SequenceGenerator(name = "amey_seq",sequenceName = "employee_sequence",initialValue = 101, allocationSize = 1)
	private int eno;
	

	@Column(name="empname")
	private String ename;
	private double salary;
	
	@Transient
	int temp;
	
	Address address;
	
	public Employee() {}
	public Employee(int eno, String ename, double salary) {
		super();
		this.eno = eno;
		this.ename = ename;
		this.salary = salary;
	}
	public int getEno() {
		return eno;
	}
	public void setEno(int eno) {
		this.eno = eno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [eno=" + eno + ", ename=" + ename + ", salary=" + salary + "]";
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	
}
