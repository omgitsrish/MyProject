package com.bean;

public class Employee {

	private int empid;
	private  String ename;
	private  String designation;
	private  int experience;
	private  int contact_no;
	private String address;
	private  String status;
	public Employee(int empid, String ename, String designation,
			int experience, int contact_no, String address, String status) {
		super();
		this.empid = empid;
		this.ename = ename;
		this.designation = designation;
		this.experience = experience;
		this.contact_no = contact_no;
		this.address = address;
		this.status = status;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	public int getContact_no() {
		return contact_no;
	}
	public void setContact_no(int contact_no) {
		this.contact_no = contact_no;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", ename=" + ename
				+ ", designation=" + designation + ", experience=" + experience
				+ ", contact_no=" + contact_no + ", address=" + address
				+ ", status=" + status + "]";
	}
	
	

	
}
