package com.Controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.Employee;
import com.bean.Salary;
import com.service.Service;

public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Service service = new Service();

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("action");
		if (action.equals("addSal")) {
			Salary s = new Salary(Integer.parseInt(request
					.getParameter("empid")), request.getParameter("month"),
					request.getParameter("fyear"), Integer.parseInt(request.getParameter("basic")),
					Integer.parseInt(request.getParameter("performance")),
					Integer.parseInt(request.getParameter("income")),
					Integer.parseInt(request.getParameter("food")));
			s.setTotal_salary((Integer.parseInt(request.getParameter("basic"))+
					Integer.parseInt(request.getParameter("performance"))+
					Integer.parseInt(request.getParameter("food")))-
					Integer.parseInt(request.getParameter("income")));
			
			System.out.println(s);
			boolean value = service.addSalary(s);
			if(value){
				RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
				request.setAttribute("success", "Salary added successfully");
				rd.forward(request, response);
			}
			else
			{
				RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
				request.setAttribute("fail", "Salary did not add");
				rd.forward(request, response);
			}
		}
		
		else if(action.equals("fetchemp")){
			ArrayList<Employee> list = new ArrayList<Employee>();
			ArrayList<Employee> out = new ArrayList<Employee>();
			String name=request.getParameter("ename");
			list = service.getEmployeeList();
			System.out.println("List in controller is "+ list);
				for(Employee e : list){
					System.out.println(e.getEname()+"  "+name);
					if(e.getEname().equals(name))
						out.add(e);
				}
			RequestDispatcher rd = request.getRequestDispatcher("fetchemp.jsp");
			request.setAttribute("list", out);
			System.out.println("Gone");
			rd.forward(request, response);
			
		}

	}

}
