package example.employee.leaf;

import example.employee.component.Employee;

public class Developer implements Employee {
	String name = "";
	String docket = "";

	public Developer(String name, String docket) {
		super();
		this.name = name;
		this.docket = docket;
	}

	@Override
	public void showData(String docket) {
		if (this.docket.equals(docket)) {
			System.out.println("Developer [name=" + name + ", docket=" + docket + "]");
		}
	}

	public String getDocket() {
		return docket;
	}
	
}
