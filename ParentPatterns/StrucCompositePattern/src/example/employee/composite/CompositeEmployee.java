package example.employee.composite;

import java.util.ArrayList;
import java.util.List;

import example.employee.component.Employee;

public class CompositeEmployee implements Employee {

	// collection of Shapes
	private List<Employee> employees = new ArrayList<Employee>();

	@Override
	public void showData(String docket) {
		for (Employee sh : employees) {
			sh.showData(docket);
		}
	}

	// adding shape to drawing
	public void add(Employee s) {
		this.employees.add(s);
	}

	// removing shape from drawing
	public void remove(Employee s) {
		employees.remove(s);
	}

	// removing all the shapes
	public void clear() {
		System.out.println("Clearing all the employees.");
		this.employees.clear();
	}

}
