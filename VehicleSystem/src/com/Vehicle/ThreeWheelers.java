package com.Vehicle;

public class ThreeWheelers {
	
	private Object companyName;
	private String name;
	private String manufDate;
	private int no_of_tyres;
	private int torque;
	
	
	public Object getCompanyName() {
		return companyName;
	}
	public void setCompanyName(Object companyName) {
		this.companyName = companyName;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getManufDate() {
		return manufDate;
	}
	public void setManufDate(String manufDate) {
		this.manufDate = manufDate;
	}
	public int getNo_of_tyres() {
		return no_of_tyres;
	}
	public void setNo_of_tyres(int no_of_tyres) {
		this.no_of_tyres = no_of_tyres;
	}
	public int getTorque() {
		return torque;
	}
	public void setTorque(int torque) {
		this.torque = torque;
	}
	
	
	public ThreeWheelers(Object companyName, String name, String manufDate, int no_of_tyres, int torque) {
		super();
		this.companyName = companyName;
		this.name = name;
		this.manufDate = manufDate;
		this.no_of_tyres = no_of_tyres;
		this.torque = torque;
	}
	
	
	public ThreeWheelers() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "ThreeWheelers [companyName=" + companyName + ", name=" + name + ", manufDate=" + manufDate
				+ ", no_of_tyres=" + no_of_tyres + ", torque=" + torque + "]";
	}
	
	

}
