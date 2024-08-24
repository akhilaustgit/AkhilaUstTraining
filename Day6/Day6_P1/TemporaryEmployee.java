package Programs.Day6_P1;

import Programs.Day6.Employee;

public class TemporaryEmployee extends Employee{

	private float hourlypay;
	private String company_addr;

	public TemporaryEmployee(int eid, String name, float hourlypay, String company_addr) {
		super(eid, name);
		this.hourlypay = hourlypay;
		this.company_addr = company_addr;
		
		// TODO Auto-generated constructor stub
	}
	
	public void display() {
		displaye();
		System.out.println("Hourly Pay is "+hourlypay+" Company address is "+company_addr);
	}

	

}
