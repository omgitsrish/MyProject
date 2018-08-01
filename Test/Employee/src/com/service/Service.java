package com.service;

import java.util.ArrayList;

import Util.DButil;

import com.bean.Employee;
import com.bean.Salary;
import com.dao.DAO;

public class Service {
	DAO d  =new DAO();
	public boolean addSalary(Salary s) {
		
		return d.addSalary(s);
	}
	public ArrayList<Employee> getEmployeeList() {
		// TODO Auto-generated method stub
		System.out.println("Comes in service");
		return d.getEmployees();
	}

}
