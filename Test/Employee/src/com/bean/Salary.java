package com.bean;

public class Salary {
	private int empid;
	private String month;
	private String financial_year;
	private int basic_pay;
	private int performance_pay;
	private int income_tax;
	private int food_coupon;
	private int total_salary;
	public Salary(int empid, String month, String financial_year,
			int basic_pay, int performance_pay, int income_tax,
			int food_coupon) {
		super();
		this.empid = empid;
		this.month = month;
		this.financial_year = financial_year;
		this.basic_pay = basic_pay;
		this.performance_pay = performance_pay;
		this.income_tax = income_tax;
		this.food_coupon = food_coupon;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getMonth() {
		return month;
	}
	public void setMonth(String month) {
		this.month = month;
	}
	public String getFinancial_year() {
		return financial_year;
	}
	public void setFinancial_year(String financial_year) {
		this.financial_year = financial_year;
	}
	public int getBasic_pay() {
		return basic_pay;
	}
	public void setBasic_pay(int basic_pay) {
		this.basic_pay = basic_pay;
	}
	public int getPerformance_pay() {
		return performance_pay;
	}
	public void setPerformance_pay(int performance_pay) {
		this.performance_pay = performance_pay;
	}
	public int getIncome_tax() {
		return income_tax;
	}
	public void setIncome_tax(int income_tax) {
		this.income_tax = income_tax;
	}
	public int getFood_coupon() {
		return food_coupon;
	}
	public void setFood_coupon(int food_coupon) {
		this.food_coupon = food_coupon;
	}
	public int getTotal_salary() {
		return total_salary;
	}
	public void setTotal_salary(int total_salary) {
		this.total_salary = total_salary;
	}
	@Override
	public String toString() {
		return "Salary [empid=" + empid + ", month=" + month
				+ ", financial_year=" + financial_year + ", basic_pay="
				+ basic_pay + ", performance_pay=" + performance_pay
				+ ", income_tax=" + income_tax + ", food_coupon=" + food_coupon
				+ ", total_salary=" + total_salary + "]";
	}
	
	
	
	

}
