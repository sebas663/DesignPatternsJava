package example.employee.client;

import example.employee.composite.CompositeEmployee;
import example.employee.leaf.Developer;
import example.employee.leaf.Manager;

public class EmployeeCompositeDemo {

	public static void main(String[] args) {

		CompositeEmployee compositeManager = new CompositeEmployee();
		Manager manager = new Manager("manager","M1");
		Manager manager2 = new Manager("manager2","M2");
		Developer developer = new Developer("developer","D1");
		Developer developer2 = new Developer("developer2","D2");
		compositeManager.add(manager);
		compositeManager.add(developer);
		compositeManager.add(manager2);
		compositeManager.add(developer2);
		compositeManager.showData("D1");

	}

}
